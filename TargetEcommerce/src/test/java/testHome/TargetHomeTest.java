package testHome;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import targetHome.TargetHome;

public class TargetHomeTest extends WebAPI {

    TargetHome homePage;

    @BeforeMethod
    public void getInIt(){
        homePage= PageFactory.initElements(driver,TargetHome.class);
    }


    @Test
    public void testTargetLogoDisplayCheck(){
        homePage.targetLogoDisplayCheck();
    }

    @Test
    public void testTargetLogoIsClickable() {
        homePage.targetLogoIsClickable();
        homePage.validateTargetLogoIsClickable();
    }

    @Test
    public void testTargetShoppingCardIsClickable(){
        homePage.targetShoppingCardIsClickable();
        homePage.validateTargetShoppingCardIsClickable();
    }

    @Test
    public void testTargetWeeklyAdIsClickable(){
        homePage.targetWeeklyAdIsClickable();
        homePage.validateTargetWeeklyAdIsClickable();
    }
    @Test
    public void testTargetWebElementsToyIsClickable(){
        homePage.targetWebElementsToyIsClickable();
        //homePage.validateTargetWebElementsToyIsClickable();
    }

    @Test
    public void testTargetWebElementsElectronics(){
        homePage.targetWebElementsElectronics();
        //homePage.validateTargetWebElementsElectronics();
    }

    @Test
    public void testTargetWebElementsSearchBox(){
        homePage.targetWebElementsSearchBox();
        homePage.validateTargetWebElementsSearchBox();
    }

