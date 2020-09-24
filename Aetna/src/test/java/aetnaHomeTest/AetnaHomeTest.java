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
    public void getInIt(){
        aetnaHome= PageFactory.initElements(driver,AetnaHome.class);
    }


    @Test
    public void testAetnaLogoIsDisplay(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aetnaHome.aetnaLogoIsDisplay();
    }
    @Test
    public void testAetnaContactUs() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aetnaHome.aetnaContactUs();
        aetnaHome.aetnaContactUsValidateText("Like this article");
    }
    @Test
    public void testAetnaMemberSupport() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aetnaHome.aetnaMemberSupport();
        aetnaHome.aetnaMemberSupportValidateText("What do you want to search for near 11208 (Brooklyn, NY)?");
    }
    @Test
    public void testAetnaExplore() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aetnaHome.aetnaExplore();
        aetnaHome.aetnaExploreValidateText("Job Title:");
    }
    @Test
    public void testAetnaLogInCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aetnaHome.aetnaLogInCheck();
        aetnaHome.aetnaLogInCheckValidateText("Convenient, Secure and Efficient");
    }

}
