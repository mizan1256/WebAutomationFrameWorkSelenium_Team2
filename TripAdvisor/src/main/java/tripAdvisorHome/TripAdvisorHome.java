package tripAdvisorHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


import static tripAdvisorHome.TripAdvisorWebElements.*;
public class TripAdvisorHome extends WebAPI {

    @FindBy(how= How.XPATH, using = webElementsSearchBox) public WebElement SearchBox;
    @FindBy(how= How.XPATH, using = webElementsSearchButton) public WebElement SearchButton;

    @FindBy(how= How.XPATH, using = webElementsLogo) public WebElement Logo;
    @FindBy(how= How.XPATH, using = webElementsHotels) public WebElement Hotels;
    @FindBy(how= How.XPATH, using = webElementsHotelsName) public WebElement HotelsName;
    @FindBy(how= How.XPATH, using = webElementsHotelsSearch) public WebElement HotelsSearch;
    @FindBy(how= How.XPATH, using = webElementsCheckInDate) public WebElement CheckInDate;
    @FindBy(how= How.XPATH, using = webElementsCheckOutDate) public WebElement CheckOutDate;
    @FindBy(how= How.XPATH, using = webElementsAddRoom) public WebElement AddRoom;
    @FindBy(how= How.XPATH, using = webElementsAddGuests) public WebElement AddGuests;
    @FindBy(how= How.XPATH, using = webElementsUpdate) public WebElement Update;
    @FindBy(how= How.XPATH, using = webElementsHotelsText) public WebElement HotelsText;

    @FindBy(how= How.XPATH, using = webElementsWriteReview) public WebElement WriteReview;
    @FindBy(how= How.XPATH, using = webElementsCity) public WebElement City;
    @FindBy(how= How.XPATH, using = webElementsSelectCity) public WebElement SelectCity;
    @FindBy(how= How.XPATH, using = webElementsReviewStoreName) public WebElement StoreName;
    @FindBy(how= How.XPATH, using = webElementsReviewSelectStore) public WebElement SelectStore;
    @FindBy(how= How.XPATH, using = webElementsReviewFiveStars) public WebElement FiveStars;
    @FindBy(how= How.XPATH, using = webElementsReviewTitle) public WebElement ReviewTitle;
    @FindBy(how= How.XPATH, using = webElementsYourReview) public WebElement YourReview;
    @FindBy(how= How.XPATH, using = webElementsWithFriends) public WebElement WithFriends;
    @FindBy(how= How.XPATH, using = webElementsMark) public WebElement Mark;
    @FindBy(how= How.XPATH, using = webElementsSubmit) public WebElement Submit;
    @FindBy(how= How.XPATH, using = webElementsValidateText) public WebElement ValidateText;







    public void tripAdvisorSearch() throws InterruptedException {
        SearchBox.sendKeys("Canada");
        Thread.sleep(2000);
        SearchButton.click();
        Thread.sleep(2000);
    }
    public void validateTripAdvisorSearch() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Search results: Canada - Tripadvisor", driver.getTitle());
    }

    public void tripAdvisorLogo() throws InterruptedException {
        Logo.isDisplayed();
        Thread.sleep(2000);
    }

    public void tripAdvisorHotels() throws InterruptedException {
        Hotels.click();
        Thread.sleep(2000);
        HotelsName.sendKeys("Bangladesh Hotels");
        Thread.sleep(2000);
        HotelsSearch.click();
        Thread.sleep(2000);
        CheckInDate.click();
        Thread.sleep(2000);
        CheckOutDate.click();
        Thread.sleep(2000);
        AddRoom.click();
        Thread.sleep(2000);
        AddGuests.click();
        Thread.sleep(2000);
        Update.click();
        Thread.sleep(4000);
    }
    public void validateTripAdvisorHotels(String expectedResult){
        String actualResult = HotelsText.getText();
        Assert.assertEquals(actualResult,expectedResult,"Didn't Pass");

    }

    public void tripAdvisorWriteReview() throws InterruptedException {
        WriteReview.click();
        City.click();
        City.sendKeys("Brooklyn");
        Thread.sleep(1000);
        SelectCity.click();
        StoreName.sendKeys("Starbucks");
        Thread.sleep(2000);
        SelectStore.click();
        FiveStars.click();
        ReviewTitle.sendKeys("Just For FUN!!");
        Thread.sleep(1000);
        YourReview.sendKeys("Sorryyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
        WithFriends.click();
        Mark.click();
        Submit.click();
        Thread.sleep(3000);
    }
    public void validateTripAdvisorWriteReview(String expectedResult){
        String actualResult = ValidateText.getText();
        Assert.assertEquals(actualResult,expectedResult,"Didn't Pass");
    }





}
