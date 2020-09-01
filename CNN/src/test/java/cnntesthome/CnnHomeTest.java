package cnntesthome;

import cnnhome.CnnHome;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CnnHomeTest extends WebAPI {

    CnnHome homePage;

    @BeforeMethod
    public void getInIt(){
        homePage= PageFactory.initElements(driver,CnnHome.class);
    }


    @Test
    public void testCnnSingIn() throws InterruptedException {
        homePage.cnnSingIn();
    }
}
