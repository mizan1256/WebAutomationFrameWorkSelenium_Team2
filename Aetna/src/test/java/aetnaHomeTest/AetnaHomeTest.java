package aetnaHomeTest;

import aetnaHome.AetnaHome;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class AetnaHomeTest extends WebAPI {
    AetnaHome aetnaHome;

    @BeforeMethod
    public void getInIt() {
        aetnaHome = PageFactory.initElements(driver, AetnaHome.class);
    }

    @Test
    public void testaetnaLogoIsDisplay() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aetnaHome.aetnaLogoIsDisplay();
    }

    @Test
    public void testKeepUpWithYourCareCheck() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aetnaHome.keepUpWithYourCareButtonCheck();
        aetnaHome.validateKeepUpWithYourCareButtonCheck("Time for you and your needs");
    }

    @Test
    public void testAetnaMedicareButtonCheck() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aetnaHome.aetnaMedicareButtonCheck();
        aetnaHome.validateAetnaMedicareButtonCheck();
    }

    @Test
    public void testShopForAPlanButton() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aetnaHome.shopForAPlanButton();
        aetnaHome.validateShopForAPlan();
    }

    @Test
    public void testMemberSupportButtonCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aetnaHome.memberSupportButtonCheck();
        aetnaHome.validateMemberSupportButtonCheck();
    }
    @Test
    public void testFindADoctorButtonCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aetnaHome.findADoctorButtonCheck();
        aetnaHome.validateFindADoctorButtonCheck("Welcome to Aetna's member website");
    }

}