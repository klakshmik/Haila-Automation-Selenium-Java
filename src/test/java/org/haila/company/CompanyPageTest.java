package org.haila.company;

import org.haila.pages.company.CompanyPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.haila.base.BaseTest;

public class CompanyPageTest extends BaseTest {

    @Test(priority = 1)
    public void navigateToAboutPageTest() {
        CompanyPage companyPage = PageFactory.initElements(driver, CompanyPage.class);
        companyPage.navigateToAboutPage();
        Assert.assertEquals(companyPage.getAboutPageSuccessText(), "ABOUT US");
    }

    @Test(priority = 2)
    public void navigateToCareesPageTest() {
        CompanyPage companyPage = PageFactory.initElements(driver, CompanyPage.class);
        companyPage.navigateToCareersPage();
        Assert.assertEquals(companyPage.getCareersPageSuccessText(), "Current Openings");
    }

    @Test(priority = 3)
    public void navigateToNewsPageTest() {
        CompanyPage companyPage = PageFactory.initElements(driver, CompanyPage.class);
        companyPage.navigateToNewsPage();
        Assert.assertEquals(companyPage.getNewsPageSuccessText(), "News");
    }

    @Test(priority = 4)
    public void navigateToSustainabilityPageTest() {
        CompanyPage companyPage = PageFactory.initElements(driver, CompanyPage.class);
        companyPage.navigateToSustainabilityPage();
        Assert.assertEquals(companyPage.getSustainabilityPageSuccessText(), "SUSTAINABLE IoT");
    }


}
