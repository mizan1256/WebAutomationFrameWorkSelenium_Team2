package giftCardTest;

import common.WebAPI;
import giftCards.GiftCardHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GiftCardHomePageTest extends WebAPI {
    GiftCardHomePage giftCard;
    @BeforeMethod
    public void getInit(){
        giftCard= PageFactory.initElements(driver,GiftCardHomePage.class);
    }
    @Test
    public void testCliCkGiftCardButton() throws InterruptedException {
        giftCard.clickGiftCardButton();
        giftCard.validateClickGiftCardButton();
    }
    @Test
    public void testClickTargetGiftCard() throws InterruptedException {
      giftCard.clickTargetGiftCards();
      giftCard.validateClickTargetGiftCards();
    }
    @Test
    public void testClickShiptDealButton() throws InterruptedException {
        giftCard.clickShiptDealButton();
        giftCard.validateClickShiptDealButton();
    }
    @Test
    public void testClickVisaPreparedCard() throws InterruptedException {
        giftCard.clickVisaPreparedCard();
        giftCard.validateClickVisaPreparedCard();
    }
    @Test
    public void testClickVisaPreparedShiptButton() throws InterruptedException {
        giftCard.clickVisaPreparedShiptButton();
        giftCard.validateClickVisaPreparedShiptButton();
    }
    @Test
    public void testClickContinueShippingButton() throws InterruptedException {
        giftCard.clickAddToCart();
        giftCard.validateClickAddToCart();
    }

    @Test
    public void testClickVisaGiftCard() throws InterruptedException {
        giftCard.clickVisaGiftCard();
        giftCard.validateClickVisaGiftCard();
    }

}
