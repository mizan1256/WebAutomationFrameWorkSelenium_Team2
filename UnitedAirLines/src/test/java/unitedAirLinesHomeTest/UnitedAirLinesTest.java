package unitedAirLinesHomeTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import unitedAirLinesHome.UnitedAirLinesHome;

public class UnitedAirLinesTest extends WebAPI {

    UnitedAirLinesHome unitedAirLinesHome;


    @BeforeMethod
    public void getInIt(){
        unitedAirLinesHome= PageFactory.initElements(driver,UnitedAirLinesHome.class);
    }

    @Test
    public void testCnnSingIn() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        unitedAirLinesHome.UnitedLogo();
    }
    @Test
    public void testUnitedSearchBox() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        unitedAirLinesHome.UnitedSearchCheck();
        unitedAirLinesHome.UnitedValidateSearchText("Site search Results");
    }
    @Test
    public void testUnitedSaveTrips() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        unitedAirLinesHome.UnitedSaveTripsCheck();
    }
    @Test
    public void testUnitedAlerts() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        unitedAirLinesHome.UnitedAlertsCheck();
        unitedAirLinesHome.UnitedValidateAlertsText("My trips");
    }
    @Test
    public void testUnitedCustomerSafety() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        unitedAirLinesHome.UnitedCustomerSafetyCheck();
        unitedAirLinesHome.UnitedValidateCustomerSafetyText("United CleanPlus");
    }
    @Test
    public void testUnitedTripOverview() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        unitedAirLinesHome.UnitedTripOverviewCheck();
        unitedAirLinesHome.UnitedValidateTripOverviewText("International travel");
    }
    @Test
    public void testUnitedBookFlight() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        unitedAirLinesHome.UnitedBookFlightCheck();
        unitedAirLinesHome.UnitedValidateBookFlightText("Book a flight");
    }
    @Test
    public void testUnitedHelp() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        unitedAirLinesHome.UnitedHelpCheck();
        unitedAirLinesHome.UnitedValidateHelpText("There are two ways you can pay for your checked bags before your flight.");
    }
    @Test
    public void testUnitedLanguages() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        unitedAirLinesHome.UnitedLanguagesCheck();
    }
    @Test
    public void testUnitedSignIn() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        unitedAirLinesHome.UnitedSignInCheck();
    }




}
