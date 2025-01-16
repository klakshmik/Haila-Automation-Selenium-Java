package org.haila.pages.product;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.haila.pages.base.WebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Slf4j
public class ProductsPage extends WebPage {

    @FindBy(css = "nav[class='R_TAzU'] > ul > li > a")
    protected List<WebElement> hailaPages;

    @FindBy(css = "div[role='tablist'] > div")
    protected List<WebElement> tabList;

    @FindBy(css = "div[id='comp-kdgenexw'] > a > span")
    protected WebElement successText;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToProductsPage() {
        selectOptionFromHailaPages("PRODUCTS");
    }


    public void selectOptionFromHailaPages(String page) {
        for (WebElement element : hailaPages) {
            if (element.getText().equalsIgnoreCase(page)) {
                element.click();
                break;
            }
        }
    }

    public void selectProductFromTabList(int productIndex) {
        for (int i = 0; i < tabList.size(); i++) {
            WebElement element = tabList.get(i);
            if (i == productIndex) {
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
