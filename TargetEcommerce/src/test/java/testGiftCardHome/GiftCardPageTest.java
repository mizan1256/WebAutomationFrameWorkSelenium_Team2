package testGiftCardHome;

import common.WebAPI;
import giftcard.GiftCardPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GiftCardPageTest extends WebAPI {
    GiftCardPage giftCardPage;
     @BeforeMethod
    public void getInit(){
       giftCardPage = PageFactory.initElements(driver, GiftCardPage.class);
    }
    @Test
    public void testGiftCardButton() throws InterruptedException {
        giftCardPage.giftCardButtonCheck();
        Thread.sleep(3000);
        giftCardPage.validateGiftCardButtonCheck();
    }
    @Test
    public void testShiptImageDisplay() throws InterruptedException {
        giftCardPage.shiptImageDisplay();
    }
    @Test
    public void testGcpShiptImageIsClickAble() throws InterruptedException {
        giftCardPage.gcpShiptImageIsClickAble();
        giftCardPage.validateGcpShiptImageIsClickAble();
    }
    @Test
    public void tsetGcpShiptButtonIsDisplay() throws InterruptedException {
         giftCardPage.gcpShiptButtonIsDisplay();
    }
    @Test
    public void testGcpShiptButtonIsClickable() throws InterruptedException {
         giftCardPage.gcpShiptButtonIsClickable();
        giftCardPage.validateGcpShiptButtonIsClickable();
    }
    @Test
    public void testGcpGiftCardForSchShoBagLogoIsDisplay(){
         giftCardPage.gcpGiftCardForSchShoBagLogoIsDisplay();
    }
    @Test
    public void testGcpGiftCardForSchoolShoppingBagLogo() throws InterruptedException {
        giftCardPage.gcpGiftCardForSchoolShoppingBagLogo();
        giftCardPage.validateGcpGiftCardForSchoolShoppingBagLogo();
    }
    @Test
    public void tsetGcpGiftForSchoolChooseOption() throws InterruptedException {
         giftCardPage.gcpGiftForSchoolChooseOption();
         giftCardPage.validateGcpGiftForSchoolChooseOption();
    }
}
