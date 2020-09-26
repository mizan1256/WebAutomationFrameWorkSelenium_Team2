package testAetna;

import aetnaHome.AetnaHomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class testAetnaHomePage extends WebAPI {

    AetnaHomePage aetnaHomePage;
    @BeforeMethod
    public void getInIt(){
        aetnaHomePage= PageFactory.initElements(driver,AetnaHomePage.class);
    }
    @Test
    public void testAetnaLogoIsDisplayed(){
        aetnaHomePage.aetnaLogoIsDisplayed();
    }
    @Test
    public void testCheckContactUsButton() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aetnaHomePage.checkContactUsButton();
        aetnaHomePage.validateCheckContactUsButton("Contact Aetna");
    }
    @Test
    public void testCheckEspanolButton() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aetnaHomePage.checkEspanolButton();
        aetnaHomePage.validateCheckEspanolButton(driver.getTitle());
    }
    @Test
    public void testCheckAethnaSearchBox() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aetnaHomePage.checkAethnaSearchBox();
        aetnaHomePage.validateCheckAethnaSearchBox("Showing results for \"Health Insurance plans\"");
    }
    @Test
    public void testCheckAethnaShopForAPlanButton() throws InterruptedException {
        aetnaHomePage.checkAethnaShopForAPlanButton();
        aetnaHomePage.validateCheckAethnaShopForAPlanButton(driver.getTitle());
    }
    @Test
    public void testCheckFindADoctorHospitalOrPharmacyMenu() throws InterruptedException {
        aetnaHomePage.checkFindADoctorHospitalOrPharmacyMenu();
        aetnaHomePage.validateCheckFindADoctorHospitalOrPharmacyMenu(driver.getTitle());
    }
}
