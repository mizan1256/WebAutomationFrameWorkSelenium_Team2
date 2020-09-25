package tripAdvisorTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import tripAdvisorHome.TripAdvisorHomePage;

public class TripAdvisorHomeTest extends WebAPI {


//Js Executor
//    public static void selectDateByJS(WebDriver driver, WebElement element, String dateValue){
//        JavascriptExecutor js=((JavascriptExecutor)driver);
//        js.executeScript("arguments[0].setAttribute('value','"+dateValue+"');",element);
//    }


    TripAdvisorHomePage tripAdvisorHomePage;

    @BeforeMethod
    public void getInIt(){
        tripAdvisorHomePage = PageFactory.initElements(driver,TripAdvisorHomePage.class);
    }

    @Test
    public void test() throws InterruptedException {
        tripAdvisorHomePage.searchBoxClickable();
    }
    @Test
    public void testTripAdvisorWhereToSearchBox() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHomePage.tripAdvisorWhereToSearchBox();
        tripAdvisorHomePage.validateTripAdvisorWhereToSearchBox("Texas");
    }
    @Test
    public void testTripAdvisorHotelTabButton()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHomePage.tripAdvisorHotelTabButton();
        tripAdvisorHomePage.validateTripAdvisorWhereToSearchBox("Hotels matching \"Texas\"");
    }
    @Test
    public void testTripAdvisorVacationRentalsTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHomePage.tripAdvisorVacationRentalsTab();
        tripAdvisorHomePage.validateTripAdvisorVacationRentalsTab("Vacation rentals matching \"Texas\"");
    }
    @Test
    public void testTripAdvisorGageHotelCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHomePage.tripAdvisorGageHotelCheck();
        tripAdvisorHomePage.validateTripAdvisorGageHotelCheck("Gage Hotel");
    }
    @Test
    public void testTripAdvisorGageHotelCheckIn() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tripAdvisorHomePage.tripAdvisorGageHotelCheckIn();
    }






}
