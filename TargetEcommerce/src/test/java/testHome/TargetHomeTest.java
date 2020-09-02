package testHome;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import targetHome.TargetHome;

public class TargetHomeTest extends WebAPI {
    TargetHome targetHome;
    @BeforeMethod
    public void getInit(){
        targetHome= PageFactory.initElements(driver,TargetHome.class);
    }
    @Test
    public void testSearchBoxIsDisplayed() throws InterruptedException {
        targetHome.searchBoxIsDisplayed();
        targetHome.validateSearchBoxDisplayed();
    }
    @Test
    public void testSearchBoxCheck() throws InterruptedException {
        targetHome.searchBoxCheck("samsung");
        targetHome.validateSearchText();
    }
    @Test
    public void testSearchNewArrivals() throws InterruptedException {
        targetHome.searchBoxCheck("new arrivals");
        targetHome.validateSearchNewArrival();
    }
    @Test
    public void testSearchCartDisplayed() throws InterruptedException {
        targetHome.searchCartIsDisplayed();
        targetHome.validateSearchBoxDisplayed();
    }
    @Test
    public void testGetHomePageLogo() throws InterruptedException {
        targetHome.getHomePageLogo();
        targetHome.validateGetHomePageLogo();
    }
    @Test
    public void testClickCollegeButton() throws InterruptedException {
        targetHome.clickCollegeButton();
        targetHome.validateClickCollegeButton();
    }
    @Test
    public void testClickMensButton() throws InterruptedException {
        targetHome.clickMensButton();
        targetHome.validateClickMensButton();
    }
    @Test
    public void testClickSameDayDelivery() throws InterruptedException {
        targetHome.clickSameDayDelivery();
        targetHome.validateClickSameDayDelivery();
    }
}
