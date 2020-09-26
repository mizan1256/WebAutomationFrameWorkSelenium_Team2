package unitedAirLinesHomeTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import unitedAirLinesHome.UnitedAirLinesHome;

public class UnitedAirLinesTest extends WebAPI {
    UnitedAirLinesHome unitedAirLinesHome;
    @BeforeMethod
    public void getInit(){

        unitedAirLinesHome= PageFactory.initElements(driver, UnitedAirLinesHome.class);
    }
    @Test
    public void testCheckUAAlertsButton() throws InterruptedException {
        unitedAirLinesHome.checkUAAlertsButton();
        unitedAirLinesHome.validateCheckUAAlertsButton("Important notices");
    }
    @Test
    public void testCheckUACareerButton() throws InterruptedException {
        unitedAirLinesHome.checkUACareerButton();
        unitedAirLinesHome.validateCheckUACareerButton("A career is a journey – take yours farther");
    }
    @Test
    public void testCheckUABrandingButton() throws InterruptedException {
        unitedAirLinesHome.checkUABrandingButton();
        unitedAirLinesHome.validateCheckUABrandingButton("Branding");
    }
    @Test
    public void testCheckUALeaderShipButton() throws InterruptedException {
        unitedAirLinesHome.checkUALeadershipTeamButton();
        unitedAirLinesHome.validateCheckUALeadershipTeamButton(driver.getTitle());
    }
    @Test
    public void testCheckUANewsRoomButton() throws InterruptedException {
        unitedAirLinesHome.checkUAUnitedShopButton();
        unitedAirLinesHome.validateCheckUAUnitedShopButton("United newsroom");
    }
}