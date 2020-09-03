package testgeicohome;

import common.WebAPI;
import geicohomepage.GeicoHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class GeicoHomePageTest extends WebAPI {

    GeicoHomePage geicoHomePage;

    @BeforeMethod
    public void getInit() {
        geicoHomePage = PageFactory.initElements(driver, GeicoHomePage.class);
    }

    @Test
    public void testLogoIsDisplayed() throws InterruptedException {
        geicoHomePage.logoIsDisplayed();
    }

    @Test
    public void testCovidTab() {
        geicoHomePage.covidTab();
    }

    @Test
    public void testAutoTab() throws InterruptedException {
        geicoHomePage.autoTab();
    }

    @Test
    public void testSearchButtonCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        geicoHomePage.searchButtonCheck();
        geicoHomePage.validateSearchButtonCheck("Site Search");
    }
    @Test
    public void testAutoSearchSite() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        geicoHomePage.searchButtonCheck();
        geicoHomePage.validateAutoSearchSite("Site Search");
    }


}
