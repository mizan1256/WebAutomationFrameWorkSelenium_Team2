package findStoreTest;

import common.WebAPI;
import findStores.FindStoresHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindStoresHomePageTest extends WebAPI {
    FindStoresHomePage findStores;

    @BeforeMethod
    public void getInit() {
        findStores = PageFactory.initElements(driver, FindStoresHomePage.class);
    }

    @Test
    public void testSearchFindStores() throws InterruptedException {
        findStores.searchFindStores();
        findStores.validateSearchFindStores();
    }
    @Test
    public void testQueenStore() throws InterruptedException {
        findStores.searchQueensStores();
        findStores.validateSearchQueensStores();
    }
    @Test
    public void testElmontStore() throws InterruptedException {
        findStores.searchElmontStores();
        findStores.validateSearchElmontStore();
    }
    @Test
    public void validateSearchElmontStoreInfo() throws InterruptedException {
        findStores.searchElmontStoreInfo();
        findStores.validateSearchElmontStoreInfo();
    }
    @Test
    public  void testSearchElmontStoreHoursInfo() throws InterruptedException {
        findStores.searchNearbyStoreHoursInfo();
        findStores.validateSearchNearbyStoreHoursInfo();
    }
    @Test
    public  void testZipBox() throws InterruptedException {
        findStores.checkZipBox();
        findStores.validateCheckZipBox();

    }
    @Test
    public void testSearchLakeStreetStore() throws InterruptedException {
        findStores.searchLakeStreetStore();
        findStores.validateSearchLakeStreetStore();
    }

}