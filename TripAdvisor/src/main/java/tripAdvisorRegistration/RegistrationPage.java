package tripAdvisorRegistration;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static tripAdvisorRegistration.RegistrationPageWebElements.*;

public class RegistrationPage  extends WebAPI {
    @FindBy(how = How.XPATH,using = webElementsTripAdvisorSignINButton) public WebElement signINButton;
    @FindBy(how = How.XPATH,using = webElementsTripAdvisorIframe) public WebElement tripAdvisorIframe;
    @FindBy(how = How.XPATH,using = webElementsTripAdvisorContinueEmail) public WebElement taContinueEmailButton;
    @FindBy(how = How.XPATH,using = webElementsTripAdvisorSignUpButton) public WebElement taSignUpButton;
    @FindBy(how = How.XPATH,using = webElementsTripAdvisorEmailBox) public WebElement taContinueEmailBox;
    @FindBy(how = How.XPATH,using = webElementsTripAdvisorPassWordBox) public WebElement taPassWordBox;
    @FindBy(how = How.XPATH,using = webElementsTripAdvisorJoinButton) public WebElement taJoinButton;

    //Action Method
    public void checkTaRegistration() throws InterruptedException {
        signINButton.click();
        driver.switchTo().frame(tripAdvisorIframe);
        Thread.sleep(3000);
        taContinueEmailButton.click();
        taSignUpButton.click();
        taContinueEmailBox.sendKeys("pntitny@gmail.com");
        taPassWordBox.sendKeys("Ta12345678");
        taJoinButton.click();
        Thread.sleep(2000);
    }
    //Validate Method
    public void validateCheckTaRegistration(String expectedResult) throws InterruptedException {
        String actualResult = "Tripadvisor: Read Reviews, Compare Prices & Book";
        Thread.sleep(3000);
        Assert.assertEquals(actualResult,expectedResult, "Text don't match");

    }
}

