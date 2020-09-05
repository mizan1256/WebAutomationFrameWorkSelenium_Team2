package unitedAirLinesTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import unitedAirlinesRegistration.UnitedAirlinesRegistrationPage;

public class UnitedAirlinesRegistrationPageTest extends WebAPI {

    UnitedAirlinesRegistrationPage unitedAirlinesRegistrationPage;

    @BeforeMethod
    public void gitInIt() {
        unitedAirlinesRegistrationPage = PageFactory.initElements(driver, UnitedAirlinesRegistrationPage.class);
    }

    @Test
    public void testCreateSignInAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        unitedAirlinesRegistrationPage.createSignInAccount();
    }

    @Test
    public void testFindFlightDestination() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        unitedAirlinesRegistrationPage.findFlightDestination();
        unitedAirlinesRegistrationPage.validateFindFlightDestination("Map Search");
    }

    @Test
    public void testFindFlightDateCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        unitedAirlinesRegistrationPage.findFlightDateCheck();
        unitedAirlinesRegistrationPage.validatefindFlightDateCheck("Map Search");
    }

    @Test
    public void testNumberOfPassengerCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        unitedAirlinesRegistrationPage.numberOfPassengerCheck();
        unitedAirlinesRegistrationPage.validateNumberOfPassengerCheck("One-way");
    }
    @Test
    public void testPassengerClassCheck() throws InterruptedException {
        unitedAirlinesRegistrationPage.passengerClassCheck();
    }


}
