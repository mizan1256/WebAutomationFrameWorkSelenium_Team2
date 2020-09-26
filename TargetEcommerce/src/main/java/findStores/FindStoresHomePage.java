package findStores;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static findStores.FindStoresHomePageElements.*;

public class FindStoresHomePage extends WebAPI {
    @FindBy(how = How.XPATH,using = webElementsFindStores) public WebElement findStoresSearch;
    @FindBy(how = How.XPATH,using = webElementsFindStoresText) public WebElement findStoresText;
    @FindBy(how = How.XPATH,using = webElementsQueensStores) public WebElement queensStore;
    @FindBy(how = How.XPATH,using = webElementsQueensStoresText) public WebElement queenStoreText;
    @FindBy(how = How.XPATH,using = webElementsElmontStores) public WebElement elmontStore;
    @FindBy(how = How.XPATH,using = webElementsElmontStoresText) public WebElement elmontStoreText;
    @FindBy(how = How.XPATH,using = webElementsElmontStoresInfoText) public WebElement elmontStoresInfoText;
    //    @FindBy(how = How.XPATH,using = webElementsElmontStoresHoursText) public WebElement elmontStoresHoursText;
    @FindBy(how = How.XPATH,using = webElementsNearbyStore) public WebElement nearbyStore;
    @FindBy(how = How.XPATH,using = webElementsNearbyStoreHoursText) public WebElement nearbyStoreHoursText;
    @FindBy(how = How.XPATH,using = webElementsZipBox) public WebElement zipBox;
    @FindBy(how = How.XPATH,using = webElementsLakeStreetStore) public WebElement lakeStreetStore;
    @FindBy(how = How.XPATH,using = webElementsLakeStreetStoreText) public WebElement lakeStreetStoreText;

    //Test-6
    //Action Method
    public void searchFindStores(){
        findStoresSearch.click();
    }
    //Validate method
    public void validateSearchFindStores() throws InterruptedException {
        String actualResult=findStoresText.getText();
        Thread.sleep(5000);
        String expectedResult="Find a store";
        Assert.assertEquals(actualResult,expectedResult,"not match");
    }
    // Test-7
    //Action Method
    public void searchQueensStores() throws InterruptedException {
        Thread.sleep(5000);
        findStoresSearch.click();
        Thread.sleep(5000);
        queensStore.click();
    }
    //Validate method
    public void validateSearchQueensStores() throws InterruptedException {
        String actualResult=queenStoreText.getText();
        Thread.sleep(5000);
        String expectedResult="Queens Place";
        Assert.assertEquals(actualResult,expectedResult,"Text don't match");
    }
    // Test-8
    //Action Method
    public void searchElmontStores() throws InterruptedException {
        findStoresSearch.click();
        Thread.sleep(5000);
        elmontStore.click();
        Thread.sleep(3000);
    }
    //Validate method
    public void validateSearchElmontStore() throws InterruptedException {
        String actualResult=elmontStoreText.getText();
        Thread.sleep(5000);
        String expectedResult="Elmont";
        Assert.assertEquals(actualResult,expectedResult,"Text don't exist");
    }
    // Test-9
    //Action Method
    public void searchElmontStoreInfo() throws InterruptedException {
        findStoresSearch.click();
        Thread.sleep(5000);
        elmontStore.click();
        Thread.sleep(3000);
    }
    //Validate method
    public void validateSearchElmontStoreInfo() throws InterruptedException {
        String actualResult=elmontStoresInfoText.getText();
        Thread.sleep(5000);
        String expectedResult="Store info";
        Assert.assertEquals(actualResult,expectedResult,"Text don't exist");
    }
    // Test-10
    //Action Method
    public void searchNearbyStoreHoursInfo() throws InterruptedException {
        findStoresSearch.click();
        Thread.sleep(5000);
        nearbyStore.getLocation();
        nearbyStore.click();
        Thread.sleep(5000);
    }
    //validate Method
    public void validateSearchNearbyStoreHoursInfo() throws InterruptedException {
        String actualResult=nearbyStoreHoursText.getText();
        Thread.sleep(5000);
        String expectedResult="Store hours";
        Assert.assertEquals(actualResult,expectedResult,"Text don't match");
    }
    //Action Method
    public void checkZipBox() throws InterruptedException {
        findStoresSearch.click();
        Thread.sleep(4000);
        zipBox.click();
        Thread.sleep(3000);
    }
    //Validate Method
    public void validateCheckZipBox() throws InterruptedException {
        String actualResult = "Stores Near Me : Target";
        Thread.sleep(3000);
        String expectedResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }

    public void searchLakeStreetStore() throws InterruptedException {
        Thread.sleep(5000);
        findStoresSearch.click();
        Thread.sleep(5000);
        lakeStreetStore.click();
        Thread.sleep(3000);
    }
    public void validateSearchLakeStreetStore() throws InterruptedException {
        String actualResult=lakeStreetStoreText.getText();
        Thread.sleep(5000);
        String expectedResult="Lake Street";
        Assert.assertEquals(actualResult,expectedResult,"not match");
    }
}
