package unitedAirLinesTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import unitedAirLinesHome.UnitedAirLinesHomePage;

public class UnitedAirLinesHomePageTest extends WebAPI {

    UnitedAirLinesHomePage unitedAirLinesHomePage;

    @BeforeMethod
    public void gitInIt() {
        unitedAirLinesHomePage = PageFactory.initElements(driver, UnitedAirLinesHomePage.class);
    }

    @Test
    public void testUnitedAirlinesLogoIsDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        unitedAirLinesHomePage.unitedAirlinesLogoIsDisplayed();
    }

    @Test
    public void testBookTabCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        unitedAirLinesHomePage.bookTabCheck();
        unitedAirLinesHomePage.validateBookTabCheck("We're here for you");
    }

    @Test
    public void testTravelInfoTabCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        unitedAirLinesHomePage.travelInfoTabCheck();
        unitedAirLinesHomePage.validateTravelInfoTabCheck("Timetable\n" + "You are here.");
    }
}
