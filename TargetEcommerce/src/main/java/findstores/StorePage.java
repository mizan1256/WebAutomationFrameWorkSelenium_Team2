package findstores;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static findstores.StorePageWebElement.*;

public class StorePage extends WebAPI {

    @FindBy(how = How.XPATH, using= findStoreByXpath)//8
    public WebElement findStore;

    @FindBy(how = How.XPATH, using= expected_FindStoreByXpath)//8
    public WebElement expectedFindStoreText;

    public void findStore_method() throws InterruptedException {// case # 8
        Thread.sleep(3000);
        findStore.click();
        //System.out.println(driver.getTitle());
    }
    public void validate_FindStore_method() throws InterruptedException {
        String actualResult=expectedFindStoreText.getText();
        String expectedResult= "Find a store";
        Assert.assertEquals(actualResult,expectedResult,"Test case do not match");
        Thread.sleep(1000);
    }
//////////////////// case#12
    @FindBy(how = How.XPATH, using= lakeStreetStore)//12
    public WebElement lakeStreet;

    @FindBy(how = How.XPATH, using= weeklyAdButton)//12
    public WebElement weeklyButton;

    @FindBy(how = How.XPATH, using= expectedWeeklyAd)//12
    public WebElement expectedWeekly;

    public void setLakeStreet() throws InterruptedException {//.....12
        findStore_method();
        lakeStreet.click();
        weeklyButton.click();
    }
    public void validateSetLakeStreet() throws InterruptedException {
        String actualResult="Weekly Ad";
        String expectedResult=expectedWeekly.getText();
        Assert.assertEquals(actualResult,expectedResult);
        Thread.sleep(3000);
    }
////////////////////////////// case # 13

    @FindBy(how = How.XPATH, using= enterZip_CityBox)//13
    public WebElement enterZipOrCity;

    @FindBy(how = How.XPATH, using= zipCodeBox)//13
    public WebElement zipCode;

    @FindBy(how = How.XPATH, using= findStoreButton)//13
    public WebElement findStoreButn;

    @FindBy(how = How.XPATH, using= near11435Text)//13
    public WebElement expected11435;

    public void setEnterZip_CityBox() throws InterruptedException {//.....13
        findStore_method();
        enterZipOrCity.click();
        zipCode.clear();
        zipCode.click();
        zipCode.sendKeys("11435");
        findStoreButn.click();
    }
    public void validateSetEnterZip_CityBox(){//13
        String actualResult= "near 11435";
        String expectedResult= expected11435.getText();
        Assert.assertEquals(actualResult,expectedResult);

    }
    ////////////////////////////// case # 14
    @FindBy(how = How.CLASS_NAME, using= fallForAllLebel)//14
    public WebElement fallForAll;

    @FindBy(how = How.XPATH, using= expectedFallForAllLebel)//14
    public WebElement expectedFall;

    public void setFallForAll() throws InterruptedException {//.....14
        findStore_method();
        fallForAll.click();
    }
    public void validateSetFallForAll() throws InterruptedException {//14
        String actualResult= "Starbucks";
        String expectedResult= expectedFall.getText();
        Assert.assertEquals(actualResult,expectedResult);
        Thread.sleep(3000);
    }
/////////////////////////// case #15
    @FindBy(how = How.XPATH, using= seeOfferDetailText)//15
    public WebElement seeOffer;

    @FindBy(how = How.XPATH, using= expectedOfferDetail)//15
    public WebElement expectedOffer;

    public void seeOfferDetailText() throws InterruptedException {//.....15
        findStore_method();
        seeOffer.click();
        Thread.sleep(6000);
    }
    public void validateSeeOfferDetailText() throws InterruptedException {//15
        String actualResult= "What would you like to do";
        String expectedResult= expectedOffer.getText();
        Assert.assertEquals(actualResult,expectedResult);
        Thread.sleep(3000);
    }


}
