package cnntesthome;

import cnnhome.CnnHomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CnnHomePageTest extends WebAPI {

    CnnHomePage myCnnHomePage;

    @BeforeMethod
    public void getInIt(){
        myCnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
    }


    @Test//#33
    public void testing_Validate_Us() throws InterruptedException {
        myCnnHomePage.us();
        myCnnHomePage.validate_Us();
    }
    @Test//#34
    public void testing_Validate_world() throws InterruptedException {
        myCnnHomePage.world();
        myCnnHomePage.validate_World();
    }
    @Test//#35
    public void testing_validate_Politics() throws InterruptedException {
            myCnnHomePage.politics();
            myCnnHomePage.validate_Politics();

    }
    @Test//#36
    public void testing_Validate_Business() throws InterruptedException {
        myCnnHomePage.business();
        myCnnHomePage.validate_Business();
    }
    @Test//#37
    public void testing_Validate_Opinion() throws InterruptedException {
        myCnnHomePage.opinion();
        myCnnHomePage.validate_Opinion();
    }
    @Test//#38
    public void testing_Validate_Health() throws InterruptedException {
        myCnnHomePage.health();
        myCnnHomePage.validate_Health();
    }
    @Test//#39
    public void testing_Validate_Entertainment() throws InterruptedException {
        myCnnHomePage.health();
        myCnnHomePage.validate_Entertainment();
    }
    @Test//#40
    public void testing_Validate_Style() throws InterruptedException {
        myCnnHomePage.style();
        myCnnHomePage.validate_Style();
    }
    @Test//#41
    public void testing_Validate_Travel() throws InterruptedException {
        myCnnHomePage.travel();
        myCnnHomePage.validate_Travel();
    }
    @Test//#42
    public void testing_Validate_Sports() throws InterruptedException {
        myCnnHomePage.sports();
        myCnnHomePage.validate_Sports();
    }
    @Test//#43
    public void testing_Validate_Videos() throws InterruptedException {
        myCnnHomePage.videos();
        myCnnHomePage.validate_Videos();
    }
    @Test//#44
    public void testing_Validate_LiveTvXpath() throws InterruptedException {
        myCnnHomePage.liveTvXpath();
        myCnnHomePage.validate_LiveTvXpath();
    }
    @Test//#45
    public void testing_Validate_EditionButton() throws InterruptedException {
        myCnnHomePage.editionButton();
        myCnnHomePage.validate_EditionButton();
    }
    @Test//#46
    public void testing_Validate_Arabic() throws InterruptedException {
        myCnnHomePage.arabic();
        myCnnHomePage.validate_Arabic();
    }
    @Test//#47
    public void testing_Validate_CnnLogo() throws InterruptedException {
        myCnnHomePage.cnnLogo();
        myCnnHomePage.validate_CnnLogo();
    }
    @Test//#48
    public void testing_Validate_EspanolTextXpath() throws InterruptedException {
        myCnnHomePage.espanolTextXpath();
        myCnnHomePage.validate_EspanolTextXpath();
    }
    @Test//#50
    public void testing_Validate_signInCreation() throws InterruptedException {
        myCnnHomePage.signInCreation();
        myCnnHomePage.validate_signInCreation();
    }
}
