package testRegistration;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import signUp.Registration;

public class RegistrationTest extends WebAPI {

    Registration registration;

    @BeforeMethod
    public void getInit() {
        registration = PageFactory.initElements(driver, Registration.class);
    }
    @Test
    public void TestCreateAccount() {//works
        registration.createAccount();
        registration.validateCreateAccount();
    }
    @Test
    public void TestSignIn() {//works
        registration.signIn();
        registration.validateSignIn();
    }
    @Test
    public void testBuyItAgain() {//works
        registration.buyItAgain();
        registration.validateBuyItAgain();
    }
    @Test
    public void testBuyAgainSignIn() {//works
        registration.buyAgainSignIn();
        registration.validateBuyAgainSignIn();
    }

    @Test
    public void testSignInToBuyAgain() throws InterruptedException {//works
        registration.signInToBuyAgain();
        registration.validateSignInToBuyAgain();
    }
    @Test
    public void testmyStore() {//works
        registration.myStore();
        registration.validateMyStore();
    }

}
