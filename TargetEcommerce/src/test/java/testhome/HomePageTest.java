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
        homePage = PageFactory.initElements(driver, HomePage.class);

    }
    @Test
    public void testSearchBoxIsDisplayed(){
        homePage.searchBoxIsDisplayed();
    }
    @Test
    public void testSearchBoxCheck() throws InterruptedException {
        homePage.searchBoxCheck("face mask");
        homePage.validateSearchText();
    }
    @Test
    public void testTargetLogoIsDisplayed(){
        homePage.targetLogoIsDisplayed();
    }
    @Test
    public void testDisposableMaskIsDisplayed() throws InterruptedException {
        homePage.disposableMaskIsDisplayed("Face Masks");
        homePage.validateFaceMasks();
    }
    @Test
    public void testClearanceImage() throws InterruptedException {
        homePage.clearanceImage();
        homePage.validateClearanceImage();
    }
    @Test
    public void testWeeklyAdClickable(){
        homePage.weeklyAdClickable();
    }
    @Test
    public void testGiftCardPageLanded(){
        homePage.giftCardPageLanded();
        homePage.validateGiftCardPageLanded();
    }
    @Test
    public void testCheckYourBalance() throws InterruptedException {
        homePage.checkYourBalance();
        homePage.validateCheckYourBalance();
    }
    @Test
    public void testCheckEmailButton() throws InterruptedException {
        homePage.checkEmailButton();
        homePage.validateCheckEmailButton();
    }
    @Test
    public void testcheckMailButton() throws InterruptedException {
        homePage.checkMailButton();
        homePage.validateCheckMailButton();
    }

}
