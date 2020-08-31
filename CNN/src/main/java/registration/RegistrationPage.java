package registration;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static registration.RegistrationWebElementPage.*;

public class RegistrationPage extends WebAPI {

    @FindBy(how = How.XPATH, using = userAccountButton) public WebElement userAccount;
    @FindBy(how = How.XPATH, using = userSignUp) public WebElement signUp;
    @FindBy(how = How.XPATH, using = userEmailAddress) public WebElement emailAddress;
    @FindBy(how = How.XPATH, using = userPassword) public WebElement password;
    @FindBy(how = How.XPATH, using = userZipCode) public WebElement zipCode;
    @FindBy(how = How.XPATH, using = userRegisterButton) public WebElement register;
    @FindBy(how = How.XPATH, using = validateUserAccountText) public WebElement accountText;
    @FindBy(how = How.XPATH, using = validateNegativeText) public WebElement negativeText;
    @FindBy(how = How.XPATH, using = logInBox) public WebElement logBox;
    @FindBy(how = How.XPATH, using = logInEmail) public WebElement logEmail;
    @FindBy(how = How.XPATH, using = logInPassword) public WebElement logPassword;
    @FindBy(how = How.XPATH, using = logInButton) public WebElement logButton;
    @FindBy(how = How.XPATH, using = logHeaderText) public WebElement headerText;


//    Action Method Possitive Test case
    public void userAccount() throws InterruptedException {
        Thread.sleep(5000);
        userAccount.click();
        signUp.click();
        Thread.sleep(2000);
        emailAddress.sendKeys("pnt30235_NY@gmail.com");
        password.sendKeys("Pnt@30235");
        zipCode.sendKeys("11416");
//        register.click();
        Thread.sleep(7000);
    }
//    Validation
    public void validateUserAccount(){
        String actualResult = "";
        String expectedResult = accountText.getText();
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");

    }
    //    Action Method Negative Test case (using same credential)
    public void userAccountNegative() throws InterruptedException {
        Thread.sleep(5000);
        userAccount.click();
        signUp.click();
        Thread.sleep(2000);
        emailAddress.sendKeys("pnt30235_NY@gmail.com");
        password.sendKeys("Pnt@30235");
        zipCode.sendKeys("11416");
        register.click();
    }
    //    Validation
    public void validateUserAccountNegative() {
        String actualResult = "This account already exists. Please log in.";
        String expectedResult = negativeText.getText();
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
//    Action Method
    public void logInCheck() throws InterruptedException {
        Thread.sleep(5000);
        userAccount.click();
        logBox.click();
        logEmail.sendKeys("pnt30235_NY@gmail.com");
        logPassword.sendKeys("Pnt@30235");
        logButton.click();
    }
//    Validation
    public void validateLogInCheck(){
        String actualResult = "Your email has not been verified";
        String expectedResult = headerText.getText();
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
    //    Action Method Negative Case (use same credential
    public void logInCheckNegative() throws InterruptedException {
        Thread.sleep(5000);
        userAccount.click();
        logBox.click();
        logEmail.sendKeys("pnt30235@gmail.com");
        logPassword.sendKeys("Pnt@12345");
        logButton.click();
    }
//    Validation
    public void validateLogInCheckNegative() {
        String actualResult = "You have entered an invalid username or password.";
        String expectedResult = negativeText.getText();
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println("PASSED");
    }

}
