package org.haila.pages.company;

import org.haila.pages.base.WebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CompanyPage extends WebPage {

    @FindBy(css = "nav[class='R_TAzU'] > ul > li:nth-child(4) > div > div > div > p")
    protected WebElement companyPage;

    @FindBy(css = "nav[class='R_TAzU'] > ul > li:nth-child(4) > ul > li:first-child > a")
    protected WebElement companyAboutPage;

    @FindBy(css = "nav[class='R_TAzU'] > ul > li:nth-child(4) > ul > li:nth-child(2) > a")
    protected WebElement companyCareersPage;

    @FindBy(css = "nav[class='R_TAzU'] > ul > li:nth-child(4) > ul > li:nth-child(3) > a")
    protected WebElement companyNewsPage;

    @FindBy(css = "nav[class='R_TAzU'] > ul > li:nth-child(4) > ul > li:nth-child(4) > a")
    protected WebElement companySustainabilityPage;

    @FindBy(css = "div[class='gallery-item-common-info gallery-item-right-info'] div > div > div:nth-child(2) > a > div > div > h2")
    protected WebElement newsText;

    @FindBy(xpath = "//span[text()='ABOUT US']")
    protected WebElement aboutPageSuccessText;

    @FindBy(xpath = "//span[text()='Current Openings']")
    protected WebElement careersPageSuccessText;

    @FindBy(xpath = "//a[text()='News']")
    protected WebElement newsPageSuccessText;

    @FindBy(xpath = "//span[text()='SUSTAINABLE IoT']")
    protected WebElement sustainabilityPageSuccessText;

    public CompanyPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToAboutPage() {
        action.moveToElement(companyPage).click().build().perform();
        companyAboutPage.isDisplayed();
        clickUsingJS(companyAboutPage);
        pause(DELAY_TEST_TIME);
    }

    public void navigateToCareersPage() {
        action.moveToElement(companyPage).click().build().perform();
        companyCareersPage.isDisplayed();
        clickUsingJS(companyCareersPage);
        pause(DELAY_TEST_TIME);
    }

    public void navigateToNewsPage() {
        action.moveToElement(companyPage).click().build().perform();
        companyNewsPage.isDisplayed();
        clickUsingJS(companyNewsPage);
        newsText.click();
        pause(DELAY_TEST_TIME);
    }

    public void navigateToSustainabilityPage() {
        action.moveToElement(companyPage).click().build().perform();
        companySustainabilityPage.isDisplayed();
        clickUsingJS(companySustainabilityPage);
    }


    public String getAboutPageSuccessText() {
        WebElement element = aboutPageSuccessText;
        return element.getText();
    }

    public String getCareersPageSuccessText() {
        WebElement element = careersPageSuccessText;
        return element.getText();
    }

    public String getNewsPageSuccessText() {
        WebElement element = newsPageSuccessText;
        return element.getText();
    }

    public String getSustainabilityPageSuccessText() {
        WebElement element = sustainabilityPageSuccessText;
        return element.getText();
    }

}




