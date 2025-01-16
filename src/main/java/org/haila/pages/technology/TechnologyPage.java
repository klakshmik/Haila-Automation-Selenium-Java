package org.haila.pages.technology;

import org.haila.pages.base.WebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TechnologyPage extends WebPage {

    @FindBy(css = "nav[class='R_TAzU'] > ul > li > a")
    protected List<WebElement> hailaPages;

    @FindBy(xpath = "//span[text()='Backscatter of Wi-Fi Signal']")
    protected WebElement successText;

    public TechnologyPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToTechnologyPage() {
        selectOptionFromHailaPages("Technology");
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
