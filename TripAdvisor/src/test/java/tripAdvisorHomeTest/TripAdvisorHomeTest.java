package tripAdvisorHomeTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import tripAdvisorHome.TripAdvisorHome;

public class TripAdvisorHomeTest extends WebAPI {

    TripAdvisorHome homePage;

    @BeforeMethod
    public void getInIt(){
        homePage= PageFactory.initElements(driver,TripAdvisorHome.class);
    }

    @Test
    public void testTripAdvisorSearch() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.tripAdvisorSearch();
        homePage.validateTripAdvisorSearch();
    }

    @Test
    public void testTripAdvisorLogo() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.tripAdvisorLogo();
    }
    @Test
    public void testTripAdvisorHotels() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.tripAdvisorHotels();
        homePage.validateTripAdvisorHotels("Bangladesh Hotels");
    }
    @Test
    public void testTripAdvisorWriteReview() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.tripAdvisorWriteReview();
        homePage.validateTripAdvisorWriteReview("Starbucks");
    }


}
