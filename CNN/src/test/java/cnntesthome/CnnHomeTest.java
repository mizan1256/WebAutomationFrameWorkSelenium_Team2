package cnntesthome;

import cnnhome.CnnHome;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class CnnHomeTest extends WebAPI {

    CnnHome cnnHomePage;

    @BeforeMethod
    public void getInIt(){
        cnnHomePage= PageFactory.initElements(driver,CnnHome.class);
    }


    @Test(enabled = true)
    public void testCnnSingIn() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cnnHomePage.cnnSingIn();
        cnnHomePage.validateCnnSingIn();
    }
    @Test(enabled = true)
    public void testCnnUsClick() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cnnHomePage.cnnUsClick();
        cnnHomePage.validateWebElementsExpectedText();
    }
    @Test(enabled = true)
    public void testCnnZipCode() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cnnHomePage.cnnZipCode();
    }
    @Test(enabled = true)
    public void testCnnWebElementsDropDown() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cnnHomePage.cnnWebElementsDropDown();
        cnnHomePage.validateWebElementsDropDown();
    }
    @Test(enabled = true)
    public void testCnnWebElementsUS() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cnnHomePage.cnnWebElementsUS();
        cnnHomePage.validateWebElementsUS();
    }
    @Test(enabled = true)
    public void testCnnWebElementsWorld() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cnnHomePage.cnnWebElementsWorld();
        cnnHomePage.validateWebElementsWorld();
    }
    @Test(enabled = true)
    public void testCnnWebElementsHealth() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cnnHomePage.cnnWebElementsHealth();
        cnnHomePage.validateWebElementsHealth();
    }
    @Test(enabled = true)
    public void testCnnWebElementsStyle() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cnnHomePage.cnnWebElementsStyle();
        cnnHomePage.validateWebElementsStyle();
    }
    @Test(enabled = true)
    public void testCnnWebElementsLiveTV() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cnnHomePage.cnnWebElementsLiveTV();
        cnnHomePage.validateWebElementsLiveTV();
    }
    @Test(enabled = true)
    public void testCnnWebElementsVideo() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cnnHomePage.cnnWebElementsVideo();
        cnnHomePage.validateWebElementsVideo();
    }
    @Test(enabled = true)
    public void testCnnSignUP() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cnnHomePage.cnnSingUP();
        cnnHomePage.validateCnnSineUP();
    }
    @Test
    public void testCnnEditor() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cnnHomePage.cnnWebElementsEditor();
        cnnHomePage.validateWebElementsEditor();
    }
    @Test
    public void testCnnTrending() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cnnHomePage.cnnWebElementsTrending();
        cnnHomePage.validateCnnWebElementsTrending("Food and Diet");
    }
    @Test
    public void testCnnWebElementsTravel() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cnnHomePage.cnnWebElementsTravel();
        cnnHomePage.validateCnnWebElementsTravel("FOLLOW CNN");
    }
    @Test
    public void testCnnWebElementsSteveNash() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cnnHomePage.cnnWebElementsSteveNash();
        cnnHomePage.validateCnnWebElementsSteveNash("Allen Kim");
    }




}
