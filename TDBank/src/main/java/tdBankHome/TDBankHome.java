package tdBankHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static tdBankHome.TDBankHomeWebElements.*;

public class TDBankHome extends WebAPI {
    @FindBy(how = How.XPATH, using = webElementsTDSmallBusinessButton)
    public WebElement tdSmallBusinessButton;

    @FindBy(how = How.XPATH, using = webElementsTDSmallBusinessButtonText)
    public WebElement tdSmallBusinessButtonText;

    @FindBy(how = How.XPATH, using = webElementsTDCommercialButton)
    public WebElement tdCommercialButton;

    @FindBy(how = How.XPATH, using = webElementsTDInvestingNWealthButton)
    public WebElement tdInvestingNWealtButton;

    @FindBy(how = How.XPATH, using = webElementsTDHelpButton)
    public WebElement tdHelpButton;


    @FindBy(how = How.XPATH, using = webElementsTDLearningButton)
    public WebElement tdLearningButton;

    //Action Method
    public void checkTDSmallBusinessButton() {
        tdSmallBusinessButton.click();
    }

    //Validate Method
    public void validateCheckTDSmallBusinessButton(String expectedResult) throws InterruptedException {
        Thread.sleep(3000);
        String actualResult = tdSmallBusinessButtonText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");

    }
    //Action Method
    public void checkTDCommercialButton() {
        tdCommercialButton.click();
    }
    //Validate Method
    public void validateCheckTDCommercialButton(String expectedResult) throws InterruptedException {
        String actualResult = getTextByXpath(webElementsTDCommercialButtonText);
        Thread.sleep(3000);
        Assert.assertEquals(actualResult,expectedResult,"Text Don't match");
    }
    //Action Method
    public void checkTDInvestingNWealthButton() {
        tdInvestingNWealtButton.click();
    }
    //Validate Method
    public void validateCheckTDInvestingNWealthButton(String expectedResult) throws InterruptedException {
        String actualResult = getTextByXpath(webElementsTDInvestingNWealthButtonText);
        Thread.sleep(3000);
        Assert.assertEquals(actualResult,expectedResult,"Text Don't match");
    }
    //Action Method
    public void checkTDHelpButton() {

        tdHelpButton.click();
    }
    //Validate Method
    public void validateCheckTDHelpButton(String expectedResult) throws InterruptedException {
        String actualResult = "Help Center";
        Thread.sleep(3000);
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }
    //Action Method
    public void checkTDLearningButton() {
        tdLearningButton.click();
    }
    //Validate Method
    public void validateCheckTDLearningButton(String expectedResult) throws InterruptedException {
        String actualResult = getTextByXpath(webElementsTDLearningButtonText);
        Thread.sleep(3000);
        Assert.assertEquals(actualResult,expectedResult, "Text don't match");
    }
}
