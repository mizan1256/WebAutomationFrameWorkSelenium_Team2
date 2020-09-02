package giftCard;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static giftCard.GiftCardWebElement.*;


public class GiftCard extends WebAPI {

    @FindBy(how = How.XPATH, using = giftCardsXPathWebElement)
    public WebElement giftCards ;
    @FindBy(how = How.XPATH, using = registryXPathWebElement)
    public WebElement registry;
    @FindBy(how = How.XPATH, using = registryFirstNameXPathWebElement)
    public WebElement registryFirstName;
    @FindBy(how = How.XPATH, using = registryLastNameXPathWebElement)
    public WebElement registryLastName;
    @FindBy(how = How.XPATH, using = SearchXPathWebElement)
    public WebElement SearchButton;



    public void timeToBeClickable(int timeInSec, WebElement webElementVariable) {
        WebDriverWait wait = new WebDriverWait(driver, timeInSec);
        wait.until(ExpectedConditions.elementToBeClickable(webElementVariable));

    }


    /**
     * navigate to giftcard and validate the url
     */

    //action method
    public void giftCard(){
        //click on gift card
        giftCards.click();
    }

    //validate Method

    public void validateGiftCard(){
        Assert.assertEquals(driver.getCurrentUrl(),urlForGiftCard);

    }

    /**
     *search a registry for john doe and validate the url at the end
     */

    //action method
    public void registry(){
        //click registry
        timeToBeClickable(10,registry);
        registry.click();
        //enter firstName
        timeToBeClickable(10,registryFirstName);
        registryFirstName.sendKeys("John");
        //enter last name
        timeToBeClickable(10,registryLastName);
        registryLastName.sendKeys("doe");
        timeToBeClickable(10,SearchButton);
        SearchButton.click();

    }

    //validate method
    public void validateRegistry(){
       Assert.assertEquals(driver.getCurrentUrl(),url);
    }







}
