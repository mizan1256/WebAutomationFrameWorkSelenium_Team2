package cnntravel;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static cnnhome.CnnHomePageWebElement.*;
import static cnntravel.CnnTravelWebElement.*;

public class CnnTravelPage extends WebAPI {
////case 57
    @FindBy(how = How.XPATH, using = travelTextXpath)//41
    public WebElement travel;

    @FindBy(how = How.XPATH, using =destinationTextXpath )
    public WebElement destination;

    @FindBy(how = How.XPATH, using =argentinaTextXpath )
    public WebElement argentina;

    @FindBy(how = How.XPATH, using =expectedArgentinaXpath )
    public WebElement expectedArgentina;

    public void travelDestination() throws InterruptedException {
        travel.click();
        Thread.sleep(2000);
        destination.click();
        Thread.sleep(2000);
        argentina.click();
    }
    public void validate_TravelDestination() {
        String actualResult ="Argentina";
        String expectedResult= expectedArgentina.getText();
//        System.out.println(driver.getTitle());
        Assert.assertEquals(actualResult, expectedResult);
    }
    ///////////////// case 58
    @FindBy(how = How.XPATH, using =foodDrinkTextXpath )
    public WebElement foodDrink;

    public void foodDrinkTextXpath() throws InterruptedException {
        travel.click();
        Thread.sleep(2000);
        foodDrink.click();
        Thread.sleep(2000);

    }
    public void validateFoodDrinkTextXpath() {
        String actualResult ="Food & Drink | CNN Travel";
        String expectedResult= driver.getTitle();
//      System.out.println(driver.getTitle());
        Assert.assertEquals(actualResult, expectedResult);
    }
    ///////////////// case 59
    @FindBy(how = How.XPATH, using =newsTextXpath )
    public WebElement news;

    public void newsTextClickable() throws InterruptedException {
        travel.click();
        Thread.sleep(2000);
        news.click();
        Thread.sleep(2000);
    }
    public void validateNewsTextClickable() {
        String actualResult ="Travel News | CNN Travel";
        String expectedResult= driver.getTitle();
//      System.out.println(driver.getTitle());
        Assert.assertEquals(actualResult, expectedResult);
    }
    ///////////////// case 60.travel.stay
    @FindBy(how = How.XPATH, using =stayTextXpath )
    public WebElement stay;

    public void stayTextClickable() throws InterruptedException {
        travel.click();
        Thread.sleep(2000);
        stay.click();
        Thread.sleep(2000);
    }
    public void validateStayTextClickable() {
        String actualResult ="Places to Stay | CNN Travel";
        String expectedResult= driver.getTitle();
//      System.out.println(driver.getTitle());
        Assert.assertEquals(actualResult, expectedResult);
    }
    ///////////////// case 61.travel.video.play button

    @FindBy(how = How.XPATH, using =videoTextClass )
    public WebElement video;

    @FindBy(how = How.XPATH, using =watchNowXpath )
    public WebElement playIcon;

    public void videoPlayable() throws InterruptedException {//61
        travel.click();
        Thread.sleep(3000);
        video.click();
        Thread.sleep(4000);
        //playIcon.click();
    }
    public void validateVideoPlayable() {
        String actualResult ="Places to Stay | CNN Travel";
        String expectedResult= driver.getTitle();
     System.out.println(driver.getTitle());
        Assert.assertEquals(actualResult, expectedResult);
    }
}
