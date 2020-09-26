package tripAdvisorHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static tripAdvisorHome.TripAdvisorHomeWebElements.*;
import static tripAdvisorHome.TripAdvisorWebElement.*;

public class TripAdvisorHome extends WebAPI {
    @FindBy (how = How.XPATH, using = webElementHotelsButton) public WebElement hotelButton;
    @FindBy (how = How.XPATH, using = webElementVacationRentalsButton) public WebElement vacationRentalsButton;
    @FindBy (how = How.XPATH, using= webElementThinksToDoButton) public WebElement thinksToDoButton;
    @FindBy (how = How.XPATH, using= webElementSearchBox) public WebElement searchBox;
    @FindBy (how = How.XPATH, using = webElementSearchButton) public WebElement searchButton;
    @FindBy (how = How.XPATH, using = webElementSearchButtonText) public WebElement searchButtonText;

    @FindBy(how = How.XPATH, using = webElementRestaurant) public WebElement restaurantButton;
    @FindBy(how = How.XPATH, using = writeAReviewWebElement) public WebElement writeAReviewButton;
    @FindBy(how = How.XPATH, using = travelForumsWebElement) public WebElement travelForumsButton;
    @FindBy(how = How.XPATH, using = moreButtonWebElement) public WebElement moreButtonIsClickable;
    @FindBy(how = How.XPATH, using = postButtonWebElement) public WebElement postButton;

    // Action method
    public void hotelsButtonIsClickable(){
        hotelButton.click();
    }
    // Validation method
    public void validateHotelsButtonIsClickable(String expectedResult){
        String actualResult= getTextByXpath(webElementHotelsButtonNearbyText);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // Action method
    public void vacationRentalsButtonIsClickable(){
        vacationRentalsButton.click();
    }
    // Validation method
    public void validateVacationRentalsButtonIsClickable(String expectedResult){
        String actualResult= getTextByXpath(webElementHotelsButtonNearbyText);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // Action method
    public void thinksToDoButtonIsClickable(){
        thinksToDoButton.click();
    }
    // Validation method
    public void validateThinksToDoButtonIsClickable(String expectedResult) {
        String actualResult = getTextByXpath(webElementHotelsButtonNearbyText);
        Assert.assertEquals(actualResult, expectedResult);
    }
    // Action method
    public void searchBoxIsDisplayed(){
        searchBox.isDisplayed();
    }
    // Validation method
    public void validateSearchBoxIsDisplayed(String expectedResult) {
        String actualResult = getTextByXpath(webElementHotelsButton);
        Assert.assertEquals(actualResult, expectedResult);
    }
    // Action method
    public void searchBoxCheck(String searchItem){
        searchBox.sendKeys(searchItem);
        searchButton.click();
    }
    // Validation method
    public void validateSearchBoxCheck() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Search results: \"Bangladesh\" - Tripadvisor",driver.getTitle());
    }
    // Action Method
    public void restaurantButton() throws InterruptedException {
        searchButtonText.click();
        Thread.sleep(3000);
    }
    // Validation method
    public void validateRestaurantButton(String expectedResult) {
        String actualResult = getTextByXpath(webElementHotelsButton);
        Assert.assertEquals(actualResult, expectedResult);
    }
    // Action Method
    public void writeAReviewButtonIsDisplayed() throws InterruptedException {
        writeAReviewButton.isDisplayed();
        Thread.sleep(3000);
    }
    // Action Method
    public void travelForumsButtonIsClickable() throws InterruptedException {
        travelForumsButton.click();
        Thread.sleep(3000);
    }
    // Action Method
    public void moreButtonIsClickable(){
        moreButtonIsClickable.click();
    }
    // Action Method
    public void postButtonIsClickable() throws InterruptedException {
        postButton.click();
        Thread.sleep(3000);
    }
    @FindBy(how = How.XPATH,using = webElementsWriteReviewButton)
    public WebElement writeReviewButton;

    @FindBy(how = How.XPATH,using = webElementsTAPressButton)
    public WebElement pressButton;

    @FindBy(how = How.XPATH,using =webElementsTAOwnersButton)
    public WebElement ownersButton;

    @FindBy(how = How.XPATH,using =webElementsTATravelersChoiceButton)
    public WebElement travelersChoiceButton;

    //Action Method
    public void checkSearchBoxText(String searchItem ) throws InterruptedException {
        searchBox.sendKeys(searchItem);
        searchButton.click();
        Thread.sleep(3000);
    }
    //Validate Method
    public void validateCheckSearchBoxText(String expectedResult) throws InterruptedException {
        String actualResult=searchButtonText.getText();
        Thread.sleep(3000);
        Assert.assertEquals(actualResult,expectedResult,"Don't match");

    }
    //Action Method
    public void checkPostButton() throws InterruptedException {
        postButton.click();
        Thread.sleep(3000);
        writeReviewButton.click();
    }
    //Validate Method
    public void validateCheckPostButton(String expectedResult) throws InterruptedException {
        String actualResult = "Write a review - Tripadvisor";
        Thread.sleep(3000);
        Assert.assertEquals(actualResult,expectedResult, "Text don't match");
    }
    //Action Method
    public void checkTAPressButton(){
        pressButton.click();
    }
    //Validate Method
    public void validateTAPressButton(String expectedResult) throws InterruptedException {
        String actualResult = "Tripadvisor: Read Reviews, Compare Prices & Book";
        Thread.sleep(3000);
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }
    //Action Method
    public void checkTAOwnersButton(){
        ownersButton.click();
    }
    //Validate Method
    public void validateCheckTAOwnersButton(String expectedResult) throws InterruptedException {
        String actualResult = getTextByXpath(webElementsTAOwnersButtonText);
        Thread.sleep(3000);
        Assert.assertEquals(actualResult, expectedResult, "Text Don't match");
    }
    //Action Method
    public void checkTATravelersChoiceButton(){
        travelersChoiceButton.click();
    }
    //Validate Method
    public void validateCheckTATravelersChoiceButton(String expectedResult) throws InterruptedException {
        String actualResult = getTextByXpath(webElementsTATravelersChoiceButtonText);
        Thread.sleep(3000);
        Assert.assertEquals(actualResult, expectedResult, "Text Don't match");
    }

//    public void validateRedCardButtonIsClicked() throws InterruptedException {
//        Thread.sleep(3000);
//        String actualResult=redCardText.getText();
//        String expectedResult="Benefits";
//        Assert.assertEquals(actualResult,expectedResult, "Search Item doesn't Match");
//
//}

    //Validation Method
//    public void validateMoreButtonIsDisplayed(){
//        String actualResult=pharmacyText.getText();
//        String expectedResult="Pharmacy";
//        Assert.assertEquals(actualResult,expectedResult); // Assertion/Validation Method
//        System.out.println("PASSED");
}
