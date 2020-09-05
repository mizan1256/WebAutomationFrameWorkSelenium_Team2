package cnnstyle;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static cnnhome.CnnHomePageWebElement.*;
import static cnnhome.CnnHomePageWebElement.expectedSignInCreationXpath;
import static cnnstyle.StyleHomePageWebElement.*;

public class StyleHomePage extends WebAPI {// case 62
    @FindBy(how = How.XPATH, using =styleText_Xpath )
    public WebElement style;
    @FindBy(how = How.XPATH, using =menuBurgerButtonXpath )
    public WebElement burgerButton;
    @FindBy(how = How.XPATH, using =artsTextXpath )
    public WebElement arts;
    @FindBy(how = How.XPATH, using =expectedArtsTextXpath )
    public WebElement expectedArts;

    public void styleToArtsPage() throws InterruptedException {
        style.click();
        burgerButton.click();
        Thread.sleep(1000);
        arts.click();
        Thread.sleep(1000);
    }
    public void validate_StyleToArtsPage() {
        String actualResult ="Arts";
        String expectedResult= expectedArts.getText();
        //System.out.println(driver.getTitle());
        Assert.assertEquals(actualResult, expectedResult);
    }
    //////////////////// case 63

    @FindBy(how = How.XPATH, using =designText_Xpath )
    public WebElement design;

    @FindBy(how = How.XPATH, using =expectedDesignXpath )
    public WebElement expectedDesign;

    public void styleToDesignPage() throws InterruptedException {//
        style.click();
        burgerButton.click();
        Thread.sleep(3000);
        design.click();
        Thread.sleep(3000);
    }
    public void validate_StyleToDesignPage() {
        String actualResult ="Design";
        String expectedResult= expectedDesign.getText();
        Assert.assertEquals(actualResult, expectedResult);
    }
    //////////////////// case 64

    @FindBy(how = How.XPATH, using =fashionTextXpath )
    public WebElement fashion;

    @FindBy(how = How.XPATH, using =expectedFashionXpath )
    public WebElement expectedFashion;

    public void styleToFashionPage() throws InterruptedException {//64
        style.click();
        burgerButton.click();
        Thread.sleep(3000);
        fashion.click();
        Thread.sleep(3000);
    }
    public void validate_StyleToFashionPage() {
        String actualResult ="Fashion";
        String expectedResult= expectedFashion.getText();
        Assert.assertEquals(actualResult, expectedResult);
    }
    //////////////////// case 65

    @FindBy(how = How.XPATH, using =architectureTextXpath )
    public WebElement architecture;

    @FindBy(how = How.XPATH, using =expectedArchitectureXpath )
    public WebElement expectedArchitecture;

    public void styleToArchitecturePage() throws InterruptedException {//65
        style.click();
        burgerButton.click();
        Thread.sleep(3000);
        architecture.click();
        Thread.sleep(3000);
    }
    public void validate_StyleToArchitecturePage() {
        String actualResult ="Architecture";
        String expectedResult= expectedFashion.getText();
        Assert.assertEquals(actualResult, expectedResult);
    }
    //////////////////// case 66

    @FindBy(how = How.XPATH, using =luxuryTextXpath )
    public WebElement luxury;

    @FindBy(how = How.XPATH, using =expectedLuxuryXpath )
    public WebElement expectedLuxury;

    public void styleToLuxuryPage() throws InterruptedException {//66
        style.click();
        burgerButton.click();
        Thread.sleep(3000);
        luxury.click();
        Thread.sleep(3000);
    }
    public void validate_StyleToLuxuryPage() {
        String actualResult ="Luxury";
        String expectedResult= expectedLuxury.getText();
        Assert.assertEquals(actualResult, expectedResult);
    }//////////////////// case 67

    @FindBy(how = How.XPATH, using =beautyTextXpath )
    public WebElement beauty;

    @FindBy(how = How.XPATH, using =expectedBeautyXpath )
    public WebElement expectedBeauty;

    public void styleToBeautyPage() throws InterruptedException {//66
        style.click();
        burgerButton.click();
        Thread.sleep(3000);
        beauty.click();
        Thread.sleep(3000);
    }
    public void validate_StyleToBeautyPage() {
        String actualResult ="Beauty";
        String expectedResult= expectedBeauty.getText();
        Assert.assertEquals(actualResult, expectedResult);
    }


}
