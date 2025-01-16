package org.haila.technology;

import org.haila.base.BaseTest;
import org.haila.pages.technology.TechnologyPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TechnologyPageTest extends BaseTest {
    @Test
    public void navigateToTechnologyPageTest() {
        TechnologyPage technologyPage = PageFactory.initElements(driver, TechnologyPage.class);
        technologyPage.navigateToTechnologyPage();
        Assert.assertEquals(technologyPage.getSuccessText(), "Backscatter of Wi-Fi Signal");
    }
}
