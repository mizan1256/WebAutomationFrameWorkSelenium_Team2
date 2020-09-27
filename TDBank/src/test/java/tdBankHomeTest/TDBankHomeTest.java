package tdBankHomeTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import tdBankHome.TDBankHome;

public class TDBankHomeTest extends WebAPI {
    TDBankHome tdBankHome;
    @BeforeMethod
    public void getInIt(){
        tdBankHome = PageFactory.initElements(driver, TDBankHome.class);
    }

    @Test
    public void testTDBankLogoIsDisplayed(){
        tdBankHome.tdBankLogoIsDisplayed();
    }
    @Test
    public void testTDBankSmallBusinessTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tdBankHome.tdBankSmallBusinessTab();
        tdBankHome.validateTDBankSmallBusinessTab("Business Customers");
    }
    @Test
    public void testTDBankCommercialTab() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tdBankHome.tdBankCommercialTab();
        tdBankHome.validateTDBankCommercialTab("1-855-847-0664");
    }
    @Test
    public void testTDBankCommercialLearnBox() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tdBankHome.tdBankCommercialLearnBox();
        tdBankHome.validateTDBankCommercialLearnBox("An Overview of PPP Loan Forgiveness");
    }
    @Test
    public void testInvestingAndWealthTab(){
        tdBankHome.investingAndWealthTab("Connect with TD Bank");
    }
}
