package org.haila.pages.partners;

import org.haila.pages.base.WebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PartnersPage extends WebPage {

    @FindBy(xpath = "//span[text()='Partners']")
    protected WebElement partnersPage;

    @FindBy(xpath = "//span[text()='Partners']")
    protected WebElement successText;

    public PartnersPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToPartnersPage() {
        partnersPage.click();
        pause(DELAY_TEST_TIME);
    }

    public String getSuccessText() {
        return successText.getText();
    }
}
