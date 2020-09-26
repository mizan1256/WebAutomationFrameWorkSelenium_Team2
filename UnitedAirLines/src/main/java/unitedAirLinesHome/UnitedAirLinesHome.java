package unitedAirLinesHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static unitedAirLinesHome.UnitedAirLinesHomeWebElements.*;

public class UnitedAirLinesHome extends WebAPI {
    @FindBy(how = How.XPATH,using = webElementsUAAlertsButton)
    public WebElement uaAlertsButton;

    @FindBy(how = How.XPATH,using = webElementsUACareerButton)
    public WebElement uaCareerButton;


    @FindBy(how = How.XPATH,using = webElementsUABrandingButton)
    public WebElement uaBrandingButton;

    @FindBy(how = How.XPATH,using = webElementsUALeadershipTeamButton)
    public WebElement uaLeadershipTeamButton;

    @FindBy(how = How.XPATH,using = webElementsUANewsRoomButton)
    public WebElement uaNewsRoomButton;

    @FindBy(how = How.XPATH,using = webElementsUAUNewsRoomButtonText)
    public WebElement uaNewsRoomButtonText;

    //Action Method
    public void checkUAAlertsButton() {
        uaAlertsButton.click();
    }
    //Validate Method
    public void validateCheckUAAlertsButton(String expectedResult) throws InterruptedException {
        String actualResult = getTextByXpath(webElementsUAAlertsButtonText);
        Thread.sleep(3000);
        Assert.assertEquals(actualResult,expectedResult, "Text don't match");
    }
    //Action Method
    public void checkUACareerButton() {
        uaCareerButton.click();
    }
    //Validate Method
    public void validateCheckUACareerButton(String expectedResult) throws InterruptedException {
        String actualResult = getTextByXpath(webElementsUACareerButtonText);
        Thread.sleep(3000);
        Assert.assertEquals(actualResult,expectedResult, "Text don't match");
    }
    //Action Method
    public void checkUABrandingButton() {
        uaBrandingButton.click();
    }
    //Validate Method
    public void validateCheckUABrandingButton(String expectedResult) throws InterruptedException {
        Thread.sleep(3000);
        String actualResult = getTextByXpath(webElementsUABrandingButtonText);
        Assert.assertEquals(actualResult,expectedResult, "Text don't match");
    }
    //Action Method
    public void checkUALeadershipTeamButton() {
        uaLeadershipTeamButton.click();
    }
    public void validateCheckUALeadershipTeamButton(String expectedResult) throws InterruptedException {
        Thread.sleep(3000);
        String actualResult = "Company Leadership - United Airlines Holdings, Inc.";
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }
    //Action Method
    public void checkUAUnitedShopButton() throws InterruptedException {
        Thread.sleep(3000);
        uaNewsRoomButton.click();

    }
    //Validate Method
    public void validateCheckUAUnitedShopButton(String expectedResult)  {
        String actualResult = uaNewsRoomButtonText.getText();
        Assert.assertEquals(actualResult,expectedResult, "Text don't match");
    }
}
