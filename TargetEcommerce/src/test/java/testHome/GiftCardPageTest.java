package testHome;

import common.WebAPI;
import giftCard.GiftCardPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GiftCardPageTest extends WebAPI {
    GiftCardPage giftCardPage;

    @BeforeMethod
    public void getInit() {

        giftCardPage = PageFactory.initElements(driver, GiftCardPage.class);
    }

    @Test
    public void testGiftCardButton() throws InterruptedException {
        GiftCardPage.checkGiftCard();
        GiftCardPage.validateGiftCardText();
    }

    @Test
    public void testDeal() throws InterruptedException {
        GiftCardPage.checkGiftCard();
        GiftCardPage.validateGiftCardText();
    }

    @Test
    public void testShiptDealImageDisplat() throws InterruptedException {
        GiftCardPage.checkshiptDealImageDisplay();
    }


    @Test
    public void shiptDealImageClickable() throws InterruptedException {
        GiftCardPage.checkshiptDeaButtonClickAble();
        GiftCardPage.validateShipDealImageClickText();
    }

    @Test
    public void testShiptGiftCardDisplay() throws InterruptedException {
        GiftCardPage.checkshiptGiftCardDisplay();
    }

    @Test
    public void testFindStore() throws InterruptedException {
        GiftCardPage.checkFindeStore();
        GiftCardPage.validateFindStoreText();
    }

    @Test
    public void testBulkGitCardDisplay() throws InterruptedException {
        GiftCardPage.checkBulkGiftCardDisplay();

    }
}