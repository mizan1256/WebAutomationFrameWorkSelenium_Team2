package testhome;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import registration.RegistrationPage;

public class RegistrationPageTest extends WebAPI {

    RegistrationPage registrationPage;

    @BeforeMethod
    public void gitInit(){
        registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
    }
    @Test
    public void testUserAccount() throws InterruptedException {
        registrationPage.userAccount();
        registrationPage.validateUserAccount();
    }
    @Test
    public void testUserAccountNegative() throws InterruptedException {
        registrationPage.userAccountNegative();
        registrationPage.validateUserAccountNegative();
    }
    @Test
    public void testLogInCheck() throws InterruptedException {
        registrationPage.logInCheck();
        registrationPage.validateLogInCheck();
    }
    @Test
    public void testLogInCheckNegative() throws InterruptedException {
        registrationPage.logInCheckNegative();
        registrationPage.validateLogInCheckNegative();
    }


}
