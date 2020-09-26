package registryButtonTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import registry.RegistryHomePage;

public class RegistryHomePageTest extends WebAPI {
    RegistryHomePage registry;

    @BeforeMethod
    public void getInit() {
        registry = PageFactory.initElements(driver, RegistryHomePage.class);
    }

    @Test
    public void testCheckRegistry() throws InterruptedException {
        registry.checkRegistry();
        registry.validateCheckRegistry();
    }
    @Test
    public void testCheckHouseWarmingRegistry() throws InterruptedException {
        registry.checkHouseWarmingRegistry();
        registry.validateCheckHouseWarmingRegistry();
    }
    @Test
    public void testCheckHouseWarmingBrands() throws InterruptedException {
        registry.checkHouseWarmingBrands();
        registry.validateCheckHouseWarmingBrands();
    }
    @Test
    public void testCreateRegistry() throws InterruptedException {
        registry.checkCreateRegistry();
        registry.validateCreateRegistry();
    }
    @Test
    public void testCheckRegistrySignINButton() throws InterruptedException {
        registry.checkRegistrySignINButton();
        registry.validateCheckRegistrySignINButton();

    }
    @Test
    public void testCheckFindList() throws InterruptedException {
        registry.checkFindList();
        registry.validateCheckFindList();

    }
    @Test
    public void testCheckReadyForSchool() throws InterruptedException {
        registry.checkReadyForSchool();
        registry.validateCheckReadyForSchool();

    }
}
