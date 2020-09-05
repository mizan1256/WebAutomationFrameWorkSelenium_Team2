package cnnhome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static cnnhome.CnnWebElements.*;

public class CnnHome extends WebAPI {

    @FindBy (how = How.XPATH, using = webElementsSignIn) public WebElement SignIn;
    @FindBy (how=How.XPATH, using = webElementsUserName) public WebElement UserName;
    @FindBy (how=How.XPATH, using =  webElementsPassword) public WebElement Password;
    @FindBy (how=How.XPATH, using =  webElementsLogIn) public WebElement LogIn;
    @FindBy (how=How.XPATH, using =  webElementsUsClick) public WebElement UsClick;
    @FindBy (how=How.XPATH, using =  webElementsZipCod) public WebElement ZipCod;
    @FindBy (how=How.XPATH, using =  webElementsSetLocation) public WebElement SetLocation;

    @FindBy (how=How.XPATH, using =  webElementsDropDown) public WebElement DropDown;
    @FindBy (how=How.XPATH, using =  webElementsText) public WebElement Text;
    @FindBy (how=How.XPATH, using =  webElementsSearch) public WebElement Search;
    @FindBy (how=How.XPATH, using =  webElementsBusiness) public WebElement Business;
    @FindBy (how=How.XPATH, using =  webElementsUS) public WebElement US;
    @FindBy (how=How.XPATH, using =  webElementsWorld) public WebElement World;
    @FindBy (how=How.XPATH, using =  webElementsHealth) public WebElement Health;
    @FindBy (how=How.XPATH, using =  webElementsStyle) public WebElement Style;
    @FindBy (how=How.XPATH, using =  webElementsLiveTV) public WebElement LiveTV;
    @FindBy (how=How.XPATH, using =  webElementsPlay) public WebElement Play;
    @FindBy (how=How.XPATH, using =  webElementsVideo) public WebElement Video;

    @FindBy (how=How.XPATH, using =  webElementsSignUP) public WebElement SignUP;
    @FindBy (how=How.XPATH, using =  webElementsSignUpEmail) public WebElement SignUpEmail;
    @FindBy (how=How.XPATH, using =  webElementsSignUpPassword) public WebElement SignUpPassword;
    @FindBy (how=How.XPATH, using =  webElementsSeeSignUpPassword) public WebElement SeeSignUpPassword;
    @FindBy (how=How.XPATH, using =  webElementsSignUpZipCode) public WebElement SignUpZipCode;
    @FindBy (how=How.XPATH, using =  webElementsSignUpRegister) public WebElement SignUpRegister;
    @FindBy (how=How.XPATH, using =  webElementsLogOut) public WebElement LogOut;

    @FindBy (how=How.XPATH, using =  webElementsEditor) public WebElement Editor;
    @FindBy (how=How.XPATH, using =  webElementsInternational) public WebElement International;
    @FindBy (how=How.XPATH, using =  webElementsTrending) public WebElement Trending;
    @FindBy (how=How.XPATH, using =  webElementsFood) public WebElement Food;
    @FindBy (how=How.XPATH, using =  webElementsFoodText) public WebElement FoodText;
    @FindBy (how=How.XPATH, using =  webElementsTravel) public WebElement Travel;
    @FindBy (how=How.XPATH, using =  webElementsTravelText) public WebElement TravelText;

    @FindBy (how=How.XPATH, using =  webElementsSteveNash) public WebElement SteveNash;
    @FindBy (how=How.XPATH, using =  webElementsSteveNashText) public WebElement SteveNashText;





    public void cnnSingIn() throws InterruptedException {
        SignIn.click();
        UserName.sendKeys("arman.hossain496@gmail.com");
        Password.sendKeys("Cnn1234!");
        Thread.sleep(3000);
        LogIn.click();
        Thread.sleep(9000);
        SignIn.click();
        Thread.sleep(3000);
        LogOut.click();
        Thread.sleep(4000);
    }
    public void validateCnnSingIn(){
        System.out.println(driver.getTitle());
        Assert.assertEquals("CNN - Breaking News, Latest News and Videos", driver.getTitle());
    }

