package tripAdvisorHomeTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import tripAdvisorHome.TripAdvisorHome;

public class TripAdvisorHomeTest extends WebAPI {
    TripAdvisorHome tripAdvisorHome;

    @BeforeMethod
    public void getInIt(){
        tripAdvisorHome = PageFactory.initElements(driver, TripAdvisorHome.class);
    }

    @Test
    public void testHotelsButton() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHome.hotelsButton();
        tripAdvisorHome.validateHotelsButton();
    }
}
