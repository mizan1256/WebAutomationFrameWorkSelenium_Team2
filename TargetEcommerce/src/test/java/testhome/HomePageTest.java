package testhome;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePageTest extends WebAPI {
    HomePage homePage;
    @BeforeMethod
    public void getInit(){
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void testSearchBoxCheck() throws InterruptedException {
        homePage.searchBoxCheck("iPhone");
         homePage.validateSearchText();
    }
    @Test(enabled = true)
    public void testSearchBoxIsDisplayed(){
        homePage.searchBoxIsDisplayed();
    }
    @Test(enabled = true)
    public void testCreateTargetAccount() throws InterruptedException {
        homePage.createTargetAccount();
    }
    @Test(enabled = true)
    public void testCreateTargetAccountForNegativeTest() throws InterruptedException {
        homePage.createTargetAccountForNegativeTest();
        homePage.validateCreateTargetAccountForNegativeTest();
    }
    @Test(enabled = true)
    public void testSignInTargetUserAccount(){
        homePage.signInTargetUserAccount();
        homePage.validateSignInTargetUserAccount();
    }
    @Test (enabled = true)
    public void testSignInTargetUserAccountUsingInvalidCredentials() throws InterruptedException {
        homePage.signInTargetUserAccountUsingInvalidCredentials();
        homePage.validateSignInTargetUserAccountUsingInvalidCredentials();
    }
}
