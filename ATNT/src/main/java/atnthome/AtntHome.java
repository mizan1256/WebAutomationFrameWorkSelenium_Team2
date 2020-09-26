package atnthome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static atnthome.AtntHomeWebElements.*;

public class AtntHome extends WebAPI {
    @FindBy(how = How.XPATH, using = webElementsAtntDealsButton)
    public WebElement attDealsButton;
    @FindBy(how = How.XPATH, using = webElementsAtntWireLessButton)
    public WebElement attWirelessButton;
    @FindBy(how = How.XPATH, using = webElementsAtntExploreWireLessButton)
    public WebElement exploreWireLessButton;
    @FindBy(how = How.XPATH, using = webElementsAtntInternetButton)
    public WebElement internetButton;
    @FindBy(how = How.XPATH, using =  webElementsAtntInternetButtonText)
    public WebElement internetButtonText;
    @FindBy(how = How.XPATH, using =  webElementsAtntTvButton)
    public WebElement tvButton;
    @FindBy(how = How.XPATH, using =  webElementsAtntTvButtonText)
    public WebElement tvButtonText;
    @FindBy(how = How.XPATH, using =  webElementsAtntPrepaidButton)
    public WebElement prepaidButton;
    @FindBy(how = How.XPATH, using =  webElementsAtntPrepaidButtonText)
    public WebElement prepaidButtonText;



    //Action Method
    public void checkAttDealsButton() {
        attDealsButton.click();
    }

    //Validate Method
    public void validateCheckAttDealsButton(String expectedResult) throws InterruptedException {
        String actualResult = "AT&T Deals on Phones, Wireless Plans, Internet & TV Services";
        Thread.sleep(3000);
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }

    //Action Method
    public void checkAttWirelessButton() {
        attWirelessButton.click();
    }
    //Validate Method
    public void validateCheckAttWirelessButton(String expectedResult) throws InterruptedException {
        String actualResult = "AT&T Wireless – Latest Phones & Best Wireless Plans";
        Thread.sleep(3000);
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }
    //Action Method
    public void checkAttInternetButton() {
        internetButton.click();
    }
    //Validate Method
    public void validateCheckAttInternetButton(String expectedResult) throws InterruptedException {
        Thread.sleep(3000);
        String actualResult = internetButtonText.getText();
        Assert.assertEquals(actualResult,expectedResult, "Text don't match");
    }
    //Action Method
    public void checkAttTvButton() {
        tvButton.click();
    }
    //Validate Method
    public void validateCheckAttTvButton(String expectedResult) throws InterruptedException {
        String actualResult = tvButtonText.getText();
        Thread.sleep(3000);
        Assert.assertEquals(actualResult,expectedResult, "Text don't match");
    }
    //Action Method
    public void checkAttPrepaidButton() {
        prepaidButton.click();
    }
    //Validate Method
    public void validateCheckAttPrepaidButton(String expectedResult) throws InterruptedException {
        String actualResult = prepaidButtonText.getText();
        Thread.sleep(3000);
        Assert.assertEquals(actualResult,expectedResult, "Text don't match");
    }

}
