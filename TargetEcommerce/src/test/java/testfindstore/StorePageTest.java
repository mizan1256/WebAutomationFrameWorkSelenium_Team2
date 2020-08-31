package testfindstore;

import common.WebAPI;
import findstores.StorePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StorePageTest extends WebAPI {

    StorePage myStorePage;

    @BeforeMethod
    public void getInIt(){
        myStorePage= PageFactory.initElements(driver, StorePage.class);
    }

    @Test//8
    public void testing_validate_FindStoreByXpath_method() throws InterruptedException {
        myStorePage.findStore_method();
        myStorePage.validate_FindStore_method();
    }
    @Test//12
    public void testing_ValidateSetLakeStreet() throws InterruptedException {
        myStorePage.setLakeStreet();
        myStorePage.validateSetLakeStreet();
    }
    @Test//13
    public void testing_validateSetEnterZip_CityBox ()throws InterruptedException {
        myStorePage.setEnterZip_CityBox();
        myStorePage.validateSetEnterZip_CityBox();
    }
    @Test//14
    public void testing_ValidateSetFallForAll()throws InterruptedException {
        myStorePage.setFallForAll();
        myStorePage.validateSetFallForAll();
    }
    @Test//15
    public void testing_validateSeeOfferDetailText()throws InterruptedException {
        myStorePage.seeOfferDetailText();
        myStorePage.validateSeeOfferDetailText();
    }
}
