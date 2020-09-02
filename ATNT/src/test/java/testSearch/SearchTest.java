package testSearch;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import registration.Registration;
import reporting.TestLogger;
import searchItem.Search;

public class SearchTest extends WebAPI {
    Search search;
    @BeforeMethod
    public void getInit() {
        search = PageFactory.initElements(driver, Search.class);
    }

    @Test
    public void testSearch() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        search.searchItem();
        search.validateSearchItem();
    }

    @Test
    public void testSearchBoxCheckUsingGetItemValue() throws InterruptedException {//search and validate
        search.searchBoxCheckUsingGetItemValue();
    }

    @Test
    public void testSearchBoxCheckGetItemsListFromExcel() throws Exception {
        search.searchBoxCheckGetItemsListFromExcel();

    }@Test
    public void testSearchBoxCheckGetItemsListFromDB() throws Exception {
        search.searchBoxCheckGetItemsListFromDB();

    }




}
