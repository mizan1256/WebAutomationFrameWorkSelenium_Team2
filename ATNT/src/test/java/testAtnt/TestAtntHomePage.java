package testAtnt;

import atntHome.AtntHomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestAtntHomePage extends WebAPI {
    AtntHomePage atntHomePage;

    @BeforeMethod
    public void getInIt() {
        atntHomePage = PageFactory.initElements(driver, AtntHomePage.class);
    }

    @Test
    public void testBurgerButtonCheck() {
        atntHomePage.burgerButtonCheck();
    }
    @Test
    public void testSearchBoxCheckAndGetItemValue() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        atntHomePage.searchBoxCheckAndGetItemValue();
    }
    @Test
    public void testSearchBoxAndGetItemsListFromExcel() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        atntHomePage.searchBoxAndGetItemsListFromExcel();
    }
    @Test
    public void testSearchBoxCheckGetItemsListFromDB() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        atntHomePage.searchBoxCheckGetItemsListFromDB();
    }


}
