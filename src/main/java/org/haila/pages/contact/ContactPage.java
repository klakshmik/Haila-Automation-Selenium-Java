package org.haila.pages.contact;

import org.haila.pages.base.WebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactPage extends WebPage {


    @FindBy(css = "nav[class='R_TAzU'] > ul > li > a")
    protected List<WebElement> hailaPages;

    @FindBy(xpath = "//span[text()='CONTACT US']")
    protected WebElement successText;

    public ContactPage(WebDriver driver) {
        super(driver);
    }


    public void navigateToContactPage() {
        selectOptionFromHailaPages("Contact");

    }


    public void selectOptionFromHailaPages(String page) {
        for (WebElement element : hailaPages) {
            if (element.getText().equalsIgnoreCase(page)) {
                element.click();
                break;
            }
        }
    }


    public String getSuccessText() {
        WebElement element = successText;
        return element.getText();
    }

}


