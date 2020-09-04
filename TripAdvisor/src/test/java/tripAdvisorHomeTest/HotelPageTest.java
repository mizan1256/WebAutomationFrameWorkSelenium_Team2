package tripAdvisorHomeTest;

import common.WebAPI;
import hotelPage.HotelPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tripAdvisorHome.TripAdvisorHome;

public class HotelPageTest extends WebAPI {
    HotelPage hotelPage;
    TripAdvisorHome tripAdvisorHome;

    @BeforeMethod
    public void getInIt() {
        hotelPage = PageFactory.initElements(driver, HotelPage.class);
    }

    @Test
    public void testHotelButton() throws InterruptedException {
        hotelPage.hotelsButton();
    }
    @Test
    public void testHotelsCheckIn() throws InterruptedException {
        hotelPage.hotelsCheckIn();
    }
}