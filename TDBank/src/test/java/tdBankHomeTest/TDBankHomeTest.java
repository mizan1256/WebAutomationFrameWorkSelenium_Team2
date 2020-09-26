package tdBankHomeTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tdBankHome.TDBankHome;

public class TDBankHomeTest extends WebAPI {
    TDBankHome tdBankHome;
    @BeforeMethod
    public void getInit(){

        tdBankHome= PageFactory.initElements(driver, TDBankHome.class);
    }
    @Test
    public void testCheckTDSmallBusinessButton() throws InterruptedException {
        tdBankHome.checkTDSmallBusinessButton();
        tdBankHome.validateCheckTDSmallBusinessButton("Small Business Banking");
    }
    @Test
    public void testCheckTDCommercialButton() throws InterruptedException {
        tdBankHome.checkTDCommercialButton();
        tdBankHome.validateCheckTDCommercialButton("TD Commercial Banking");
    }
    @Test
    public void testCheckTDInvestingNWealthButton() throws InterruptedException {
        tdBankHome.checkTDInvestingNWealthButton();
        tdBankHome.validateCheckTDInvestingNWealthButton("Investing and Wealth");
    }
    @Test
    public void testCheckTDHelpButton() throws InterruptedException {
        tdBankHome.checkTDHelpButton();
        tdBankHome.validateCheckTDHelpButton(driver.getTitle());
    }
    @Test
    public void testCheckTDLearningButton() throws InterruptedException {
        tdBankHome.checkTDLearningButton();
        tdBankHome.validateCheckTDLearningButton("Learning Center");
    }
}