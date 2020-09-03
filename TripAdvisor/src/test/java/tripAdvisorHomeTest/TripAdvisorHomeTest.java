package tripAdvisorHomeTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import tripAdvisorHome.TripAdvisorHomePage;

public class TripAdvisorHomeTest extends WebAPI{

    TripAdvisorHomePage tripAdvisorHomePage;

    @BeforeMethod
    public void getInIt(){
        tripAdvisorHomePage = PageFactory.initElements(driver,TripAdvisorHomePage.class);
    }
    @Test
    public void testSearchBoxCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHomePage.searchBoxCheck();
    }
    @Test
    public void test() throws InterruptedException {
        tripAdvisorHomePage.searchBoxClickable();
    }
}
