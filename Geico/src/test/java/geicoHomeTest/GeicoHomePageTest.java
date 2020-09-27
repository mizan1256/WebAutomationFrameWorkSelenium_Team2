package geicoHomeTest;

import common.WebAPI;
import geicoHomePage.GeicoHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GeicoHomePageTest extends WebAPI {
    GeicoHomePage geicoHomePage;

    @BeforeMethod
    public void getInIt(){
        geicoHomePage= PageFactory.initElements(driver, GeicoHomePage.class);
    }
    @Test
    public void testGeicoLogoIsDisplay(){
        geicoHomePage.geicoLogoIsDisplay();
    }
    @Test
    public void testMakeAPaymentButton() throws InterruptedException {
        geicoHomePage.makeAPaymentButton();
        geicoHomePage.validateMakeAPaymentButton("Express Services");
    }
    @Test
    public void testMakePaymentCheck() throws InterruptedException {
        geicoHomePage.makePaymentCheck();
    }

        @Test
    public void testZipCode() throws InterruptedException {//works
            geicoHomePage.zipCode();
            geicoHomePage.verifyZipcode();
    }
    @Test
    public void TestExploreZipcode() throws InterruptedException {//works
        geicoHomePage.exploreZipcode();
        geicoHomePage.verifyExploreZipcode();
    }
    @Test
    public void TestExplore() throws InterruptedException {//works
        geicoHomePage.explore();
        geicoHomePage.verifyExplore();
    }

    @Test
    public void TestCovid19Update() throws InterruptedException {//works
        geicoHomePage.covid19Update();
        geicoHomePage.verifyCovid19Update();
    }
    @Test
    public void TestGiveBack() throws InterruptedException {//works
        geicoHomePage.giveBack();
        geicoHomePage.verifyGiveBack();
    }
}
