package org.haila.pages.base;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Data
@Slf4j
public class WebPage {

    public static final int DELAY_TEST_TIME = 2;
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions action;
    protected JavascriptExecutor js;

    public WebPage(WebDriver driver) {
        this.driver = driver;
        action = new Actions(driver);
        this.js = (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }


    public void waitForElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public WebElement waitForElementToBeVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickUsingJS(WebElement element) {
        js.executeScript("arguments[0].click();", element);
    }

    public void pause(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException ex) {
            log.info("Interrupted exception occurring during thread.sleep call.", ex);
        }
    }
}


