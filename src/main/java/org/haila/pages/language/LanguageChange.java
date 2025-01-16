package org.haila.pages.language;

import org.haila.pages.base.WebPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LanguageChange extends WebPage {

    @FindBy(css = "div[class='WfZwmg _ap_Ez wixui-language-menu'] > button > div:nth-child(2)")
    protected List<WebElement> languageList;

    @FindBy(xpath = "//p[text()='NOUS CONTACTER']")
    public WebElement frenchSuccessText;

    public LanguageChange(WebDriver driver) {
        super(driver);
    }

    public void changeLanguage() {
        selectLanguageFromLanguageList("FR");
        pause(DELAY_TEST_TIME);
    }

    public void selectLanguageFromLanguageList(String language) {
        for (WebElement languageOption : languageList) {
            if (language.equalsIgnoreCase(languageOption.getText())) {
                languageOption.click();
                break;
            }
        }
    }

    public String getFrenchSuccessText() {
        return frenchSuccessText.getText();
    }

    public String getEnglishSuccessText() {
        return frenchSuccessText.getText();
    }

}
