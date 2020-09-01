package weeklyad;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static weeklyad.WeeklyAdWebElement.*;

public class WeeklyAdPage extends WebAPI {
    @FindBy(how =How.XPATH, using = webElementWeeklyAd) public WebElement weeklyAd;
    @FindBy(how = How.XPATH, using = webElementWeeklyAdButton) public WebElement weeklyAdButton;
    @FindBy(how = How.XPATH, using = webElementViewweeklyAd) public WebElement viewWeeklyAd;
    @FindBy(how = How.XPATH, using = webElementMenuDropDown) public WebElement weeklyAdMenuDropDown;
    @FindBy(how = How.XPATH, using = webElementWeeklyAdPriceList) public WebElement weeklyAdPriceList;
    @FindBy(how = How.XPATH, using = weeklyAdPageTargetLogo) public WebElement weeklyAdBottomTargetLogo;
    @FindBy(how = How.XPATH, using = weeklyAdPageFooterMenuTerms)public WebElement weeklyAdFooterMenuTermsLink;
    @FindBy(how = How.XPATH, using = weeklyAdPageFooterMenuPrivacy) public WebElement weeklyAdPageFooterMenuPrivacyLink;
    @FindBy(how = How.XPATH, using = weeklyAsPageInterestBasedAd) public WebElement weeklyAsPageInterestBasedAdLink;
    /**
     * Author Mohammad Islam(Mizan)
     */
  //Action mathod
    public void weeklyAdIsDisplay(){
        weeklyAd.isDisplayed();
        System.out.println("Test case is diplayed : "+weeklyAd.isDisplayed());
    }
    //Action method
    public void weeklyAdButtonIsClickable(){
        weeklyAd.click();
    }
    //Validation
    public void validateWeeklyAdButtonIsClickable(){
        String actualResult= weeklyAdButton.getText();
        String expectedResult="Weekly Ad";
        Assert.assertEquals(actualResult,expectedResult,"Test case text not match");
    } //Action method
    public void viewWeeklyAdIsDisplay() throws InterruptedException {
        weeklyAdButtonIsClickable();
        Thread.sleep(3000);
        viewWeeklyAd.isDisplayed();
        System.out.println("Test case is diplayed : "+viewWeeklyAd.isDisplayed());
    } //Action method
    public void viewWeeklyAdIsClickable() throws InterruptedException {
        weeklyAdButtonIsClickable();
        Thread.sleep(3000);
        weeklyAdMenuDropDown.click();
        Thread.sleep(3000);
        weeklyAdPriceList.click();
        Thread.sleep(3000);
    }  //Validation
    public void validateViewWeeklyAdIsClickable() throws InterruptedException {
       Assert.assertEquals("Weekly Deals In Stores Now : Target Weekly Ad", driver.getTitle());
    }
    public void weeklyAdBottomTargetLogoIsDisplay(){
        weeklyAdButtonIsClickable();
        System.out.println("Weekly Ad page bottom logo is displayed : "+ weeklyAdBottomTargetLogo.isDisplayed());
    } //Action method
    public void weeklyAdBottomMenuTermsLinkIsClickable(){
        weeklyAdButtonIsClickable();
        weeklyAdFooterMenuTermsLink.click();
    }
    //Validation
    public void validateWeeklyAdBottomMenuTermsLinkIsClickable(){
        Assert.assertEquals("Weekly Deals In Stores Now : Target Weekly Ad", driver.getTitle());
    }
    public void weeklyAdPageFooterMenuPrivacyLinkIsClickable(){
        weeklyAdButtonIsClickable();
        weeklyAdPageFooterMenuPrivacyLink.click();
    }
    public void validateWeeklyAdPageFooterMenuPrivacyLinkIsClickable(){
        Assert.assertEquals("Weekly Deals In Stores Now : Target Weekly Ad",driver.getTitle());
    }
    public void weeklyAsPageInterestBasedAdLinkIsActive(){
        weeklyAdButtonIsClickable();
        weeklyAsPageInterestBasedAdLink.click();
    }
    public void validateWeeklyAsPageInterestBasedAdLinkIsActive(){
        Assert.assertEquals("Weekly Deals In Stores Now : Target Weekly Ad",driver.getTitle());
    }
}
