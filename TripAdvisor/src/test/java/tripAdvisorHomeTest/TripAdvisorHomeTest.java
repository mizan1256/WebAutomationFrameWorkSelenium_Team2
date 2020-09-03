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
    public void getInit(){
        tripAdvisorHome= PageFactory.initElements(driver,TripAdvisorHome.class);
    }
    @Test
    public void testCheckSearchBoxText() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHome.checkSearchBoxText("\"Cox's Bazar\"");
        tripAdvisorHome.validateCheckSearchBoxText("Top results matching \"\"Cox's Bazar\"\"");
    }
    @Test
    public void testCheckPostButton() throws InterruptedException {
      tripAdvisorHome.checkPostButton();
      tripAdvisorHome.validateCheckPostButton(driver.getTitle());
    }
}
