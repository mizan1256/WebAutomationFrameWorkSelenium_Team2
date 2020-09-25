package testExploreMenu;

import common.WebAPI;
import exploreMenu.ExploreMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ExploreMenuTest extends WebAPI {

    ExploreMenu exploreMenu;

    @BeforeMethod
    public void getInit() {
        exploreMenu = PageFactory.initElements(driver, ExploreMenu.class);
    }

    @Test
    public void testExploreWireLess()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreMenu.exploreWireless();
        exploreMenu.validateExploreWireless();
    }
    @Test
    public void testExploreWirelessPhonesAndDevices()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreMenu.exploreWirelessPhonesAndDevices();
        exploreMenu.validateExploreWirelessPhonesAndDevices();
    }
    @Test
    public void testExploreWirelessPlanesAndPrices()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreMenu.exploreWirelessPlanesAndPrices();
        exploreMenu.validateExploreWirelessPlanesAndPrices();
    }

    @Test
    public void testExploreWirelessPlanDiscounts()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreMenu.exploreWirelessPlanDiscounts();
        exploreMenu.validateExploreWirelessPlanDiscounts();
    }

    @Test
    public void testExploreWirelessInternationalOption()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreMenu.exploreWirelessInternationalOption();
        exploreMenu.validateExploreWirelessInternationalOption();
    }

    @Test
    public void testExploreWirelessFiveG()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreMenu.exploreWirelessFiveGX();
        exploreMenu.validateExploreWirelessFiveG();
    }
    @Test
    public void testExploreWirelessUpgradeYourDevice()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreMenu.exploreWirelessUpgradeYourDevice();
        exploreMenu.validateExploreWirelessUpgradeYourDevice();
    }
    @Test
    public void testExploreWirelessBringYourDevice()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreMenu.exploreWirelessBringYourDevice();
        exploreMenu.validateExploreWirelessBringYourDevice();
    }
    @Test
    public void testExploreWirelessTradeInYourDevice()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreMenu.exploreWirelessTradeInYourDevice();
        exploreMenu.validateExploreWirelessTradeInYourDevice();
    }

    @Test
    public void testExploreWirelessAddADevice()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreMenu.exploreWirelessAddADevice();
        exploreMenu.validateExploreWirelessAddADevice();
    }

    @Test
    public void testExplorePrepaid()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreMenu.explorePrepaid();
        exploreMenu.validateExplorePrepaid();
    }
    @Test
    public void testExplorePrepaidMobilePlans()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreMenu.explorePrepaidMobilePlans();
        exploreMenu.validateExplorePrepaidMobilePlans();
    }

    @Test
    public void testExplorePrepaidPhones()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreMenu.explorePrepaidPhones();
        exploreMenu.validateExplorePrepaidPhones();
    }
    @Test
    public void testExploreTvAndEntertainment()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreMenu.exploreTvAndEntertainment();
        exploreMenu.validateExploreTvAndEntertainment();
    }
    @Test
    public void testExploreTvAndEntertainmentDirectTV()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreMenu.exploreTvAndEntertainmentDirectTV();
        exploreMenu.validateExploreTvAndEntertainmentDirectTV();
    }
    @Test
    public void testExploreTvAndEntertainmentUverseTV()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreMenu.exploreTvAndEntertainmentUVerseTV();
        exploreMenu.validateExploreTvAndEntertainmentUVerseTV();
    }

    @Test
    public void testExploreTvAndEntertainmentBundles()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreMenu.exploreTvAndEntertainmentBundles();
        exploreMenu.validateExploreTvAndEntertainmentBundles();
    }

    @Test
    public void testExploreTvAndEntertainmentInternationalPackages()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreMenu.exploreTvAndEntertainmentInternationalPackages();
        exploreMenu.validateExploreTvAndEntertainmentInternationalPackages();
    }
    @Test
    public void testExploreTvAndEntertainmentTvAccessories()throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreMenu.exploreTvAndEntertainmentTvAccessories();
        exploreMenu.validateExploreTvAndEntertainmentTvAccessories();
    }


}
