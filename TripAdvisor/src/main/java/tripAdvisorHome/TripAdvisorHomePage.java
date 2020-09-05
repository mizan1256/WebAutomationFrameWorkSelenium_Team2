package tripAdvisorHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


import static tripAdvisorHome.TripAdvisorWebElements.*;

public class TripAdvisorHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = homeSearchBox)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = homeSearchButton)
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = tripAdvisorWhereToPageText)
    public WebElement pageText;
    @FindBy(how = How.XPATH, using = tripAdvisorHotelPageTitleText)
    public WebElement titleText;
    @FindBy(how = How.XPATH, using = tripAdvisorVacationRentalsTitleMatchText)
    public WebElement titleMatchText;
    @FindBy(how = How.XPATH, using = tripAdvisorGageHotelCheckText)
    public WebElement gageCheckText;

    //    Action Method
    public void searchBoxClickable() throws InterruptedException {
        searchBox.isDisplayed();
        Thread.sleep(5000);
    }
//  Action Method
    public void tripAdvisorWhereToSearchBox() throws InterruptedException {
        clickByXpath(tripAdvisorHotelTab);
        Thread.sleep(3000);
        typeOnElementNEnter(tripAdvisorWhereToSearchBox, "Texas");
        Thread.sleep(3000);
    }
//  Validate Method
    public void validateTripAdvisorWhereToSearchBox(String expectedResult) {
        String actualResult = titleText.getText();
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println("PASSED");
    }
//  Action Method
    public void tripAdvisorHotelTabButton() throws InterruptedException {
        clickByXpath(tripAdvisorHotelTab);
        Thread.sleep(3000);
        typeOnElementNEnter(tripAdvisorWhereToSearchBox, "Texas");
        Thread.sleep(3000);
        clickByXpath(tripAdvisorHotelButton);
        Thread.sleep(3000);
    }
//  Validate Method
    public void validateTripAdvisorHotelTabButton(String expectedResult) {
        String actualResult = pageText.getText();
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println("PASSED");
    }
//    Action Method
    public void tripAdvisorVacationRentalsTab() throws InterruptedException {
        tripAdvisorWhereToSearchBox();
        clickByXpath(tripAdvisorVacationRentalsTab);
        Thread.sleep(3000);
    }
    //  Validate Method
    public void validateTripAdvisorVacationRentalsTab(String expectedResult) {
//        String actualResult = titleMatchText.getText();
        String actualResult = getTextByXpath(tripAdvisorVacationRentalsTitleMatchText);
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println("PASSED");
    }
//  Action Method
    public void tripAdvisorGageHotelCheck() throws InterruptedException {
        tripAdvisorHotelTabButton();
        clickOnElement(tripAdvisorGageHotelCheck);
        Thread.sleep(3000);
    }
    //  Validate Method
    public void validateTripAdvisorGageHotelCheck(String expectedResult) {
//        String actualResult = getTextByXpath(tripAdvisorGageHotelCheckText);
        String actualResult = gageCheckText.getText();
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println("PASSED");
    }
    public void tripAdvisorGageHotelCheckIn() throws InterruptedException {
        tripAdvisorGageHotelCheck();
        Thread.sleep(3000);
//        String newWindow = driver.getWindowHandle();
//        driver.switchTo().window(newWindow);
        clickByXpath(tripAdvisorGageHotelCheckIn);
        Thread.sleep(3000);
    }


}
