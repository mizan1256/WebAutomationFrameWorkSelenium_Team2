package geicoHomeTest;


import common.WebAPI;
import geicoHome.GeicoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class GeicoHomeTest extends WebAPI {

GeicoHome geicoHome;


    @BeforeMethod
    public void getInIt(){
        geicoHome= PageFactory.initElements(driver,GeicoHome.class);
    }

    @Test
    public void testGeicoLogo() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        geicoHome.geicoLogoIsDisplay();
    }
    @Test
    public void testInsurance() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        geicoHome.geicoInsurance();
        //geicoHome.validateInsuranceText("What's the year, make, and model?");
    }
    @Test
    public void testSearchCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        geicoHome.geicoSearchCheck();
        geicoHome.validateSearchText("Site Search");
    }
    @Test
    public void testHomeownerCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        geicoHome.geicoHomeownerCheck();
        geicoHome.validateHomeownerText("Let's Get Started");
    }
    @Test
    public void testBoatCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        geicoHome.geicoBoatCheck();
        geicoHome.validateBoatText("Owner Information");
    }
    @Test
    public void testCondoCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        geicoHome.geicoCondoCheck();
        geicoHome.validateCondoText("Street Address");
    }



}
