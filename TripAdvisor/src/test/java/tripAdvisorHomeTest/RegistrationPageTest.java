package tripAdvisorHomeTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tripAdvisorHome.TripAdvisorHome;
import tripAdvisorRegistration.RegistrationPage;

public class RegistrationPageTest extends WebAPI {
    RegistrationPage registrationPage;
    @BeforeMethod
    public void getInit(){
        registrationPage= PageFactory.initElements(driver,RegistrationPage.class);
    }
    @Test
    public void testCheckTaRegistration() throws InterruptedException {
        registrationPage.checkTaRegistration();
        registrationPage.validateCheckTaRegistration(driver.getTitle());
    }
}