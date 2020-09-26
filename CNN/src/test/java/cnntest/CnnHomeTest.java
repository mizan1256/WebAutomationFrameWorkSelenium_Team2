package cnntest;

import cnnhome.CnnHome;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CnnHomeTest extends WebAPI {
    CnnHome cnnHome;
    @BeforeMethod
    public void getInit()
    {cnnHome= PageFactory.initElements(driver,CnnHome.class);
    }
    @Test(enabled = true)
    public void testCheckCnnLogo() throws InterruptedException {
        cnnHome.checkUSButton();
        cnnHome.validateUSButton();
    }
    @Test(enabled = true)
    public void testDisplayCnnLogo() throws InterruptedException {
        cnnHome.displayCnnLogo();
        cnnHome.validateDisplayCnnLogo();
    }
    @Test(enabled = true)
    public void testCheckCnnMiddleEastButton() throws InterruptedException {
        cnnHome.checkCnnMiddleEastButton();
        cnnHome.validateCnnMiddleEastButton();
    }
    @Test(enabled = true)
    public void testCheckCnnZipBox() throws InterruptedException {
        cnnHome.checkCnnZipBox();
        cnnHome.validateCheckCnnZipBox();
    }
    @Test(enabled = true)
    public void testCheckCnnEntertainmentButton() throws InterruptedException {
        cnnHome.checkCnnEntertainmentButton();
        cnnHome.validateCnnEntertainmentButton();
    }

}
