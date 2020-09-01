package testhome;

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


    @Test(enabled = true)
    public void testLoginPageIsDisplayed() {
        homePage.checkLoginPageIsDisplayed();
        homePage.validateLoginPageIsDisplayed();
    }

    @Test
    public void testLoginWithInvalidEmailAndPassword() {
        homePage.checkLoginWithInvalidEmailAndPassword("asdf", "123456");
        homePage.validateInvalidEmailAndPassword();
    }

    @Test(enabled = true)
    public void testLoginWithInvalidEmail() {
        homePage.checkLoginWithInvalidEmail("12345", "p123456");
        homePage.validateInvalidEmail();
    }

    @Test(enabled = true)
    public void testLoginWithInvalidPassword() {
        homePage.checkLoginWithInvalidPassword("pnt_p@gmail.com", "1234567");
        homePage.validateInvalidPassword();
    }

    @Test(enabled = true)
    public void testForgotPasswordPageIsDisplayed() {
        homePage.checkForgotPasswordPageIsDisplayed();
        homePage.validateForgotPasswordIsDisplayed();
    }

    @Test(enabled = true)
    public void testResetPasswordWithInvalidEmail() {
        homePage.checkResetPasswordWithInvalidEmail("123456");
        homePage.validateInvalidForgotPasswordEmail();
    }

    @Test(enabled = true)
    public void testSelectStorePageIsDisplayed(){
        homePage.checkSelectStorePageIsDisplayed();
        homePage.validateSelectStorePageIsDisplayed();
    }

    @Test
    public void testLookupStoreWithInvalidLocationInput(){
        homePage.lookupStoreWithInvalidLocationInput("asdf");
        homePage.validateInvalidLocationOfStore();
    }

    @Test
    public void testLocationWithZipCode(){
        homePage.lookupStoreWithZipCode("11435");
        homePage.validateZipCodeLocation();
    }

    @Test
    public void testLocationWithCityName(){
        homePage.lookupStoreWithCityName("Astoria");
        homePage.validateCityLocation();
    }

    @Test
    public void testLocationWithStateName(){
        homePage.lookupStoreWithStateName("Florida");
        homePage.validateStateLocation();
    }








}
