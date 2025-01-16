package org.haila.pages.applications;

import lombok.extern.slf4j.Slf4j;
import org.haila.pages.base.WebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


@Slf4j
public class ApplicationsPage extends WebPage {

    @FindBy(css = "nav[class='R_TAzU'] > ul > li > a")
    protected List<WebElement> hailaPages;

    @FindBy(css = "div[data-testid='columns'] > div:first-child > div:nth-child(2) > div:first-child > div:nth-child(2) > div:first-child > fluid-columns-repeater > div > div:nth-child(2) > div > div:first-child > a >wow-image > img")
    protected List<WebElement> applicationImgList;

    @FindBy(xpath = "//span[text()='APPLICATIONS']")
    protected WebElement successText;


    public ApplicationsPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToApplicationsPage() {
        selectOptionFromHailaPages("Applications");
    }


    private void selectOptionFromHailaPages(String page) {
        for (WebElement element : hailaPages) {
            if (element.getText().equalsIgnoreCase(page)) {
                element.click();
                break;
            }
        }
    }

    public void selectImgFromApplicationsList(int applicationIndex) {
        for (int i = 0; i < applicationImgList.size(); i++) {
            WebElement element = applicationImgList.get(i);
            if (i == applicationIndex) {
                scrollToElement(element);
                clickUsingJS(element);
                pause(DELAY_TEST_TIME);
                break;
            }
        }
    }

    public String getSuccessText() {
        WebElement element = successText;
        return element.getText();
    }
}

