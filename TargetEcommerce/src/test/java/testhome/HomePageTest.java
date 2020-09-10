package testhome;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    HomePage homePage;
    @BeforeMethod
    public void getInit(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void testSearchBoxIsDisplayed() throws InterruptedException {
        homePage.searchBoxIsDisplayed();
        homePage.validateSearchBoxIsDisplayed("More");
    }
    @Test
    public void testSearchBoxCheck() throws InterruptedException {
        homePage.searchBoxCheck();
    }
    @Test
    public void testSocialButtonIsDisplayed() throws InterruptedException {
        homePage.socialButtonIsDisplayed();
        homePage.validateSocialButtonText();
    }
    @Test
    public void testHelpButtonIsClicked() throws InterruptedException {
        homePage.helpButtonIsClicked();
        homePage.validateHelpButtonIsClicked("Feedback");
    }
    @Test
    public void testStoresButtonIsDisplayed() throws InterruptedException {
        homePage.storesButtonIsDisplayed();
        homePage.validateStoresButtonIsDisplayed("Featured categories");
    }
    @Test
    public void testAppsButtonIsClickable() throws InterruptedException {
        homePage.appsButtonIsClickable();
        homePage.validateAppsButtonIsClicked("Target for iOS");
    }
    @Test
    public void testMoreButtonIsSelectable() throws InterruptedException {
        homePage.moreButtonIsClickable();
        homePage.validateMoreButtonIsClickable("Emails");
    }
    @Test
    public void testShopAllIsDisplayed() throws InterruptedException {
        homePage.shopAllIsDisplayed();
        homePage.validateShopAllButtonCategoriesIsDisplayed("Featured categories");
    }
    @Test
    public void testfeaturesCategoriesIsDisplayed() throws InterruptedException {
        homePage.featuresCategoriesIsDisplayed();
        homePage.validateFeaturesCategoriesIsDisplayed("Shop all");
    }

//    @Test
//    public void testSearchTextIsDisplayed(){
//        homePage.
//    }
}
