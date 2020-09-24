package atnthometest;

import atnthome.AtntHome;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class AtntHomeTest extends WebAPI {

    AtntHome atntHome;

    @BeforeMethod
    public void getInIt(){
        atntHome= PageFactory.initElements(driver,AtntHome.class);
    }


    @Test
    public void testAttLogoIsDisplay(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        atntHome.attLogoIsDisplay();
    }
    @Test
    public void testAttDeals() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        atntHome.attDeals();
        atntHome.validateDealsText("Order online today! Get FREE express shipping & FREE returns.");
    }
    @Test
    public void testAttInternet() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        atntHome.attInternetCheck();
        atntHome.attValidateInternetText("Internet your way");
    }
    @Test
    public void testAttSupport() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        atntHome.attSupportCheck();
        atntHome.attValidateSupportText("How can we help?");
    }
    @Test
    public void testAttAccount() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        atntHome.attSignInCheck();
        atntHome.attValidateSignInText("We were unable to locate your account. Try again with different information. (RBE055)");
    }

}
