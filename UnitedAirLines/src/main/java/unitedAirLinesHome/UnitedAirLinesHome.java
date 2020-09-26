package unitedAirLinesHome;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static unitedAirLinesHome.UnitedAirWebElement.*;
public class UnitedAirLinesHome extends WebAPI{

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
    @FindBy(how = How.XPATH, using = homeUnitedLogo)
    public WebElement unitedLogo;

    @FindBy(how = How.XPATH, using = homeBookTabButton)
    public WebElement bookTab;
    @FindBy(how = How.XPATH, using = homeClosePanelButton)
    public WebElement closeButton;
    @FindBy(how = How.XPATH, using = homeDisplayedText)
    public WebElement displayedText;

    @FindBy(how = How.XPATH, using = homeTravelInfoTabButton)
    public WebElement travelInfo;
    @FindBy(how = How.XPATH, using = homeTimeTableButton)
    public WebElement timeTableButton;
    @FindBy(how = How.XPATH, using = homeTimeTableText)
    public WebElement timeTableText;


    public void languageButtonCheck() throws InterruptedException {
        language.click();
        selectLanguage.click();
        Thread.sleep(3000);
        deutsch.click();


    }
    //    Action Method
    public void unitedAirlinesLogoIsDisplayed() {

        unitedLogo.isDisplayed();
    }

    //    Action Method
    public void bookTabCheck() throws InterruptedException {
        Thread.sleep(2000);
        bookTab.click();
        Thread.sleep(3000);
        closeButton.click();
        Thread.sleep(2000);
    }

    // Validate Method
    public void validateBookTabCheck(String expectedResult) {
        String actualResult = displayedText.getText();
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println("PASSED");
    }

    //    Action Method
    public void travelInfoTabCheck() throws InterruptedException {
        Thread.sleep(2000);
        travelInfo.click();
        Thread.sleep(2000);
        timeTableButton.click();
        Thread.sleep(2000);
    }

    // Validate Method
    public void validateTravelInfoTabCheck(String expectedResult) {
        String actualResult = timeTableText.getText();
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println("PASSED");
    }
}
