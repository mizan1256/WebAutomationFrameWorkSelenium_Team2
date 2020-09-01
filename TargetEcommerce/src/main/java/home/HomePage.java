package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static home.HomePageWebElement.*;

public class HomePage extends WebAPI {


    @FindBy(how = How.XPATH, using = webElementSearchBox)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = webElementSearchButton)
    public WebElement searchBoxButton;

    @FindBy(how = How.XPATH, using = webElementSearchButtonText)
    public WebElement searchText;
    @FindBy(how = How.XPATH, using = webElementWeeklyAd)
    public WebElement searchWeeklyAd;
    @FindBy(how = How.XPATH, using = webElementWeeklyAdText)
    public WebElement searchWeeklyAdText;
    @FindBy(how = How.XPATH, using = navigateDeals)
    public WebElement checkNavigateDeal;
    @FindBy(how = How.CSS, using = navigateDealsText)
    public WebElement checkNavigateDealText;

    @FindBy(how = How.XPATH, using = navigateCategories)
    public WebElement checkNavigateCategories;

    @FindBy(how = How.CSS, using = navigateCategoriesText)
    public WebElement checkNavigateCategoriesText;

    @FindBy(how = How.CSS, using = navigateWhatsNew)
    public WebElement checkNavigateWhatsNew;

    @FindBy(how = How.CSS, using = navigateWhatsNewText)
    public WebElement checkNavigateWhatsNewText;

    @FindBy(how = How.CSS, using = navigateSameDayDelivery)
    public WebElement checknavigateSameDayDelivery;

    @FindBy(how = How.XPATH, using = navigateSameDayDeliveryText)
    public WebElement checknavigateSameDayDeliveryText;

    @FindBy(how = How.XPATH, using = navigateRegistry)
    public WebElement checknavigateRegistry;

    @FindBy(how = How.XPATH, using = navigateRegistryText)
    public WebElement checknavigateRegistryText;

    @FindBy(how = How.XPATH, using = allThingsSchoolDisplay)
    public WebElement checkAllThingsSchoolDisplay;

    @FindBy(how = How.XPATH, using = frontImageIsDisplay)
    public WebElement checkFrontImageDisplay;

    @FindBy(how = How.XPATH, using = clickMoreOption)
    public WebElement checkMoreOption;

    @FindBy(how = How.XPATH, using = clickMoreOptionText)
    public WebElement checkMoreOptionText;


    @FindBy(how = How.XPATH, using = shoppingCartLogo)
    public WebElement shoppInCartLogo;

    @FindBy(how = How.XPATH, using = shoppingCartLogoText)
    public WebElement shoppingCartText;

    @FindBy(how = How.XPATH, using = redCardTab)
    public WebElement redcard;

    @FindBy(how = How.XPATH, using = redBenifitText)
    public WebElement benifitText;

    @FindBy(how = How.XPATH, using = redExclusives)
    public WebElement exclusives;

    @FindBy(how = How.XPATH, using = moveToDoor)
    public WebElement moveText;


    @FindBy(how = How.XPATH, using = showMoreButton)
    public WebElement showButton;

    @FindBy(how = How.XPATH, using = driveUpText)
    public WebElement driveText;


    @FindBy(how = How.XPATH, using = moreDetailsClass)
    public WebElement moreDetails;

    @FindBy(how = How.XPATH, using = aboutThisItemText)
    public WebElement itemText;

    @FindBy(how = How.XPATH, using = aboutItemText)
    public WebElement aboutText;


    @FindBy(how = How.XPATH, using = atHomeLearning)
    public WebElement atHome;

    @FindBy(how = How.XPATH, using = colorPencilsButton)
    public WebElement colorPencil;

    @FindBy(how = How.XPATH, using = crayolaPencilBoxImage)
    public WebElement crayolaImg;


    @FindBy(how = How.XPATH, using = coloredPencilsText)
    public WebElement pencilsText;



    // Action Method
    //method for search box
    public void searchBoxCheck() {
        searchBox.isDisplayed();
    }
    //    Action Method
    //method for search button click
    public void searchBoxButtonCheck(String searchItem) {
        searchBox.sendKeys(searchItem);
        searchBoxButton.click();
    }
    //    Validation
    //assert for search box click
    public void validateSearchText() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult = searchText.getText();
        Thread.sleep(3000);
        String expectedResult = "iPhone";
        Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
    }
    //    Action Method
    //method weekly ad
    public void checkWebElementWeeklyAd() {
        searchWeeklyAd.click();
    }
    //    Validation
    //assert for weekly ad
    public void validatewebElementWeeklyAdText() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult = searchWeeklyAdText.getText();
        Thread.sleep(3000);
        String expectedResult = "Ready for school";
        Assert.assertEquals(actualResult, expectedResult, "test fail");
    }
    //    Action Method
    //method fot Deals
    public void checkNavigateDeals() {
        checkNavigateDeal.click();
    }
    //    Validation
    //assert for weekly deal
    public void validateNavigateDealFor() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult = checkNavigateDealText.getText();
        String expectedResult = "Clearance";
        Assert.assertEquals(actualResult, expectedResult, "test fail");
    }
    //method for catagories.
    //    Action Method
    public void checkCategories() {

        checkNavigateCategories.click();
    }
    //    Validation
    public void validateNavigateCategories() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult = checkNavigateCategoriesText.getText();
        String expectedResult = "Main Menu";
        Assert.assertEquals(actualResult, expectedResult, "test fail");
    }
    //    Action Method
    public void checkwhatsNewButton() {
        checkNavigateWhatsNew.click();
    }
    //    Validation
    public void validateNavigateWhatsNew() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult = checkNavigateWhatsNewText.getText();
        String expectedResult = "#TargetStyle";
        Assert.assertEquals(actualResult, expectedResult, "test fail");
    }
    //    Action Method
    public void checkSameDayDelivery() {
        checknavigateSameDayDelivery.click();
    }
    //    Validation
    public void validateNavigateSameDayDelivery() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult = checknavigateSameDayDeliveryText.getText();
        String expectedResult = "Learn more";
        Assert.assertEquals(actualResult, expectedResult, "test fail");
    }
    //    Action Method
    public void checkRegistryButton() {
        checknavigateRegistry.click();
    }
    //    Validation
    public void validatenavigateRegistryText() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult = checknavigateRegistryText.getText();
        String expectedResult = "find a registry";
        Assert.assertEquals(actualResult, expectedResult, "test fail");
    }
    //    Action Method
    public void searchiphone() {
        searchBox.sendKeys("iphone");
    }
    //    Action Method
    public void searchAllThingsSchool() {
        checkAllThingsSchoolDisplay.isDisplayed();
    }
    //    Action Method
    public void searcFrontImageDisplay() {
        checkFrontImageDisplay.isDisplayed();
    }
    //    Action Method
    public void searchMoreOption() {
        checkMoreOption.click();
    }
    //    Validation
    public void validateMoreOptionText() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actualResult = checkMoreOptionText.getText();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String expectedResult = "Target App";
        Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
    }

    //    Action Method
    public void shoppingCartLogoIsDisplay() {
        shoppInCartLogo.isDisplayed();
        System.out.println("Shoping cart logo is displayed :" + shoppInCartLogo.isDisplayed());
    }
    //    Action Method
    public void shoppingCartLogoIsClickable() {
        shoppInCartLogo.click();
    }
    //    Validation
    public void validateShoppingCartLogoIsClickable() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult = shoppingCartText.getText();
        System.out.println(shoppingCartText.getText());
        Thread.sleep(3000);
        String expectedresult = "Your cart is empty";
        Assert.assertEquals(actualResult, expectedresult, "Test case not match");
    }
    //    Action Method
    public void redCardLandedPage(){
        redcard.click();
    }
    //    Validation
    public void validateRedCardLandedPage(){
        String actualResult = benifitText.getText();
        String expectedResult= "Benefits";
        Assert.assertEquals(actualResult,expectedResult,"Not Match");
        System.out.println("PASSED");
    }
    //  Action Method
    public void redCardExclusivePage() throws InterruptedException {
        redcard.click();
        Thread.sleep(3000);
        exclusives.click();
    }
    //    Validation
    public void validateRedCardExclusivePage(){
        String actualResult = moveText.getText();
        String expectedResult = "More to your door";
        Assert.assertEquals(actualResult,expectedResult,"Not Match");
        System.out.println("PASSED");
    }
    //  Action Method
    public void showMoreButton(){
        redcard.click();
        showButton.click();
    }
    //    Validation
    public void validateShowMoreButton(){
        String actualResult = driveText.getText();
        String expectedResult = "Drive Up";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
    //Action Method
    public void moreDetailsbutton() throws InterruptedException {
        redcard.click();
        exclusives.click();
        Thread.sleep(2000);
        moreDetails.click();
        Thread.sleep(4000);
//        itemText.isDisplayed();
    }
    // Validation
    public void validatemoreDetailsbutton(){
        String actualResult = aboutText.getText();
        String expectedResult = "About this item";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
    //    Action Method
    public void atHomeLearning() throws InterruptedException {
        atHome.click();
        Thread.sleep(6000);
        colorPencil.click();
        Thread.sleep(2000);
        crayolaImg.isDisplayed();
    }
    //    Validation
    public void testAtHomeLearning() throws InterruptedException {
        String actualResult=pencilsText.getText();
        Thread.sleep(3000);
        String expectedResult="Colored Pencils";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }

}








