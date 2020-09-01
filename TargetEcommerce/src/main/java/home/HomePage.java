package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import timeUtility.TimeUtil;

import static home.HomePageWebElements.*;

public class HomePage extends WebAPI {

    //@FindBy Annotations
    @FindBy(xpath = WebEleSignInBtn_Xp)
    WebElement signInBtn;

    @FindBy(xpath = WebEleSignInLink_Xp)
    WebElement signInLink;

    @FindBy(xpath = WebEleEmailField_Xp)
    WebElement emailField;

    @FindBy(xpath = WebElePassWordField_Xp)
    WebElement passWordField;

    @FindBy(xpath = WebEleLoginBtn_Xp)
    WebElement loginBtn;

    @FindBy(xpath = WebEleLoginPageText_Xp)
    WebElement loginPageText;

    @FindBy(xpath = WebEleInvalidEmailText_Xp)
    WebElement invalidEmailText;

    @FindBy(xpath = WebEleInvalidPasswordText_Xp)
    WebElement invalidPasswordText;

    @FindBy(id = WebEleForgotPasswordLink_Id)
    WebElement forgotPasswordLink;

    @FindBy(xpath = WebEleForgotPasswordText_Xp)
    WebElement forgotPasswordText;

    @FindBy(xpath = WebEleForgotPasswordEmailField_Xp)
    WebElement forgotPasswordEmailField;

    @FindBy(xpath = WebEleForgotPasswordPageContinueBtn_Xp)
    WebElement continueBtn;

    @FindBy(id = WebEleForgotPasswordInvalidEmailText_Id)
    WebElement forgotPasswordInvalidEmailText;

    @FindBy(xpath = WebEleSelectingStoreBtn_Xp)
    WebElement selectStoreBtn;

    @FindBy(xpath = WebEleSelectStoreText_Xp)
    WebElement selectStoreText;

    @FindBy(xpath = WebEleAddressLookupBox_Xp)
    WebElement addressLookupBox;

    @FindBy(xpath = WebEleAddressLookupBtn_Xp)
    WebElement addressLookupBtn;

    @FindBy(id = WebEleInvalidLocationText_Id)
    WebElement invalidLocationText;

    @FindBy(xpath = WebEleForestHillsLocationText_Xp)
    WebElement forestHillsLocation;

    @FindBy(xpath = WebEleHarlemLocationText_Xp)
    WebElement HarlemLocationAstoria;

    @FindBy(xpath = WebEleSpringHillFloridaLocationText_Xp)
    WebElement SpringHillFlorida;


    //Action Method

    public void checkLoginPageIsDisplayed() {
        signInBtn.click();
        TimeUtil.waitFor(2000);
        signInLink.click();
        TimeUtil.waitFor(2000);
    }

    public void checkLoginWithInvalidEmailAndPassword(String email, String password) {
        signInBtn.click();
        TimeUtil.waitFor(2000);
        signInLink.click();
        TimeUtil.waitFor(2000);
        emailField.sendKeys(email);
        TimeUtil.waitFor(2000);
        passWordField.sendKeys(password);
        TimeUtil.waitFor(2000);
        loginBtn.click();
    }

    public void checkLoginWithInvalidEmail(String email, String password) {
        signInBtn.click();
        TimeUtil.waitFor(2000);
        signInLink.click();
        TimeUtil.waitFor(2000);
        emailField.sendKeys(email);
        passWordField.sendKeys(password);
        loginBtn.click();

    }

    public void checkLoginWithInvalidPassword(String email, String password) {
        signInBtn.click();
        TimeUtil.waitFor(2000);
        signInLink.click();
        TimeUtil.waitFor(2000);
        emailField.sendKeys(email);
        passWordField.sendKeys(password);
        loginBtn.click();

    }

    public void checkForgotPasswordPageIsDisplayed() {
        signInBtn.click();
        TimeUtil.waitFor(2000);
        signInLink.click();
        TimeUtil.waitFor(2000);
        forgotPasswordLink.click();
        TimeUtil.waitFor(2000);

    }

