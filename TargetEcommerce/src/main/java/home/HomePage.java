package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageWebElement.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = webElementSearchBox) public WebElement searchBox;

    @FindBy(how = How.XPATH, using = webElementSearchButton) public WebElement searchButton;

    @FindBy(how = How.XPATH, using = webElementSocialButton) public WebElement socialButton;
    @FindBy(how = How.XPATH, using = webElementSocialButtonText) public WebElement validateSocialButtonText;

    @FindBy(how = How.XPATH, using = webElementHelpButton) public WebElement helpButton;
    @FindBy(how = How.XPATH, using = webElementStoresButton) public WebElement storesButton;
    @FindBy(how = How.XPATH, using = webElementAppsButton) public WebElement appsButton;
    @FindBy(how = How.XPATH, using = webElementMoreButton) public WebElement moreButtonIsClickable;
    @FindBy(how = How.XPATH, using = shopAllWebElement) public WebElement shopAll;
    @FindBy(how = How.XPATH, using = featuresCategoriesWebElement) public WebElement featuresCategories;

    //Action Method
    public void searchBoxIsDisplayed() throws InterruptedException {
        searchBox.isDisplayed();
        Thread.sleep(3000);
    }
    // Validation method
    public void validateSearchBoxIsDisplayed(String expectedResult){
        String actualResult = getTextByXpath(webElementMoreButton);
        Assert.assertEquals(actualResult,expectedResult);
    }
    //Action Method
    public void searchBoxCheck() throws InterruptedException {
        typeOnElementNEnter(webElementSearchBox,"pencil");
//        typeOnElement(webElementSearchBox,"pencil");
//        clickOnElement(webElementSearchButton);
        Thread.sleep(3000);
    }
    // Action Method
    public void socialButtonIsDisplayed() throws InterruptedException {
        socialButton.click();
        Thread.sleep(3000);
        System.out.println("Search Text Button is Displayed"+ socialButton.isDisplayed());
    }
    // Validation method
    public void validateSocialButtonText() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult=validateSocialButtonText.getText();
        String expectedResult="Youtube";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
    // Action Method
    public void helpButtonIsClicked() throws InterruptedException {
        helpButton.click();
        Thread.sleep(3000);
        System.out.println("Help Button is Clicked" + helpButton.isDisplayed());
    }
    // Validation Method
    public void validateHelpButtonIsClicked(String expectedResult){
        String actualResult = getTextByXpath(webElementHelpButtonFeedbackText);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // Action Method
    public void storesButtonIsDisplayed() throws InterruptedException {
        storesButton.isDisplayed();
        Thread.sleep(3000);
        System.out.println("Stores Button is Displayed" + storesButton.isDisplayed());
    }
    // Validation Method
    public void validateStoresButtonIsDisplayed(String expectedResult){
        String actualResult = getTextByXpath(webElementStoresButtonCategoriesText);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // Action Method
    public void appsButtonIsClickable() throws InterruptedException {
        appsButton.click();
        Thread.sleep(3000);
        System.out.println("Apps Button is Clickable" + appsButton.isDisplayed());
    }
    // Validation Method
    public void validateAppsButtonIsClicked(String expectedResult){
        String  actualResult = getTextByXpath(webElementAppsButtonTargetForiOSText);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // Action Method
    public void moreButtonIsClickable() throws InterruptedException {
        moreButtonIsClickable.click();
        Thread.sleep(3000);
    }
    // Validation Method
    public void validateMoreButtonIsClickable(String expectedResult){
       String actualResult = getTextByXpath(webElementMoreButtonEmailsText);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // Action Method
    public void shopAllIsDisplayed() throws InterruptedException {
        shopAll.isDisplayed();
        Thread.sleep(3000);
    }
    // Validation Method
    public void validateShopAllButtonCategoriesIsDisplayed(String expectedResult){
        String actualResult = getTextByXpath(webElementStoresButtonCategoriesText);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // Action Method
    public void featuresCategoriesIsDisplayed() throws InterruptedException {
        featuresCategories.isDisplayed();
        Thread.sleep(3000);
    }
    // Validation Method
    public void validateFeaturesCategoriesIsDisplayed(String expectedResult){
        String actualResult = getTextByXpath(shopAllWebElement);
        Assert.assertEquals(actualResult,expectedResult);
    }




//    public void searchTextDisplayed() throws InterruptedException {
//        searchText.isDisplayed();
//    }
//        Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
//    }
//    // Action Method
//    public void searchBoxCheck(String searchItem){
//        searchField.clear();
//        searchField.sendKeys(searchItem);
//        searchFieldButton.click();
//    }
//    // Validate Method
//    public void validateSearchText() throws InterruptedException {
//        Thread.sleep(3000);
//        String actualResult = headerIPhone.getText();
//        Thread.sleep(3000);
//        String expectedResult = "iPhone";
//        System.out.println(actualResult);
//        Assert.assertEquals(actualResult, expectedResult, "Text doesn't match");

    }