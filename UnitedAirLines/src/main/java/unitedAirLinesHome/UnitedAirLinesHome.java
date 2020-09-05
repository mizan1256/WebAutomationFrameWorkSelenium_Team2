package unitedAirLinesHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static unitedAirLinesHome.UniteAirWebElement.*;

public class UnitedAirLinesHome extends WebAPI {
    @FindBy(how = How.XPATH, using = languageWebElement)
    public WebElement language;

    @FindBy(how = How.XPATH, using = selectLanguageWebElement)
    public WebElement selectLanguage;

    @FindBy(how = How.XPATH, using = selectLocationWebElement)
    public WebElement selectLocation;

    @FindBy(how = How.XPATH, using = changeButtonWebElement)
    public WebElement changeButton;

    @FindBy(how = How.XPATH, using = deutschWebElement)
    public WebElement deutsch;

    public void languageButtonCheck() throws InterruptedException {
        language.click();
        selectLanguage.click();
        Thread.sleep(3000);
        deutsch.click();


    }
}
