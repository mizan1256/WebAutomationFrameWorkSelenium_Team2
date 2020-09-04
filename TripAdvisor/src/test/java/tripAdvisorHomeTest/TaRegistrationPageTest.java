package tripAdvisorHomeTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tripAdvisorRegistration.TaRegistrationPage;

public class TaRegistrationPageTest extends WebAPI {
    TaRegistrationPage taRegistrationPage;
    @BeforeMethod
    public void getInIt(){
        taRegistrationPage= PageFactory.initElements(driver, TaRegistrationPage.class);
    }
    @Test
    public void testSignInButtonCheck(){
        taRegistrationPage.signInButtonCheck();
        taRegistrationPage.validateSignInButtonCheck();
    }
    @Test
    public void testSignUpCheck() throws InterruptedException {
        taRegistrationPage.signUpCheck();
        taRegistrationPage.validateSignUpCheck();
    }
    @Test
    public void testSignInToTripAdvisor() throws InterruptedException {
        taRegistrationPage.signInToTripAdvisor();
        taRegistrationPage.testSignInToTripAdvisor();
    }

}
