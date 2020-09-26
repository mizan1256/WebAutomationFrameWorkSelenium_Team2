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
        tripAdvisorHome= PageFactory.initElements(driver, TripAdvisorHome.class);
    }

    @Test
    public void testHotelButtonIsClickable(){
        tripAdvisorHome.hotelsButtonIsClickable();
        tripAdvisorHome.validateHotelsButtonIsClickable("Nearby");
    }
    @Test
    public void testVacationRentalsButtonIsClickable(){
        tripAdvisorHome.vacationRentalsButtonIsClickable();
        tripAdvisorHome.validateVacationRentalsButtonIsClickable("Nearby");
    }
    @Test
    public void testThinksToDoButtonIsClickable(){
        tripAdvisorHome.thinksToDoButtonIsClickable();
        tripAdvisorHome.validateThinksToDoButtonIsClickable("Nearby");
    }
    @Test
    public void testSearchBoxIsClickable(){
        tripAdvisorHome.searchBoxIsDisplayed();
        tripAdvisorHome.validateSearchBoxIsDisplayed("Hotels");
    }
    @Test
    public void testSearchBoxCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHome.searchBoxCheck("\"Bangladesh\"");
        tripAdvisorHome.validateSearchBoxCheck();

    }
    @Test
    public void testRestaurantButton() throws InterruptedException {
        tripAdvisorHome.restaurantButton();
        tripAdvisorHome.validateRestaurantButton("");
    }
    @Test
    public void testWriteAReviewButtonIsDisplayed() throws InterruptedException {
        tripAdvisorHome.writeAReviewButtonIsDisplayed();
    }
    @Test
    public void testTravelForumsButtonIsClickable() throws InterruptedException {
        tripAdvisorHome.travelForumsButtonIsClickable();
    }
    @Test
    public void testMoreButtonIsClickable(){
        tripAdvisorHome.moreButtonIsClickable();
    }
//    @Test
//    public void testPostButtonIsClickable(){
//        tripAdvisorHome.postButtonIsClickable();
//    }
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
