package atnthome;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Set;

import static atnthome.AtntHomePageWebElements.*;

public class AtntHomePage extends WebAPI {

    //@Find By
    @FindBy(xpath = homePageSearchBoxW_Xp)
    WebElement homePageSearchBox;

    @FindBy(xpath = upgradeDeviceLink_Xp)
    WebElement upgradeDeviceLink;

    @FindBy(xpath = upgradeNowBtn_Xp)
    WebElement upgradeNowBtn;

    @FindBy(xpath = continueBtnWithPrice_Xp)
    WebElement continueBtn;

    @FindBy(xpath = upgradeMyPhoneLink_Xp)
    WebElement upgradeMyPhoneLink;

    @FindBy(xpath = signInPageText_Xp)
    WebElement signInPageText;

    @FindBy(xpath = businessLink_Xp)
    WebElement businessLink;

    @FindBy(xpath = businessTvBtn_xp)
    WebElement businessTvBtn;

    @FindBy(xpath = shopDirecttvBtn_Xp)
    WebElement shopDirectTvBtn;
    @FindBy(xpath = directTvText_xp)
    WebElement directTvText;

    @FindBy(xpath = iphone11ProText_Xp)
    WebElement iphone11ProWebEle;

    @FindBy(xpath = searchBoxBtn_Xp)
    WebElement searchBoxBtn;

    @FindBy(xpath = accountBtn_Xp)
    WebElement accountBtn;

    @FindBy(linkText = manageProfile_LT)
    WebElement manageProfile;

    @FindBy(xpath = supportBtn_Xp)
    WebElement supportBtn;

    @FindBy(xpath = supportSearchField_Xp)
    WebElement supportSearchField;

    @FindBy(xpath = supportSearchBtn_Xp)
    WebElement supportSearchBtn;

    @FindBy(xpath = supportSearchedPageText_Xp)
    WebElement supportSearchedPageText;

    @FindBy(xpath = menuBtn_Xp)
    WebElement menuBtn;

    @FindBy(xpath = wirelessBtn_Xp)
    WebElement wirelessBtn;

    @FindBy(xpath = exploreWirelessBtn_Xp)
    WebElement exploreWirelessBtn;








    //Action Method
    public void upgradeDevice(){
        clickOnElement(homePageSearchBox);
        sleepFor(2);
        clickOnElement(upgradeDeviceLink);
        sleepFor(2);
        clickOnElement(upgradeNowBtn);
        sleepFor(3);

        //String parentWindow = driver.getWindowHandle();
        clickOnElement(continueBtn);
        sleepFor(3);

//        Set<String> handles = driver.getWindowHandles();
//        for (String handle : handles){
//            System.out.println(handle);
//        }

        clickOnElement(upgradeMyPhoneLink);
        sleepFor(5);

    }

    public void switchToBusiness(){
        clickOnElement(businessLink);
        clickOnElement(businessTvBtn);
        clickOnElement(shopDirectTvBtn);
    }

    public void searchingProduct(){
        clickOnElement(homePageSearchBox);
        clearField(homePageSearchBox);
        typeOnElement(homePageSearchBox,iphone11ProText);
        sleepFor(3);
        clickOnElement(searchBoxBtn);

    }

    public void selectItemFromAccountList(){
        clickOnElement(accountBtn);
        sleepFor(3);
        clickOnElement(manageProfile);
        sleepFor(4);

    }

    public void checkSupport(){
        clickOnElement(supportBtn);
        sleepFor(3);
        typeOnElement(supportSearchField,supportSearchFieldText);
        sleepFor(3);
        clickOnElement(supportSearchBtn);

    }

    public void checkMenuButton(){
        waitUntilClickAble(menuBtn);
        clickOnElement(menuBtn);
        sleepFor(2);
        clickOnElement(wirelessBtn);
        sleepFor(2);
        clickOnElement(exploreWirelessBtn);
    }





    //Validate Method
    public void validateSignInScreenIsDisplayed(){
     Assert.assertTrue(isDisplayed(signInPageText));
    }

    public void validateSwitchToBusiness(){
        String expectedText ="Speak with a DIRECTV sales rep";
        String actualText = directTvText.getText();
        Assert.assertEquals(actualText,expectedText,"Text doesn't match");
    }

    public void validateSearchingProduct(){
        String expectedText ="IPHONE 11 PRO";
        String actualText = iphone11ProWebEle.getText();
        Assert.assertEquals(actualText,expectedText,"Text doesn't match");
    }

    public void validateSelectItemFromAccountList(){
        Assert.assertTrue(isDisplayed(signInPageText));
    }

    public void validateSupport(){
        Assert.assertTrue(isDisplayed(supportSearchedPageText));
    }

    public void validateMenuButton(){
        String expectedTitle = "AT&T Wireless – Latest Phones & Best Wireless Plans";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Title doesn't match");
    }









}
