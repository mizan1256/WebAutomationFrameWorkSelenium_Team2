package geicoHomeTest;

import common.WebAPI;
import geicoHome.GeicoHomePage;
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
}
