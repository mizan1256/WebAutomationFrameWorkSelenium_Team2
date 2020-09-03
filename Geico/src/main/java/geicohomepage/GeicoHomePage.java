package geicohomepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static geicohomepage.GeicoHomeWebElement.*;

public class GeicoHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = webElementGeicoLogo_Cls)
    public WebElement logo;

    @FindBy(how = How.XPATH, using = webElementCovidTab)
    public WebElement covid;

    @FindBy(how = How.XPATH, using = autoBox)
    public WebElement auto;

    @FindBy(how = How.XPATH, using = homeSearchButton)
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = homeSearchBox)
    public WebElement searchBox;
    @FindBy(how = How.XPATH, using = homeSearchItemButton)
    public WebElement searchItemButton;
    @FindBy(how = How.XPATH, using = homeSearchItemText)
    public WebElement searchItemText;
    @FindBy(how = How.XPATH, using = autoSearchSite)
    public WebElement searchSite;

    //    Action Method
    public void logoIsDisplayed() throws InterruptedException {
        logo.click();
        Thread.sleep(5000);
    }

    //  Action Method
    public void covidTab() {
        covid.click();
    }

    //  Action Method
    public void autoTab() throws InterruptedException {
        Thread.sleep(5000);
        auto.click();
    }

    //  Action Method
    public void searchButtonCheck() throws InterruptedException {
        searchButton.click();
        Thread.sleep(2000);
        searchBox.sendKeys("Auto");
        Thread.sleep(2000);
        searchItemButton.click();
    }

    // Validate Method
    public void validateSearchButtonCheck(String expectedResult) {
        String actualResult = searchItemText.getText();
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println("PASSED");
    }

    //  Action Method
    public void autoSearchSite() throws InterruptedException {
        searchButtonCheck();
        Thread.sleep(2000);
        searchSite.click();
    }

    // Validate Method
    public void validateAutoSearchSite(String expectedResult) {
        String actualResult = searchItemText.getText();
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println("PASSED");
    }


}
