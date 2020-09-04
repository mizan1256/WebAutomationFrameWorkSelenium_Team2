package tripAdvisorRegistration;

import common.WebAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static tripAdvisorRegistration.TaRegistrationWebElement.*;

public class TaRegistrationPage extends WebAPI {
    @FindBy(how = How.XPATH, using = tripAdvisorSignInButtonWebElement)
    public WebElement tripAdvisorSignInButton;

    @FindBy(how = How.XPATH, using = imNotARobotButtonWebElement)
    public WebElement imNotARobotButton;

    @FindBy(how = How.XPATH, using = continueWithEmailButton)
    public WebElement continueWithEmail;

    @FindBy(how = How.XPATH, using = signUpButtonWebElement)
    public WebElement signUpButton;

    @FindBy(how = How.XPATH, using = signUpEmailWebElem)
    public WebElement signUpEmail;

    @FindBy(how = How.XPATH, using = signUpPasswordWebElement)
    public WebElement signUpPassword;

    @FindBy(how = How.XPATH, using = joinButtonWebElement)
    public WebElement joinButton;

    @FindBy(how = How.XPATH, using = signIneEmailBoxWebElement)
    public WebElement signInEmailBox;

    @FindBy(how = How.XPATH, using = signInPasswordBoxWebElement)
    public WebElement signInPassword;

    @FindBy(how = How.XPATH, using = logInButtonWebElement)
    public WebElement logInButton;

    @FindBy(how = How.XPATH, using = tripAdvRegIframeWebElement)
    public WebElement tripAdvRegIframe;


    //Action
    public void signInButtonCheck(){
        tripAdvisorSignInButton.click();
    }//Validate
    public void validateSignInButtonCheck(){
        Assert.assertEquals("Tripadvisor: Read Reviews, Compare Prices & Book",driver.getTitle());
    }

    //Action
    public void signUpCheck() throws InterruptedException {
        tripAdvisorSignInButton.click();
        // Alert alert= driver.switchTo().alert();
        // alert.dismiss();
        driver.switchTo().frame(tripAdvRegIframe);
        Thread.sleep(3000);
        continueWithEmail.click();
        signUpButton.click();
        //imNotARobotButton.click();
        Thread.sleep(5000);
        signUpEmail.sendKeys("pnt30242@gmail.com");
        Thread.sleep(5000);
        signUpPassword.sendKeys("Pnt@30242");
        Thread.sleep(5000);
        joinButton.click();

    }//Validate
    public void validateSignUpCheck(){
        Assert.assertEquals("Tripadvisor: Read Reviews, Compare Prices & Book", driver.getTitle());
    }

    //Action
    public void signInToTripAdvisor() throws InterruptedException {
        tripAdvisorSignInButton.click();
        driver.switchTo().frame(tripAdvRegIframe);
        Thread.sleep(3000);
        imNotARobotButton.click();
        Thread.sleep(3000);
        continueWithEmail.click();
        Thread.sleep(3000);
        signInEmailBox.sendKeys("pnt30242@gmail.com");
        Thread.sleep(3000);
        signInPassword.sendKeys("Pnt@30242");
        logInButton.click();
    }
    //Validate
    public void testSignInToTripAdvisor(){
    Assert.assertEquals("Tripadvisor: Read Reviews, Compare Prices & Book",driver.getTitle());
    }
}
