package testredcard;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import redcard.RedCardPage;

public class RedCardPageTest extends WebAPI {

    RedCardPage redCardPage;

    @BeforeMethod
    public void getInit(){
        redCardPage = PageFactory.initElements(driver, RedCardPage.class);
    }
    @Test
    public void testRedCardLandedPage(){
        redCardPage.redCardLandedPage();
        redCardPage.validateRedCardLandedPage();
    }
    @Test
    public void testValidateRedCardExclusivePage() throws InterruptedException {
        redCardPage.redCardExclusivePage();
        redCardPage.validateRedCardExclusivePage();
    }
    @Test
    public void testShowMoreButton(){
        redCardPage.showMoreButton();
        redCardPage.validateShowMoreButton();
    }
    @Test
    public void testMoreDetailsbutton() throws InterruptedException {
        redCardPage.moreDetailsbutton();
        redCardPage.validatemoreDetailsbutton();
    }
    @Test
    public void testAtHomeLearning() throws InterruptedException {
        redCardPage.atHomeLearning();
        redCardPage.testAtHomeLearning();
    }


}
