package aetnaHomeTest;
import aetnaHome.AetnaHome;
import aetnaRegistration.AetnaRegistrationPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AetnaRegTest extends WebAPI {
    AetnaRegistrationPage aetnaRegistrationPage;
    @BeforeMethod
    public void getInIt() {
        aetnaRegistrationPage = PageFactory.initElements(driver, AetnaRegistrationPage.class);
    }

    @Test
    public void testHomePageLogInButtonCheck() throws InterruptedException {
        aetnaRegistrationPage.homePageLogInButtonCheck();
    }
}
