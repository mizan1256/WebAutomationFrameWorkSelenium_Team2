package giftCard;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static giftCard.GiftCardPageWebElement.*;

public class GiftCardPage extends WebAPI {

    @FindBy(how = How.XPATH, using = navigateGiftCard)
    public static WebElement searchGiftCard;

    @FindBy(how = How.XPATH, using = navigateGiftCardText)
    public static WebElement searchGiftCardText;

    @FindBy(how = How.XPATH, using = shiptDealImageDisplay)
    public static WebElement searchshiptDealImageDisplay;

    @FindBy(how = How.XPATH, using = shipDealImageClickText)
    public static WebElement searchshipDealImageClickText;

    @FindBy(how = How.XPATH, using = shiptGiftCardDisplay)
    public static WebElement searchshipGiftCardDisplay;

    @FindBy(how = How.XPATH, using = nevigateFindeStore)
    public static WebElement searchNevigateFindeStore;

    @FindBy(how = How.XPATH, using = nevigateFindeStoreText)
    public static WebElement searchFindeStoreText;

    @FindBy(how = How.XPATH, using = bulkGiftCardDisplay)
    public static WebElement searchbulkGiftCardDisplay;


    public static void checkGiftCard(){
        searchGiftCard.click();
    }
    public static void validateGiftCardText () throws InterruptedException {
        Thread.sleep(3000);
        String actualResult = searchGiftCardText.getText();
        Thread.sleep(3000);
        String expectedResult = "Gift Cards";
        Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
    }

    public static void checkshiptDealImageDisplay() throws InterruptedException {

        searchGiftCard.click();
        Thread.sleep(3000);
        System.out.println("The image is Displayed : " +  searchshiptDealImageDisplay.isDisplayed() );
    }
    public static void checkshiptDeaButtonClickAble() throws InterruptedException {
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchGiftCard.click();
          searchshiptDealImageDisplay.click();
    }
    public static void validateShipDealImageClickText() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actualResult=searchshipDealImageClickText.getText();
        String expectedResult="Help us improve this page";
        Assert.assertEquals(actualResult,expectedResult,"test fail");
    }

    public static void checkshiptGiftCardDisplay() throws InterruptedException {

        searchGiftCard.click();
        Thread.sleep(3000);
        System.out.println("the image is displayn :"  +    searchshipGiftCardDisplay.isDisplayed() );
    }
    public static void checkFindeStore(){
        searchNevigateFindeStore.click();
    }
    public static void validateFindStoreText() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult=searchFindeStoreText.getText();
        String expectedResult="Find a store";
        Assert.assertEquals(actualResult,expectedResult,"test fail");
    }
    public static void checkBulkGiftCardDisplay() throws InterruptedException {
        searchGiftCard.click();
        searchbulkGiftCardDisplay.isDisplayed();
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println("The image is Displayed : " +   searchbulkGiftCardDisplay.isDisplayed() );
    }



}
