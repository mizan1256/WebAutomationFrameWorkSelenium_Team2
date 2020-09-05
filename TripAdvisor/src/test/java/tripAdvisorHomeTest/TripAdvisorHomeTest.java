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
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
      tripAdvisorHome.checkPostButton();
      tripAdvisorHome.validateCheckPostButton(driver.getTitle());
    }
    @Test
    public void testCheckTAPresspButton() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHome.checkTAPressButton();
        tripAdvisorHome.validateTAPressButton(driver.getTitle());
    }
    @Test
    public void testCheckTAOwnersButton() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHome.checkTAOwnersButton();
        tripAdvisorHome.validateCheckTAOwnersButton("Claim Your Free Tripadvisor Listing");
    }
    @Test
    public void testCheckTATravelersChoiceButton() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHome.checkTATravelersChoiceButton();
        tripAdvisorHome.validateCheckTATravelersChoiceButton("");
    }

}
