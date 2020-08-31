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
    public void testSearchBoxCheck() throws InterruptedException {
        homePage.serchBoxCheck("iPhone");
         homePage.validateSeachText();
    }
    @Test
    public void testserchBoxIsDisplayed(){
        homePage.serchBoxIsDisplayed();
    }
    @Test
    public void testCreateTargetAccount() throws InterruptedException {
        homePage.createTargetAccount();
    }
    @Test
    public void testCreateTargetAccountForNegativeTest() throws InterruptedException {
        homePage.createTargetAccountForNegativeTest();
        homePage.validateCreateTargetAccountForNegativeTest();
    }
    @Test
    public void testSignInTargerUserAccount(){
        homePage.signInTargerUserAccount();
        homePage.validateSignInTargerUserAccount();
    }
    @Test (enabled = true)
    public void testSignInTargerUserAccountUsingInvalidCredentials() throws InterruptedException {
        homePage.signInTargerUserAccountUsingInvalidCredentials();
        homePage.validateSignInTargetUserAccountUsingInvalidCredentials();
    }
}
