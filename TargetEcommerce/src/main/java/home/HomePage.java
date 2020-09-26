package home;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static home.HomePageWebElement.*;

public class HomePage extends WebAPI {


    @FindBy(how = How.XPATH, using = searchBoxXPathWebElement)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = textXPATHSWebElement)
    public WebElement shampooText;
    @FindBy(how = How.XPATH, using = calculatorZeroToFifteenXPATHSWebElement)
    public WebElement calculator;
    @FindBy(how = How.XPATH, using = searchHeadphonesXPATHSWebElement)
    public WebElement searchHeadphones;
    @FindBy(how = How.XPATH, using = searchHeadphonesHeartSignXPATHSWebElement)
    public WebElement searchHeadphonesHeartSign;
    @FindBy(how = How.XPATH, using = deliveryXPATHSWebElement)
    public WebElement delivery;
    @FindBy(how = How.XPATH, using = calculatorXPATHSWebElement)
    public WebElement chooseCalc;
    @FindBy(how = How.XPATH, using = addToRegistryXPATHSWebElement)
    public WebElement addToRegistry;
    @FindBy(how = How.XPATH, using = registryXPathWebElement)
    public WebElement registry;
    @FindBy(how = How.XPATH, using = registryTextXPathWebElement)
    public WebElement registryText;
    @FindBy(how = How.XPATH, using = weeklyAddXPathXPathWebElement)
    public WebElement WeeklyAd;
    @FindBy(how = How.XPATH, using = ViewTheWeeklyAdXPathWebElement)
    public WebElement viewWeeklyAd;
    @FindBy(how = How.XPATH, using = addTextXPathWebElement)
    public WebElement adText;
    @FindBy(how = How.XPATH, using = loginTextCssSWebElement)
    public WebElement loginText;
    @FindBy(how = How.XPATH, using = addToCartXPathWebElement)
    public WebElement addToCartButton;
    @FindBy(how = How.XPATH, using = addToCartTextXPathWebElement)
    public WebElement addToCartText;
    @FindBy(how = How.XPATH, using = heartButtonXPathWebElement)
    public WebElement heartButton;
    @FindBy(how = How.XPATH, using = footerLogoXPathWebElement)
    public WebElement footerLogo;
    @FindBy(how = How.XPATH, using = moreXPathWebElement)
    public WebElement more;
    @FindBy(how = How.XPATH, using = targetAppXPathWebElement)
    public WebElement targetApp;
    @FindBy(how = How.XPATH, using = pharmacyXPathWebElement)
    public WebElement pharmacy;
    @FindBy(how = How.XPATH, using = whatsNewXPathWebElement)
    public WebElement whatsNew;
    @FindBy(how = How.XPATH, using = whatsNewTrendsXPathWebElement)
    public WebElement whatsNewTrends;
    @FindBy(how = How.XPATH, using = whatsNewSpotLightXPathWebElement)
    public WebElement whatsNewSpotLight;
    @FindBy(how = How.XPATH, using = storeXPathWebElement)
    public WebElement storeLocation;
    @FindBy(how = How.XPATH, using = storeLocationZipcodeXPathWebElement)
    public WebElement storeLocationZipCode;
    @FindBy(how = How.XPATH, using = harlemLocationXPathWebElement)
    public WebElement harlemLocation;
    @FindBy(how = How.XPATH, using = searchButtonZipcodeXPathWebElement)
    public WebElement searchButtonZipcode;
    @FindBy(how = How.XPATH, using = schoolXPathWebElement)
    public WebElement school;
    @FindBy(how = How.XPATH, using = wifiAndNetworkingXPathWebElement)
    public WebElement wifiAndNetworking;
        @FindBy(how = How.XPATH, using = wifiAndNetworkingTextXPathWebElement)
    public WebElement wifiAndNetworkingText;

    @FindBy(how = How.XPATH, using = sameDayDeliveryXPathWebElement)
    public WebElement sameDayDelivery;
    @FindBy(how = How.XPATH, using = sharpieXPathWebElement)
    public WebElement sharpie;
    @FindBy(how = How.XPATH, using = sameDayDeliverXPathWebElement)
    public WebElement deliverItSameDay;
    @FindBy(how = How.XPATH, using = oderHistoryXPathWebElement)
    public WebElement oderHistory;
    @FindBy(how = How.XPATH, using = kidsHeadPhoneXPathWebElement)
    public WebElement kidsHeadPhone;
    @FindBy(how = How.XPATH, using = jBuddiesHeadPhoneXPathWebElement)
    public WebElement jBuddiesHeadPhone;
    @FindBy(how = How.XPATH, using = jBuddiesTitleXPathWebElement)
    public WebElement jBuddiesTitle;
    @FindBy(how = How.XPATH, using = listAssistXPathWebElement)
    public WebElement listAssist;
    @FindBy(how = How.XPATH, using = postItXPathWebElement)
    public WebElement postIt;


