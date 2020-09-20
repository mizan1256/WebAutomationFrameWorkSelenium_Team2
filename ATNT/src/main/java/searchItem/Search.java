package searchItem;

import common.WebAPI;
import dataDriven.DataSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;

import static searchItem.SearchWebElement.*;

public class Search extends WebAPI {
    String textVarificatePre = "Showing results for ";

    @FindBy(how = How.XPATH, using = searchBoxXpathWebElement)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = searchTextWebElement)
    public WebElement searchText;

    //action method
    public void searchItem() {
        clickOnElement(searchBoxXpathWebElement);
        typeByXpath(searchBoxXpathWebElement, "iphone 8 plus");
        searchBox.submit();

    }

    //validate method
    public void validateSearchItem() throws InterruptedException {
        waitUntilClickAble(By.xpath(searchBoxXpathWebElement));
        sleepFor(5);
        String actualText = searchText.getText();
        String expectedText = textVarificatePre + "\"iphone 8 plus\"" + ".";
        Assert.assertEquals(actualText, expectedText);
    }

    //get the data from a different class "dataSource"
    public void searchBoxCheckUsingGetItemValue() throws InterruptedException {
        List<String> itemList = DataSource.getItemValue();
        for (String st : itemList) {
            searchBox.sendKeys(st);
            searchBox.submit();
            String expectedResult = textVarificatePre + "\"" + st + "\"" + ".";
            System.out.println("Expected Result : " + expectedResult);
            sleepFor(3);
            String actualResult = searchText.getText();
            System.out.println("Actual Result : " + actualResult);
            Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
            sleepFor(3);
            searchBox.clear();
        }
    }

    //using data from excel
    public void searchBoxCheckGetItemsListFromExcel() throws Exception {
        List<String> itemList = DataSource.getItemsListFromExcel();
        for (int i = 1; i < itemList.size(); i++) {
            String item = itemList.get(i);
            searchBox.sendKeys(item);
            searchBox.submit();
            String expectedResult = textVarificatePre + "\"" + item + "\"" + ".";
            System.out.println("Expected Result : " + expectedResult);
            String actualResult = searchText.getText();
            System.out.println("Actual Result : " + actualResult);
            Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
            sleepFor(3);
            searchBox.clear();
        }

    }

    //using data from DB
    public void searchBoxCheckGetItemsListFromDB() throws Exception {
        // Insert Data to a Database table
        DataSource.insertDataIntoDB();
        // Get Data From Database Table
        List<String> itemList = DataSource.getItemsListFromDB();
        for (int i = 1; i < itemList.size(); i++) {
            String item = itemList.get(i);
            searchBox.sendKeys(item);
            searchBox.submit();
            String expectedResult = textVarificatePre + "\"" + item + "\"" + ".";
            System.out.println("Expected Result : " + expectedResult);
            String actualResult = searchText.getText();
            System.out.println("Actual Result : " + actualResult);
            Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
            sleepFor(3);
            searchBox.clear();
        }

    }


}
