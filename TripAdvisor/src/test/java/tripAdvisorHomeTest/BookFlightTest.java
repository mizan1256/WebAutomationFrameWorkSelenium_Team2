package tripAdvisorHomeTest;

import bookFlight.BookFlightHome;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookFlightTest extends WebAPI {
    BookFlightHome bookFlightHome;
    @BeforeMethod
    public void getInIt(){
        bookFlightHome= PageFactory.initElements(driver, BookFlightHome.class);
    }
    @Test
    public void testMoreButtonCheck() throws InterruptedException {
        bookFlightHome.moreButtonCheck();

    }
    @Test
    public void testSelectBookAFlight() throws InterruptedException {
        bookFlightHome.selectBookAFlight();
    }
    @Test
    public void testCalenderCheck() throws InterruptedException {
        bookFlightHome.calenderCheck();
    }
}
