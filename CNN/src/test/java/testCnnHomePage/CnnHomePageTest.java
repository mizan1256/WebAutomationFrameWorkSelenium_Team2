package testCnnHomePage;

import common.WebAPI;
import home.CnnHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class CnnHomePageTest extends WebAPI {
    CnnHomePage cnnHomePage;
    @BeforeMethod
    public void getInIt(){
        cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
    }
    @Test
    public void testCnnLogoIsDisplay(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cnnHomePage.cnnLogoIsDisplay();
    }
    @Test
    public void testCnnLogInIconIsClickable(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cnnHomePage.cnnLogInIconIsClickable();
        cnnHomePage.validateCnnLogInIconIsClickable();
    }
    @Test
    public void testCnnSearchIconIsClickable(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cnnHomePage.cnnSearchIconIsClickable();
        cnnHomePage.validateCnnSearchIconIsClickable();
    }
    @Test
    public void testCnnSearchBoxTypeAble() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cnnHomePage.cnnSearchBoxTypeAble();
        cnnHomePage.validateCNNSearchBoxTypeAble();
    }

}
