package testGiftCard;

import common.WebAPI;
import giftCard.GiftCard;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GiftCardPageTest extends WebAPI {
    GiftCard giftCard;

    @BeforeMethod
    public void getInit() {
        giftCard = PageFactory.initElements(driver, GiftCard.class);
    }

    @Test
    public void TestGiftCard() {//works
        giftCard.giftCard();
        giftCard.validateGiftCard();
    }
    @Test
    public void TestRegistry() {//works
        giftCard.registry();
        giftCard.validateRegistry();
    }


}