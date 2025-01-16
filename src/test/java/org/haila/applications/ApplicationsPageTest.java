package org.haila.applications;

import org.haila.pages.applications.ApplicationsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.haila.base.BaseTest;

public class ApplicationsPageTest extends BaseTest {
    @Test(dataProvider = "applicationPageSelection")
    public void navigateToApplicationPageTest(int applicationIndex) {
        ApplicationsPage applicationsPage = PageFactory.initElements(driver, ApplicationsPage.class);
        applicationsPage.navigateToApplicationsPage();
        applicationsPage.selectImgFromApplicationsList(applicationIndex);
        Assert.assertEquals(applicationsPage.getSuccessText(), "APPLICATIONS");
    }

    @DataProvider(name = "applicationPageSelection")
    public Object[][] applicationIndexData() {
        return new Object[][]{
                {0},
                {1},
                {2},
                {3},
                {4},
                {5},
                {6},
                {7}
        };
    }
}
