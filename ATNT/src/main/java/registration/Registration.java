package registration;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static registration.RegistrationWebElement.*;

public class Registration extends WebAPI {

    @FindBy(how = How.XPATH, using = passwordXpathWebElement)
    public WebElement password;
    @FindBy(how = How.XPATH, using = doubleCheckMessageForSignInXpathWebElement)
    public WebElement doubleCheckMessageForSignIn;


    /**
     * click on account
     *  click on sign in
     *  type userid and password
     *  validate the error message as there is no account associated w/info
     */
//actionmethod
    public void signIn(){
        clickOnElement(accountXpathWebElement);
        clickOnElement(signInXpathWebElement);
        typeOnElement(userIdXpathWebElement,"mtt123124@gmail.com");
        typeOnElementNEnter(passwordXpathWebElement,"Acdse123@");
        //clickOnElement(signInButtonCSSWebElement);
    }
//validate method
    public void validateSignIn(){
        boolean actual=doubleCheckMessageForSignIn.isDisplayed();
        Assert.assertEquals(actual,true);
    }



}
