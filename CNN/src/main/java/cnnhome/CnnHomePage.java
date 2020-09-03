package cnnhome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static cnnhome.CnnHomePageWebElement.*;


public class CnnHomePage extends WebAPI {


    @FindBy(how = How.XPATH, using = UsText)//33
    public WebElement us;

    @FindBy(how = How.XPATH, using = expectedUsText)//33
    public WebElement expectedUs;


    public void us() throws InterruptedException {// case # 33
        Thread.sleep(3000);
        us.click();

    }

    public void validate_Us() {
        String actualResult = "US";
        Assert.assertEquals(actualResult, expectedUs.getText());
    }
////////////////////////////////case # 34
    @FindBy(how = How.XPATH, using = worldTextXpath)//34
    public WebElement world;

    @FindBy(how = How.XPATH, using = expectedWorldTextXpath)//34
    public WebElement expectedWorld;

    public void world() throws InterruptedException {// case # 34
        Thread.sleep(3000);
        world.click();
    }

    public void validate_World() {
        Assert.assertEquals("World", expectedWorld.getText());
    }
/////////////////// case # 35
    @FindBy(how = How.XPATH, using = politicsTextXpath)
    public WebElement politics;


    public void politics() throws InterruptedException {// case # 35
        Thread.sleep(3000);
        politics.click();

    }

    public void validate_Politics() {
        String actualResult ="CNN - Breaking News, Latest News and Videos";
        String expectedResult= driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult);
    }
    /////////////////// case # 36
    @FindBy(how = How.XPATH, using = businessTextXpath)
    public WebElement business;

    public void business() throws InterruptedException {// case # 36
        Thread.sleep(3000);
        business.click();
    }
    public void validate_Business() {
        String actualResult ="Business News - Latest Headlines on CNN Business - CNN";
        String expectedResult= driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult);
    }
    ////////////////////////////////case # 37
    @FindBy(how = How.XPATH, using = opinionTextXpath)//37
    public WebElement opinion;

    @FindBy(how = How.XPATH, using = expectedOpinionTextXpath)//37
    public WebElement expectedOpinion;

    public void opinion() throws InterruptedException {// case # 37
        Thread.sleep(3000);
        world.click();
    }
    public void validate_Opinion() {
        Assert.assertEquals("Opinion", expectedOpinion.getText());
    }
    ////////////////////////////////case # 38
    @FindBy(how = How.XPATH, using = healthTextXpath)//38
    public WebElement health;

    @FindBy(how = How.XPATH, using = expectedHealthTextXpath)//38
    public WebElement expectedHealth;

    public void health() throws InterruptedException {// case # 38
        Thread.sleep(3000);
        health.click();
    }
    public void validate_Health() {
        Assert.assertEquals("health", expectedHealth.getText());
    }
    ////////////////////////////////case # 39
    @FindBy(how = How.XPATH, using = entertainmentTextXpath)//39
    public WebElement entertainment;

    @FindBy(how = How.XPATH, using = expectedEntertainmentTextXpath)//39
    public WebElement expectedEntertainment;

    public void entertainment() throws InterruptedException {// case # 39
        Thread.sleep(3000);
        entertainment.click();
    }
    public void validate_Entertainment() {
        Assert.assertEquals("Entertainment", expectedEntertainment.getText());
    }
    ////////////////////////////////case # 40
    @FindBy(how = How.XPATH, using = styleTextXpath)//40
    public WebElement style;

    @FindBy(how = How.XPATH, using = expectedStyleTextXpath)//40
    public WebElement expectedStyle;

    public void style() throws InterruptedException {// case # 40
        Thread.sleep(3000);
        style.click();
    }
    public void validate_Style() {
        Assert.assertEquals("style", expectedStyle.getText());
    }
    ////////////////////////////////case # 41
    @FindBy(how = How.XPATH, using = travelTextXpath)//41
    public WebElement travel;

    @FindBy(how = How.XPATH, using = expectedTravelTextXpath)//41
    public WebElement expectedTravel;

    public void travel() throws InterruptedException {// case # 41
        Thread.sleep(3000);
        travel.click();
    }
    public void validate_Travel() {
        Assert.assertEquals("travel", expectedTravel.getText());
    }
    /////////////////// case # 42
    @FindBy(how = How.XPATH, using = sportsTextXpath)
    public WebElement sports;

    public void sports() throws InterruptedException {// 42
        Thread.sleep(3000);
        sports.click();
    }
    public void validate_Sports() {
        String actualResult ="Bleacher Report | Sports. Highlights. News. Now.";
        String expectedResult= driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult);
    }
    /////////////////// case # 43
    @FindBy(how = How.XPATH, using = videosTextXpath)
    public WebElement videos;
    @FindBy(how = How.XPATH, using = expectedVideosTextXpath)
    public WebElement expectedVideos;

    public void videos() throws InterruptedException {// 43
        Thread.sleep(3000);
        videos.click();
    }
    public void validate_Videos() {
        String actualResult ="Videos";
        String expectedResult= expectedVideos.getText();
        Assert.assertEquals(actualResult, expectedResult);
    }
    ///////////////////// case# 44
    @FindBy(how = How.XPATH, using = liveTvXpath)
    public WebElement liveTv;

    public void liveTvXpath() throws InterruptedException {// 43
        Thread.sleep(3000);
        liveTv.click();
    }
    public void validate_LiveTvXpath() {
        String actualResult ="CNNgo - CNN.com";
        String expectedResult= driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult);
    }
    ///////////////////// case# 45
    @FindBy(how = How.XPATH, using = editionTextXpath)
    public WebElement editionButton;
    @FindBy(how = How.XPATH, using = internationalTextXpath)
    public WebElement international;

    public void editionButton() throws InterruptedException {// 43
        Thread.sleep(3000);
        editionButton.click();
        Thread.sleep(3000);
        international.click();
    }
    public void validate_EditionButton() {
        String actualResult ="CNN International - Breaking News, US News, World News and Video";
        String expectedResult= driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult);
    }
    ///////////////////// case# 46

    @FindBy(how = How.XPATH, using = arabicTextXpath)
    public WebElement arabic;
    @FindBy(how = How.XPATH, using = expectedArabicTextXpath)
    public WebElement expectedArabic;


    public void arabic() throws InterruptedException {// 46
        Thread.sleep(3000);
        editionButton.click();
        Thread.sleep(3000);
        arabic.click();
    }
    public void validate_Arabic() {
        String actualResult ="صفحات خاصة";
        String expectedResult= expectedArabic.getText();
        Assert.assertEquals(actualResult, expectedResult);
    }
    ///////////////////// case# 47
    @FindBy(how = How.XPATH, using = cnnLogoXpath)
    public WebElement cnnLogo;

    public void cnnLogo() throws InterruptedException {// 47
        Thread.sleep(3000);
        cnnLogo.click();
    }
    public void validate_CnnLogo() {
        String actualResult ="CNN - Breaking News, Latest News and Videos";
        String expectedResult= driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult);
    }
    ///////////////////// case# 48
    @FindBy(how = How.XPATH, using = espanolTextXpath)
    public WebElement espanol;

    public void espanolTextXpath() throws InterruptedException {// 47
        editionButton.click();
        Thread.sleep(3000);
        espanol.click();
    }
    public void validate_EspanolTextXpath() {
        String actualResult ="Últimas noticias en español | CNN en Español – Últimas noticias en español de Latinoamérica, Estados Unidos y el mundo";
        String expectedResult= driver.getTitle();
        //System.out.println(driver.getTitle());
        Assert.assertEquals(actualResult, expectedResult);
    }
