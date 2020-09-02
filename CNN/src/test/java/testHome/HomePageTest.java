package testHome;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    HomePage homePage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(enabled =false)
    public void testMenu() {//works
        homePage.menuOption();
        homePage.validateMenuOption();
    }

    @Test
    public void testMenuOption() throws InterruptedException {//works
        homePage.menuSearchOption();
        homePage.validateMenuSearchOption();
    }
    @Test(enabled =false)
    public void testLiveTV() {//works
        homePage.liveTV();
        homePage.validateLiveTV();
    }
    @Test(enabled =false)
    public void testShowsLiveTV() {
        homePage.showsLiveTV();
        homePage.validateShowsLiveTV();
    }
    @Test(enabled =false)
    public void testLiveTvSettingButton() {
        homePage.liveTvCheckUrl();
        homePage.validateLiveTvCheckUrl();
    }
    @Test(enabled =false)
    public void testUSHomePage() {
        homePage.USHomePage();
        homePage.validateUSHomePage();
    }

    @Test(enabled =false)
    public void testeditionDropDownCheck() {
        homePage.editionDropDownCheck();
        homePage.validateEditionDropDownCheck();
    }
    @Test(enabled =false)
    public void testEditionDropDownEspanolCheck() throws InterruptedException {
        homePage.editionDropDownEspanolCheck();
        homePage.validateEditionDropDownEspanolCheck();
    }

    @Test(enabled =false)
    public void testLiveUpdates() {
        homePage.liveUpdates();
        homePage.validateLiveUpdates();
    }
    @Test(enabled =false)
    public void testworld() {
        homePage.world();
        homePage.validateWorld();
    }
//    @Test
//    public void testLiveUpdatesExport() {
//        homePage.liveUpdatesExport();
////        homePage.validateLiveUpdatesScroll();
//    }


}