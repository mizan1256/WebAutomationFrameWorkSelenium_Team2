package home;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static home.HomePageElement.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = menuXPathWebElement)
    public WebElement menu;
    @FindBy(how = How.XPATH, using = USXPathWebElement)
    public WebElement US;

    @FindBy(how = How.XPATH, using = searchBoxXPathWebElement)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = newsXPathWebElement)
    public WebElement news;
    @FindBy(how = How.XPATH, using = followStoryXPathWebElement)
    public WebElement followStory;
    @FindBy(how = How.XPATH, using = emailAddressBoxXPathWebElement)
    public WebElement emailAddressBox;
    @FindBy(how = How.XPATH, using = signUpButtonXPathWebElement)
    public WebElement signUpButton;
    @FindBy(how = How.XPATH, using = liveTVXPathWebElement)
    public WebElement liveTV;
    @FindBy(how = How.XPATH, using = channelLiveTVXPathWebElement)
    public WebElement channelLiveTV;
    @FindBy(how = How.XPATH, using = CNNLiveChannelLiveTVXPathWebElement)
    public WebElement CNNLiveChannelLiveTV;
    @FindBy(how = How.XPATH, using = showsXPathWebElement)
    public WebElement showsLiveTV;
    @FindBy(how = How.XPATH, using = showsFeaturedTextXPathWebElement)
    public WebElement showsFeaturedText;
    @FindBy(how = How.XPATH, using = USHomePageXPathWebElement)
    public WebElement USHomePage;
    @FindBy(how = How.XPATH, using = USHomePageLatestStoriesXPathWebElement)
    public WebElement USHomePageLatestStoriesX;

    @FindBy(how = How.XPATH, using = latestNewsUSHomePageLatestStoriesXPathWebElement)
    public WebElement latestNewsUS;
    @FindBy(how = How.XPATH, using = editionXPathWebElement)
    public WebElement editionDropDown;
    @FindBy(how = How.XPATH, using = editionArabicXPathWebElement)
    public WebElement editionArabic;
    @FindBy(how = How.XPATH, using = editionArabicPlayLogoCheckXpathWebElement)
    public WebElement editionArabicPlayLogo;
    @FindBy(how = How.XPATH, using = editionEspanolXpathWebElement)
    public WebElement editionEspanol;
    @FindBy(how = How.XPATH, using = TrendingXPathWebElement)
    public WebElement trending;
    @FindBy(how = How.XPATH, using = worldXpathWebElement)
    public WebElement world;
    @FindBy(how = How.XPATH, using = worldTitleXpathWebElement)
    public WebElement worldTitle;


    public void scrollDownToBottom() {//the scrollBy() method scrolls down to the bottom.
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
    }


    public void elementToBeClickable(int timeInSec, WebElement webElementVariable) {
        WebDriverWait wait = new WebDriverWait(driver, timeInSec);
        wait.until(ExpectedConditions.elementToBeClickable(webElementVariable));

    }


    /**
     * menu and validate the title
     */

    //Action method
    public void menuOption() {
        //click login
        elementToBeClickable(5, menu);
        menu.click();
        elementToBeClickable(5, US);
        //click US
    }

    //Validate method
    public void validateMenuOption() {
        String actualText = driver.getTitle();
        String expectedText = "CNN - Breaking News, Latest News and Videos";
        Assert.assertEquals(actualText, expectedText);
    }

    /**
     * menu search for election
     * click on a news and follow the story, validate the URL
     */

    //Action method
    public void menuSearchOption() throws InterruptedException {
        //click login
        menu.click();
        elementToBeClickable(5, searchBox);
        //click searchBox and search election
        searchBox.sendKeys("Election");
        //enter
        searchBox.submit();
        //click on the news
//        elementToBeClickable(5, news);
        sleepFor(10);
        news.click();
        //click  followStory
//        elementToBeClickable(5, followStory);
//        followStory.click();
//        //enter email address
//        elementToBeClickable(5, emailAddressBox);
//        emailAddressBox.sendKeys("mtt@gmail.com");
//        //click  sign up
//        elementToBeClickable(5, signUpButton);
//        signUpButton.click();
    }

    //Validate method
    public void validateMenuSearchOption() {
        String actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, newsUrl);
    }

    /**
     * got o live tv click on channel
     * validate if the cnnlive button enabled or not
     */

    //Action method
    public void liveTV() {
        //click on liveTV
        elementToBeClickable(5, liveTV);
        liveTV.click();
        //click on channel
        elementToBeClickable(5, channelLiveTV);
        channelLiveTV.click();
    }

    //validate method
    public void validateLiveTV() {
        Assert.assertEquals(CNNLiveChannelLiveTV.isEnabled(), true);
    }


    /**
     * go to live tv click on shows
     * validate the txt
     */

    //Action method
    public void showsLiveTV() {
        //click on liveTV
        elementToBeClickable(5, liveTV);
        liveTV.click();
        elementToBeClickable(5, showsLiveTV);
        showsLiveTV.click();

    }

    //validate method
    public void validateShowsLiveTV() {
        String expectedText = "Featured Episodes and Shows";
        elementToBeClickable(5, showsFeaturedText);
        Assert.assertEquals(showsFeaturedText.getText(), expectedText);
    }

    /**
     * go to live tv click on shows
     * validate the url
     */

    //Action method
    public void liveTvCheckUrl() {
        //click on liveTV
        elementToBeClickable(5, liveTV);
        liveTV.click();

    }

    //validate method
    public void validateLiveTvCheckUrl() {
        Assert.assertEquals(driver.getTitle(), title);
    }


    /**
     * go to us home page
     * validate the latestNewsUS is displayed
     */

    //Action method
    public void USHomePage() {
        //click us
        USHomePage.click();
        elementToBeClickable(5, USHomePageLatestStoriesX);
        //click on latest story
        USHomePageLatestStoriesX.click();
        //scrollDown();
    }

    //validate method
    public void validateUSHomePage() {
        boolean actualResult = latestNewsUS.isDisplayed();
        Assert.assertEquals(actualResult, true);
    }

    /**
     * go to edition DropDown
     * click editionArabic
     * play and validtae the title
     */

    //Action method
    public void editionDropDownCheck() {
        //go to dropdown
        editionDropDown.click();
        elementToBeClickable(10, editionArabic);
        //click arabic
        editionArabic.click();
        elementToBeClickable(10, editionArabicPlayLogo);
        editionArabicPlayLogo.click();
    }

    //validate method
    public void validateEditionDropDownCheck() {
        String actual = driver.getTitle();
        Assert.assertEquals(actual, "CNN Arabic");
    }


    /**
     * go to edition DropDown
     * click espanol
     * validtae the url
     */

    //Action method
    public void editionDropDownEspanolCheck() {
        editionDropDown.click();
        //click espanol
        elementToBeClickable(10, editionEspanol);
        editionEspanol.click();

    }

    //validate method
    public void validateEditionDropDownEspanolCheck() throws InterruptedException {
        sleepFor(10);
        Assert.assertEquals(driver.getCurrentUrl(), url);

    }

    /**
     * go to trending
     * choose hotspot
     * validate  SortBy is displayed or not
     */

    //Action method
    public void liveUpdates() {
        trending.click();

    }

    //validate
    public void validateLiveUpdates() {
        Assert.assertEquals(driver.getTitle(), titleforTrending);

    }


    /**
     * go to liveUpdates
     * choose hotspot
     * scroll down
     * validate  followCNN is there or not
     */
    public void world() {
        world.click();

    }

    public void validateWorld() {
        elementToBeClickable(10, worldTitle);
        Assert.assertEquals(worldTitle.isDisplayed(), true);

    }


//
//    /**
//     * go to liveUpdates
//     *
//     *"what you need to know" click export
//     * validate  followCNN is there or not
//     */
//    public void liveUpdatesExport() {
//        liveUpdates();
//        //clcik on the export button
//        elementToBeClickable(10, liveUpdatesExport);
//
//        liveUpdatesExport.click();
//
//    }


}
