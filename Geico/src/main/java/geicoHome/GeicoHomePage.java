package geicoHome;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static geicoHome.GeicoHomePageWebElement.*;

public class GeicoHomePage extends WebAPI {
    @FindBy(how = How.XPATH, using =geicoLogoWebElement)
    public WebElement geicoLogo;

    public void geicoLogoIsDisplay(){
        geicoLogo.isDisplayed();
        System.out.println("Geico logo is displayed: "+ geicoLogo.isDisplayed());
    }

    public void makeAPaymentButton() throws InterruptedException {
        clickOnElement(makeAPaymentWebElement);
        Thread.sleep(3000);
    }
    public void validateMakeAPaymentButton(String expectedResult){
        String actualResult= getTextByXpath(expressServiceWebElement);
        Assert.assertEquals(actualResult,expectedResult,"Text do not match.");
    }
    public void makePaymentCheck() throws InterruptedException {
        makeAPaymentButton();
        clickOnElement(pleaseSelectFieldWebElement);
        Select select=new Select(driver.findElement(By.xpath("//select[@id='SelectComponent-1']")));
        select.selectByIndex(0);
        Thread.sleep(3000);
        typeOnElement(phoneNumberFieldWebElement,"7186901256");
        Thread.sleep(3000);
        typeOnElement(zipCodeWebElement,"11432");
        Thread.sleep(3000);
        clickOnElement(continueButtonWebElement);

    }


}
