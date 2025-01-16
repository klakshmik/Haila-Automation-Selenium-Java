package org.haila.base;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import utilities.MiscUtil;
import utilities.TestRunPropertyReader;

import java.time.Duration;

public class LocalEnvHandler {
    public static RemoteWebDriver localSetUp(TestRunPropertyReader testRunPropertyReader) {
        RemoteWebDriver driver = null;
        String browser = testRunPropertyReader.getPropertyMethod("browser");
        if (browser.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
        driver.get(testRunPropertyReader.getPropertyMethod("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        MiscUtil.defaultPause();

        return driver;
    }
}