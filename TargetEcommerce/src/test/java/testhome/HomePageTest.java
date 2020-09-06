package testhome;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import targetHome.HomePage;

public class HomePageTest extends WebAPI {
    HomePage homePage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);

    }

    @Test
    public void testSearchBoxCheck() {
        homePage.searchBoxCheck("iPhone");
        homePage.validateSearchText();
    }

    @Test
    public void testGrocery() {
        homePage.navigateToGroceries();
        homePage.validateGrocery();
    }

    @Test
    public void testSignIn() {
        homePage.verifySignIn();
        homePage.validateSignInPage();
    }

    @Test
    public void testRegistry() {
        homePage.navRegistry();
        homePage.validateRegistry();
    }

    @Test
    public void testBabyRegistry() {
        homePage.navBabyRegistry();
    }

    @Test
    public void TestJoin() {
        homePage.navToJoin();
    }

    @Test
    public void testWeeklyAdd() {
        homePage.navWeeklyAdd();
        homePage.validateWeeklyAdd();
    }

    @Test
    public void testHouseHoldEssential() {
        homePage.verifyHouseHoldEssential();
        homePage.validateHouseHold();
    }

    @Test
    public void testVerifyTopDeals() throws InterruptedException {
        homePage.verifyTopDeals();
        homePage.validateTopDeals();

    }

    @Test
    public void testClothesClickable() {
        homePage.clothesIsClickable();
    }

    @Test
    public void testShoppingCart() {
        homePage.getShoppingCart();
        homePage.validateShoppingCart();
    }

    @Test
    public void testFindAStore() {
        homePage.navigateFindAStore();
        homePage.validateFindAStore();
    }

    @Test
    public void testOrders() {
        homePage.navigateToOrders();
        homePage.validateOrders();
    }

    @Test
    public void testToSelectStore() {
        homePage.navigateToSelectStore();
        homePage.validateSelectStore();
    }

    @Test
    public void testZipCode() {
        homePage.navigateToZipCode();
        homePage.validateZipCode();
    }

    @Test
    public void navigateToSetAsMyStore() {
        homePage.navigateToSetAsMyStore();
        homePage.validateSetAsMyStore();
    }

    @Test
    public void testGiftCard() {
        homePage.NavigateToGiftCard();
        homePage.validateGiftCard();
    }
    @Test
    public void testGiftCardForSchool(){
        homePage. NavigateToGiftCardForSchool();
        homePage.validateGiftCardForSchool();
    }
    @Test
    public void chooseBackToClassGiftCard(){
        homePage.chooseBackToClassGiftCard();
        homePage.validateBackToClassGiftCard();
    }
    @Test
    public void testGooglePlayGC(){
        homePage.addToCartGooglePlayGC();
        homePage.validateGooglePlayGC();
    }
    @Test
    public void testTargetLogo(){
        homePage. verifyTargetLogo();
        homePage.validateTargetLogo();
    }
    @Test public void navigateToRedCards(){
        homePage.navigateToRedCards();
        homePage.validateToRedCards();
    }
    @Test
    public void verifyManageRedCard(){
        homePage.verifyManageRedCard();
        homePage.validateManageRedCard();
    }
    @Test
    public void redCardExclusive(){
        homePage.redCardExclusive();
        homePage.validateRedCardExclusive();
    }
    @Test
    public void navToTargetCircleOffer(){
        homePage.navToTargetCircleOffer();
        homePage.validateTargetCircleOffer();

    }
    @Test
    public void verifyOffersByCategoriesAll(){
        homePage.verifyOffersByCategoriesAll();
        homePage.validateOffersByCategories();
    }
    @Test
    public void testSameDayDelivery(){
        homePage.navigateToSameDayDelivery();
        homePage.validateSameDayDelivery();
    }
    @Test
    public void allThingsSchoolClickable(){
        homePage.allThingsSchoolClickable();
        homePage.validateAllThingsSchool();
    }
    @Test
    public void TestNoteBook() {
        homePage.navigateToNoteBook();
        homePage.validateNoteBook();
    }
    @Test
    public void testSearchBoxCheckUsingGetItemValue() throws InterruptedException {
        homePage.searchBoxCheckUsingGetItemValue();
    }
    @Test
    public void testSearchBoxCheckUsingGetItemsListFromExcel() throws Exception {
        homePage.searchBoxCheckUsingGetItemsListFromExcel();
    }
    @Test
    public void testSearchBoxCheckGetItemsListFromDB() throws Exception {
        homePage.searchBoxCheckGetItemsListFromDB();
    }
}
