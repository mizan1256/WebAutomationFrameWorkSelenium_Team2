package tdBankTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import tdBankHome.TDBankHomePage;

/**
 * author - Mohammad Mujahidul Islam
 */

public class TDBankHomePageTest extends WebAPI {

    TDBankHomePage tdBankHomePage;
    @BeforeMethod
    public void getInIt(){
        tdBankHomePage= PageFactory.initElements(driver,TDBankHomePage.class);
    }

    @Test
    public void testTDBankLogoIsDisplayed(){
        tdBankHomePage.tdBankLogoIsDisplayed();
    }
    @Test
    public void testTDBankSmallBusinessTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tdBankHomePage.tdBankSmallBusinessTab();
        tdBankHomePage.validateTDBankSmallBusinessTab("Business Customers");
    }
    @Test
    public void testTDBankCommercialTab() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tdBankHomePage.tdBankCommercialTab();
        tdBankHomePage.validateTDBankCommercialTab("1-855-847-0664");
    }
    @Test
    public void testTDBankCommercialLearnBox() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tdBankHomePage.tdBankCommercialLearnBox();
        tdBankHomePage.validateTDBankCommercialLearnBox("An Overview of PPP Loan Forgiveness");
    }
    @Test
    public void testInvestingAndWealthTab(){
        tdBankHomePage.investingAndWealthTab("Connect with TD Bank");
    }
}
