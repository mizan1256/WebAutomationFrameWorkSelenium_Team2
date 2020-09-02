package giftCards;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static giftCards.GiftCardHomePageElements.*;

public class GiftCardHomePage extends WebAPI {
    @FindBy(how = How.XPATH,using = webElementsGiftCardButton) public WebElement giftCardButton;
    @FindBy(how = How.CLASS_NAME,using = webElementsGiftCardButtonClassText) public WebElement giftCardText;
    @FindBy(how = How.XPATH,using = webElementsTargetGiftCards) public WebElement targetGiftCards;
    @FindBy(how = How.XPATH,using = webElementsTargetGiftCardsClassText) public WebElement targetGiftCardsText;
    @FindBy(how = How.XPATH,using = webElementsShiptDeal) public WebElement shiptDeal;
    @FindBy(how = How.XPATH,using =webElementsShiptDealText) public WebElement shiptDealText;
    @FindBy(how = How.XPATH,using =webElementsAddToCart) public WebElement addToCart;
    @FindBy(how = How.XPATH,using =webElementsAddToCartText) public WebElement addToCartText;
    @FindBy(how = How.XPATH,using =webElementsVisaPreparedCard) public WebElement visaPreparedCard;
    @FindBy(how = How.XPATH,using =webElementsVisaPreparedCardDisplay) public WebElement visaPreparedCardDisplay;
    @FindBy(how = How.XPATH,using =webElementsVisaPreparedShiptButton) public WebElement shiptButton;
    @FindBy(how = How.XPATH,using =webElementsVisaPreparedShiptButtonDisplay) public WebElement shiptButtonDisplay ;
    @FindBy(how = How.XPATH,using =webElementsVisaPreparedShiptButtonDisplayText) public WebElement shiptButtonDisplayText ;
    @FindBy(how = How.XPATH,using =webElementsVisaPreparedShiptViewAndCartButton) public WebElement visaPreparedShiptViewAndCartButton ;
    @FindBy(how = How.XPATH,using =webElementsVisaGiftCard) public WebElement visaGiftCard ;
    @FindBy(how = How.XPATH,using =webElementsVisaGiftCardText) public WebElement visaGiftCardText ;


    //Test-16
    //Action Method
    public void clickGiftCardButton() throws InterruptedException {
        giftCardButton.click();
        Thread.sleep(3000);
    }
    //Validate method
    public void validateClickGiftCardButton() throws InterruptedException {
        String actualResult="Something for everyone";
        Thread.sleep(5000);
        String expectedResult=giftCardText.getText();
        Assert.assertEquals(actualResult,expectedResult,"Text don't match");
    }
    //Test-17
    //Action Method
    public void clickTargetGiftCards() throws InterruptedException {
        giftCardButton.click();
        Thread.sleep(7000);
        targetGiftCards.click();
        Thread.sleep(5000);
    }
    //Validate method
    public void validateClickTargetGiftCards() throws InterruptedException {
        String actualResult="Target GiftCards";
        Thread.sleep(5000);
        String expectedResult=targetGiftCardsText.getText();
        Assert.assertEquals(actualResult,expectedResult,"Text don't Exist");
    }
    //Test-18
    //Action Method
    public void clickShiptDealButton() throws InterruptedException {
        giftCardButton.click();
        Thread.sleep(3000);
        shiptDeal.click();
        Thread.sleep(3000);
    }
    //Validate method
    public void validateClickShiptDealButton() throws InterruptedException {
        String actualResult="Shipt Membership Giftcard (Email Delivery)";
        Thread.sleep(5000);
        String expectedResult=shiptDealText.getText();
        Assert.assertEquals(actualResult,expectedResult,"Text don't Exist");
    }
    //Test-19
    //Action Method
    public void clickVisaPreparedCard() throws InterruptedException {
        giftCardButton.click();
        Thread.sleep(3000);
        shiptDeal.click();
        Thread.sleep(3000);
        visaPreparedCard.click();
        Thread.sleep(3000);
    }
    //Validate Method
    public void validateClickVisaPreparedCard()  throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='ZoomedImage__Zoomed-sc-1j8d1oa-0 lhalMp']")).isDisplayed());
        Thread.sleep(2000);
    }
    //Test-20
    //Action Method
    public void clickVisaPreparedShiptButton() throws InterruptedException {
        giftCardButton.click();
        Thread.sleep(3000);
        shiptDeal.click();
        Thread.sleep(3000);
        visaPreparedCard.click();
        Thread.sleep(3000);
        shiptButton.click();
        Thread.sleep(3000);
    }
    //Validate Method
    public void validateClickVisaPreparedShiptButton()   throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.xpath("//h2[@class='Heading__StyledHeading-sc-1m9kw5a-0 hdEoFP h-margin-a-none']")).isDisplayed());
        Thread.sleep(2000);
    }
    //Action Method
    public void clickAddToCart() throws InterruptedException {
        giftCardButton.click();
        Thread.sleep(3000);
        shiptDeal.click();
        Thread.sleep(3000);
        addToCart.click();
    }
        //Validate method
    public void validateClickAddToCart() throws InterruptedException {
        String actualResult="Added to cart";
        Thread.sleep(4000);
        String expectedResult=addToCartText.getText();
        Thread.sleep(3000);
        Assert.assertEquals(actualResult,expectedResult,"Text don't Exist");
    }
    //Action Method
    public void clickViewCart() throws InterruptedException {
        giftCardButton.click();
        Thread.sleep(3000);
        shiptDeal.click();
        Thread.sleep(3000);
        addToCart.click();
        Thread.sleep(3000);

    }
    public void clickVisaGiftCard() throws InterruptedException {
        giftCardButton.click();
        Thread.sleep(3000);
        shiptDeal.click();
        Thread.sleep(3000);
        visaGiftCard.click();
        Thread.sleep(3000);

    }

    //Validate method
    public void validateClickVisaGiftCard() throws InterruptedException {
        String actualResult="Visa Gift Card - $100 + $6 Fee";
        Thread.sleep(5000);
        String expectedResult=visaGiftCardText.getText();
        Assert.assertEquals(actualResult,expectedResult,"Text don't Exist");
    }

}
