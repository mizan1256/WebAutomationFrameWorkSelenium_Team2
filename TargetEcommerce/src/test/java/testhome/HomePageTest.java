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
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.searchBoxIsDisplayed();
    }
    @Test(enabled = true)
    public void testCreateTargetAccount() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.createTargetAccount();
    }
    @Test(enabled = true)
    public void testCreateTargetAccountForNegativeTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.createTargetAccountForNegativeTest();
        homePage.validateCreateTargetAccountForNegativeTest();
    }
    @Test(enabled = true)
    public void testSignInTargetUserAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.signInTargetUserAccount();
        homePage.validateSignInTargetUserAccount();
    }
    @Test (enabled = true)
    public void testSignInTargetUserAccountUsingInvalidCredentials() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.signInTargetUserAccountUsingInvalidCredentials();
        homePage.validateSignInTargetUserAccountUsingInvalidCredentials();
    }
    @Test
    public void testSearchBoxCheckUsingGetItemValue() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.searchBoxCheckUsingGetItemValue();
    }
    @Test
    public void testSearchBoxCheckUsingGetItemsListFromExcel() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.searchBoxCheckUsingGetItemsListFromExcel();
    }
    @Test
    public void testSearchBoxCheckGetItemsListFromDB() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.searchBoxCheckGetItemsListFromDB();
    }
}
