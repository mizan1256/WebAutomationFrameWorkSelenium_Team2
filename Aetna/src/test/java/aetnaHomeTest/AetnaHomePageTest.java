package aetnaHomeTest;
import aetnaHomePage.AetnaHomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class AetnaHomePageTest extends WebAPI {

    AetnaHomePage aetnaHomePage;

    @BeforeMethod
    public void getInit(){
        aetnaHomePage = PageFactory.initElements(driver,AetnaHomePage.class);
    }

    @Test
    public void testLoginWithUserNameBlank(){
        aetnaHomePage.loginWithUserNameFieldBlank();
        aetnaHomePage.validateLoginWithUserNameFieldBlank();
    }

    @Test
    public void testLoginWithPasswordBlank(){
        aetnaHomePage.loginWithPasswordFieldBlank();
        aetnaHomePage.validateLoginWithPasswordFieldBlank();
    }

    @Test
    public void testLoginWithInvalidUserNameAndPassword(){
        aetnaHomePage.loginWithInvalidUserNameAndPassword();
        aetnaHomePage.validateLoginWithInvalidUserNameAndPassword();
    }

    @Test
    public void testContactUs(){
        aetnaHomePage.checkContactUsBtn();
        aetnaHomePage.validateContactUsBtn();
    }

    @Test
    public void testContactUsMemberService(){
        aetnaHomePage.checkContactUsMemberService();
        aetnaHomePage.validateContactUsMemberService();
    }


    @Test
    public void testFindADoctor(){
        aetnaHomePage.findADoctor();
        aetnaHomePage.validateFindADoctor();
    }


    //




    @Test
    public void testShopForAPlanButton() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aetnaHomePage.shopForAPlanButton();
        aetnaHomePage.validateShopForAPlan();
    }

    @Test
    public void testMemberSupportButtonCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aetnaHomePage.memberSupportButtonCheck();
        aetnaHomePage.validateMemberSupportButtonCheck();
    }
    @Test
    public void testFindADoctorButtonCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aetnaHomePage.findADoctorButtonCheck();
        aetnaHomePage.validateFindADoctorButtonCheck("Welcome to Aetna's member website");
    }



}
