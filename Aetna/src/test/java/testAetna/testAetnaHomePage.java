package testAetna;

import aetnaHome.AetnaHomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testAetnaHomePage extends WebAPI {

    AetnaHomePage aetnaHomePage;
    @BeforeMethod
    public void getInIt(){
        aetnaHomePage= PageFactory.initElements(driver,AetnaHomePage.class);
    }
    @Test
    public void testAetnaLogoIsDisplayed(){
        aetnaHomePage.aetnaLogoIsDisplayed();
    }
}
