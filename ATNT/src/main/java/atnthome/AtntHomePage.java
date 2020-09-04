package atnthome;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static atnthome.AtntHomeWebElement.*;

public class AtntHomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = attLogoWebAElement)
    public WebElement attLogo;

    @FindBy(how = How.XPATH, using =  burgerButtonMenuWebElement)
    public WebElement  burgerButtonMenu;

    @FindBy(how = How.XPATH, using = burBtnMenuWirelessButtonWebElement)
    public WebElement burBtnMenuWirelessButton;

    @FindBy(how = How.XPATH, using = exploreWirelessButtonWebElement)
    public WebElement exploreWirelessButton;

    @FindBy(how = How.CSS, using = burBtnAssertTextWebElement)
    public WebElement burBtnAssertText;

    @FindBy(how = How.XPATH, using = searchBoxWebElement)
    public WebElement searchBox;

    @FindBy(how = How.XPATH, using = searchButtonWebElement)
    public WebElement searchButton;

    @FindBy(how = How.XPATH, using = attDealsLinkWebElement)
    public WebElement attDealsLink;

    @FindBy(how = How.XPATH, using = attDealsLinkTextWebElement)
    public WebElement attDealsLinkText;



    public void attLogoIsDisplay(){
        attLogo.isDisplayed();
    }

    /**
     * Att BurgerButton Menu test Action and Validate
     * @throws InterruptedException
     */
    public void attBurgBtnMenuCheck() throws InterruptedException {
        burgerButtonMenu.click();
        Thread.sleep(3000);
       burBtnMenuWirelessButton.click();
       exploreWirelessButton.click();
    }
    public void validateAttBurgBtnMenuCheck(){
        Assert.assertEquals("AT&T Wireless – Latest Phones & Best Wireless Plans", driver.getTitle());
    }

    /**
     * AT&T searchBox check
     */

    public void searchBoxCheck(){
        searchBox.click();
        attDealsLink.click();
    }
    public void validateSearchBoxCheck(){
        Assert.assertEquals("Shop AT&T deals by category",attDealsLinkText.getText() );
    }

}
