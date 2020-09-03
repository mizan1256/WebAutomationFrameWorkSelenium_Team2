package tripAdvisorHomeTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import tripAdvisorHome.TripAdvisorHome;

public class TripAdvisorHomeTest extends WebAPI {

    TripAdvisorHome myTripAdvisor;

    @BeforeMethod
    public void getInIt() {
        myTripAdvisor = PageFactory.initElements(driver, TripAdvisorHome.class);
    }


    @Test
    public void validate_SearchBoxCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        myTripAdvisor.searchBoxCheck("\"Sylhet City\"");
    }
}