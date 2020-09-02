package signUp;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static signUp.RegistrationWebElement.*;

public class Registration extends WebAPI {
    @FindBy(how = How.XPATH, using = signInXPathWebElement)
    public WebElement signIn;
    @FindBy(how = How.XPATH, using = clickCreateAccountXPathWebElement)
    public WebElement ClickCreateAccount;
    @FindBy(how = How.CSS, using = EmailAddressCssSWebElement)
    public WebElement emailAddress;
    @FindBy(how = How.CSS, using = firstNameCssSWebElement)
    public WebElement firstName;
    @FindBy(how = How.CSS, using = lastNameCssSWebElement)
    public WebElement lastName;
    @FindBy(how = How.CSS, using = passwordCssSWebElement)
    public WebElement password;
    @FindBy(how = How.CSS, using = createAccountCssSWebElement)
    public WebElement createAccount;
    @FindBy(how = How.CSS, using = SignInOptionCssSWebElement)
    public WebElement signInOption;
    @FindBy(how = How.XPATH, using = keepMeSignInXPathWebElement)
    public WebElement keepMeSignIn;
    @FindBy(how = How.XPATH, using = loginTextCssSWebElement)
    public WebElement loginText;
    @FindBy(how = How.XPATH, using = buyItAgainXpathSWebElement)
    public WebElement buyItAgain;
    @FindBy(how = How.XPATH, using = replenishXpathSWebElement)
    public WebElement replenish;
    @FindBy(how = How.XPATH, using = buyItAgainSignInButtonXpathSWebElement)
    public WebElement buyItAgainSignInButton;
    @FindBy(how = How.XPATH, using = targetLogoXpathSWebElement)
    public WebElement targetLogo;
    @FindBy(how = How.XPATH, using = signInButtonSWebElement)
    public WebElement signInButton;
    @FindBy(how = How.XPATH, using = inCorrectPasswordXPathWebElement)
    public WebElement inCorrectPassword;
    @FindBy(how = How.XPATH, using = myStoreXpathWebElement)
    public WebElement myStore;
    @FindBy(how = How.XPATH, using = searchOptionByZipOrCityXpathWebElement)
    public WebElement myStoreZipcode;
    @FindBy(how = How.XPATH, using = myStoreCityXpathWebElement)
    public WebElement myStoreCity;
//    @FindBy(how = How.XPATH, using = myStoreStateXpathWebElement)
//    public WebElement myStoreState;

    public void scrollDown() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void timeToBeClickable(int timeInSec, WebElement webElementVariable) {
        WebDriverWait wait = new WebDriverWait(driver, timeInSec);
        wait.until(ExpectedConditions.elementToBeClickable(webElementVariable));

    }

    /**
     * go to sign in and check if the sign into your target account text is there
     */

    public void clickSignIn(){
        signIn.click();
    }

    public void enterEmailAddress(){
        emailAddress.sendKeys("mtt@gmail.com");
    }

    public void enterPassword(){
        password.sendKeys("23422235454@xyz");
    }
    public void keepMeSignIn() {
        keepMeSignIn.click();
    }

    //action method
    public void signIn() {
        //click on sign in
        clickSignIn();
        timeToBeClickable(5, signInOption);
        //click sign in
        signInOption.click();
        //enter user name
        enterEmailAddress();
        //enter password
        enterPassword();
        //click keep me sign in
        keepMeSignIn();

    }

    //validate method
    public void validateSignIn() {
        String actualText = loginText.getText();
        Assert.assertEquals(actualText, expectedTextValidateSignIn);
    }

    /**
     * click on create account option and create the account with the text verification
     */
    //action method
    public void createAccount() {
        //click sign in
        signIn.click();
        //click create account
        timeToBeClickable(5, ClickCreateAccount);
        ClickCreateAccount.click();
        //enter email address
        timeToBeClickable(5, emailAddress);
        emailAddress.sendKeys("mtt@gmail.com");
        //enter first name
        timeToBeClickable(5, firstName);
        firstName.sendKeys("Mobassara");
        //enter last name
        timeToBeClickable(5, lastName);
        lastName.sendKeys("Tabassum");
        //enter password
        timeToBeClickable(5, password);
        password.sendKeys("Tas1234456");
    }

    //validate method
    public void validateCreateAccount() {

        //validate if he create account text is there or not
        String actualText = createAccount.getText();
        String expectedText = "Create account";
        Assert.assertEquals(actualText, expectedText);

    }

    /**
     * click sign in
     * click buy it again
     * validate replenish text
     */
    //action method
    public void buyItAgain() {
        //click sign in
        signIn.click();
        timeToBeClickable(5, buyItAgain);
        //click buy it again
        buyItAgain.click();

    }

    //validate method
    public void validateBuyItAgain() {
        //validate method
        Assert.assertEquals(replenish.getText(), replenishText);
    }

    /**
     * click on sign in
     * click on buy it again
     * sign in and  validate the logo
     */
    //action method
    public void buyAgainSignIn() {
        //click sign in
        signIn.click();
        timeToBeClickable(5, buyItAgain);
        //click buy it again
        buyItAgain.click();
        //click sign in
        timeToBeClickable(5, buyItAgainSignInButton);
        buyItAgainSignInButton.click();

    }

    //validate method
    public void validateBuyAgainSignIn() {
        //validate the target logo is there or not
        Assert.assertEquals(targetLogo.isDisplayed(), true);
    }

    /**
     * click on sign in
     * click on buy it again
     * click sign in
     * enter username and password
     * validte the text as the account is not created
     */

    //action method
    public void signInToBuyAgain() throws InterruptedException {
        buyAgainSignIn();
        //enter user name
        timeToBeClickable(5, emailAddress);
        emailAddress.sendKeys("mtt@gmail.com");
        timeToBeClickable(5, password);
        password.sendKeys("23422235454@xyz");
        //click keep me sign in
        keepMeSignIn.click();
        //click sign in
        signInButton.click();
        //to see the error message
        Thread.sleep(5000);

    }

    public void validateSignInToBuyAgain() {
        //validate the text
        timeToBeClickable(10, inCorrectPassword);
        Assert.assertEquals(inCorrectPassword.getText(), ooops);
    }

    /**
     * go to my store in sign in option adn look for the store near me
     *
     */
    public void myStore() {
        //click sign in
        signIn.click();
        timeToBeClickable(5, myStore);
        //click myStore
        myStore.click();
        //enter city and state
        myStoreZipcode.click();
//        myStoreCity.sendKeys("NewYork");
//        //choose state
////        myStoreCity.selectByVisibleText("NY")
//        myStoreState.click();

    }
    public void validateMyStore() {
        Assert.assertEquals(myStoreCity.isDisplayed(),true);
    }

}
