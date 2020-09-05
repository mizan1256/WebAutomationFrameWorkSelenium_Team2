package cnnteststyle;

import cnnstyle.StyleHomePage;
import cnntravel.CnnTravelPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CnnStylePageTest extends WebAPI {
    StyleHomePage myStylePage;

    @BeforeMethod
    public void getInIt(){
        myStylePage = PageFactory.initElements(driver, StyleHomePage.class);
    }

    @Test//#62
    public void testing_ValidateStyleToArtsPage() throws InterruptedException {
        myStylePage.styleToArtsPage();
        myStylePage.validate_StyleToArtsPage();
    }
    @Test//#63
    public void testing_ValidateStyleToDesignPage() throws InterruptedException {
        myStylePage.styleToDesignPage();
        myStylePage.validate_StyleToDesignPage();
    }
    @Test//#64
    public void testing_ValidateStyleToFashionPage() throws InterruptedException {
        myStylePage.styleToFashionPage();
        myStylePage.validate_StyleToFashionPage();
    }
    @Test//#65
    public void testing_Validate_StyleToArchitecturePage() throws InterruptedException {
        myStylePage.styleToArchitecturePage();
        myStylePage.validate_StyleToArchitecturePage();
    }
    @Test//#66
    public void testing_Validate_StyleToLuxuryPage() throws InterruptedException {
        myStylePage.styleToLuxuryPage();
        myStylePage.validate_StyleToLuxuryPage();
    }
    @Test//#67
    public void testing_Validate_StyleToBeautyPage() throws InterruptedException {
        myStylePage.styleToBeautyPage();
        myStylePage.validate_StyleToBeautyPage();
    }

}
