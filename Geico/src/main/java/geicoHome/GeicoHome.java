package geicoHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static geicoHome.GeicoHomeWebElements.*;

public class GeicoHome extends WebAPI {
    @FindBy(how = How.XPATH,using = webElementsGeicoLogo)
    public WebElement geicoLogo;

    @FindBy(how = How.XPATH,using = webElementsGeicoLogoText)
    public WebElement geicoLogoText;

    @FindBy(how = How.XPATH,using = webElementsGeicoCareerButton)
    public WebElement geicoCareerButton;

    @FindBy(how = How.XPATH,using = webElementsGeicoContactUsButton)
    public WebElement geicoContactUsButton;

    @FindBy(how = How.XPATH,using = webElementsGeicoPrivacyButton)
    public WebElement geicoPrivacyButton;


    //Action Method
    public void checkGeicologo(){

        geicoLogo.isDisplayed();
    }
    //Validate Method
    public void validateCheckGeicologo(String expectedResult )throws InterruptedException {
        String actualResult=geicoLogoText.getText();
        Assert.assertEquals(actualResult,expectedResult,"Not exist");
    }
    //Action Method
    public void checkGeicoCareerButton()  {
        geicoCareerButton.getLocation();
    }
    //Validate Method
    public void validateCheckGeicoCareerButton(String expectedResult) throws InterruptedException {
        String actualResult = getTextByXpath(webElementsGeicoCareerButtonText);
        Thread.sleep(3000);
        Assert.assertEquals(actualResult,expectedResult, "Text don't match");
    }
    //Action Method
    public void checkGeicoContactUsButton()  {
        geicoContactUsButton.getLocation();
    }
    //Validate Method
    public void validateCheckGeicoContactUsButton(String expectedResult) throws InterruptedException {
        String actualResult = "An Insurance Company For Your Car And More | GEICO";
        Thread.sleep(3000);
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }
    //Action Method
    public void checkGeicoPrivacyButton()  {
        geicoPrivacyButton.getLocation();
    }
    //Validate Method
    public void validateCheckGeicoPrivacyButton(String expectedResult) throws InterruptedException {
        String actualResult = "An Insurance Company For Your Car And More | GEICO";
        Thread.sleep(3000);
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }
}
