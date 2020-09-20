package deals;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utility.DataReader;

import static deals.DealsWebElement.*;
import static home.HomePageWebElement.urlForOffersByCategory;


public class Deals extends WebAPI {

    @FindBy(how = How.CSS, using = dealsCSSWebElement)
    public WebElement deals;
    @FindBy(how = How.CSS, using = clearanceCSSWebElement)
    public WebElement clearance;
    @FindBy(how = How.XPATH, using = homeClearanceXpathWebElement)
    public WebElement homeClearance;
    @FindBy(how = How.XPATH, using = HomeClearanceTitleXpathWebElement)
    public WebElement homeClearanceText;
    @FindBy(how = How.CSS, using = TopDealsCssWebElement)
    public WebElement topDeals;
    @FindBy(how = How.XPATH, using = saveOnFurnitureXpathWebElement)
    public WebElement saveOnFurniture;
    @FindBy(how = How.XPATH, using = redCardDealsXpathWebElement)
    public WebElement redCardDeals;
    @FindBy(how = How.XPATH, using = fivePercentOffXPathWebElement)
    public WebElement fivePercentOff;
    @FindBy(how = How.XPATH, using = targetCircleOffersXPathWebElement)
    public WebElement targetCircleOffers;
    @FindBy(how = How.XPATH, using = OffersByCategoryXPathWebElement)
    public WebElement OffersByCategory;
    @FindBy(how = How.XPATH, using = allCategoryXPathWebElement)
    public WebElement all;
    @FindBy(how = How.XPATH, using = footerTheLatestOnOurStoreHealthXPathWebElement)
    public WebElement footerTheLatestOnOurStoreHealth;
    @FindBy(how = How.XPATH, using = forYouXPathWebElement)
    public WebElement forYou;
    @FindBy(how = How.XPATH, using = signInToSeeTextPathWebElement)
    public WebElement signInToSeeText;
    @FindBy(how = How.XPATH, using = adultBeveragesXPathWebElement)
    public WebElement adultBeverages;
    @FindBy(how = How.XPATH, using = apparelXPathWebElement)
    public WebElement apparel;
    @FindBy(how = How.XPATH, using = babyXPathWebElement)
    public WebElement baby;
    @FindBy(how = How.XPATH, using = beautyXPathWebElement)
    public WebElement beauty;
    @FindBy(how = How.XPATH, using = beautyItemXPathWebElement)
    public WebElement beautyItem;
    @FindBy(how = How.XPATH, using = beautyItemDetailsPageXPathWebElement)
    public WebElement beautyItemDetailsPage;
    @FindBy(how = How.XPATH, using = foodXPathWebElement)
    public WebElement food;
    @FindBy(how = How.XPATH, using = foodItemXPathWebElement)
    public WebElement foodItem;
    @FindBy(how = How.XPATH, using = foodDetailsPageXPathWebElement)
    public WebElement foodDetailsPage;
    @FindBy(how = How.XPATH, using = healthXPathWebElement)
    public WebElement health;
    @FindBy(how = How.XPATH, using = healthItemXPathWebElement)
    public WebElement healthItem;
    @FindBy(how = How.XPATH, using = saveOfferXpathWebElement)
    public WebElement saveOffer;
    @FindBy(how = How.XPATH, using = signInToSaveThisOfferXpathWebElement)
    public WebElement signInToSaveThisOffer;
    @FindBy(how = How.XPATH, using = homeXpathWebElement)
    public WebElement home;
    @FindBy(how = How.XPATH, using = homeItemXpathWebElement)
    public WebElement homeItem;
    @FindBy(how = How.XPATH, using = sortByXpathWebElement)
    public WebElement sortBy;


    public void scrollDown() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void timeToBeClickable(int timeInSec, WebElement webElementVariable) {
        WebDriverWait wait = new WebDriverWait(driver, timeInSec);
       wait.until(ExpectedConditions.elementToBeClickable(webElementVariable));

    }




    /**
     * navigate deals
     */
//action method
    public void deals() {
        //click on deals
        deals.click();
        timeToBeClickable(5, clearance);
        //click on clearance
        clearance.click();
        //click homeClearance
//        timeToBeClickable(5, homeClearance);
//        homeClearance.click();

    }
    //validate method

    public void validateDeals() {
        String expectedText="https://www.target.com/c/clearance/-/N-5q0ga?lnk=dNav_clearance";
        Assert.assertEquals(driver.getCurrentUrl(), expectedText, "wrong");
    }



