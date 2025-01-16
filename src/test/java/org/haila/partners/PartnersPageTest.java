package org.haila.partners;

import org.haila.base.BaseTest;
import org.haila.pages.partners.PartnersPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PartnersPageTest extends BaseTest {

    @Test
    public void navigateToPartnersPageTest() {
        PartnersPage partnersPage = PageFactory.initElements(driver, PartnersPage.class);
        partnersPage.navigateToPartnersPage();
        Assert.assertEquals(partnersPage.getSuccessText(), "Partners");

    }


}
