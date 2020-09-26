package geicoHomeTest;

import common.WebAPI;
import geicoHome.GeicoHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GeicoHomeTest extends WebAPI {
    GeicoHome geicoHome;
    @BeforeMethod
    public void getInit(){
        geicoHome= PageFactory.initElements(driver, GeicoHome.class);
    }
    @Test
    public void testGeicologo() throws InterruptedException {
        geicoHome.checkGeicologo();
        geicoHome.validateCheckGeicologo("COVID-19 Updates");
    }
    @Test
    public void testCheckGeicoCareerButton() throws InterruptedException {
        geicoHome.checkGeicoCareerButton();
        geicoHome.validateCheckGeicoCareerButton("");
    }
    @Test
    public void testCheckTDLearningButton() throws InterruptedException {
        geicoHome.checkGeicoCareerButton();
        geicoHome.validateCheckGeicoCareerButton("");
    }
    @Test
    public void testCheckGeicoContactUsButton() throws InterruptedException {
        geicoHome.checkGeicoContactUsButton();
        geicoHome.validateCheckGeicoContactUsButton(driver.getTitle());
    }
    @Test
    public void testCheckGeicoPrivacyButton() throws InterruptedException {
        geicoHome.checkGeicoPrivacyButton();
        geicoHome.validateCheckGeicoPrivacyButton(driver.getTitle());
    }

}
