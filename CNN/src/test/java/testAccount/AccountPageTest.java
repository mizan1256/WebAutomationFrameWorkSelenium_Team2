package testAccount;

import Account.AccountPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountPageTest extends WebAPI {
    AccountPage accountPage;

    @BeforeMethod
    public void getInit() {
        accountPage = PageFactory.initElements(driver, AccountPage.class);
    }

    @Test
    public void testLogin() {//works
        accountPage.login();
        accountPage.validateLogin();
    }

    @Test
    public void testSignUp() {//works
        accountPage.signUp();
        accountPage.validateSignUp();
    }


}
