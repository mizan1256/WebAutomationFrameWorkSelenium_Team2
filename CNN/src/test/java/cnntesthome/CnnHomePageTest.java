package cnntesthome;

import cnnhome.CnnHomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CnnHomePageTest  extends WebAPI {

    CnnHomePage cnnHomePage;

    @BeforeMethod
    public void getInit(){
        cnnHomePage = PageFactory.initElements(driver,CnnHomePage.class);
    }

    @Test
    public void testSignUpWithInvalidEmail(){
        cnnHomePage.signUpWithInvalidEmail();
        cnnHomePage.validateSignUpWithInvalidEmail();
    }

    @Test
    public void testSignUpWithInvalidPassword(){
        cnnHomePage.signUpWithInvalidPassword();
        cnnHomePage.validateSignUpWithInvalidPassword();
    }

    @Test
    public void testSignUpWithInvalidZipcode(){
        cnnHomePage.signUpWithInvalidZipCode();
        cnnHomePage.validateSignUpWithInvalidZipCode();
    }

    @Test
    public void testSignUpWithAllValidCredentials(){
        cnnHomePage.signUpWithAllValidCredentials();
        cnnHomePage.validateSignUpWithAllValidCredentials();
    }

    @Test
    public void testLoginWithInvalidCredentials(){
        cnnHomePage.loginWithInvalidCredentials();
        cnnHomePage.validateLoginWithInValidCredentials();
    }

    @Test
    public void testLoginWithAllValidCredentials(){
        cnnHomePage.loginWithAllValidCredentials();
        cnnHomePage.validateLoginWithAllValidCredentials();
    }

    @Test
    public void testChangeEditionFromUsToInternational(){
        cnnHomePage.changeEditionFromUsToInternational();
        cnnHomePage.validateChangeEditionFromUsToInternational();
    }

    @Test
    public void testChangeEditionFromUsToArabic(){
        cnnHomePage.changeEditionFromUsToArabic();
        cnnHomePage.validateChangeEditionFromUsToArabic();
    }

    @Test
    public void testChangeEditionFromUsToEspanol(){
        cnnHomePage.changeEditionFromUsToEspanol();
        cnnHomePage.validateChangeEditionFromUsToEspanol();
    }

    @Test
    public void testCheckSearchBox(){
        cnnHomePage.checkSearchBox();
        cnnHomePage.validateCheckSearchBox();
    }







}
