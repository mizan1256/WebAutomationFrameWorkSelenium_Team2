package atnthometest;

import atnthome.AtntHome;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AtntHomeTest extends WebAPI {
    AtntHome atntHome;
    @BeforeMethod
    public void getInit(){

        atntHome= PageFactory.initElements(driver, AtntHome.class);
    }
    @Test
    public void testCheckAttDealsButton() throws InterruptedException {
        atntHome.checkAttDealsButton();
        atntHome.validateCheckAttDealsButton(driver.getTitle());
    }
    @Test
    public void testCheckAttWirelessButton() throws InterruptedException {
        atntHome.checkAttWirelessButton();
        atntHome.validateCheckAttWirelessButton(driver.getTitle());
    }
    @Test
    public void testCheckAttInternetButton() throws InterruptedException {
        atntHome.checkAttInternetButton();
        atntHome.validateCheckAttWirelessButton("AT&T Wireless – Latest Phones & Best Wireless Plans");
    }
    @Test
    public void testCheckAttTvButton() throws InterruptedException {
        atntHome.checkAttTvButton();
        atntHome.validateCheckAttTvButton("Order online to get a $200 AT&T Visa® Reward Card, or call 866.951.6106.");
    }
    @Test
    public void testCheckAttPrepaidButton() throws InterruptedException {
        atntHome.checkAttPrepaidButton();
        atntHome.validateCheckAttPrepaidButton("$25/mo. with AT&T PREPAIDSM");
    }
}