    /**
     * top deals and click on save on furniture validate the title
     */


    public void GoTopDeals() throws InterruptedException {
        //click on deals
        deals.click();
        timeToBeClickable(5, topDeals);
        //click on topDeals
        topDeals.click();
        //click saveOnFurniture
        sleepFor(5);
        //timeToBeClickable(5, saveOnFurniture);
        //saveOnFurniture.click();

    }

    //validate Method
    public void validateGoTopDeals() throws InterruptedException {
        sleepFor(5);
        String actualText = driver.getTitle();
        String expectedText = "Target Coupons, Promos & Deals";
        Assert.assertEquals(actualText, expectedText);
    }

    /**
     * red card exclusive and validate title
     */
//action method
    public void redCardDeals() {
        //click on deals
        deals.click();
        timeToBeClickable(5, redCardDeals);
        //click on redCard exclusive
        redCardDeals.click();

    }

    //validate Method
    public void validateRedCardDeals() {

        String actualtext = driver.getTitle();
        String expectedtext = "Target : Expect More. Pay Less.";
        Assert.assertEquals(actualtext, expectedtext);
    }

    /**
     * Redcard navigation
     */
    //action method
    public void redCardDeals2() throws InterruptedException {
        //go to red card exclusive deals
        redCardDeals();
        sleepFor(5);
        timeToBeClickable(5, fivePercentOff);
        //click on fivePercentOff
        fivePercentOff.click();

    }

    //validate method
    public void validateRedCardDeals2() {
        String actualText = fivePercentOff.getText();
        String ExpectedText = "5% off at Target";
        Assert.assertEquals(actualText, ExpectedText);
    }

    /**
     * target circle offers navigation and validating text
     */
    public void targetCircleOffers() {
        deals.click();
        timeToBeClickable(5, targetCircleOffers);
        targetCircleOffers.click();
//        //click on targetCircleOffers
//        wait.until(ExpectedConditions.elementToBeClickable(targetCircleOffers)).click();
//        //OffersByCategory
        timeToBeClickable(5, OffersByCategory);
        OffersByCategory.click();
//        wait.until(ExpectedConditions.elementToBeClickable(OffersByCategory)).click();
    }

    //validate method
    public void validateTargetCircleOffers() {
        String actualText = OffersByCategory.getText();
        String ExpectedText = "Offers by category";
        Assert.assertEquals(actualText, ExpectedText);
    }
    /**
     * navigate To "All" Target Circle
     */
    //action method
    public void navigateToTargetCircle() {
        //click on deals
        timeToBeClickable(5, deals);
        deals.click();
        //click on target circle offers
        timeToBeClickable(5, targetCircleOffers);
        targetCircleOffers.click();
        //click on all
//        all.click();
    }

    //validate method
    public void validateNavigateToTargetCircle() {
        String actualText = footerTheLatestOnOurStoreHealth.getText();
        String ExpectedText = "The latest on our store health and safety plans";
        Assert.assertEquals(actualText, ExpectedText);

    }

    /**
     * navigate To "for you" Target Circle
     */

    //action method
    public void navigateToForYouTargetCircle() throws InterruptedException {
        deals.click();
        timeToBeClickable(5, targetCircleOffers);
        //click on target circle offers
        targetCircleOffers.click();
        //timeToBeClickable(5, forYou);
        sleepFor(5);
        forYou.click();
    }

    //validate method
    public void validateNavigateToForYouTargetCircle() throws InterruptedException {
        sleepFor(5);
        String actualText = driver.getCurrentUrl();
        String ExpectedText = "https://www.target.com/offers/target-circle/recommended";
        Assert.assertEquals(actualText, ExpectedText);
    }


    /**
     * navigate To "adult beverages" Target Circle
     */

    //action method
    public void navigateToAdultBeveragesTargetCircle() throws InterruptedException {
        //click on deals
        deals.click();
        timeToBeClickable(5, targetCircleOffers);
        //click on targetCircleOffers
        targetCircleOffers.click();
        //click adultBeverages
        sleepFor(5);
        //timeToBeClickable(5, adultBeverages);
        adultBeverages.click();

    }

    //validate method
    public void validateNavigateToAdultBeveragesTargetCircle() {
        String actualText = driver.getTitle();
        String ExpectedText = "Target Circle™ Offers";
        Assert.assertEquals(actualText, ExpectedText);
    }


    /**
     * navigate To "Apparel" Target Circle and validate the url
     */