    public void checkResetPasswordWithInvalidEmail(String email) {
        signInBtn.click();
        TimeUtil.waitFor(2000);
        signInLink.click();
        forgotPasswordLink.click();
        TimeUtil.waitFor(2000);
        forgotPasswordEmailField.sendKeys(email);
        continueBtn.click();


    }

    public void checkSelectStorePageIsDisplayed(){
        selectStoreBtn.click();
        TimeUtil.waitFor(2000);
    }

    public void lookupStoreWithInvalidLocationInput(String invalidLocationInput){
        selectStoreBtn.click();
        TimeUtil.waitFor(2000);
        addressLookupBox.sendKeys(invalidLocationInput);
        TimeUtil.waitFor(2000);
        addressLookupBtn.click();
    }

    public void lookupStoreWithZipCode(String zipCode){
        selectStoreBtn.click();
        TimeUtil.waitFor(2000);
        addressLookupBox.sendKeys(zipCode);
        TimeUtil.waitFor(2000);
        addressLookupBtn.click();
    }

    public void lookupStoreWithCityName(String cityName){
        selectStoreBtn.click();
        TimeUtil.waitFor(2000);
        addressLookupBox.sendKeys(cityName);
        TimeUtil.waitFor(2000);
        addressLookupBtn.click();
    }

    public void lookupStoreWithStateName(String stateName){
        selectStoreBtn.click();
        TimeUtil.waitFor(2000);
        addressLookupBox.sendKeys(stateName);
        TimeUtil.waitFor(2000);
        addressLookupBtn.click();
    }






    //Validate Method
    public void validateLoginPageIsDisplayed() {
        String actualText = loginPageText.getText();
        String expectedText = "Sign into your Target account";
        Assert.assertEquals(actualText, expectedText, "Text doesn't match");
    }

    public void validateInvalidEmailAndPassword() {
        String actualText = invalidEmailText.getText();
        String expectedText = "Please enter a valid email or phone number";
        Assert.assertEquals(actualText, expectedText, "Text doesn't match");
    }

    public void validateInvalidEmail() {
        String actualText = invalidEmailText.getText();
        String expectedText = "Please enter a valid email or phone number";
        Assert.assertEquals(actualText, expectedText, "Text doesn't match");
    }

    public void validateInvalidPassword() {
        String actualText = invalidPasswordText.getText();
        String expectedText = "Please enter a valid password";
        Assert.assertEquals(actualText, expectedText, "Text doesn't match");
    }

    public void validateForgotPasswordIsDisplayed() {
        String actualText = forgotPasswordText.getText();
        String expectedText = "Forgot Password";
        Assert.assertEquals(actualText, expectedText, "Text doesn't match");
    }

    public void validateInvalidForgotPasswordEmail() {
        String actualText = forgotPasswordInvalidEmailText.getText();
        String expectedText = "Please enter a valid email or phone number";
        Assert.assertEquals(actualText, expectedText, "Text doesn't match");
    }

    public void validateSelectStorePageIsDisplayed(){
        String actualText = selectStoreText.getText();
        String expectedText = "Select a store";
        Assert.assertEquals(actualText,expectedText,"Text doesn't match");

    }

    public void validateInvalidLocationOfStore(){
        String actualText = invalidLocationText.getText();
        String expectedText = "please enter a valid location";
        Assert.assertEquals(actualText,expectedText,"Text doesn't match");

    }

    public void validateZipCodeLocation(){
        String actualText = forestHillsLocation.getText();
        String expectedText = "Forest Hills";
        Assert.assertEquals(actualText,expectedText,"Text doesn't match");

    }

    public void validateCityLocation(){
        String actualText = HarlemLocationAstoria.getText();
        String expectedText = "Harlem";
        Assert.assertEquals(actualText,expectedText,"Text doesn't match");

    }

    public void validateStateLocation(){
        String actualText = SpringHillFlorida.getText();
        String expectedText = "Spring Hill East";
        Assert.assertEquals(actualText,expectedText,"Text doesn't match");

    }





}
