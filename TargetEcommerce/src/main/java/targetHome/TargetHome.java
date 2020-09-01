package targetHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


import static targetHome.TargetWebElements.*;

public class TargetHome extends WebAPI {

    @FindBy(how= How.XPATH, using = webElementsLogo) public WebElement targetLogo;
    @FindBy (how=How.XPATH, using = webElementsShoppingCard) public WebElement shoppingCard;
    @FindBy (how=How.XPATH, using =  webElementsWeeklyAd) public WebElement targetWeeklyAd;
    @FindBy (how=How.XPATH, using =  webElementsToy) public WebElement targetToy;
    @FindBy (how=How.XPATH, using =  webElementsElectronics) public WebElement electronic;
    @FindBy (how=How.XPATH, using =  webElementsSearchBox) public WebElement searchBox;
    @FindBy (how=How.XPATH, using =  webElementsWallPaper) public WebElement wallPaper;
    @FindBy (how=How.XPATH, using =   webElementsForSchool) public WebElement forSchool;
    @FindBy (how=How.XPATH, using =  webElementsDealsDropDown) public WebElement  dealsDropDown;
    @FindBy (how=How.XPATH, using =  webElementsClearance) public WebElement  Clearance;
    @FindBy (how=How.XPATH, using =  webElementsWeeklyAd1) public WebElement  weeklyAd1;
    @FindBy (how=How.XPATH, using =  webElementsTopDeals) public WebElement  topDeals;
    @FindBy (how=How.XPATH, using =  webElementsRedCard) public WebElement  redCard;
    @FindBy (how=How.XPATH, using =  webElementsTargetCard ) public WebElement  targetCard;
    @FindBy (how=How.XPATH, using =  webElementsCategories ) public WebElement  categories;
    @FindBy (how=How.XPATH, using =  webElementsGrocery ) public WebElement  grocery;
    @FindBy (how=How.XPATH, using =  webElementsGroceryExploreAll ) public WebElement  groceryExploreAll;
    @FindBy (how=How.XPATH, using =  webElementsHouseHole ) public WebElement  houseHole ;
    @FindBy (how=How.XPATH, using =  webElementsHouseHoleExploreAll ) public WebElement  houseHoleExploreAll ;
    @FindBy (how=How.XPATH, using =webElementsWhatNow) public WebElement  whatNow;
    @FindBy (how=How.XPATH, using =  webElementsTargetStyle ) public WebElement  targetStyle;
    @FindBy (how=How.XPATH, using =  webElementsNewInBeauty ) public WebElement  NewInBeauty;
    @FindBy (how=How.XPATH, using =  webElementsNewInWomen ) public WebElement  NewInWomen;
    @FindBy (how=How.XPATH, using =  webElementsHomeNewArrivals ) public WebElement  HomeNewArrivals;
    @FindBy (how=How.XPATH, using =  webElementsFreshFallLook ) public WebElement  FreshFallLook;
    @FindBy (how=How.XPATH, using =  webElementsKidsNewArrivals ) public WebElement  KidsNewArrivals;
    @FindBy (how=How.XPATH, using =  webElementsTargetFinds ) public WebElement  TargetFinds;
    @FindBy (how=How.XPATH, using =  webElementsMore ) public WebElement  More;
    @FindBy (how=How.XPATH, using =  webElementsShoppingAndOrder ) public WebElement  ShoppingAndOrder;
    @FindBy (how=How.XPATH, using =  webElementsTargetApp ) public WebElement  TargetApp;
    @FindBy (how=How.XPATH, using =  webElementsPharmacy ) public WebElement  Pharmacy;
    @FindBy (how=How.XPATH, using =  webElementsWhatsNew ) public WebElement  WhatsNew;
    @FindBy (how=How.XPATH, using =  webElementsSignIn ) public WebElement  SignIn;
    @FindBy (how=How.XPATH, using =  webElementsSignInButton ) public WebElement  SignInButton ;
    @FindBy (how=How.XPATH, using =  webElementsCreateAccount ) public WebElement  CreateAccount ;
    @FindBy (how=How.XPATH, using =  webElementsOrder ) public WebElement  Order ;
    @FindBy (how=How.XPATH, using =  webElementsCircle ) public WebElement  Circle ;
    @FindBy (how=How.XPATH, using =  webElementsGiftCard ) public WebElement  GiftCard ;
    @FindBy (how=How.XPATH, using =  webElementsRedCardApplyNow ) public WebElement  RedCardApplyNow ;
    @FindBy (how=How.XPATH, using =  webElementsBuyItAgain ) public WebElement  BuyItAgain ;
    @FindBy (how=How.XPATH, using =  webElementsMyStore ) public WebElement  MyStore ;
    @FindBy (how=How.XPATH, using =  webElementsDriveUp ) public WebElement  DriveUp ;
    @FindBy (how=How.XPATH, using =  webElementsSameDayDelivery ) public WebElement  SameDayDelivery ;
    @FindBy (how=How.XPATH, using =  webElementsFavorites ) public WebElement  Favorites ;
    @FindBy (how=How.XPATH, using =  webElementsSocial ) public WebElement  Social ;
    @FindBy (how=How.XPATH, using =  webElementsSocialFacebook ) public WebElement  SocialFacebook ;
    @FindBy (how=How.XPATH, using =  webElementsAtHomeLearning ) public WebElement  AtHomeLearning ;
    @FindBy (how=How.XPATH, using =  webElementsBuyOneGetOneFree ) public WebElement  BuyOneGetOneFree ;
    @FindBy (how=How.XPATH, using =  webElementsGetYourHalloween ) public WebElement  GetYourHalloween ;
    @FindBy (how=How.XPATH, using =  webElementsShopAll ) public WebElement  ShopAll ;
    @FindBy (how=How.XPATH, using =  webElementsText ) public WebElement  Text ;
    @FindBy (how=How.XPATH, using =  webElementsPampers ) public WebElement  Pampers ;
    @FindBy (how=How.XPATH, using =  webElementsCollegeReady ) public WebElement  CollegeReady ;
    @FindBy (how=How.XPATH, using =  webElementsSheetSets ) public WebElement  SheetSets ;
    @FindBy (how=How.XPATH, using =  webElementsStorageClubs ) public WebElement  StorageClubs ;
    @FindBy (how=How.XPATH, using =  webElementsLoungeSeating ) public WebElement  LoungeSeating ;
    @FindBy (how=How.XPATH, using =  webElementsTopRated ) public WebElement  TopRated ;
    @FindBy (how=How.XPATH, using =  webElementsHelpButton ) public WebElement  HelpButton ;
    @FindBy (how=How.XPATH, using =  webElementsHelpReturns ) public WebElement  HelpReturns  ;


