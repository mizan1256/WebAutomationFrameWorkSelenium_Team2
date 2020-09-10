package tripAdvisorHomeTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tripAdvRegiHome.TripAdvRegiHome;
import tripAdvisorHome.TripAdvisorHome;

public class TripAvdRegiHomeTest extends WebAPI {
    TripAdvRegiHome tripAdvRegiHome;

    @BeforeMethod
    public void getInit(){
        tripAdvRegiHome= PageFactory.initElements(driver, TripAdvRegiHome.class);
    }

    @Test
    public void testSignUpTripAdvisor() throws InterruptedException {
        tripAdvRegiHome.signUpTripAdvisor();
    }

//    @Test
//    public void testHotelButtonIsClickable(){
//        tripAdvisorHome.hotelButtonIsClickable();
}
