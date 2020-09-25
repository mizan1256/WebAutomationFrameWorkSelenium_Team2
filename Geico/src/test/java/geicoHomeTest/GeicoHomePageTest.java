package geicoHomeTest;

import common.WebAPI;
import geicoHome.GeicoHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GeicoHomePageTest extends WebAPI {

    GeicoHomePage geicoHomePage;

    @BeforeMethod
    public void getInit(){
        geicoHomePage = PageFactory.initElements(driver,GeicoHomePage.class);

    }

    @Test
    public void testCheckAccessPolicyDropDownByText(){
        geicoHomePage.checkAccessPolicyDropDownByText();
    }

    @Test
    public void testCheckAccessPolicyDropDownByIndexNo(){
        geicoHomePage.checkAccessPolicyDropDownByIndexNo();
    }

    @Test
    public void testOnlineActivationWithPolicyNumberFieldBlank(){
        geicoHomePage.onlineActivationWithPolicyNumberFieldBlank();
        geicoHomePage.validateOnlineActivationWithPolicyNumberFieldBlank();
    }

    @Test
    public void testOnlineActivationWithInvalidCredentials(){
        geicoHomePage.onlineActivationWithInvalidCredentials();
        geicoHomePage.validateOnlineActivationWithInvalidCredentials();
    }
    @Test
    public void testOnlineActivationWithInvalidZipCode(){
        geicoHomePage.onlineActivationWithInvalidZipCode();
        geicoHomePage.validateOnlineActivationWithInvalidZipCode();
    }







}
