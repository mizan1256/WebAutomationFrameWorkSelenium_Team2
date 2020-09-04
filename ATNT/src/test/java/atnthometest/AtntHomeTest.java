package atnthometest;

import atnthome.AtntHomePage;
import common.WebAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class AtntHomeTest extends WebAPI {
    AtntHomePage atntHomePage;
    @BeforeMethod
    public void getInIt(){
        atntHomePage= PageFactory.initElements(driver, AtntHomePage.class);
    }

    @Test
    public void testAttLogoIsDisplay(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        atntHomePage.attLogoIsDisplay();
    }
    @Test
    public void testAttBurgBtnMenuCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        atntHomePage.attBurgBtnMenuCheck();
        atntHomePage.validateAttBurgBtnMenuCheck();
    }
    @Test
    public void testSearchBoxCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        atntHomePage.searchBoxCheck();
        atntHomePage.validateSearchBoxCheck();
    }
}
