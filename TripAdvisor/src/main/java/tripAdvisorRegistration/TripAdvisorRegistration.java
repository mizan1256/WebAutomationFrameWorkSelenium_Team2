package tripAdvisorRegistration;


import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static tripAdvisorRegistration.TripAdvisorRegWebElement.*;

public class TripAdvisorRegistration extends WebAPI {

    @FindBy(how = How.XPATH, using = signUpTripAccAdvisorCheck)
    public WebElement signupText;

    public void signUpCreateTripAdvisor() throws InterruptedException {
        clickOnElement(signUpTripAdvisor);
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='_30pzQStV']")));
//      clickOnElement(signUpCapchaButton);
        clickOnElement(continueWithEmailButton);
        Thread.sleep(2000);
        clickOnElement(signUpButtonTripAdvisor);
        typeByXpath(signUpEmailAddressBox, "pnt30235_NY@gmail.com");
        typeByXpath(signupCreatePassword, "Pnt@30235");
        clickOnElement(signUpJoinRegButton);
    }

    // Validate Method
    public void validateSignUpCreateTripAdvisor(String expectedResult) {
        String actualResult = signupText.getText();
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println("PASSED");
    }


}
