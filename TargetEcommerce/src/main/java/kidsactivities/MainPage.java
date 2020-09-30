package kidsactivities;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static kidsactivities.MainPageWebElements.*;

public class MainPage extends WebAPI {
    @FindBy(how = How.XPATH, using = kidsActivitiesButton)public WebElement kidsButton;
    @FindBy(how = How.XPATH,using = age2Button) public WebElement ageButton;
    @FindBy(how = How.XPATH, using = kidsPlayActivities)public WebElement kidsActivites;
    @FindBy(how = How.XPATH, using = toysButton)public WebElement toysPush;
    @FindBy(how = How.XPATH, using = toysTextLine) public WebElement toysText;
    @FindBy(how = How.XPATH, using = giftCards)public WebElement giftCard;
    @FindBy(how = How.XPATH,using = addToCartBox) public WebElement addToCart;
    @FindBy(how = How.XPATH, using = continueShoppingBox)public WebElement continueShopping;
    @FindBy(how = How.XPATH, using = emailDelivery) public WebElement emailDeliveryText;
    @FindBy(how = How.XPATH, using = mainGiftCorner)public WebElement giftCorner;
    @FindBy(how = How.XPATH, using = birthdayGiftCorner) public WebElement birthdayGift;
    @FindBy(how = How.XPATH, using = findStoreTab) public WebElement findStore;
    @FindBy(how = How.XPATH, using = enterZipCodeBox) public WebElement zipCodeBox;
    @FindBy(how = How.XPATH, using = enterZipCode) public WebElement enterZip;
    @FindBy(how = How.XPATH, using = findStoreButton) public WebElement storeButton;
    @FindBy(how = How.XPATH, using = findAStore) public WebElement findStoreText;



    //    Action Method
    public void ageActivesButton() throws InterruptedException {
        kidsButton.click();
        Thread.sleep(6000);
        ageButton.click();
    }
    //    Validation
    public void validateAgeActivesButton(){
        String actualResul=kidsActivites.getText();
        String expectedResult="Kids' Play Activities";
        Assert.assertEquals(actualResul,expectedResult);
        System.out.println("PASSED");
    }
    //    Action Method
    public void toysButton() throws InterruptedException {
        ageActivesButton();
        toysPush.getLocation();
        toysPush.click();
        Thread.sleep(3000);
    }
    //    Validation
    public void validateToysButton(){
        String actualResult = toysText.getText();
        String expectedResult = "Toys";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
    //    Action Method
    public void giftCard() throws InterruptedException {
        ageActivesButton();
        giftCard.click();
        Thread.sleep(3000);
        addToCart.click();
        Thread.sleep(3000);
        continueShopping.click();
    }
    //    Validation
    public void validationGiftCard(){
        String actualResult = emailDeliveryText.getText();
        String expectedResult = "Email delivery";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
    //    Action Method
    public void giftCorner() throws InterruptedException {
        ageActivesButton();
        giftCorner.click();
        birthdayGift.isDisplayed();
    }

    //    Action Method
    public void findStoreTab(String Code) throws InterruptedException {
        ageActivesButton();
        findStore.click();
        Thread.sleep(3000);
        zipCodeBox.click();
        Thread.sleep(3000);
        enterZip.sendKeys(Code);
        Thread.sleep(3000);
        storeButton.click();
    }
    //  Validation
    public void valedateFindStoreTab(){
        String actualResult= findStoreText.getText();
        String expectedResult = "Find a store";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }

}
