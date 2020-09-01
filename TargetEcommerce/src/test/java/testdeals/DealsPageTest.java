package testdeals;

import common.WebAPI;
import deals.DealsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DealsPageTest extends WebAPI {

    DealsPage dealsPage;

    @BeforeMethod
    public void getInit() {
        dealsPage = PageFactory.initElements(driver, DealsPage.class);
    }

    @Test
    public void testClearancePage() {
        dealsPage.checkClearancePage();
        dealsPage.validateClearancePage();
    }

    @Test
    public void testWeeklyAdPage() {
        dealsPage.checkWeeklyAdPage();
        dealsPage.validateWeeklyAdPage();
    }

    @Test
    public void testTopDealsPage() {
        dealsPage.checkTopDeals();
        dealsPage.validateTopDealsPage();
    }

    @Test
    public void testRedCardPage() {
        dealsPage.checkRedCardPage();
        dealsPage.validateRedCardPage();
    }

    @Test
    public void testTargetCircleOfferPage() {
        dealsPage.checkTargetCircleOffers();
        dealsPage.validateTargetCircleOffer();
    }


}
