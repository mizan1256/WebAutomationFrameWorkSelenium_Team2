package registration;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.CnnHomePageWebElement.webElementLogInIcon;
import static registration.RegistrationWebElement.*;

public class RegistrationPage extends WebAPI {
    @FindBy(how = How.XPATH, using = webElementLogInIcon)
    public WebElement cnnLogInIcon;
    @FindBy(how = How.XPATH, using = webElementSignUp)
    public WebElement cnnSignUpButton;
    @FindBy(how = How.XPATH, using = webElementSignUpEmail)
    public WebElement cnnSignUpEmail;
    @FindBy(how = How.XPATH, using = webElementSignUpPassword)
    public WebElement cnnSignUpPassword;
    @FindBy(how = How.XPATH, using = webElementSignUpZipcode)
    public WebElement cnnSignUpZipCode;
    @FindBy(how = How.XPATH, using = webElementRagistButton)
    public WebElement cnnRagistrationButton;
    @FindBy(how = How.XPATH, using = webElementLogInEmail)
    public WebElement cnnLogInEmail;
    @FindBy(how = How.XPATH, using = webElementLogInPassword)
    public WebElement cnnLogInPassword;
    @FindBy(how = How.XPATH, using = webElementLogInButton)
    public WebElement cnnLogInButton;
    @FindBy(how = How.XPATH, using = webElementSignUpZipcode)
    public WebElement cnnZipCodeBox;
    @FindBy(how = How.XPATH, using = getWebElementZipCodeButton)
    public WebElement cnnZipCodeButton;

    public void cnnZipCodeBox() {

        cnnZipCodeBox.sendKeys("12345");
        cnnZipCodeButton.submit();
    }

    /**
     *
     * @ CNN Fanctional test
     */
    public void cnnSignUp() throws InterruptedException {
        cnnLogInIcon.click();
        Thread.sleep(3000);
        cnnSignUpButton.click();
        Thread.sleep(3000);
        cnnSignUpEmail.sendKeys("yeasmin@gmail.com");
        cnnSignUpPassword.sendKeys("P30242");
        cnnSignUpZipCode.sendKeys("12345");
        cnnRagistrationButton.click();
    }

    public void validateCnnSignUp() {
        System.out.println(driver.getTitle());

    }

    public void cnnAccountLogIn() throws InterruptedException {
        cnnLogInIcon.click();
        Thread.sleep(3000);
        cnnLogInEmail.sendKeys("yeasmin@gmail.com");
        cnnLogInPassword.sendKeys("P30242");
        cnnLogInButton.click();
    }

    public void validateCnnAccountLogIn() {
        Assert.assertEquals("CNN - Breaking News, Latest News and Videos", driver.getTitle());
    }
}
