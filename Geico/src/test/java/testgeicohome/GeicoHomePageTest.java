package testgeicohome;

import common.WebAPI;
import geicohomepage.GeicoHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GeicoHomePageTest extends WebAPI {

    GeicoHomePage geicoHomePage;

    @BeforeMethod
    public void getInit(){
        geicoHomePage= PageFactory.initElements(driver, GeicoHomePage.class);
    }
    @Test
    public void testLogoIsDisplayed() throws InterruptedException {
        geicoHomePage.logoIsDisplayed();
    }
    @Test
    public void testCovidTab(){
        geicoHomePage.covidTab();
    }
    public void testAutoTab() throws InterruptedException {
        geicoHomePage.autoTab();
    }



}
