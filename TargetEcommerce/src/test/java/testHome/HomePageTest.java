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

    @Test
    public void testwebElementSearchBox() {
        homePage.searchBoxCheck();

    }

    @Test
    public void testSearchButton() throws InterruptedException {
        homePage.searchBoxButtonCheck("iphone");
        homePage.validateSearchText();
    }

    @Test
    public void testWeeklyAd() throws InterruptedException {
        homePage.checkWebElementWeeklyAd();
        homePage.validatewebElementWeeklyAdText();
    }

    @Test
    public void testDeal() throws InterruptedException {
        homePage.checkNavigateDeals();
        homePage.validateNavigateDealFor();
    }

    @Test
    public void testCatagories() throws InterruptedException {
        homePage.checkCategories();
        homePage.validateNavigateCategories();
    }

    @Test
    public void testWhatsNew() throws InterruptedException {
        homePage.checkwhatsNewButton();
        homePage.validateNavigateWhatsNew();
    }

    @Test
    public void testSameDayDelivery() throws InterruptedException {
        homePage.checkSameDayDelivery();
        homePage.validateNavigateSameDayDelivery();
    }

    @Test
    public void testRegistery() throws InterruptedException {
        homePage.checkRegistryButton();
        homePage.validatenavigateRegistryText();
    }

    @Test
    public void testSearchIphone() {
        homePage.searchiphone();
    }

    @Test
    public void testAllThingsSchoolInDisplay() {
        homePage.searchAllThingsSchool();
    }

    @Test
    public void testFrontImageInDisplay() {
        homePage.searcFrontImageDisplay();
    }

    @Test
    public void testMoreOption() throws InterruptedException {
        homePage.searchMoreOption();
        homePage.validateMoreOptionText();
    }

    @Test
    public void testShoppingCartLogoIsDisplay() {
        homePage.shoppingCartLogoIsDisplay();
    }

    @Test
    public void testalidateShoppingCartLogoIsClickable() throws InterruptedException {
        homePage.shoppingCartLogoIsClickable();
        homePage.validateShoppingCartLogoIsClickable();
    }
    @Test
    public void testRedCardLandedPage(){
        homePage.redCardLandedPage();
        homePage.validateRedCardLandedPage();
    }
    @Test
    public void testValidateRedCardExclusivePage() throws InterruptedException {
        homePage.redCardExclusivePage();
        homePage.validateRedCardExclusivePage();
    }
    @Test
    public void testShowMoreButton(){
        homePage.showMoreButton();
        homePage.validateShowMoreButton();
    }
    @Test
    public void testMoreDetailsbutton() throws InterruptedException {
        homePage.moreDetailsbutton();
        homePage.validatemoreDetailsbutton();
    }
    @Test
    public void testAtHomeLearning() throws InterruptedException {
        homePage.atHomeLearning();
        homePage.testAtHomeLearning();
    }


}







