package cnnhome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static cnnhome.CnnHomeWebElements.*;

public class CnnHome extends WebAPI {
    @FindBy(how = How.XPATH,using = webElementsUSButton) public WebElement uSButton;
    @FindBy(how = How.XPATH,using = webElementsUSButtonText) public WebElement uSButtonText;
    @FindBy(how = How.XPATH,using = webElementsCnnLogo) public WebElement cNnLogo;
    @FindBy(how = How.XPATH,using = webElementsCnnLogoText) public WebElement cNnLogoText;
    @FindBy(how = How.XPATH,using = webElementsCnnWorldButton) public WebElement cNnWorldButton;
    @FindBy(how = How.XPATH,using = webElementsCnnMiddleEastButton) public WebElement cNnMiddleEasButton;
    @FindBy(how = How.XPATH,using = webElementsCnnMiddleEastButtonTitle) public WebElement cNnMiddleEasButtonTitle;
    @FindBy(how = How.XPATH,using = webElementsCnnZipBox) public WebElement cNnZipBox;
    @FindBy(how = How.XPATH,using = webElementsCnnSetLocationButton) public WebElement cNnSetLocationButton;
    @FindBy(how = How.ID,using = webElementsCnnSetLocationButtonTextId) public WebElement cNnSetLocationButtonTextId;
    @FindBy(how = How.XPATH,using = webElementsCnnEntertainmentButton) public WebElement cNnEntertainmentButton;
    @FindBy(how = How.XPATH,using = webElementsCnnEntertainmentButtonTitle) public WebElement cNnEntertainmentButtonTitl;




    //Action Method
    public void checkUSButton() throws InterruptedException {
        uSButton.click();
        Thread.sleep(3000);
    }
    //Validate Method
    public void validateUSButton() throws InterruptedException {
        String actualResult =uSButtonText.getText();
        Thread.sleep(3000);
        String expectedResult = "US";
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }

    //Action Method
    public void displayCnnLogo() throws InterruptedException {
        cNnLogo.isDisplayed();
        Thread.sleep(2000);
    }
    //Validate Method
    public void validateDisplayCnnLogo()throws InterruptedException {
        String expectedResult=cNnLogoText.getText();
        String actualResult="TRENDING:";
        Assert.assertEquals(actualResult,expectedResult,"Not exist");
    }

    //Action Method
    public void checkCnnMiddleEastButton() throws InterruptedException {
        cNnWorldButton.click();
        Thread.sleep(3000);
        cNnMiddleEasButton.click();
    }

    //Validate Method
    public void validateCnnMiddleEastButton() throws InterruptedException {
        String actualResult = "Middle East news - breaking news, video, headlines and opinion - CNN";
        Thread.sleep(3000);
        String expectedResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }
    //Action Method
    public void checkCnnZipBox() throws InterruptedException {
        cNnZipBox.sendKeys("11436");
        Thread.sleep(3000);
        cNnSetLocationButton.click();
    }
    //Validate Method
    public void validateCheckCnnZipBox() throws InterruptedException {
        String actualResult =cNnSetLocationButtonTextId.getText();
        Thread.sleep(3000);
        String expectedResult = "Create a CNN Account";
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }
    //Action Method
    public void checkCnnEntertainmentButton() throws InterruptedException {
        cNnEntertainmentButton.click();
        Thread.sleep(3000);
    }
    //Validate Method
    public void validateCnnEntertainmentButton() throws InterruptedException {
        String actualResult = "Entertainment News - Celebrities, Movies, TV, Music - CNN";
        Thread.sleep(3000);
        String expectedResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }
}
