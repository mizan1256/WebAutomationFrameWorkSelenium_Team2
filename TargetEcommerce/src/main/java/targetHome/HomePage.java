package targetHome;

import common.WebAPI;
import datadriven.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static targetHome.HomePageWebElements.*;


public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = webElementCssSearchBox)
    public WebElement searchBox;
    //  @FindBy(how = How.CSS, using=webElementCssSearchButton)
    // public WebElement searchButton;
    @FindBy(how = How.XPATH, using = webElementSearchText)
    public WebElement searchText;
    @FindBy(how = How.XPATH, using = webElementXPathCategories)
    public WebElement categories;
    @FindBy(how = How.XPATH, using = webElementXPathGroceries)
    public WebElement grocery;
    @FindBy(how = How.XPATH, using = webElementXPathExplore)
    public WebElement explore;
    @FindBy(how = How.XPATH, using = webElementText)
    public WebElement text;
    @FindBy(how = How.XPATH, using = webElementSignIn)
    public WebElement signIn;
    @FindBy(how = How.XPATH, using = webElementSignInDropDown)
    public WebElement signInDropDown;
    @FindBy(how = How.XPATH, using = webElementSignInUserName)
    public WebElement username;
    @FindBy(how = How.XPATH, using = webElementSignInPassWord)
    public WebElement passWord;
    @FindBy(how = How.XPATH, using = webElementSignInButton)
    public WebElement signInButton;
    //Registry
    @FindBy(how = How.XPATH, using = webElementXpathRegistry)
    public WebElement registry;
    @FindBy(how = How.XPATH, using = webElementXpathRegistryText)
    public WebElement registryText;
    @FindBy(how = How.XPATH, using = webElementXPathBabyRegistry)
    public WebElement babyRegistry;
    @FindBy(how = How.XPATH, using = webElementXpathJoin)
    public WebElement join;
    @FindBy(how = How.XPATH, using = webElementXPathClose)
    public WebElement close;


    //WeeklyAdd
    @FindBy(how = How.XPATH, using = webElementXPathWeeklyAdd)
    public WebElement weeklyAdd;
    @FindBy(how = How.XPATH, using = getWebElementXPathWeeklyAddText)
    public WebElement weeklyAddText;

    //house hold essentials
    @FindBy(how = How.XPATH, using = webElementXPathCategorie)
    public WebElement categories1;
    @FindBy(how = How.XPATH, using = webElementXPathHouseHold)
    public WebElement houseHoldEssential;
    @FindBy(how = How.XPATH, using = webElementXPathExplores)
    public WebElement explore1;
    @FindBy(how = How.XPATH, using = webElementXPathText)
    public WebElement verifyText;

    //deals
    @FindBy(how = How.XPATH, using = webElementsDeals)
    public WebElement deals;
    @FindBy(how = How.XPATH, using = WebElementsTopDeals)
    public WebElement topDeals;
    @FindBy(how = How.XPATH, using = GetWebElementsTopDealsText)
    public WebElement topDealsText;
    @FindBy(how = How.XPATH, using = WebElementsClothes)
    public WebElement clothes;
    //shopping cart
    @FindBy(how = How.XPATH, using = WebElementsCart)
    public WebElement shoppingCart;
    //find store
    @FindBy(how = How.XPATH, using = WebElementXpathFindStore)
    public WebElement findStore;
    //orders
    @FindBy(how = How.XPATH, using = WebElementXpathOrders)
    public WebElement orders;
    //click select store
    @FindBy(how = How.XPATH, using = WebElementXpathSelectStore)
    public WebElement selectStore;
    //Zip
    @FindBy(how = How.XPATH, using = WebElementXpathZipCode)
    public WebElement zipCode;
    //set as my store
    @FindBy(how = How.XPATH, using = WebElementXpathSearch)
    public WebElement search;
    @FindBy(how = How.XPATH, using = WebElementXpathSetAsMyStore )
    public WebElement setAsMyStore;
    //gift card
    @FindBy(how = How.XPATH, using =WebElementXpathGiftCard )
    public WebElement giftCard;
    //gift card for school
    @FindBy(how = How.XPATH, using =WebElementXpathGiftCardForSchool)
    public WebElement giftCardForSchool;
    //choose back to class gift card
    @FindBy(how = How.XPATH, using =WebElementXpathBackToClass)
    public WebElement chooseBackToClass;
    //add to cart
    @FindBy(how = How.XPATH, using =WebElementXpathAddToCart)
    public WebElement addToCart;
    //choose google play gift card
    @FindBy(how = How.XPATH, using =WebElementXpathGooglePlay)
    public WebElement googlePlay;
    //Target logo
    @FindBy(how = How.XPATH, using =WebElementXpathTargetLogo)
    public WebElement targetLogo;
    //red cards
    @FindBy(how = How.XPATH, using =WebElementXpathRedCards)
    public WebElement redCards;
    @FindBy(how = How.XPATH, using =WebElementXpathRedCardsDisplay)
    public WebElement redCardsDisplayed;
    //manage red cards
    @FindBy(how = How.XPATH, using =WebElementXpathManageRedCards)
    public WebElement manageRedCards;
    //red card exclusive
    @FindBy(how = How.XPATH, using =WebElementXpathRedCardExclusive)
    public WebElement exclusive;
    //target circle offer
    @FindBy(how = How.XPATH, using =WebElementXpathTargetCircleOffer)
    public WebElement targetCircleOffer;
    @FindBy(how = How.XPATH, using =WebElementXpathTargetCircleOfferText)
    public WebElement circleOfferText;
    //offer by categories all
    @FindBy(how = How.XPATH, using =WebElementXpathOfferByCategoriesAll)
    public WebElement offerByCategoriesAll;
    //same day delivery
    @FindBy(how = How.XPATH, using =WebElementXpathSameDayDelivery)
    public WebElement sameDayDelivery;
    //All things school
    @FindBy(how = How.XPATH, using =WebElementXpathAllThingsSchool)
    public WebElement allThingsSchool;
    //click on note book
    @FindBy(how = How.XPATH, using =WebElementXpathNoteBook)
    public WebElement noteBook;
    @FindBy(xpath = "//input[@id='search']")
    WebElement searchF;






    /**
     * Test Case:1
     * @param searchItem
     * open the browser
     * navigate to the url
     * enter iphone on search field
     * click on search button
     * verify that you are on correct page
     */

    //Action Method
    public void searchBoxCheck(String searchItem) {
        searchBox.clear();
        searchBox.sendKeys(searchItem);
        searchBox.submit();
    }

    // Validate Method
    public void validateSearchText() {
        String actualResult = driver.getTitle();
        String expectedResult = "Target : Expect More. Pay Less.";
        Assert.assertEquals(actualResult, expectedResult, "Search Item not match ");
    }

    /**
     * Test Case:2
     * open the browser
     * navigate to the url
     * click on sign in
     * click on sign in from the dropdown
     * enter the username in the username field
     * enter the password in the password filed
     * click on sign in
     */


    public void verifySignIn() {
        WebDriverWait expWait = new WebDriverWait(driver, 10);

        expWait.until(ExpectedConditions.elementToBeClickable(signIn));
        signIn.click();
        signInDropDown.click();
        username.sendKeys("Yeasmin Jaman");
        passWord.sendKeys("abcd1234");
        signInButton.click();
    }

    public void validateSignInPage() {
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);
        String expectedTitle = "Target Login";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    /**
     * Test Case:3
     * open the browser
     * click on url
     * click on categories menu
     * click on grocery from the categories drop down
     * click on explore
     * validate the correct page or not
     */

    public void navigateToGroceries() {
        categories.click();
        grocery.click();
        explore.click();
        System.out.println(driver.getTitle());
    }

    public void validateGrocery() {
        String actualResult = driver.getTitle();
        String expectedResult = "Target : Expect More. Pay Less.";
        Assert.assertEquals(actualResult, expectedResult, "Test Fail");
    }

    /**
     * Test Case:4
     * Navigate to Shopping Cart
     * 1: Launch chrome browser
     * 2: navigate to www.target.com
     * 3:Click on Shopping cart icon in top right corner
     * 4: Verify sign in page title and match with expected page title
     */

    public void getShoppingCart() {
        WebDriverWait expWait = new WebDriverWait(driver, 10);

        expWait.until(ExpectedConditions.elementToBeClickable(shoppingCart));
        shoppingCart.click();

    }

    public void validateShoppingCart() {
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);
        String expectedTitle = "Target";
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    /**
     * Test Case:5
     * Navigate to find a store
     * open browser
     * navigate to www.target.com
     * click on find a store
     * verify find a store page title match with expected title
     */
    public void navigateFindAStore() {
        findStore.click();
    }

    public void validateFindAStore() {
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);
        String expectedTitle = "Stores Near Me : Target";
        Assert.assertEquals(actualTitle, expectedTitle);
    }


    /**
     * Test Case:6
     * Navigate to find a store
     * open browser
     * navigate to www.target.com
     * click on find a store
     * verify find a store page title match with expected title
     */
    public void navigateToSelectStore() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        selectStore.click();
    }

    public void validateSelectStore() {
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);
        String expectedTitle = "Target : Expect More. Pay Less.";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    /**
     * Test Case:7
     * Navigate to find a store
     * open browser
     * navigate to www.target.com
     * click on find a store
     * enter the zipcode in zipcode field
     * verify find a store page title match with expected title
     */
    public void navigateToZipCode() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        selectStore.click();
        zipCode.sendKeys("80227");
    }

    public void validateZipCode() {
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);
        String expectedTitle = "Target : Expect More. Pay Less.";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    /**
     * Test Case:8
     * Navigate to find a store
     * open browser
     * navigate to www.target.com
     * click on find a store
     * enter the zipcode in zipcode field
     * click on search
     * select your store
     * set as my store
     * verify find a store page title match with expected title
     */
    public void navigateToSetAsMyStore() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        selectStore.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        zipCode.sendKeys("80227");
        search.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        setAsMyStore.click();
    }

    public void validateSetAsMyStore() {
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);
        String expectedTitle = "Target : Expect More. Pay Less.";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    /**
     * Test Case:9
     * Validate to orders
     * Navigate to find a store
     * open browser
     * navigate to www.target.com
     * click on orders
     * verify orders page title match with expected title
     */
    public void navigateToOrders() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        orders.click();
    }

    public void validateOrders() {
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);
        String expectedTitle = "Target Login";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    /**
     * Test Case:10
     * Validate registry
     * open the browser
     * navigate to www.target.com
     * click on registry
     * verify registry text with expected text
     */
    //Click on Registry
    public void navRegistry() {
        registry.click();
    }

    public void validateRegistry() {
        String actualResult = registryText.getText();
        String expectedResult = "GIVE THE PERFECT GIFT";
        Assert.assertEquals(actualResult, expectedResult, "test fail");
    }

    /**
     * Test Case:11
     * Validate registry
     * open the browser
     * navigate to www.target.com
     * click on registry
     * click on baby registry
     * verify registry text with expected text
     */
    public void navBabyRegistry() {
        registry.click();
        babyRegistry.click();
    }


    /**
     * Test Case:12
     * Validate gift card
     * open the browser
     * navigate to www.target.com
     * click on gift card
     * verify gift card page title with expected title
     */


    public void NavigateToGiftCard(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        giftCard.click();
    }

    public void validateGiftCard(){
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);
        String expectedTitle = "Target : Expect More. Pay Less.";
        Assert.assertEquals(actualTitle, expectedTitle);
    }


    /**
     * Test Case:13
     * Validate gift card for school
     * open the browser
     * navigate to www.target.com
     * click on gift card
     * click on gift card for school
     * verify gift card for school page title with expected title
     */


    public void NavigateToGiftCardForSchool(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        giftCard.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        giftCardForSchool.click();
    }

    public void validateGiftCardForSchool(){
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);
        String expectedTitle = "Gift Cards : Target";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    /**
     * Test Case:14
     * Add  back to class gift card at shopping cart
     * open the browser
     * navigate to www.target.com
     * click on gift card
     * click on gift card for school
     * click on choose option for back to class gift card
     * add to cart
     * verify add to cart page title with expected title
     */


    public void chooseBackToClassGiftCard(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        giftCard.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        giftCardForSchool.click();
        chooseBackToClass.click();
        addToCart.click();
    }

    public void validateBackToClassGiftCard(){
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);
        String expectedTitle = "Gift Cards : Target";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    /**
     * Test Case:15
     * Add  google play gift card at shopping cart
     * open the browser
     * navigate to www.target.com
     * click on gift card
     * click on gift card for school
     * click on google play gift card
     * add to cart
     * verify add to cart page title with expected title
     */


    public void addToCartGooglePlayGC(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        giftCard.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        giftCardForSchool.click();
        googlePlay.click();
        addToCart.click();
    }

    public void validateGooglePlayGC(){
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);
        String expectedTitle = "Gift Cards : Target";
        Assert.assertEquals(actualTitle, expectedTitle);
    }


    /**
     * Test Case:16
     * Validate registry
     * open the browser
     * navigate to www.target.com
     * click on registry
     * click on baby registry
     * verify registry text with expected text
     */

    //Click on Join
    public void navToJoin() {
        registry.click();
        babyRegistry.click();
        join.click();

    }

    /**
     * Test Case:17
     * validate weekly add
     * open the browser
     *  navigate to www.target.com
     *  click on weekly add
     *  validate weekly add page text with expected text
     */
    //WeeklyAdd
    public void navWeeklyAdd() {
        weeklyAdd.click();
    }

    public void validateWeeklyAdd() {
        String actualResult = weeklyAddText.getText();
        String expectedText = "Target Weekly Ad";
        Assert.assertEquals(actualResult, expectedText, "Test Fail");
    }
    /**
     * Test Case:18
     * validate household essentials
     * open the browser
     *  navigate to www.target.com
     *  click on categories
     *  click on household essentials
     *  click on essential
     *  validate household essential  page title with expected title
     */
    //household
    public void verifyHouseHoldEssential() {
        categories1.click();
        houseHoldEssential.click();
        explore1.click();

    }

    public void validateHouseHold() {
        String actualResult = driver.getTitle();
        String expectedResult = "Target : Expect More. Pay Less.";
        Assert.assertEquals(actualResult, expectedResult, "Test Fail");
    }

    /**
     * Test Case:19
     * validate top deals
     * open the browser
     *  navigate to www.target.com
     *  click on deals
     *  click on top deals from deals drop down
     *  validate top deals  page title with expected title
     */
    public void verifyTopDeals() throws InterruptedException {
        deals.click();
        Thread.sleep(2000);
        topDeals.click();

    }

    public void validateTopDeals() {
        String actualResult = topDealsText.getText();
        String expectedResult = "Homepage";
        Assert.assertEquals(actualResult, expectedResult, "test fail");
    }
    /**
     * Test Case:20
     * validate top deals
     * open the browser
     *  navigate to www.target.com
     *  click on deals
     *  click on top deals from deals drop down
     *  click on clothes option
     */

    public void clothesIsClickable() {
        deals.click();
        topDeals.click();
        clothes.click();
    }

    /**
     * Test Case:21
     * validate target logo
     * open the browser
     * navigate to www.target.com
     * click on target logo at top left corner
     * validate the logo with expected result
     */

    public void verifyTargetLogo() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        targetLogo.click();

    }

    public void validateTargetLogo() {
        String actualResult = driver.getTitle();
        System.out.println("Page title:" + actualResult);
        String expectedResult = "Target : Expect More. Pay Less.";
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * Test Case:22
     * validate red cards
     * open the browser
     * navigate to www.target.com
     * click on red card
     * validate the red card with expected results
     */
    public void navigateToRedCards(){
        redCards.click();
    }

    public void validateToRedCards(){

        boolean actualResult=redCardsDisplayed.isDisplayed();
        boolean expectedResult=true;
        Assert.assertEquals(actualResult, true,"test fail");
    }

    /**
     * Test Case:23
     * validate manage my red cards
     * open the browser
     * navigate to www.target.com
     * click on red card
     * click on manage my red card
     * validate the manage red card with expected results
     */
    public void verifyManageRedCard(){
        redCards.click();
        manageRedCards.click();
    }
    public void validateManageRedCard(){

        boolean actualResult=manageRedCards.isDisplayed();

        Assert.assertEquals(actualResult, true,"test fail");


    }

    /**
     * Test Case:24
     * open browser
     * navigate to www.target.com
     * click on deals
     * click on red card exclusive from the drop down
     * verify the page title with expected title
     */
    public void redCardExclusive(){
        deals.click();
        exclusive.click();
    }
    public void validateRedCardExclusive(){
        String actualTitle=driver.getTitle();
        String expectedTitle="Target : Expect More. Pay Less.";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    /**
     * validate target circle offers
     * Test Case:26
     * open browser
     * navigate to www.target.com
     * click on deals
     * click on target circle offers
     * verify the page title with expected title
     */
    public void navToTargetCircleOffer(){
        deals.click();
        targetCircleOffer.click();

    }
    public void validateTargetCircleOffer(){
        String actualResult=driver.getTitle();
        String expectedResult="Target Circle™ Offers";
        Assert.assertEquals(actualResult,expectedResult);
    }
    /**
     * validate target circle offers
     * Test Case:27
     * open browser
     * navigate to www.target.com
     * click on deals
     * click on target circle offers
     * click on all under offers by categories
     * verify the page title with expected title
     */
    public void verifyOffersByCategoriesAll(){
        deals.click();
        targetCircleOffer.click();
        offerByCategoriesAll.click();

    }
    public void validateOffersByCategories(){
        String actualResult=driver.getTitle();
        String expectedResult="Target Circle™ Offers";
        Assert.assertEquals(actualResult,expectedResult);
    }

    /**
     * Test Case:28
     * validate same day delivery
     * open browser
     * navigate to www.target.com
     * click on same day delivery
     * verify the page title with expected title
     */
    public void navigateToSameDayDelivery() {
        sameDayDelivery.click();
    }

    public void validateSameDayDelivery() {
        String actualResult = driver.getTitle();
        String expectedResult = "Same Day Delivery : Target";
        Assert.assertEquals(actualResult, expectedResult);
    }
    /**
     * Test Case:29
     * validate all things school is clickable
     * open browser
     * navigate to www.target.com
     * click on all things school
     * verify the page title with expected title
     */
    public void allThingsSchoolClickable() {
        allThingsSchool.click();
    }

    public void validateAllThingsSchool() {
        String actualResult = driver.getTitle();
        String expectedResult ="Target : Expect More. Pay Less.";
        Assert.assertEquals(actualResult, expectedResult);
    }
    /**
     * Test Case:30
     * validate note book clickable
     * open browser
     * navigate to www.target.com
     * click on all things school
     * click on note bool
     * verify the page title with expected title
     */
    public void navigateToNoteBook() {
        allThingsSchool.click();
        noteBook.click();
    }

    public void validateNoteBook() {
        String actualResult = driver.getTitle();
        String expectedResult ="Notebooks & Journals : Target";
        Assert.assertEquals(actualResult, expectedResult);
    }
    /**
     * Search Item Using getItemValue method
     */
    //Action Method
    public void searchBoxCheckUsingGetItemValue() throws InterruptedException {
        List<String> itemList = DataSource.getItemValue();
        for (String st : itemList) {
            searchF.sendKeys(st);
            searchF.submit();
            searchF.clear();
            Thread.sleep(3000);
        }
    }

    //Action Method
    public void searchBoxCheckUsingGetItemsListFromExcel() throws Exception {
        List<String> itemList= DataSource.getItemsListFromExcel();
        for (int i=1; i<itemList.size();i++){
            String item=itemList.get(i);
            searchF.sendKeys(item);
            searchF.submit();
            String expectedResult="\""+item+"\"";
            System.out.println("Expected Result : "+expectedResult);
            String actualResult = searchText.getText();
            System.out.println("Actual Result : "+actualResult);
            Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
            sleepFor(3);
            searchF.clear();
            Thread.sleep(3000);
        }
    }
    public void searchBoxCheckGetItemsListFromDB() throws Exception {
        // Insert Data to a Database table
        DataSource.insertDataIntoDB();
        // Get Data From Database Table
        List<String> itemList= DataSource.getItemsListFromDB();
        for (int i=1; i<itemList.size();i++){
            String item=itemList.get(i);
            searchF.sendKeys(item);
            searchF.submit();
            String expectedResult="\""+item+"\"";
            System.out.println("Expected Result : "+expectedResult);
            String actualResult = searchText.getText();
            System.out.println("Actual Result : "+actualResult);
            Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
            sleepFor(3);
            searchF.clear();
            Thread.sleep(3000);
        }

    }



}
