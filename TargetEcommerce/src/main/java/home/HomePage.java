package home;

import common.WebAPI;
import datadriven.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;

import static home.HomePageWebElement.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = webElementSearchBox)
    public WebElement searchText;
    @FindBy(xpath = "//input[@id='search']")
    WebElement searchField;
    @FindBy(xpath = "//button[@class='SearchInputButton-sc-1opoijs-0 gpTjzt']")
    WebElement searchFieldButton;
    @FindBy(xpath = "//h1[@class='Heading__StyledHeading-sc-1m9kw5a-0 jAsGMN h-margin-b-none']")
    WebElement headerIPhone;

    /**
     * Search Item Using getaItemValue method
     * @throws InterruptedException
     */
    //Action Method
    public void searchBoxCheckUsingGetItemValue() throws InterruptedException {
        List<String> itemList = DataSource.getItemValue();
        for (String st : itemList) {
            searchField.sendKeys(st);
            searchField.submit();
            searchField.clear();
            Thread.sleep(3000);
        }
    }

    //Action Method
    public void searchBoxCheckUsingGetItemsListFromExcel() throws Exception {
        List<String> itemList= DataSource.getItemsListFromExcel();
        for (int i=1; i<itemList.size();i++){
            String item=itemList.get(i);
            searchField.sendKeys(item);
            searchField.submit();
            Thread.sleep(3000);
            String expectedResult="";
            System.out.println("Expected Result : "+expectedResult);
            String actualResult = searchText.getText();
            System.out.println("Actual Result : "+actualResult);
            Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
            sleepFor(3);
            searchField.clear();
            Thread.sleep(3000);
        }
    }
    public void searchBoxCheckGetItemsListFromDB() throws Exception {
        // Insert Data to a Database table
        DataSource.insertDataIntoDB();
        // Get Data From Database Table
        List<String> itemList= DataSource.getItemsListFromDB();
        for (int i=1; i<itemList.size();i++){
            String item=itemList.get(i);
            searchField.sendKeys(item);
            searchField.submit();
            String expectedResult="\""+item+"\"";
            System.out.println("Expected Result : "+expectedResult);
            String actualResult = searchText.getText();
            System.out.println("Actual Result : "+actualResult);
            //    Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
            sleepFor(3);
            searchField.clear();
            Thread.sleep(3000);
        }

    }
}