    //action method
    public void navigateToApparelTargetCircle() throws InterruptedException {
        //click on deals
        deals.click();
        //click on target Circle Offers
        timeToBeClickable(5, targetCircleOffers);
        targetCircleOffers.click();
        //click apparel
sleepFor(5);
//timeToBeClickable(5, apparel);
//        apparel.click();

    }

    //validate method
    public void validateNavigateToApparelTargetCircle() throws InterruptedException {
        sleepFor(5);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.target.com/offers/target-circle";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    /**
     * navigate To "baby" Target Circle and validate if baby is displayed or not
     */

    //action method
    public void navigateToBabyTargetCircle() throws InterruptedException {
        //click on deals
        deals.click();
        timeToBeClickable(5, targetCircleOffers);
        //click on target Circle Offers
        targetCircleOffers.click();
        //click baby
        sleepFor(5);
//        timeToBeClickable(5, baby);
        baby.click();

    }

    //validate method
    public void validateNavigateToBabyTargetCircle() {
        boolean actualText = baby.isDisplayed();
        boolean expectedText = true;
        Assert.assertEquals(actualText, expectedText);
    }

    /**
     * navigate To "beauty" Target Circle and validate if beautyItemDetailsPage is displayed or not
     */

    //action method
    public void navigateToBeautyTargetCircle() throws InterruptedException {
        //click on deals
        deals.click();
        timeToBeClickable(5, targetCircleOffers);
        //click on target Circle Offers
        targetCircleOffers.click();
        //click beauty
        sleepFor(5);
        //timeToBeClickable(5, beauty);
        beauty.click();
        //click on beautyItem
        sleepFor(5);
//        timeToBeClickable(5, beautyItem);
//        beautyItem.click();
    }

    //validate method
    public void validateNavigateToBeautyTargetCircle() {
        String actualText= driver.getCurrentUrl();
//        boolean actualText =foote.isDisplayed();
        String expectedText = "https://www.target.com/offers/target-circle/232";
        Assert.assertEquals(actualText, expectedText);
    }

    /**
     * navigate To "food" Target Circle and validate if food details is displayed or not
     */

    //action method
    public void navigateToFoodTargetCircle() throws InterruptedException {
        //click on deals
        deals.click();
        timeToBeClickable(5, targetCircleOffers);
        //click on target Circle Offers
        targetCircleOffers.click();
        //click food
        sleepFor(5);
//        timeToBeClickable(5, food);
        food.click();
        //click bel vita Breakfast biscuits
        sleepFor(5);
//        timeToBeClickable(5, foodItem);
//        foodItem.click();

    }

    //validate method
    public void validateNavigateToFoodTargetCircle() {

       // boolean actualText = foodDetailsPage.isDisplayed();
        String actualText = driver.getCurrentUrl();

        Assert.assertEquals(actualText, "https://www.target.com/offers/target-circle/26");
    }

    /**
     * navigate To "health" Target Circle and validate the signInToSaveThisOffer text
     */

    //action method
    public void navigateToHealthTargetCircle() {
        //click on deals
        deals.click();
        timeToBeClickable(5, targetCircleOffers);
        //click on target Circle Offers
        targetCircleOffers.click();
        //click health
        timeToBeClickable(5, health);
        health.click();
        //click healthItem
        timeToBeClickable(5, healthItem);
        healthItem.click();
        //click saveOffer
        timeToBeClickable(5, saveOffer);
        saveOffer.click();

    }

    //validate method
    public void validateNavigateToHealthTargetCircle() throws InterruptedException {
        sleepFor(5);
        String actualText = driver.getTitle();
        String expectedText = "Sign in to save this offer";
        Assert.assertEquals(actualText, expectedText);
    }

    /**
     * navigate To "home" Target Circle and validate the signInToSaveThisOffer text
     */
    //action method
    public void navigateToHomeTargetCircle() throws InterruptedException {
        //click on deals
        deals.click();
        timeToBeClickable(5, targetCircleOffers);
        //click on target Circle Offers
        targetCircleOffers.click();
        //click home
        sleepFor(5);
//        timeToBeClickable(5, 5home);
        home.click();
        //click on homeItem
        timeToBeClickable(5, homeItem);
        homeItem.click();

    }

    //validate method
    public void validateNavigateToHomeTargetCircle() {
        Boolean actualText = sortBy.isDisplayed();
        Boolean expectedText = false;
        Assert.assertEquals(actualText, expectedText);
    }








}
