package tripAdvisorHomeTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tripAdvisorRegistration.TripAdvisorRegPage;


public class RegistrationPageTest extends WebAPI {
    TripAdvisorRegPage tripAdvisorRegPage;
    @BeforeMethod
    public void getInit(){
        tripAdvisorRegPage= PageFactory.initElements(driver,TripAdvisorRegPage.class);
    }
    @Test
    public void testCheckTaRegistration() throws InterruptedException {
        tripAdvisorRegPage.checkTaRegistration();
        tripAdvisorRegPage.validateCheckTaRegistration(driver.getTitle());
    }

}
