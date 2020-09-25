package tdBankHomeTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tdBankHome.TDBankHomePage;

public class TDBankHomePageTest extends WebAPI {

    TDBankHomePage tdBankHomePage;

    @BeforeMethod
    public void getInit(){
        tdBankHomePage = PageFactory.initElements(driver,TDBankHomePage.class);
    }

    @Test
    public void testChangeCountry(){
        tdBankHomePage.changeCountry();
        tdBankHomePage.validateCountryChanged();
    }
    @Test
    //MouseHoverOver
    public void testSelectCreditCardFromList(){
        tdBankHomePage.selectCreditCardFromList();
        tdBankHomePage.validateCreditCardPage();
    }
    @Test
    //MouseHover and DropDown
    public void testSavingsAccount(){
        tdBankHomePage.savingsAccountDropdown();
        tdBankHomePage.validateSavingsAccount();
    }

    @Test
    //Login with invalid credentials with navigating to another page
    public void testLoginWithInvalidCredentials(){
        tdBankHomePage.loginWithInvalidCredentials();
        tdBankHomePage.validateLoginWithInvalidCredentials();
    }








}