    public void cnnUsClick() throws InterruptedException {
        UsClick.click();
        Thread.sleep(2000);
    }
    public void validateWebElementsExpectedText() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("US News – Top national stories and latest headlines - CNN", driver.getTitle());
    }

    public void cnnZipCode() throws InterruptedException {
        ZipCod.sendKeys("11208");
        Thread.sleep(2000);
        SetLocation.submit();
        Thread.sleep(2000);
    }

    public void cnnWebElementsDropDown() throws InterruptedException {
        DropDown.click();
        Text.sendKeys("Sport");
        Thread.sleep(2000);
        Search.submit();
        Business.click();
        Thread.sleep(2000);
    }
    public void validateWebElementsDropDown(){
        System.out.println(driver.getTitle());
        Assert.assertEquals("Search CNN - Videos, Pictures, and News - CNN.com", driver.getTitle());
    }

    public void cnnWebElementsUS() throws InterruptedException {
        DropDown.click();
        Text.sendKeys("Sport");
        Thread.sleep(2000);
        Search.submit();
        US.click();
        Thread.sleep(2000);
    }
    public void validateWebElementsUS(){
        System.out.println(driver.getTitle());
       Assert.assertEquals("Search CNN - Videos, Pictures, and News - CNN.com", driver.getTitle());
    }

    public void cnnWebElementsWorld() throws InterruptedException {
        DropDown.click();
        Text.sendKeys("Sport");
        Thread.sleep(2000);
        Search.submit();
       World.click();
        Thread.sleep(2000);
    }
    public void validateWebElementsWorld() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Search CNN - Videos, Pictures, and News - CNN.com", driver.getTitle());
    }

    public void cnnWebElementsHealth() throws InterruptedException {
        DropDown.click();
        Text.sendKeys("Sport");
        Thread.sleep(2000);
        Search.submit();
        Health.click();
        Thread.sleep(2000);
    }
    public void validateWebElementsHealth() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Search CNN - Videos, Pictures, and News - CNN.com", driver.getTitle());
    }

    public void cnnWebElementsStyle() throws InterruptedException {
        DropDown.click();
        Text.sendKeys("Sport");
        Thread.sleep(2000);
        Search.submit();
        Style.click();
        Thread.sleep(2000);
    }
    public void validateWebElementsStyle() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Search CNN - Videos, Pictures, and News - CNN.com", driver.getTitle());
    }

    public void cnnWebElementsLiveTV() throws InterruptedException {
        LiveTV.click();
        Thread.sleep(2000);
        Play.click();
        Thread.sleep(5000);
    }
    public void validateWebElementsLiveTV() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("CNNgo - CNN.com", driver.getTitle());
    }

    public void cnnWebElementsVideo() throws InterruptedException {
        Video.click();
        Thread.sleep(5000);
    }
    public void validateWebElementsVideo() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("Video News - CNN", driver.getTitle());
    }

    public void cnnSingUP() throws InterruptedException {
        SignIn.click();
        Thread.sleep(2000);
        SignUP.click();
        SignUpEmail.sendKeys("arman.hossain496@gmail.com");
        Thread.sleep(2000);
        SignUpPassword.sendKeys("Cnn1234!");
        Thread.sleep(2000);
        SeeSignUpPassword.click();
        Thread.sleep(2000);
        SignUpZipCode.sendKeys("11208");
        Thread.sleep(2000);
        SignUpRegister.click();
        Thread.sleep(2000);
    }
    public void validateCnnSineUP(){
        System.out.println(driver.getTitle());
        //Assert.assertEquals("CnnHomeTest: test Cnn Sing In", driver.getTitle());

    }

    public void cnnWebElementsEditor() throws InterruptedException {
        Editor.click();
        Thread.sleep(2000);
        International.click();
        Thread.sleep(2000);
    }
    public void validateWebElementsEditor() {
        System.out.println(driver.getTitle());
        Assert.assertEquals("CNN International - Breaking News, US News, World News and Video", driver.getTitle());
    }

    public void cnnWebElementsTrending() throws InterruptedException {
        Trending.click();
        Thread.sleep(2000);
        Food.click();
        Thread.sleep(3000);

    }
    public void validateCnnWebElementsTrending(String expectedResult) throws InterruptedException {
        String actualResult = FoodText.getText();
        Thread.sleep(3000);
        Assert.assertEquals(actualResult, expectedResult, "don't pass");
    }

    public void cnnWebElementsTravel() throws InterruptedException {
        Travel.click();
        Thread.sleep(3000);
    }
    public void validateCnnWebElementsTravel(String expectedResult) throws InterruptedException {
        String actualResult = TravelText.getText();
        Thread.sleep(3000);
        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
    }

    public void cnnWebElementsSteveNash() throws InterruptedException {
        SteveNash.click();
        Thread.sleep(3000);
    }
    public void validateCnnWebElementsSteveNash(String expectedResult) throws InterruptedException {
        String actualResult = SteveNashText.getText();
        Thread.sleep(3000);
        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
    }




}







