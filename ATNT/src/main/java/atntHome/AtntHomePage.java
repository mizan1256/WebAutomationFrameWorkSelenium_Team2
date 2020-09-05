package atntHome;

import common.WebAPI;
import dataDrivenAtnt.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static atntHome.AtntWebElementPage.*;

public class AtntHomePage extends WebAPI {

//    @FindBy(how = How.ID, using = homePageBurgerButtonId)
//    public WebElement burgerButton;
    @FindBy(how = How.XPATH, using = homePageSearchBox)
    public WebElement searchBox1;
    @FindBy(how = How.XPATH, using = homePageSearchButton)
    public WebElement searchButton1;


//    Action Method
    public void burgerButtonCheck(){
        clickOnElement(homePageBurgerButtonId);
        driver.getWindowHandle();
    }
    public void searchBoxCheckAndGetItemValue() throws InterruptedException {
        List<String> itemsList = DataSource.getItemValue();
        for (String st:itemsList) {
            searchBox1.sendKeys(st);
            searchButton1.click();
            Thread.sleep(3000);
            navigateBack();
            Thread.sleep(2000);
            searchBox1.clear();
            Thread.sleep(3000);
        }
    }

    public void searchBoxAndGetItemsListFromExcel() throws Exception {
        List<String> itemsList= DataSource.getItemsListFromExcel();
        for (int i=1; i<itemsList.size();i++) {
            String item = itemsList.get(i);
            searchBox1.sendKeys(item);
            searchButton1.click();
            Thread.sleep(2000);
            searchBox1.clear();
            Thread.sleep(3000);
        }
    }
    public void searchBoxCheckGetItemsListFromDB() throws Exception {
        // Insert Data to a Database table
        DataSource.insertDataIntoDB();
        // Get Data From Database Table
        List<String> itemList = DataSource.getItemsListFromDB();
        for (int i = 1; i < itemList.size(); i++) {
            String item = itemList.get(i);
            searchBox1.sendKeys(item);
            searchButton1.click();
            sleepFor(3);
            searchBox1.clear();
            sleepFor(3);
//            String expectedResult="\""+item+"\"";
//            System.out.println("Expected Result : "+expectedResult);
//            String actualResult = searchText.getText();
//            System.out.println("Actual Result : "+actualResult);
//            Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
//            sleepFor(3);
//            searchBox.clear();
        }
    }
}
