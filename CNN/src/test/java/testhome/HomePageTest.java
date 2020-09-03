package testhome;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePageTest extends WebAPI {

    HomePage homePage;

    @BeforeMethod
    public void gitInit(){
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test (enabled = false)
    public void testCnnLogoIsDisplayed(){
        homePage.cnnLogoIsDisplayed();
    }
    @Test (enabled = false)
    public void testOpinionButton(){
        homePage.opinionButton();
        homePage.validateOpinionButton();
    }
    @Test (enabled = false)
    public void testUsButton(){
        homePage.usButton();
        homePage.validateUsButton();
    }
    @Test(enabled = false)
    public void testDropDownEditionButton(){
        homePage.dropDownEditionButton();
        homePage.validateDropDownEditionButton();
    }
    @Test(enabled = false)
    public void testDropDownArabic(){
        homePage.dropDownArabic();
        homePage.validateDropDownArabic();
    }
    @Test (enabled = false)
    public void testBurgerButtonCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.burgerButtonCheck();
        homePage.validateSearchText("");
    }
    @Test
    public void testTravelTabCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePage.travelTabCheck();
        homePage.validateTravelTabCheck("");
    }

}
