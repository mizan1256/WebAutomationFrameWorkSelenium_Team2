package targetsigninpage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static targetsigninpage.SignInPageWebElements.*;

public class SignInPage extends WebAPI {
    @FindBy(how = How.XPATH,using = webElementsSignInButton)
    public WebElement signInButton;

    @FindBy(how = How.XPATH,using = webElementsCreateAccountButton)
    public WebElement createAccountButton;

    @FindBy(how = How.XPATH,using = webElementsUserEmailId)
    public WebElement userEmailId;

    @FindBy(how = How.XPATH,using = webElementsUserFirstName)
    public WebElement userFirstName;

    @FindBy(how = How.XPATH,using = webElementsUserLastName)
    public WebElement userLastName;

    @FindBy(how = How.XPATH,using = webElementsUserMobileNumber)
    public WebElement userMobileNumber;

    @FindBy(how = How.XPATH,using = webElementsUserPasWord)
    public WebElement userPassword;

    @FindBy(how = How.XPATH,using = webElementsCreateAccountBox)
    public WebElement createAccountBox;

    //Action Method
    public void checkCreateAccount() throws InterruptedException {
        signInButton.click();
        Thread.sleep(3000);
        createAccountButton.click();
        userEmailId.sendKeys("pntitny@gmail.com");
        userFirstName.sendKeys("PNT");
        userLastName.sendKeys("IT");
        userMobileNumber.sendKeys("6464314010");
        userPassword.sendKeys("p1234567");
        createAccountBox.click();
        Thread.sleep(3000);
    }
    //Validate Method
    public void validateCheckCreateAccount() throws InterruptedException {
        String actualResult = "Target Login";
        Thread.sleep(3000);
        String expectedResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }
}