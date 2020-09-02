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
    public void getInit(){

        aetnaHome= PageFactory.initElements(driver, AetnaHome.class);
    }
    @Test(enabled = false)
    public void testCheckContactUsButton() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aetnaHome.checkContactUsButton();
        aetnaHome.validateCheckContactUsButton("Contact Aetna");
    }
    @Test(enabled = false)
    public void testCheckEspanolButton() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aetnaHome.checkEspanolButton();
        aetnaHome.validateCheckEspanolButton(driver.getTitle());
    }


}
