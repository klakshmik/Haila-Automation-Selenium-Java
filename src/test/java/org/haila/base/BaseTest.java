package org.haila.base;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import utilities.TestRunPropertyReader;

@Slf4j
public class BaseTest {

    protected static RemoteWebDriver driver;
    protected static TestRunPropertyReader testRunPropertyReader;


    @BeforeSuite
    public void setupClass() {

        log.info("Started setupClass");

        testRunPropertyReader = new TestRunPropertyReader("src/test/resources/testrun.properties");

        String testPlatform = getTestPlatform();

        switch (testPlatform) {
            case "LAMBDA":
                driver = LambdaPlatformHandler.setupLambdaTestEnv();
                break;

            case "LOCAL":
            default:
                driver = LocalEnvHandler.localSetUp(testRunPropertyReader);
        }

        driver.get(testRunPropertyReader.getPropertyMethod("url"));
    }


    @AfterTest
    public void afterTest() {
        log.info("In AfterTest()");
        driver.quit();
    }


    private static String getTestPlatform() {
        String testPlatform = System.getProperty("testPlatform");
        log.info("testPlatform: {}", testPlatform);

        if (StringUtils.isEmpty(testPlatform))
            testPlatform = "";

        return testPlatform;
    }
}

