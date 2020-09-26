package unitedAirLinesHomeTest;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import unitedAirLinesHome.UnitedAirLinesHome;

public class UnitedAirLinesHomePageTest extends WebAPI{
    UnitedAirLinesHome unitedAirLinesHome;
    @BeforeMethod
    public void getInIt(){
        unitedAirLinesHome= PageFactory.initElements(driver,UnitedAirLinesHome.class);
    }
    @Test
    public void testLanguageButtonCheck() throws InterruptedException {
        unitedAirLinesHome.languageButtonCheck();
    }
}