    public void targetLogoDisplayCheck(){
        targetLogo.isDisplayed();
    }

    public void targetLogoIsClickable(){
        targetLogo.click();
    }
    public void validateTargetLogoIsClickable(){
        // System.out.println(driver.getTitle());
        Assert.assertEquals("Target : Expect More. Pay Less.",driver.getTitle());
    }

    public void targetShoppingCardIsClickable(){
        shoppingCard.click();
    }
    public void validateTargetShoppingCardIsClickable(){
        //System.out.println(driver.getTitle());
        Assert.assertEquals("Target", driver.getTitle());
    }

    public void targetWeeklyAdIsClickable(){
        targetWeeklyAd.click();
    }
    public void validateTargetWeeklyAdIsClickable(){
        System.out.println(driver.getTitle());
        Assert.assertEquals("Weekly Deals In Stores Now : Target Weekly Ad",driver.getTitle());
    }

    public void targetWebElementsToyIsClickable(){
        targetToy.click();
    }
    public void validateTargetWebElementsToyIsClickable() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Target : Expect More. Pay Less.",driver.getTitle());
    }

    public void targetWebElementsElectronics(){
        electronic.click();
    }
    public void validateTargetWebElementsElectronics() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Target : Expect More. Pay Less.",driver.getTitle());
    }

    public void targetWebElementsSearchBox() {
        searchBox.click();
    }
    public void validateTargetWebElementsSearchBox() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Target : Expect More. Pay Less.",driver.getTitle());
    }

    public void targetWebElementsWallPaper(){
        wallPaper.isDisplayed();
    }

    public void targetWebElementsForSchool(){
        forSchool.click();
    }
    public void validateTargetWebElementsForSchool(){
        System.out.println(driver.getTitle());
        Assert.assertEquals("Target : Expect More. Pay Less.", driver.getTitle());
    }

    public void targetWebElementsDealsDropDown() throws InterruptedException {
        dealsDropDown.click();
        Thread.sleep(3000);
        Clearance.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsDealsDropDown(){
        System.out.println(driver.getTitle());
        Assert.assertEquals("Clearance : Save on Thousands of Clearance Items : Target", driver.getTitle());
    }

    public void targetWebElementsWeeklyAd1() throws InterruptedException {
        dealsDropDown.click();
        Thread.sleep(3000);
        weeklyAd1.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsWeeklyAd1() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Weekly Deals In Stores Now : Target Weekly Ad", driver.getTitle());
    }

    public void targetWebElementsTopDeals() throws InterruptedException {
        dealsDropDown.click();
        Thread.sleep(5000);
        topDeals.click();
        Thread.sleep(4000);
    }
    public void validateTargetWebElementsTopDeals() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Weekly Deals In Stores Now : Target Weekly Ad", driver.getTitle());
    }

    public void targetWebElementsRedCard() throws InterruptedException {
        dealsDropDown.click();
        Thread.sleep(3000);
        redCard.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsRedCard(){
        System.out.println(driver.getTitle());
        Assert.assertEquals("RedCard : Save 5% at Target", driver.getTitle());
    }

    public void targetWebElementsTargetCard() throws InterruptedException {
        dealsDropDown.click();
        Thread.sleep(3000);
        targetCard.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsTargetCard(){
        System.out.println(driver.getTitle());
        Assert.assertEquals("Target Circle™ Offers", driver.getTitle());
    }

    public void targetWebElementsCategories() throws InterruptedException {
        categories.click();
        Thread.sleep(3000);
        grocery.click();
        Thread.sleep(2000);
        groceryExploreAll.click();
        Thread.sleep(2000);
    }

    public void targetWebElementsHouseHole() throws InterruptedException {
        categories.click();
        Thread.sleep(3000);
        houseHole.click();
        Thread.sleep(2000);
        houseHoleExploreAll.click();
        Thread.sleep(2000);
    }

    public void targetWebElementsWhatNow() throws InterruptedException {
        whatNow.click();
        Thread.sleep(3000);
        targetStyle.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsWhatNow(){
        System.out.println(driver.getTitle());
        Assert.assertEquals("#TargetStyle : Target Finds", driver.getTitle());
    }

    public void targetWebElementsNewInBeauty() throws InterruptedException {
        whatNow.click();
        Thread.sleep(3000);
        NewInBeauty.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsNewInBeauty() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("New in Beauty : Target", driver.getTitle());
    }

    public void targetWebElementsNewInWomen() throws InterruptedException {
        whatNow.click();
        Thread.sleep(3000);
        NewInWomen.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsNewInWomen() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Clothing New Arrivals for Women : Target", driver.getTitle());
    }

    public void targetWebElementsHomeNewArrivals() throws InterruptedException {
        whatNow.click();
        Thread.sleep(3000);
        HomeNewArrivals.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsHomeNewArrivals() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Home New Arrivals : Target", driver.getTitle());
    }

    public void targetWebElementsFreshFallLook() throws InterruptedException {
        whatNow.click();
        Thread.sleep(3000);
        FreshFallLook.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsFreshFallLook() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Young Adult Fall Faves : Target", driver.getTitle());
    }

    public void targetWebElementsKidsNewArrivals() throws InterruptedException {
        whatNow.click();
        Thread.sleep(3000);
        KidsNewArrivals.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsKidsNewArrivals() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Kids' New Arrivals : Target", driver.getTitle());
    }

    public void targetWebElementsTargetFinds() throws InterruptedException {
        whatNow.click();
        Thread.sleep(3000);
        TargetFinds.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsTargetFinds() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Target Finds", driver.getTitle());
    }

    public void targetWebElementsMore() throws InterruptedException {
        More.click();
        Thread.sleep(3000);
        ShoppingAndOrder.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsMore() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Shipping & Order Services : Target", driver.getTitle());
    }

    public void targetWebElementsTargetApp() throws InterruptedException {
        More.click();
        Thread.sleep(3000);
        TargetApp.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsTargetApp() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Target App - Your Shopping and Saving Sidekick", driver.getTitle());
    }

    public void targetWebElementsPharmacy() throws InterruptedException {
        More.click();
        Thread.sleep(3000);
        Pharmacy.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsPharmacy() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Pharmacy : Target", driver.getTitle());
    }

    public void targetWebElementsWhatsNew() throws InterruptedException {
        More.click();
        Thread.sleep(3000);
        WhatsNew.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsWhatsNew() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Gift Ideas : Target Finds", driver.getTitle());
    }

    public void targetWebElementsSignIn() throws InterruptedException {
        SignIn.click();
        Thread.sleep(3000);
        SignInButton.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsSignIn() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Target Login", driver.getTitle());
    }

    public void targetWebElementsCreateAccount() throws InterruptedException {
        SignIn.click();
        Thread.sleep(3000);
        CreateAccount.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsCreateAccount() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Target Login", driver.getTitle());
    }

    public void targetWebElementsOrder() throws InterruptedException {
        SignIn.click();
        Thread.sleep(3000);
        Order.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsOrder() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Target Login", driver.getTitle());
    }

    public void targetWebElementsCircle() throws InterruptedException {
        SignIn.click();
        Thread.sleep(3000);
        Circle.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsCircle() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Target Circle", driver.getTitle());
    }

    public void targetWebElementsGiftCard() throws InterruptedException {
        SignIn.click();
        Thread.sleep(3000);
        GiftCard.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsGiftCard() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Check Gift Card Balance : Target", driver.getTitle());
    }

    public void targetWebElementsRedCardApplyNow() throws InterruptedException {
        SignIn.click();
        Thread.sleep(3000);
        RedCardApplyNow.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsRedCardApplyNow() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("RedCard : Save 5% at Target", driver.getTitle());
    }

    public void targetWebElementsBuyItAgain() throws InterruptedException {
        SignIn.click();
        Thread.sleep(3000);
        BuyItAgain.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsBuyItAgain() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Buy it again : Target", driver.getTitle());
    }

    public void targetWebElementsMyStore() throws InterruptedException {
        SignIn.click();
        Thread.sleep(3000);
        MyStore.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsMyStore() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Stores Near Me : Target", driver.getTitle());
    }

    public void targetWebElementsDriveUp() throws InterruptedException {
        DriveUp.isDisplayed();
        Thread.sleep(3000);
    }

    public void targetWebElementsSameDayDelivery() throws InterruptedException {
        SameDayDelivery.isDisplayed();
        Thread.sleep(3000);
    }

    public void targetWebElementsFavorites() throws InterruptedException {
        Favorites.click();
        Thread.sleep(3000);
    }
    public void validateWebElementsFavorites() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Your Favorites : Target", driver.getTitle());
    }

    public void targetWebElementsSocial() throws InterruptedException {
        Social.click();
        Thread.sleep(3000);
        SocialFacebook.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsSocial() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Target : Expect More. Pay Less.", driver.getTitle());
    }

    public void targetWebElementsAtHomeLearning() throws InterruptedException {
        AtHomeLearning.click();
        Thread.sleep(3000);
        BuyOneGetOneFree.click();
        Thread.sleep(2000);
    }
    public void validateTargetWebElementsAtHomeLearning() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("School & Office Supplies Deals : Target", driver.getTitle());
    }

    public void targetWebElementsGetYourHalloween() throws InterruptedException {
        GetYourHalloween.isDisplayed();
        Thread.sleep(3000);
    }

    public void targetWebElementsShopAll() throws InterruptedException {
        ShopAll.click();
        Thread.sleep(3000);

    }
    public void validateTargetWebElementsShopAll() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Shop All Categories : Target", driver.getTitle());
    }

    public void targetWebElementsText() throws InterruptedException {
        Text.click();
        Thread.sleep(3000);
    }

    public void targetWebElementsPampers() throws InterruptedException {
        Pampers.isDisplayed();
        Thread.sleep(1000);
    }

    public void targetWebElementsCollegeReady() throws InterruptedException {
        CollegeReady.click();
        Thread.sleep(3000);
    }
    public void validateTargetWebElementsCollegeReady() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("College Dorm Room Essentials : Target", driver.getTitle());
    }

    public void targetWebElementsSheetSets() throws InterruptedException {
        SheetSets.click();
        Thread.sleep(3000);
    }
    public void validateTargetWebElementsSheetSets() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Dorm Bedding : Target", driver.getTitle());
    }

    public void targetWebElementsStorageClubs() throws InterruptedException {
        StorageClubs.click();
        Thread.sleep(3000);
    }
    public void validateTargetWebElementsStorageClubs() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("College Dorm Storage & Organization: Target", driver.getTitle());
    }

    public void targetWebElementsLoungeSeating() throws InterruptedException {
        LoungeSeating.click();
        Thread.sleep(3000);
    }
    public void validateTargetWebElementsLoungeSeating() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Dorm Furniture : Target", driver.getTitle());
    }

    public void targetWebElementsTopRated() throws InterruptedException {
        TopRated.isDisplayed();
        Thread.sleep(2000);
    }

    public void targetWebElementsHelpButton() throws InterruptedException {
        HelpButton.click();
        Thread.sleep(3000);
        HelpReturns.click();
        Thread.sleep(3000);
    }
    public void validateTargetWebElementsHelpButton() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Returns : Target", driver.getTitle());
    }

}