//    @FindBy(how = How.XPATH, using = freeOrderPickupXPathWebElement)
//    public WebElement freeOrderPickup;



    public void scrollDown() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void timeToBeClickable(int timeInSec, WebElement webElementVariable) {
        WebDriverWait wait = new WebDriverWait(driver, timeInSec);
        wait.until(ExpectedConditions.elementToBeClickable(webElementVariable));

    }

    /**
     * add calculator to cart and validate the login button text
     */
    //action method
    public void ItemsAddToCart() throws InterruptedException {
        //search calculator
        timeToBeClickable(5, searchBox);
        searchBox.sendKeys("calculator");
        //click enter
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        sleepFor(5);
        searchBox.submit();
        //calculator click
        sleepFor(5);
        calculator.click();
        sleepFor(5);
        //click on free order pickup
        sleepFor(5);
        delivery.click();
        //click on the desired calculator
        sleepFor(5);
//        timeToBeClickable(5, chooseCalc);
        chooseCalc.click();
        //add to cart
        timeToBeClickable(5, addToRegistry);
        addToRegistry.click();
    }


    public void validateAddToCart() {
        String actualText = loginText.getText();
        String expectedText = "Sign into your Target account";
        Assert.assertEquals(actualText, expectedText, "test failed");
    }

    /**
     * search shampoo adn look for a text at the end of the page and validate that
     */

    //action method
    public void SearchElement() {
        //go to search box and search tresemme shampoo
        timeToBeClickable(5, searchBox);
        searchBox.sendKeys("ogx shampoo");
        //click enter
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        searchBox.submit();
        //scroll down to the page
        scrollDown();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        //Thread.sleep(5000);
    }

    //validate Method
    public void validateSearchElement() {
        String actualText = shampooText.getText();
        String expectedtext = "The latest on our store health and safety plans";
        Assert.assertEquals(actualText, expectedtext);

    }
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    //click on the notebook
//        Actions act= new Actions(driver);
//        act.moveToElement(shampoo).click().build().perform();


    /**
     * click on registry and explore the option to get the text
     */
    public void navigate() {
        registry.click();

    }

    public void validateNaviagte() {
        String actualText = registryText.getText();
        String expectedText = "GIVE THE PERFECT GIFT";
        Assert.assertEquals(actualText, expectedText, "Not found");
    }

    /**
     * test:
     * click on weekly deals adn get the text to check
     */
    //action method
    public void navigateToWeeklyAd() {
        //click on weeklyAd
        WeeklyAd.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //click on view
        viewWeeklyAd.click();
    }

    //validate method
    public void validateNavigateToWeeklyAd() {
        //get the text on the last page and validate it
        String actualText = adText.getText();
        String expectedText = "items on page:";
        Assert.assertEquals(actualText, expectedText, "not found");
    }

    /**
     * click on cart and validate the text
     */
    public void cart() {
        addToCartButton.click();
    }

    //validate

    public void validateCart() {
        timeToBeClickable(10, addToCartText);
        boolean actual = addToCartText.isDisplayed();
        Assert.assertEquals(actual, true);
    }

    /**
     * click on wishList and validate the text
     */
    //action method
    public void wishList() {
        //click on wishList
        heartButton.click();
        //scroll down
        scrollDown();
    }

    //validate
    public void validateWishList() {
        Assert.assertEquals(footerLogo.isDisplayed(), true);
    }


    /**
     * all the things in school
     * click highlight
     *  and validate order history text
     */
