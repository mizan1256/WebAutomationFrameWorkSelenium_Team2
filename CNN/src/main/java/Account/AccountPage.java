package Account;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static Account.AccountPageElement.*;


public class AccountPage extends WebAPI {

    @FindBy(how = How.CSS, using = loginLogoXPathWebElement)
    public WebElement loginLogo;
    @FindBy(how = How.XPATH, using = emailAddressXPathWebElement)
    public WebElement emailAddress;
    @FindBy(how = How.XPATH, using = passwordXPathWebElement)
    public WebElement password;
    @FindBy(how = How.XPATH, using = loginXPathWebElement)
    public WebElement loginButton;
    @FindBy(how = How.XPATH, using = signUpXPathWebElement)
    public WebElement signUp;
    @FindBy(how = How.XPATH, using = emailAddressToSignUpXPathWebElement)
    public WebElement emailAddressToSignUp;
    @FindBy(how = How.XPATH, using = passwordToSignUpXPathWebElement)
    public WebElement passwordToSignUp;
    @FindBy(how = How.XPATH, using = zipcodeToSignUpXPathWebElement)
    public WebElement zipcodeToSignUp;
    @FindBy(how = How.XPATH, using = registerButtonXPathWebElement)
    public WebElement registerButton;

public void elementToBeClickable(int timeInSec, WebElement element){
    WebDriverWait wait = new WebDriverWait(driver,timeInSec);
    wait.until(ExpectedConditions.elementToBeClickable(element));

}





    /**
     * login and validate if loginButton is there
     */
    //Action method
    public void login(){
        //click login
        loginLogo.click();
        elementToBeClickable(20,emailAddress);
        //enter email address
        emailAddress.sendKeys("mtt@gmail.com");
        //enter password
        elementToBeClickable(20,password);
        password.sendKeys("242245sfvdfbefbdbe@");
    }

    //validate method
    public void validateLogin(){
//        Boolean actualText=loginButton.isDisplayed();
//        Boolean expectedText= true;
        Assert.assertEquals(loginButton.isDisplayed(), true);
    }


    /**
     * sign up and validate the sign up button is there or not
     */

    //Action method
    public void signUp() {
        //click login
        loginLogo.click();
        //click signUp
        elementToBeClickable(20,signUp);
       signUp.click();
        //enter email Address To SignUp
        elementToBeClickable(20,emailAddressToSignUp);
        emailAddressToSignUp.sendKeys("mtts@gmail.com");
        //enter password
        elementToBeClickable(20,passwordToSignUp);
        passwordToSignUp.sendKeys("1234567TTdsd@");
        //enter zipcodeToSignUp
        elementToBeClickable(20,zipcodeToSignUp);
        zipcodeToSignUp.sendKeys("10462");
    }

    //validate method
    public void validateSignUp(){
        Assert.assertEquals(registerButton.isDisplayed(), true);
    }




}
