package registration;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static registration.CnnRegistrationPageWebElements.*;

public class CnnRegistrationPage extends WebAPI {
    @FindBy(how = How.XPATH,using = webElementsUserButton)
    public WebElement userAccountButton;

    @FindBy(how = How.XPATH,using = webElementsSingButton)
    public WebElement signUpButton;

    @FindBy(how = How.XPATH,using = webElementsUserEmailBox)
    public WebElement signUpEmail;

    @FindBy(how = How.XPATH,using = webElementsUserPasswordBox)
    public WebElement signUpPasswordBox;

    @FindBy(how = How.XPATH,using = webElementsUserZipBox)
    public WebElement signUpZipCode;

    @FindBy(how = How.XPATH,using = webElementsRegisterButton)
    public WebElement registrationButton;

    @FindBy(how = How.XPATH,using = webElementsRequiredText)
    public WebElement requiredText;

    @FindBy(how = How.XPATH,using = webElementsUserLogInEmailBox)
    public WebElement userLogInEmailBox;

    @FindBy(how = How.XPATH,using = webElementsUserLogInPassWordBox)
    public WebElement userLogInPasswordBox;

    @FindBy(how = How.XPATH,using = webElementsLogInButton)
    public WebElement userLogInButton;

    //Action
    public void checkSignUpButton() throws InterruptedException {
        userAccountButton.click();
        signUpButton.click();
        signUpEmail.sendKeys("pntitny@gmail.com");
        signUpPasswordBox.sendKeys("P1234567s@");
        signUpZipCode.sendKeys("11436");
        Thread.sleep(2000);
    }
    //Validate
    public void validateCheckSignUpButton() throws InterruptedException {
        String actualResult="";
        String expectedResult=requiredText.getText();
        Thread.sleep(300);
        Assert.assertEquals(actualResult,expectedResult,"Not exist");
    }
    //Negative test
    //Action
    public void checkSignUpButtonWithInvalidRequirements() throws InterruptedException {
        userAccountButton.click();
        signUpButton.click();
        signUpEmail.sendKeys("pni@gmail.com");
        signUpPasswordBox.sendKeys("e1234567s@");
        signUpZipCode.sendKeys("10000");
        Thread.sleep(2000);
    }
    //Validate
    public void validateCheckSignUpButtonWithInvalidRequirements() throws InterruptedException {
        String actualResult="";
        String expectedResult=requiredText.getText();
        Thread.sleep(300);
        Assert.assertEquals(actualResult,expectedResult,"Not exist");
    }
    //Action
    public void checkLogInButton() {
        userAccountButton.click();
        userLogInEmailBox.sendKeys("pntitny@gmail.com");
        userLogInPasswordBox.sendKeys("P1234567s@");
        userLogInButton.click();

    }
    //Validate
    public void validateCheckLogInButton()  {
        String actualResult = driver.getTitle();
        String expectedResult = "CNN - Breaking News, Latest News and Videos";
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");

    }
    //Negative test
    //Action
    public void checkLogInButtonWithWrongIdPassword() throws InterruptedException {
        userAccountButton.click();
        userLogInEmailBox.sendKeys("pnitny@gmail.com");
        userLogInPasswordBox.sendKeys("1234567s@");
        userLogInButton.click();
        Thread.sleep(2000);
    }
    //Validate
    public void validateCheckLogInButtonWithWrongIdPassword() throws InterruptedException {
        String actualResult = driver.getTitle();
        String expectedResult = "CNN - Breaking News, Latest News and Videos";
        Thread.sleep(2000);
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");

    }
}
