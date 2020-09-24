package atnthome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static atnthome.AtntWebElements.*;

public class AtntHome extends WebAPI {

    @FindBy(how = How.XPATH, using = webElementsLogoIsDisplay) public WebElement LogoIsDisplay;
    @FindBy(how = How.XPATH, using = webElementsDeals) public WebElement Deals;
    @FindBy(how = How.XPATH, using = webElementsDealsWireLess) public WebElement DealsWireLes;
    @FindBy(how = How.XPATH, using = webElementsDealsShopNow) public WebElement DealsShopNow;
    @FindBy(how = How.XPATH, using = webElementsDealsValidateText) public WebElement DealsValidateText;

    @FindBy(how = How.XPATH, using = webElementsInternet) public WebElement Internet;
    @FindBy(how = How.XPATH, using = webElementsCheckAvailability) public WebElement CheckAvailability;
    @FindBy(how = How.XPATH, using = webElementsAddress) public WebElement Address;
    @FindBy(how = How.XPATH, using = webElementsGetAddress) public WebElement GetAddress;
    @FindBy(how = How.XPATH, using = webElementsCheckAddress) public WebElement CheckAddress;
    @FindBy(how = How.XPATH, using = webElementsInternetValidateText) public WebElement InternetValidateText;

    @FindBy(how = How.XPATH, using = webElementsSupport) public WebElement Support;
    @FindBy(how = How.XPATH, using = webElementsSupportValidateText) public WebElement SupportValidateText;

    @FindBy(how = How.XPATH, using = webElementsAccount) public WebElement Account;
    @FindBy(how = How.XPATH, using = webElementsAccountSignIn) public WebElement AccountSignIn;
    @FindBy(how = How.XPATH, using = webElementsCreateAccount) public WebElement CreateAccount;
    @FindBy(how = How.XPATH, using = webElementsAttAndTv) public WebElement AttAndTv;
    @FindBy(how = How.XPATH, using = webElementsContinue) public WebElement Continue;
    @FindBy(how = How.XPATH, using = webElementsPhoneNum) public WebElement PhoneNum;
    @FindBy(how = How.XPATH, using = webElementsCardNum) public WebElement CardNum;
    @FindBy(how = How.XPATH, using = webElementsZipCode) public WebElement ZipCode;
    @FindBy(how = How.XPATH, using = webElementsContinue2) public WebElement Continue2;
    @FindBy(how = How.XPATH, using = webElementsAccountValidateText) public WebElement AccountValidateText;




    public void attLogoIsDisplay() {
        LogoIsDisplay.isDisplayed();
    }

    public void attDeals() throws InterruptedException {
        Deals.click();
        Thread.sleep(1000);
        DealsWireLes.click();
        Thread.sleep(1000);
        DealsShopNow.click();
        Thread.sleep(1000);
    }
    public void validateDealsText(String expectedResult){
        String actualResult = DealsValidateText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
    }

    public void attInternetCheck() throws InterruptedException {
        Internet.click();
        Thread.sleep(1000);
        CheckAvailability.click();
        Thread.sleep(1000);
        Address.sendKeys("424 E 9th St, Brooklyn, NY 11218");
        Thread.sleep(1000);
        GetAddress.click();
        Thread.sleep(1000);
        CheckAddress.click();
        Thread.sleep(4000);
    }
    public void attValidateInternetText(String expectedResult){
        String actualResult = InternetValidateText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
    }

    public void attSupportCheck() throws InterruptedException {
        Support.click();
        Thread.sleep(1000);
    }
    public void attValidateSupportText(String expectedResult){
        String actualResult = SupportValidateText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
    }

    public void attSignInCheck() throws InterruptedException {
        Account.click();
        Thread.sleep(1000);
        AccountSignIn.click();
        Thread.sleep(1000);
        CreateAccount.click();
        Thread.sleep(1000);
        AttAndTv.click();
        Thread.sleep(1000);
        Continue.click();
        Thread.sleep(2000);
        PhoneNum.sendKeys("6474987837");
        CardNum.sendKeys("4333");
        ZipCode.sendKeys("13259");
        Continue2.click();
        Thread.sleep(2000);
    }
    public void attValidateSignInText(String expectedResult){
        String actualResult = AccountValidateText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
    }










}
