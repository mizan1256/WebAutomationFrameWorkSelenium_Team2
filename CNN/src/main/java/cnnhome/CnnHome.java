package cnnhome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static cnnhome.CnnWebElements.*;

public class CnnHome extends WebAPI {

    @FindBy (how = How.XPATH, using = webElementsSignIn) public WebElement SignIn;
    @FindBy (how=How.XPATH, using = webElementsUserName) public WebElement UserName;
    @FindBy (how=How.XPATH, using =  webElementsPassword) public WebElement Password;
    @FindBy (how=How.XPATH, using =  webElementsLogIn) public WebElement LogIn;
    @FindBy (how=How.XPATH, using =  webElementsForgot) public WebElement Forgot;
    @FindBy (how=How.XPATH, using =  webElementsEmail) public WebElement Email;
    @FindBy (how=How.XPATH, using =  webElementsResat) public WebElement Resat;
    @FindBy (how=How.XPATH, using =  webElementsClear) public WebElement Clear;





    public void cnnSingIn() throws InterruptedException {
        SignIn.click();
        Thread.sleep(2000);
        UserName.sendKeys("Arman.Hossain");
        Thread.sleep(2000);
        Password.sendKeys("12345");
        Thread.sleep(2000);
        LogIn.click();
        Thread.sleep(2000);
        Forgot.click();
        Thread.sleep(2000);
        Email.sendKeys("dbfjanhfnahffnjakha");
        Thread.sleep(2000);
        Resat.click();
        Thread.sleep(2000);
        Email.clear();
        Thread.sleep(2000);
    }

    public void validateCnnSingIn(){

    }



}
