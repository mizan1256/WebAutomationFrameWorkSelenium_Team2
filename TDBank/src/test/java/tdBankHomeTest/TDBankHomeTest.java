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
    public void getInit() {
        tdBankHome = PageFactory.initElements(driver, TDBankHome.class);
    }

    @Test
    public void TestLogin() throws InterruptedException {
        tdBankHome.login();
        tdBankHome.testLogin();
    }

    @Test
    public void TestSmallBusiness() throws InterruptedException {
        tdBankHome.smallBusiness();
        tdBankHome.verifySmallBusiness();

    }
    @Test
    public void TestProductsOption() throws InterruptedException {
        tdBankHome.productsOption();
        tdBankHome.verifyProductsOption();
    }
    @Test
    public void TestClickCommercial() throws InterruptedException {
        tdBankHome.clickCommercial();
        tdBankHome.verifyClickCommercial();

    }
    @Test
    public void TestExplorePersonal() throws InterruptedException {
        tdBankHome.ExplorePersonal();
        tdBankHome.verifyExplorePersonal();

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
