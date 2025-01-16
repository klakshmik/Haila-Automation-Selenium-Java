package org.haila.language;

import org.haila.base.BaseTest;
import org.haila.pages.language.LanguageChange;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LanguageChangeTest extends BaseTest {
    @Test
    public void changeLanguageTest() {
        LanguageChange language = PageFactory.initElements(driver, LanguageChange.class);
        language.changeLanguage();
        String frenchText = language.getFrenchSuccessText();
        String englishText = language.getEnglishSuccessText();
        Assert.assertTrue(frenchText.equals("NOUS CONTACTER") || englishText.equals("CONTACT"),
                "The page language did not change as expected. Found French Text: " + frenchText + " or " +
                        "English Text: " + englishText);
    }


}