/////////////////////////// case# 50

    @FindBy(how = How.XPATH, using =signInLogoXpath )
    public WebElement signInLogo;
    @FindBy(how = How.XPATH, using =signInTextXpath )
    public WebElement signInText;
    @FindBy(how = How.XPATH, using =emailAddressBoxXpath )
    public WebElement emailAddress;
    @FindBy(how = How.XPATH, using =passwordBoxXpath )
    public WebElement password;
    @FindBy(how = How.XPATH, using =zipCodeBoxXpath )
    public WebElement zipCode;
    @FindBy(how = How.XPATH, using =registerButtonXpath )
    public WebElement register;
    @FindBy(how = How.XPATH, using =expectedSignInCreationXpath )
    public WebElement expectedSignIN;

    public void signInCreation(){
        signInLogo.click();
        signInText.click();
        emailAddress.click();
        emailAddress.clear();
        emailAddress.sendKeys("jonhossn@gmail.com");
        password.click();
        password.clear();
        password.sendKeys("Dhaka1219!");
        zipCode.click();
        zipCode.clear();
        zipCode.sendKeys("11435");
        register.click();

    }
    public void validate_signInCreation() {
        String actualResult ="This account already exists. Please log in.";
        String expectedResult= expectedSignIN.getText();
        //System.out.println(driver.getTitle());
        Assert.assertEquals(actualResult, expectedResult);
    }

}
