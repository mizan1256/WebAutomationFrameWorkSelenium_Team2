package atnthometest;

import atnthome.AtntHomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AtntHomePageTest extends WebAPI {

    AtntHomePage atntHomePage;

    @BeforeMethod
    public void getInit(){
        atntHomePage = PageFactory.initElements(driver,AtntHomePage.class);
    }

    @Test(enabled = true)
    public void testUpgradingDevice(){
        atntHomePage.upgradeDevice();
        atntHomePage.validateSignInScreenIsDisplayed();
    }

    @Test
    public void testSwitchToBusiness(){
        atntHomePage.switchToBusiness();
        atntHomePage.validateSwitchToBusiness();
    }

    @Test
    public void testSearchingProduct(){
        atntHomePage.searchingProduct();
        atntHomePage.validateSearchingProduct();
    }

    @Test
    public void testSelectItemFromAccountList(){
        atntHomePage.selectItemFromAccountList();
        atntHomePage.validateSelectItemFromAccountList();
    }

    @Test
    public void testSupport(){
        atntHomePage.checkSupport();
        atntHomePage.validateSupport();
    }

    @Test
    public void testMenuButton(){
        atntHomePage.checkMenuButton();
        atntHomePage.validateMenuButton();
    }





}
