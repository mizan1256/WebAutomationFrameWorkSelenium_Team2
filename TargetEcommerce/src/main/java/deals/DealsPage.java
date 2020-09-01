package deals;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import timeUtility.TimeUtil;

import static deals.DealsPageWebElements.*;

public class DealsPage extends WebAPI {

    //@FindBy Annotations
    @FindBy(xpath = WebEleDealsBtn_Xp)
    WebElement dealsBtn;

    @FindBy(xpath = WebEleClearanceLink_Xp)
    WebElement clearanceLink;

    @FindBy(xpath = WebEleClearancePageText_Xp)
    WebElement clearancePageText;

    @FindBy(xpath = WebEleWeeklyAdLink_Xp)
    WebElement weeklyAdLink;

    @FindBy(xpath = WebEleTopDealsLink_Xp)
    WebElement topDealsLink;

    @FindBy(xpath = WebEleTopDealsPageText_Xp)
    WebElement topDealsPageText;

    @FindBy(xpath = WebEleRedCardExclusiveLink_Xp)
    WebElement RedCardExclusiveLink;

    @FindBy(xpath = WebEleRedCardPageText_Xp)
    WebElement RedCardPageText;

    @FindBy(xpath = WebEleTargetCircleOffersLink_Xp)
    WebElement targetCircleOffersLink;

    @FindBy(xpath = WebEleTargetCircleOffersPageText_Xp)
    WebElement targetCircleOffersPageText;


    //Action Methods
    public void checkClearancePage() {
        dealsBtn.click();
       TimeUtil.waitFor(3000);
        clearanceLink.click();
    }

    public void checkWeeklyAdPage() {
        dealsBtn.click();
        TimeUtil.waitFor(2000);
        weeklyAdLink.click();
    }


    public void checkTopDeals() {
        dealsBtn.click();
        TimeUtil.waitFor(2000);
        topDealsLink.click();
    }

    public void checkRedCardPage() {
        dealsBtn.click();
        TimeUtil.waitFor(2000);
        RedCardExclusiveLink.click();
    }

    public void checkTargetCircleOffers() {
        dealsBtn.click();
        TimeUtil.waitFor(2000);
        targetCircleOffersLink.click();
    }



    //Validate Method
    public void validateClearancePage() {
        String clearancePageActualText = clearancePageText.getText();
        Assert.assertTrue(true, clearancePageActualText);
    }

    public void validateWeeklyAdPage() {
        String weeklyAdPageActTitle = driver.getTitle();
        String weeklyAdPageExpTitle = "Weekly Deals In Stores Now : Target Weekly Ad";
        Assert.assertEquals(weeklyAdPageActTitle, weeklyAdPageExpTitle, "Title doesn't match");
    }

    public void validateTopDealsPage() {
        String actualText = topDealsPageText.getText();
        String expectedText = "Top Deals";
        Assert.assertEquals(actualText,expectedText,"Page Text doesn't match");

    }

    public void validateRedCardPage() {
        String actualText = RedCardPageText.getText();
        String expectedText = "RedCard";
        Assert.assertEquals(actualText,expectedText,"Title doesn't match");
    }

    public void validateTargetCircleOffer() {
        String actualText = targetCircleOffersPageText.getText();
        String expectedText = "Target Circle™ Offers";
        Assert.assertEquals(actualText,expectedText,"Title doesn't match");
    }



}
