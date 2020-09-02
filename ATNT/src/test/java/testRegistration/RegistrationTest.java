package testRegistration;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import registration.Registration;

public class RegistrationTest extends WebAPI {
    Registration registration;

    @BeforeMethod
    public void getInit() {
        registration = PageFactory.initElements(driver, Registration.class);
    }

    @Test
    public void testSignIn() {
        registration.signIn();
        registration.validateSignIn();
    }



}
