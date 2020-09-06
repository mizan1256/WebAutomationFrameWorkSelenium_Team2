package cnnhome;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static cnnhome.CnnHomePageWebElements.*;

public class CnnHome extends WebAPI {

    //set location
    @FindBy(how = How.XPATH, using = WebElementXpathSetZipCode)
    public WebElement zipCode;
    @FindBy(how = How.XPATH, using = WebElementXpathSetLocation)
    public WebElement setLocation;
    //click on us
    @FindBy(how = How.XPATH, using = WebElementXpathUs)
    public WebElement us;
    //the latest us stories
    @FindBy(how = How.XPATH, using = WebElementXpathUsLatestStories)
    public WebElement latestUsStories;
    //logo is displayed
    @FindBy(how = How.XPATH, using = WebElementXpathLogoIsDisplayed)
    public WebElement logs;
    //registration
    @FindBy(how = How.XPATH, using = webElementSignUp)
    public WebElement signUp;
    @FindBy(how = How.XPATH, using = webElementSignUpEmail)
    public WebElement email;
    @FindBy(how = How.XPATH, using = webElementSignUpPassword)
    public WebElement passWord;
    @FindBy(how = How.XPATH, using = webElementSignUpZipcode)
    public WebElement getZipCode;
    @FindBy(how = How.XPATH, using = webElementRegistrationButton)
    public WebElement sub;
    @FindBy(css = menuBoxWebElement)public WebElement menuBox;
    @FindBy(xpath = headerSearchBarWebElement)public WebElement headerSearch;
    @FindBy(className = buttonSearchBarWebElement)public WebElement searchButton;
    @FindBy(xpath = USNewsLinkBarWebElement)public WebElement USNewsLink;
    @FindBy(xpath = USNewsLinkTopNewsBarWebElement)public WebElement USNewsLinkTopNews;
    @FindBy(xpath = videosLinkWebElements)public WebElement videosLink;
    @FindBy(xpath = videosLinkSelectedWebElements)public WebElement selectedvideoLink;
    @FindBy(css = userAccountButtonWebElement)public WebElement userAcc;
    @FindBy(xpath = emailWebElement)public WebElement email1;
    @FindBy(xpath = passwordWebElement)public WebElement password;
    @FindBy(xpath = CNNLogoWebElement)public WebElement CNNLogo;

    /**
     * Test Case:1
     * validate set location
     * open the browser
     * navigate to the url
     * enter the zip code in zipcode field
     * click on search button
     * verify that you are on correct page
     */

    //Action Method
    public void setLocationCheck() {
        zipCode.sendKeys("80227");
        setLocation.click();
    }

    // Validate Method
    public void validateLocationSearch() {
        String actualResult = driver.getTitle();
        String expectedResult = "Register for a CNN account";
        Assert.assertEquals(actualResult, expectedResult, "Test fail");
    }

    /**
     * Test Case:2
     * validate us is clickable
     * open the browser
     * navigate to the url
     * click on us
     * verify that you are on correct page
     */
    //Action Method
    public void usIsClickable() {
        us.click();
    }

    // Validate Method
    public void validateUsLink() {
        String actualResult = driver.getTitle();
        String expectedResult = "US News – Top national stories and latest headlines - CNN";
        Assert.assertEquals(actualResult, expectedResult, "Test fail");
    }
    /**
     * Test Case:3
     * validate the latest Us stories
     * open the browser
     * navigate to the url
     * click on us
     * click on the latest us stories
     * verify that you are on correct page
     */
    //Action Method
    public void verifyTheLatestUsStories() {
        us.click();
        latestUsStories.click();
    }

    // Validate Method
    public void validateLatestUsStories() {
        String actualResult = driver.getTitle();
        String expectedResult = "Latest News - CNN";
        Assert.assertEquals(actualResult, expectedResult, "Test fail");
    }
    /**
     * Test Case:4
     * validate us is clickable
     * open the browser
     * navigate to the url
     * click on logo
     * verify that you are on correct page
     */
    //Action Method
    public void logoIsDisplayed(){
        logs.click();
    }
    //Validation Method
    public void validateLogoIsDisplayed(){
        System.out.println(driver.getTitle());
        Assert.assertEquals("CNN - Breaking News, Latest News and Videos", driver.getTitle());
    }
    /**
     * Test Case:5
     * validate the registration page
     * open the browser
     * navigate to the url
     * enter email in email field
     * enter password in password field
     * enter zip code
     * click on sign up button
     * verify that you are on correct page
     */

    public void verifyRegistration() throws InterruptedException {
        signUp.click();
        Thread.sleep(3000);
        signUp.click();
        Thread.sleep(3000);
        email.sendKeys("yeasmin@gmail.com");
        passWord.sendKeys("abcd1234");
        zipCode.sendKeys("80227");
        sub.click();
    }

    public void validateRegistration() {
        System.out.println(driver.getTitle());

    }

    public void menuBoxGenerating(){
        menuBox.click();
    }
    public void headerSearchBox(String searchItem){
        headerSearch.sendKeys(searchItem);
    }
    public void clickSearchButton(){ headerSearch.sendKeys(Keys.ENTER); }
    public void USNewsLink(){
        USNewsLink.click();
    }
    public void USTopNews(){
        USNewsLinkTopNews.click();
    }
    public void videoLink(){
        videosLink.click();
    }
    public void videoSelectedLink(){
        selectedvideoLink.click();
    }
    public void userACC(){userAcc.click();}
    public void emailLogin(String emailLog){email.sendKeys(emailLog);}
    public void passwordAdd(String pass){ password.sendKeys(pass);}

    public void menuSearch() throws InterruptedException {
        menuBoxGenerating();
        sleepFor(2);
    }
    public void validateMenu(){
        String actual=menuBox.getText();
        Assert.assertEquals(actual,"","Test fail");
    }
    public void menuSearchForItem() throws InterruptedException {
        menuBoxGenerating();
        headerSearchBox("Donald Trump");
    }
    public void menuSearchForItemAndClick() throws InterruptedException {
        menuBoxGenerating();
        headerSearchBox("Donald Trump");
    }
    public void USTopNewsOfToday() throws InterruptedException {
        USNewsLink();
        sleepFor(2);
        USTopNews();
    }
    public void VideoLinksButton() throws InterruptedException {
        videoLink();
        videoSelectedLink();
        sleepFor(10);
    }

    public void userAccDetails() throws InterruptedException {
        userACC();
        emailLogin("yeasmin@gamin.com");
        passwordAdd("abcd1234");
    }

    public void userACCFromExcel(String login, String password){
        userACC();
        emailLogin(login);
        passwordAdd(password);

    }
//    public void windowScroll(){
//        scrollUpDownByHeight();
//    }
    public void validatingCNNLogo(){
        String actual=CNNLogo.getText();
        Assert.assertEquals(actual,"","not successful");
    }

}