    @Test
    public void testWebElementsWallPaper(){
        homePage.targetWebElementsWallPaper();
    }
    @Test
    public void testTargetWebElementsForSchool(){
        homePage.targetWebElementsForSchool();
        homePage.validateTargetWebElementsForSchool();
    }
    @Test
    public void testTargetWebElementsDealsDropDown() throws InterruptedException {
        homePage.targetWebElementsDealsDropDown();
        homePage.validateTargetWebElementsDealsDropDown();
    }
    @Test
    public void testTargetWebElementsWeeklyAd1() throws InterruptedException {
        homePage.targetWebElementsWeeklyAd1();
        homePage.validateTargetWebElementsWeeklyAd1();
    }
    @Test
    public void testTargetWebElementsTopDeals() throws InterruptedException {
        homePage.targetWebElementsTopDeals();
        homePage.validateTargetWebElementsTopDeals();
    }
    @Test
    public void testTargetWebElementsRedCard() throws InterruptedException {
        homePage.targetWebElementsRedCard();
        homePage.validateTargetWebElementsRedCard();
    }
    @Test
    public void testTargetWebElementsTargetCard() throws InterruptedException {
        homePage.targetWebElementsTargetCard();
        homePage.validateTargetWebElementsTargetCard();
    }
    @Test
    public void testTargetWebElementsCategories() throws InterruptedException {
        homePage.targetWebElementsCategories();
    }
    @Test
    public void testTargetWebElementsHouseHole() throws InterruptedException {
        homePage.targetWebElementsHouseHole();
    }
    @Test
    public void testTargetWebElementsWhatNow() throws InterruptedException {
        homePage.targetWebElementsWhatNow();
        homePage.validateTargetWebElementsWhatNow();
    }
    @Test
    public void testTargetWebElementsNewInBeauty() throws InterruptedException {
        homePage.targetWebElementsNewInBeauty();
        homePage.validateTargetWebElementsNewInBeauty();
    }
    @Test
    public void testTargetWebElementsNewInWomen() throws InterruptedException {
        homePage.targetWebElementsNewInWomen();
        homePage.validateTargetWebElementsNewInWomen();
    }
    @Test
    public void testTargetWebElementsHomeNewArrivals() throws InterruptedException {
        homePage.targetWebElementsHomeNewArrivals();
        homePage.validateTargetWebElementsHomeNewArrivals();
    }
    @Test
    public void testTargetWebElementsFreshFallLook() throws InterruptedException {
        homePage.targetWebElementsFreshFallLook();
        homePage.validateTargetWebElementsFreshFallLook();
    }
    @Test
    public void testTargetWebElementsKidsNewArrivals() throws InterruptedException {
        homePage.targetWebElementsKidsNewArrivals();
        homePage.validateTargetWebElementsKidsNewArrivals();
    }
    @Test
    public void testTargetWebElementsTargetFinds() throws InterruptedException {
        homePage.targetWebElementsTargetFinds();
        homePage.validateTargetWebElementsTargetFinds();
    }
    @Test
    public void testTargetWebElementsMore() throws InterruptedException {
        homePage.targetWebElementsMore();
        homePage.validateTargetWebElementsMore();
    }
    @Test
    public void testTargetWebElementsTargetApp() throws InterruptedException {
        homePage.targetWebElementsTargetApp();
        homePage.validateTargetWebElementsTargetApp();
    }
    @Test
    public void testTargetWebElementsPharmacy() throws InterruptedException {
        homePage.targetWebElementsPharmacy();
        homePage.validateTargetWebElementsPharmacy();

    }
    @Test
    public void testTargetWebElementsWhatsNew() throws InterruptedException {
        homePage.targetWebElementsWhatsNew();
        homePage.validateTargetWebElementsWhatsNew();
    }
    @Test
    public void testTargetWebElementsSignIn() throws InterruptedException {
        homePage.targetWebElementsSignIn();
        homePage.validateTargetWebElementsSignIn();
    }
    @Test
    public void testTargetWebElementsCreateAccount() throws InterruptedException {
        homePage.targetWebElementsCreateAccount();
        homePage.validateTargetWebElementsCreateAccount();
    }
    @Test
    public void testTargetWebElementsOrder() throws InterruptedException {
        homePage.targetWebElementsOrder();
        homePage.validateTargetWebElementsOrder();
    }
    @Test
    public void testTargetWebElementsCircle() throws InterruptedException {
        homePage.targetWebElementsCircle();
        homePage.validateTargetWebElementsCircle();
    }
    @Test
    public void testTargetWebElementsGiftCard() throws InterruptedException {
        homePage.targetWebElementsGiftCard();
        homePage.validateTargetWebElementsGiftCard();
    }
    @Test
    public void testTargetWebElementsRedCardApplyNow() throws InterruptedException {
        homePage.targetWebElementsRedCardApplyNow();
        homePage.validateTargetWebElementsRedCardApplyNow();
    }
    @Test
    public void testTargetWebElementsBuyItAgain() throws InterruptedException {
        homePage.targetWebElementsBuyItAgain();
        homePage.validateTargetWebElementsBuyItAgain();
    }
    @Test
    public void testTargetWebElementsMyStore() throws InterruptedException {
        homePage.targetWebElementsMyStore();
        homePage.validateTargetWebElementsMyStore();
    }
    @Test
    public void testTargetWebElementsDriveUp() throws InterruptedException {
        homePage.targetWebElementsDriveUp();
    }
    @Test
    public void testTargetWebElementsSameDayDeliver() throws InterruptedException {
        homePage.targetWebElementsSameDayDelivery();
    }
    @Test
    public void testTargetWebElementsFavorites() throws InterruptedException {
        homePage.targetWebElementsFavorites();
        homePage.validateWebElementsFavorites();
    }
    @Test
    public void testTargetWebElementsSocial() throws InterruptedException {
        homePage.targetWebElementsSocial();
        homePage.validateTargetWebElementsSocial();
    }
    @Test
    public void testTargetWebElementsAtHomeLearning() throws InterruptedException {
        homePage.targetWebElementsAtHomeLearning();
        homePage.validateTargetWebElementsAtHomeLearning();
    }
    @Test
    public void testTargetWebElementsGetYourHalloween() throws InterruptedException {
        homePage.targetWebElementsGetYourHalloween();
    }
    @Test
    public void testTargetWebElementsShopAll() throws InterruptedException {
        homePage.targetWebElementsShopAll();
        homePage.validateTargetWebElementsShopAll();
    }
    @Test
    public void testTargetWebElementsText() throws InterruptedException {
        homePage.targetWebElementsText();
    }
    @Test
    public void testTargetWebElementsPampers() throws InterruptedException {
        homePage.targetWebElementsPampers();
    }
    @Test
    public void testTargetWebElementsCollegeReady() throws InterruptedException {
        homePage.targetWebElementsCollegeReady();
        homePage.validateTargetWebElementsCollegeReady();
    }
    @Test
    public void testTargetWebElementsSheetSets() throws InterruptedException {
        homePage.targetWebElementsSheetSets();
        homePage.validateTargetWebElementsSheetSets();
    }
    @Test
    public void testTargetWebElementsStorageClubs() throws InterruptedException {
        homePage.targetWebElementsStorageClubs();
        homePage.validateTargetWebElementsStorageClubs();
    }
    @Test
    public void testTargetWebElementsLoungeSeating() throws InterruptedException {
        homePage.targetWebElementsLoungeSeating();
        homePage.validateTargetWebElementsLoungeSeating();
    }
    @Test
    public void testTargetWebElementsTopRated() throws InterruptedException {
        homePage.targetWebElementsTopRated();
    }
    @Test
    public void testTargetWebElementsHelpButton() throws InterruptedException {
        homePage.targetWebElementsHelpButton();
        homePage.validateTargetWebElementsHelpButton();
    }





}
