package testHome;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import targetHome.TargetHome;

public class TargetHomeTest extends WebAPI {

    TargetHome homePage;

    @BeforeMethod
    public void getInIt(){
        homePage= PageFactory.initElements(driver,TargetHome.class);
    }
    @Test
    public void testTargetLogoDisplayCheck(){
        homePage.targetLogoDisplayCheck();
    }

    @Test
    public void testTargetLogoIsClickable() {
        homePage.targetLogoIsClickable();
        homePage.validateTargetLogoIsClickable();

    }
}
