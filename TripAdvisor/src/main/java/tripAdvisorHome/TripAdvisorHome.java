package tripAdvisorHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static tripAdvisorHome.TripAdvisorHomeWebElements.*;


public class TripAdvisorHome extends WebAPI {

    @FindBy(how = How.XPATH,using = webElementsSearchBox)
    public WebElement searchBox;

    @FindBy(how = How.XPATH,using = webElementsSearchButton)
    public WebElement searchButton;

    @FindBy(how = How.XPATH,using = webElementsSearchButtonText)
    public WebElement searchButtonText;

    @FindBy(how = How.XPATH,using = webElementsPostButton)
    public WebElement postButton;

    @FindBy(how = How.XPATH,using = webElementsWriteReviewButton)
    public WebElement writeReviewButton;

    @FindBy(how = How.XPATH,using = webElementsTAPressButton)
    public WebElement pressButton;

    @FindBy(how = How.XPATH,using =webElementsTAOwnersButton)
    public WebElement ownersButton;

    @FindBy(how = How.XPATH,using =webElementsTATravelersChoiceButton)
    public WebElement travelersChoiceButton;


//    Action Method
    public void searchBoxClickable() throws InterruptedException {
        searchBox.isDisplayed();
        Thread.sleep(5000);
    }


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
}
