package tdBankHome;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static tdBankHome.TDBankHomeWebElement.*;
public class TDBankHome extends WebAPI{
    @FindBy(how = How.XPATH, using = loginXpathWebElement)
    public WebElement login;
    @FindBy(how = How.XPATH, using = loginErrorMessageXpathWebElement)
    public WebElement loginErrorMessage;
    @FindBy(how = How.XPATH, using = PPPForgivenessText)
    public WebElement PPPForgivenessTextVerify;


    //test 1:
    //action method
    public void login() throws InterruptedException {
        clickByXpath(loginXpathWebElement);
        sleepFor(5);
        typeByXpath(userNameXpathWebElement, "acjivqpofjpqocq121");
        sleepFor(5);
        typeByXpath(PasswordXpathWebElement, "123k41ig$#21");
        clickByXpath(loginButtonXpathWebElement);
    }

    //validate method
    public void testLogin() {
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, "TD Bank Online Banking");
    }

    //test 2:
    //action method
    public void smallBusiness() throws InterruptedException {
        clickByXpath(smallBusinessXpathWebElement);
        sleepFor(5);
        //click checking
        clickByXpath(checkingXpathWebElement);
    }

    //validate method
    public void verifySmallBusiness() {
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, "Open A Small Business Checking Account – TD Bank");
    }


    //test 3:
    //action method
    public void productsOption() throws InterruptedException {
        sleepFor(5);
        //hover your mouse to the products
        mouseHoverByXpath(productsXpathWebElement);
//        WebElement searchBtn = driver.findElement(By.xpath(productsCheckingXpathWebElement));
//        Actions action = new Actions(driver);
//        action.moveToElement(searchBtn).perform();
        sleepFor(5);

    }

    //validate method
    public void verifyProductsOption() {
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, "TD Personal Banking, Loans, Cards & More | TD Bank");

    }

    //test 4:
    //action method

    public void clickCommercial() throws InterruptedException {
        //click commercial
        clickByXpath(commercialXpathWebElement);
        sleepFor(5);
        clickByXpath(commercialLearnMoreXpathWebElement);
        sleepFor(5);
        //click on ppp forgiveness
        clickByXpath(PPPForgivenessXpathWebElement);
        sleepFor(5);
    }
    //validate method

    public void verifyClickCommercial() {
        String actualText = PPPForgivenessTextVerify.getText();
        String expectedText = "Paycheck Protection Program (PPP) Loan Forgiveness";
        Assert.assertEquals(actualText, expectedText);
    }


    //test 5:
    public void ExplorePersonal() throws InterruptedException {
        //click checking
        clickByXpath(checkingXpathWebElement);
        sleepFor(5);
        clickByXpath(beyondCheckingXpathWebElement);
        sleepFor(5);
        clickByXpath(boxXpathWebElement);
        sleepFor(5);
        clickByXpath(boxNYXpathWebElement);
        sleepFor(5);
        clickByXpath(boxCityXpathWebElement);
        sleepFor(5);
        //click on the city search box
        clickByXpath(boxCityChooseXpathWebElement);
        sleepFor(5);
    }
    //validate method
    public void verifyExplorePersonal(){
        String actual=driver.getTitle();
        Assert.assertEquals(actual,"TD Beyond Checking");
    }

}
