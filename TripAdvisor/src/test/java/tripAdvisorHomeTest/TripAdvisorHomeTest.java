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

    @Test(enabled = true)
    public void testHotelsButton() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHome.hotelsButton();
        tripAdvisorHome.validateHotelsButton();
    }
    @Test(enabled = true)
    public void testSearchBoxCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHome.searchBoxCheck("\"Mexico City\"");
        tripAdvisorHome.validateSearchBoxText("\"Mexico City\"");
    }
    @Test(enabled = true)
    public void testWhereToSearchButtonCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHome.whereToSearchBoxCheck("\"Queens\"");
       tripAdvisorHome.validateWhereToSearchButtonText("\"Queens\"");
    }
    @Test(enabled = true)
    public void testVacationRentalsButtonIsClickable() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHome.vacationRentalsButtonIsClickable();
        tripAdvisorHome.validateVacationRentalsButtonIsClickable();
    }
    @Test(enabled = true)
    public void testThingsToDoButtonIsClickable() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHome.thingsToDoButtonIsClickable();
        tripAdvisorHome.validateThingsToDoButtonIsClickable();
    }
    @Test(enabled = true)
    public void testRestaurantButtonIsClickable(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHome.restaurantButtonIsClickable();
        tripAdvisorHome.validateRestaurantButtonIsClickable();
    }
    @Test(enabled = true)
    public void testWriteAReviewButtonCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHome.writeAReviewButtonCheck();
        tripAdvisorHome.validateWriteAReviewButtonCheck("Review a place you've visited");
    }
    @Test
    public void testTravelForumsButtonCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHome.travelForumsButtonCheck();
        tripAdvisorHome.validateTravelForumsButtonCheck();
    }
    @Test
    public void testMoreButtonIsClickable() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHome.moreButtonIsClickable();
        tripAdvisorHome.validateMoreButtonIsClickable();
    }

    @Test
    public void testPostButtonIsClickable() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHome.postButtonClickable();
        tripAdvisorHome.validatePostButtonClickable();
    }
    @Test
    public void testAlertButtonClickable() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHome.alertButtonClickable();
        tripAdvisorHome.validateAlertButtonClickable();
    }

    @Test
    public void testTripsButtonClickable() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHome.tripsButtonClickable();
        tripAdvisorHome.validateTripsButtonClickable();
    }
}
