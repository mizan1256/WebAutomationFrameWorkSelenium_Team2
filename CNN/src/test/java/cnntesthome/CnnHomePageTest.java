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
    public void testing_validate_Us() throws InterruptedException {
        myCnnHomePage.us();
        myCnnHomePage.validate_Us();
    }
}
