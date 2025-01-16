package org.haila.contact;

import org.haila.pages.contact.ContactPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.haila.base.BaseTest;

public class ContactPageTest extends BaseTest {

    @Test
    public void navigateToContactPageTest() {
        ContactPage contactPage = PageFactory.initElements(driver, ContactPage.class);
        contactPage.navigateToContactPage();
        Assert.assertEquals(contactPage.getSuccessText(),"CONTACT US");
    }
}
