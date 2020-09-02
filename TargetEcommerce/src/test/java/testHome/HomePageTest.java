package testHome;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    HomePage homePage;
    @BeforeMethod
    public void getInIt(){
       homePage= PageFactory.initElements(driver, HomePage.class);
    }
//Action Method
    @Test(enabled = false)
    public void testTergetLogoIsDisplayed(){
        homePage.tergetLogoIsDisplayed();
//    Action Method
    }
    @Test(enabled = false)
    public void testRegistryLandedPage(){
        homePage.registryLandedPage();
    }
//    Action Method
    @Test(enabled = false)
    public void testHalloweenButton() throws InterruptedException {
        homePage.actionHalloweenButton();
    }
//    Action Method
    @Test(enabled = false)
    public void testMoreButton(){
        homePage.ActionMoreButton();
    }
    @Test(enabled = false)
    public void testSameDayDeliveryButton() throws InterruptedException {
        homePage.actionSameDayDeliveryButton();
    }
    @Test(enabled = false)
    public void testHomePageImageDisplay(){
        homePage.actionHomePageImage();
    }
    @Test(enabled = false)
    public void testBabyButton() throws InterruptedException {
        homePage.actionBabyButton();
        homePage.validationHomePageImage();
    }
    @Test(enabled = false)
    public void testClearanceTabLanded() throws InterruptedException {
        homePage.actionClearanceButton();
        homePage.validationClearanceButton();
    }
    @Test(enabled = false)
    public void testHelpButtonClickable() throws InterruptedException {
        homePage.helpButtonClickable();
        homePage.validationHelpButton();
    }
    @Test
    public void testPrivacyButtonClickable() throws InterruptedException {
        homePage.privacyButtonClickable();
    }
}
