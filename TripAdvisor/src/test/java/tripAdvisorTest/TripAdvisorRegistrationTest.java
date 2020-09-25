package tripAdvisorTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import tripAdvisorRegistration.TripAdvisorRegistration;

public class TripAdvisorRegistrationTest extends WebAPI {

    TripAdvisorRegistration tripAdvisorRegistration;
    @BeforeMethod
    public void getInIt(){
        tripAdvisorRegistration= PageFactory.initElements(driver,TripAdvisorRegistration.class);
    }

    @Test
    public void testSignUpTripAdvisor() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorRegistration.signUpCreateTripAdvisor();
        tripAdvisorRegistration.validateSignUpCreateTripAdvisor("Either your email or password was incorrect. Please try again or click the \"Forgot password?\" link below");
    }
}