//action method
    public void school1() throws InterruptedException {
        //use method to find sharpie
        allTheThingsSchool();
        //click on sharpie
        sleepFor(5);

    }
    //validate method

    public void validateSchool() {
        //validate the text for order history
        String actualText=driver.getCurrentUrl();
        Assert.assertEquals(actualText, "https://www.target.com/c/wi-fi-networking-electronics/-/N-5s7dv");
    }

    /**
     * click on more and validate the text
     */
    //action method
    public void moretargetApp() {
        more.click();
        //click on target app
        targetApp.click();
//        targetAppDownLoadAppStore.click();
    }

    public void validateMoreTargetApp() {
        Assert.assertEquals(driver.getTitle(), "Target : Expect More. Pay Less.");
    }


    /**
     * click on more , pharmacy and validate the text
     */
    //action method
    public void morePharmacy() {
        //click more
        more.click();
        timeToBeClickable(10, pharmacy);
        //click on pharmacy
        pharmacy.click();

    }

    public void validateMorePharmacy() {

        String actual = driver.getTitle();
        Assert.assertEquals(actual, "Target : Expect More. Pay Less.");
    }

    /**
     * click on more , pharmacy  and validate the text
     */
    //action method
    public void morePharmacyToolsForCareGiver() {
        morePharmacy();
        scrollDown();

    }

    public void validateMorePharmacyToolsForCareGiver() {
        Assert.assertEquals(footerLogo.isDisplayed(), true);
    }

    /**
     * click on more , whatsNew , and validate the text
     */
    //action method
    public void moreWhatsNew() {
        more.click();
        //click on whatsNew
        timeToBeClickable(10, whatsNew);
        whatsNew.click();
    }

    public void validateMoreWhatsNew() {
        Assert.assertEquals(driver.getCurrentUrl(), urlForMoreWhatsNew);
    }

    /**
     * click on more , whatsNew, Trends , and validate the text
     */
    //action method
    public void MoreWhatsNewTrends() {
        more.click();
        timeToBeClickable(10, whatsNew);
        //click on whatsNew
        whatsNew.click();
        timeToBeClickable(10, whatsNewTrends);
        //select whats New Trends
        whatsNewTrends.isSelected();

        whatsNewTrends.click();
    }

    public void validateMoreWhatsNewTrends() {
        //valideate the url
        Assert.assertEquals(driver.getCurrentUrl(), urlForMoreWhatsNewTrends);
    }

    /**
     * click on more , whatsNew , SpotLight and validate the text
     */
    //action method
    public void MoreWhatsNewSpotLight() {
        //click on more
        more.click();
        timeToBeClickable(10, whatsNew);
        //click on whats new
        whatsNew.click();
        timeToBeClickable(10, whatsNewSpotLight);
        //select whatas new spot light
        whatsNewSpotLight.isSelected();
//        whatsNewSpotLight.click();

    }

    public void validateMoreWhatsNewSpotLight() {
        String actual = whatsNewSpotLight.getText();
        String expected = "Spotlight";
        Assert.assertEquals(actual, expected);

    }

    /**
     * select A Store by giving zipcode and search
     */
    //action method
    public void selectAStore() {
        //click on the store location
        storeLocation.click();
        //enter zipcode
        timeToBeClickable(10, storeLocationZipCode);
        storeLocationZipCode.sendKeys("10454");
        //click enter
        timeToBeClickable(10, searchButtonZipcode);
        searchButtonZipcode.click();
//        storeLocation.sendKeys(Keys.ENTER);


    }

    //validate method
    public void validateSelectAStore() {
        timeToBeClickable(10, harlemLocation);

        Assert.assertEquals(harlemLocation.getText(), "Harlem");
    }

    /**
     * all the things in school
     * click highlight
     * select same day delivery
     * and validate shapie text
     */
//action method
    public void allTheThingsSchool() throws InterruptedException {
        //click on all the things school
        scrollDown();
        sleepFor(5);
        school.click();
        sleepFor(5);
        //timeToBeClickable(10, highLighter);
        //click on highlighter
        wifiAndNetworking.click();
sleepFor(5);
    }

    //validate method
    public void validateAllTheThingsSchool() {
        //validate the text  for  sharpie
        String actualtext= driver.getTitle();
        Assert.assertEquals(actualtext, wifiAndNetworkingTitle);
    }

    /**
     * click on all the things in school
     * scroll down
     * validate  the logo
     */

    public void readyForSchool(){
        //click on all the things school
        school.click();
        //scroll down to the bottom
        scrollDown();
    }
    public void validateReadyForSchool(){
        //validate the logo
        Assert.assertEquals(footerLogo.isDisplayed(),true);
    }

    /**
     * click on all the things in school
     * go to kidsHeadPhone
     * click on jBuddiesHeadPhone
     * validate the title
     */
    //action methpd
    public void kidsHeadPhone() throws InterruptedException {
        //click on all the things school
        timeToBeClickable(5, searchBox);
        searchBox.sendKeys("headphones");
        //click enter
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        sleepFor(5);
        searchBox.submit();
        //calculator click
        sleepFor(5);

        //click on free order pickup
//        delivery.click();
        //click on the desired calculator
        sleepFor(5);
        searchHeadphones.click();
        sleepFor(5);

    }
    //validate method
    public void validateKidsHeadPhone() {
        //validate the title

        Assert.assertEquals(searchHeadphonesHeartSign.isDisplayed(),true);
    }
    /**
     * click on all the things in school
     * go to faceMask
     * click on
     * validate the  current url
     */
    //action methpd
    public void postIt() throws InterruptedException {
        //click on all the things school
        school.click();
        //click on listAssist
        sleepFor(5);
//        timeToBeClickable(10, listAssist);
        listAssist.click();
        //click on post it
        timeToBeClickable(10, postIt);
        postIt.click();

    }
    //validate method
    public void validatePostIt() {
        //validate the current url
        Assert.assertEquals(driver.getCurrentUrl(),postItCurrentUrl);
    }


}
