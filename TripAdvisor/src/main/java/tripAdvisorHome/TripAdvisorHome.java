package tripAdvisorHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import reporting.TestLogger;

import java.util.List;

import static tripAdvisorHome.TripAdvisorWebElement.*;

public class TripAdvisorHome extends WebAPI {

    @FindBy(how = How.XPATH, using = searchBoxWebElement)
    public WebElement searchBox;

    @FindBy(how = How.XPATH, using = searchBoxTextWebElement)
    public WebElement searchBoxText;

    @FindBy(how = How.XPATH, using = whereToSearchBoxWebElement)
    public WebElement whereToSearchBox;

    @FindBy(how = How.XPATH, using = whereToSearchButtonWebElement)
    public WebElement whereToSearchButton;

    @FindBy(how = How.XPATH, using = whereToSearchButtonTextWebElement)
    public WebElement whereToSearchButtonText;

    @FindBy(how = How.XPATH, using = hotelsButtonWebElement)
    public WebElement hotelsButton;

    @FindBy(how = How.XPATH, using = searchButtonWebElement)
    public WebElement searchButton;

    @FindBy(how = How.XPATH, using = vacationRentalsWebElement)
    public WebElement vacationRentals;

    @FindBy(how = How.XPATH, using = thingsToDoButtonWebElement)
    public WebElement thingsToDoButton;

    @FindBy(how = How.XPATH, using = restaurantButtonWebElement)
    public WebElement restaurantButton;

    @FindBy(how = How.XPATH, using = writeAReviewButtonWebElement)
    public WebElement writeAReviewButton;

    @FindBy(how = How.XPATH, using = writeAReviewTextWebElement)
    public WebElement writeAReviewText;

    @FindBy(how = How.XPATH, using = travelForumsButtonWebElement)
    public WebElement travelForumsButton;

    @FindBy(how = How.XPATH, using = moreButtonWebElement)
    public WebElement moreButton;

    @FindBy(how = How.XPATH, using = postButtonWebElement)
    public WebElement postButton;

    @FindBy(how = How.XPATH, using = alertButtonAWebElement)
    public WebElement alertButton;

    @FindBy(how = How.XPATH, using = tripsButtonWebElement)
    public WebElement tripsButton;

    //Action Method
    public void whereToSearchBoxCheck(String searchItem) throws InterruptedException {
        Thread.sleep(3000);
        whereToSearchBox.sendKeys(searchItem);
        whereToSearchButton.click();
    }

    //Validate Method
    public void validateWhereToSearchButtonText(String expectedResult) {
        String actualResult = whereToSearchButtonText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Search Item do not mach");
    }

    //Action
    public void hotelsButton() throws InterruptedException {
        hotelsButton.click();
    }//validate

    public void validateHotelsButton() {
        Assert.assertEquals("Tripadvisor: Read Reviews, Compare Prices & Book", driver.getTitle());
    }

    //Action Method
    public void searchBoxCheck(String searchItem) throws InterruptedException {
        hotelsButton();
        searchBox.sendKeys(searchItem);
        searchButton.click();
    }//Validate Method

    public void validateSearchBoxText(String expectedResult) {
        String actualResult = searchBoxText.getText();
        // String expectedResult="\"Mexico City\"";
        Assert.assertEquals(actualResult, expectedResult, "Search Item do not mach");
    }

    public void vacationRentalsButtonIsClickable() throws InterruptedException {
        vacationRentals.click();
        Thread.sleep(3000);
        searchBox.sendKeys("\"Mexico City\"");
        searchButton.click();
    }

    public void validateVacationRentalsButtonIsClickable() {
        Assert.assertEquals("Search results: \"Mexico City\" - Tripadvisor", driver.getTitle());
    }


    public void thingsToDoButtonIsClickable() throws InterruptedException {
        thingsToDoButton.click();
        Thread.sleep(3000);
        searchBox.sendKeys("\"Mexico City\"");
        searchButton.click();
    }

    public void validateThingsToDoButtonIsClickable() {
        Assert.assertEquals("Search results: \"Mexico City\" - Tripadvisor", driver.getTitle());
    }

    //Action
    public void restaurantButtonIsClickable() {
        restaurantButton.click();
    }//Validate

    public void validateRestaurantButtonIsClickable() {
        Assert.assertEquals("Tripadvisor: Read Reviews, Compare Prices & Book", driver.getTitle());
    }

    //Action
    public void writeAReviewButtonCheck() throws InterruptedException {
        writeAReviewButton.click();
        Thread.sleep(3000);
    }

    //Validate
    public void validateWriteAReviewButtonCheck(String expectedResult) {
        String actualResult = writeAReviewText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Text do not match");
    }

    //Action
    public void travelForumsButtonCheck() throws InterruptedException {
        travelForumsButton.click();
        Thread.sleep(3000);
    }
    //validate
    public void validateTravelForumsButtonCheck(){
        Assert.assertEquals("Travel Forum, Discussion Board for Talk and Chat - Tripadvisor", driver.getTitle());
    }


    //Action
    public void moreButtonIsClickable() throws InterruptedException {
        moreButton.click();
        Thread.sleep(3000);
    }
    //validate
    public void validateMoreButtonIsClickable(){
       Assert.assertEquals("Tripadvisor: Read Reviews, Compare Prices & Book", driver.getTitle());
    }


    //Action
    public void postButtonClickable() throws InterruptedException {
        postButton.click();
        Thread.sleep(3000);
    }
    //validate
    public void validatePostButtonClickable(){
        Assert.assertEquals("Tripadvisor: Read Reviews, Compare Prices & Book", driver.getTitle());
    }

    //Action
    public void alertButtonClickable() throws InterruptedException {
        alertButton.click();
        Thread.sleep(3000);
    }
    //validate
    public void validateAlertButtonClickable(){
        Assert.assertEquals("Tripadvisor - Registration", driver.getTitle());
    }

    //Action
    public void tripsButtonClickable() throws InterruptedException {
        tripsButton.click();
        Thread.sleep(3000);
    }
    //validate
    public void validateTripsButtonClickable(){
        Assert.assertEquals("Trips on Tripadvisor", driver.getTitle());
    }
}