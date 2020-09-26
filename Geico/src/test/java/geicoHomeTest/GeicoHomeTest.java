package geicoHomeTest;
import common.WebAPI;
import geicoHome.GeicoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GeicoHomeTest extends WebAPI{
    GeicoHome geicoHome;

    @BeforeMethod
    public void getInit() {
        geicoHome = PageFactory.initElements(driver, GeicoHome.class);
    }

        @Test
    public void testZipCode() throws InterruptedException {//works
        geicoHome.zipCode();
        geicoHome.verifyZipcode();
    }
    @Test
    public void TestExploreZipcode() throws InterruptedException {//works
        geicoHome.exploreZipcode();
        geicoHome.verifyExploreZipcode();
    }
    @Test
    public void TestExplore() throws InterruptedException {//works
        geicoHome.explore();
        geicoHome.verifyExplore();
    }

    @Test
    public void TestCovid19Update() throws InterruptedException {//works
        geicoHome.covid19Update();
        geicoHome.verifyCovid19Update();
    }
    @Test
    public void TestGiveBack() throws InterruptedException {//works
        geicoHome.giveBack();
        geicoHome.verifyGiveBack();
    }

}
