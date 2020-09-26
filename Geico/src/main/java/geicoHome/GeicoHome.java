package geicoHome;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static geicoHome.GeicoHomeWebElement.*;
public class GeicoHome extends WebAPI {
    @FindBy(how = How.XPATH, using = loginXPathWebElement)
    public WebElement login;
    @FindBy(how = How.XPATH, using = weNeedAddressTextXPathWebElement)
    public WebElement weNeedAddressText;
    @FindBy(how = How.XPATH, using = WrongAddressTextXPathWebElement)
    public WebElement WrongAddressText;
    @FindBy(how = How.XPATH, using = saveTextXPathWebElement)
    public WebElement saveText;
    @FindBy(how = How.XPATH, using = loginErrorTextXPathWebElement)
    public WebElement loginErrorText;
    public void zipCode() {
        typeOnElement(zipCodeEnterXPathWebElement, "80546");
        clickByXpath(zipCodeSubmitXPathWebElement);
        clickByXpath(nextButtonXPathWebElement);

    }

    //validate
    public void verifyZipcode() {
        String actual = saveText.getText();
        Assert.assertEquals(actual, saveTextVerify);
    }

    //action method
    public void exploreZipcode() throws InterruptedException {
        zipCode();

        typeByXpath(monthXPathWebElement, "01");
        typeByXpath(dayXPathWebElement, "01");
        typeByXpath(yearXPathWebElement, "2000");
        clickByXpath(nextButtonXPathWebElement);

        typeByXpath(firstNameXPathWebElement, "Yeasmin");
        typeByXpath(LastNameXPathWebElement, "Jaman");
        clickByXpath(nextButtonXPathWebElement);
        sleepFor(5);
    }
    //validate

    public void verifyExploreZipcode() {
        String actual = weNeedAddressText.getText();
        Assert.assertEquals(actual, "We need your address in Denver, CO (80546).");
    }

    //action method
    public void explore() throws InterruptedException {
        exploreZipcode();
//        clearField(addressXPathWebElement);
        typeOnElement(addressXPathWebElement, "385 Denver");
        typeOnElement(aptXPathWebElement, "1f");
        clickByXpath(nextButtonXPathWebElement);
    }

    public void verifyExplore() {
        String actual = WrongAddressText.getText();
        Assert.assertEquals(actual, "We need your address in Denver, CO (80746).");
    }

    //action method
    public void covid19Update() {
        clickByXpath(covid19UpdateXPathWebElement);
    }

    public void verifyCovid19Update() {
        Assert.assertEquals(driver.getTitle(), "COVID-19: GEICO is Here to Help | GEICO");
    }

    //action method
    public void giveBack() {
        covid19Update();
        clickByXpath(geicoGiveBackXPathWebElement);
        clickByXpath(geicoGiveBack6MonthsXPathWebElement);
        clickByXpath(calenderXPathWebElement);
        clickByXpath(calenderdateXPathWebElement);
        typeByXpath(premiumXPathWebElement, "12000000");
        clickByXpath(calculateXPathWebElement);

    }

    public void verifyGiveBack() {
        Assert.assertEquals(driver.getTitle(),"The GEICO Giveback Credit Estimator | GEICO");
    }
}
