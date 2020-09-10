package redCard;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static redCard.RedCardHomePageWebElement.*;

public class RedCardHomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = webElementRedCardButton) public WebElement redCardButton;
    @FindBy(how = How.XPATH, using = webElementRedCardText) public WebElement redCardText;
    @FindBy(how = How.XPATH, using = webElementExclusiveButton) public WebElement exclusiveButton;
    @FindBy(how = How.XPATH, using = webElementBenefitButton) public WebElement benefitButton;
    @FindBy(how = How.XPATH, using = webExclusiveButtonIsClickable) public WebElement exclusiveButtonIsClickable;
    @FindBy(how = How.XPATH, using = webElementProgramRulesButton) public WebElement programRulesButton;
    @FindBy(how = How.XPATH, using = webElementApplyForCreditCardButton) public WebElement applyForCreditCardButton;
    @FindBy(how = How.XPATH, using = webElementApplyForDebitButton) public WebElement applyForDebitButton;
    @FindBy(how = How.XPATH, using = webElementManageMyRedCardButton) public WebElement manageMyRedCardButton;
    @FindBy(how = How.XPATH, using = webElementMoreButton) public WebElement moreButton;
    @FindBy(how = How.XPATH, using = webElementPharmacyText) public WebElement pharmacyText;
    @FindBy(how = How.XPATH, using = webElementShowMoreButton) public WebElement showMoreButton;
    @FindBy(how = How.XPATH, using = webElementWhichCardIsRightForYouButton) public WebElement whichCardIsRightForYouButton;
    @FindBy(how = How.XPATH, using = webElementLearnMoreButton) public WebElement learnMoreButton;
    @FindBy(how = How.XPATH, using = webElementNoAnnualFeeButton) public WebElement noAnnualFeeButton;
    @FindBy(how = How.XPATH, using = webElementContactUsButton) public WebElement contactUsButton;
    @FindBy(how = How.XPATH, using = webElementPetsButton) public WebElement petsButton;

    // Action Method
    public void setRedCardButtonIsDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        redCardButton.isDisplayed();
        System.out.println("Red Card Button is Displayed: "+ redCardButton.isDisplayed());
    }
    // Validate Method
    public void validateRedCardButton(String expectedResult){
       String actualResult= getTextByXpath(webElementRedCardButtonOrdersText);
       Assert.assertEquals(actualResult,expectedResult);
    }
    // Action Method
    public void setRedCardButtonIsClicked() throws InterruptedException {
        Thread.sleep(3000);
        redCardButton.click();
    }
    // Validation Method
    public void validateRedCardButtonIsClicked() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult=redCardText.getText();
        String expectedResult="Benefits";
        Assert.assertEquals(actualResult,expectedResult, "Search Item doesn't Match");
    }
    // Action Method
    public void setExclusiveButtonIsDisplayed() throws InterruptedException {
        redCardButton.click();
        Thread.sleep(3000);
        exclusiveButton.isDisplayed();
        System.out.println("Exclusive Button is Displayed: "+ exclusiveButton.isDisplayed());
    }
    // Validation Method
    public void validateExclusiveButton(String expectedResult){
        String actualResult= getTextByXpath(webElementBenefitButton);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // Action Method
    public void exclusiveButtonIsClickable() throws InterruptedException {
        redCardButton.click();
        Thread.sleep(3000);
        exclusiveButtonIsClickable.click();
    }
    /// Validation Method
    public void validateExclusiveButtonIsClickable(String expectedResult){
        String actualResult = getTextByXpath(webElementExclusiveButtonApplyForDebitText);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // Action Method
    public void setBenefitButtonIsDisplayed() throws InterruptedException {
        redCardButton.click();
        Thread.sleep(3000);
        benefitButton.isDisplayed();
        System.out.println("Benefit Button is Displayed: " + benefitButton.isDisplayed());
    }
    // Validation Method
    public void validateBenefitButtonIsDisplayed(String expectedResult){
        String actualResult= getTextByXpath(webExclusiveButtonIsClickable);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // Action Method
    public void setProgramRulesButtonIsDisplayed() throws InterruptedException {
        redCardButton.click();
        Thread.sleep(3000);
        programRulesButton.isDisplayed();
        System.out.println("Program Button is Displayed: " + programRulesButton.isDisplayed());
    }

    // Validation Method
    public void validateMethodProgramRulesButtonIsDisplayed(String expectedResult){
         String actualResult= getTextByXpath(webExclusiveButtonIsClickable);
         Assert.assertEquals(actualResult,expectedResult);
     }
    // Action Method
    public void setApplyForCreditCardButtonIsDisplayed() throws InterruptedException {
        redCardButton.click();
        Thread.sleep(3000);
        applyForCreditCardButton.isDisplayed();
        System.out.println("Apply For Credit Card Button is Displayed:" + applyForCreditCardButton.isDisplayed());
    }
    // Validation Method
    public void validateApplyForCreditCardButtonIsDisplayed(String expectedResult) {
        String actualResult = getTextByXpath(webExclusiveButtonIsClickable);
        Assert.assertEquals(actualResult,expectedResult);
    }
    // Action Method
    public void setApplyForDebitButtonIsDisplayed() throws InterruptedException {
        redCardButton.click();
        Thread.sleep(4000);
        applyForDebitButton.isDisplayed();
        System.out.println("Apply For Debit Button is Displayed:" + applyForDebitButton.isDisplayed());
    }
    // Validation Method
    public void validateApplyForDebitButtonIsDisplayed(String expectedResult) {
        String actualResult = getTextByXpath(webExclusiveButtonIsClickable);
        Assert.assertEquals(actualResult, expectedResult);
    }
    // Action Method
    public void setManageMyRedCardButtonIsDisplayed() throws InterruptedException {
        redCardButton.click();
        Thread.sleep(4000);
        manageMyRedCardButton.isDisplayed();
        System.out.println("Manage My Red Card Button is Displayed" + manageMyRedCardButton.isDisplayed());
    }
        // Validation Method
    public void validateManageMyRedCardButtonIsDisplayed(String expectedResult) {
            String actualResult = getTextByXpath(webExclusiveButtonIsClickable);
            Assert.assertEquals(actualResult, expectedResult);
    }
    // Action Method
    public void setMoreButtonIsDisplayed() throws InterruptedException { // Action Method
        redCardButton.click();
        Thread.sleep(5000);
        moreButton.click();
        Thread.sleep(3000);
        System.out.println("More Button is Displayed" + moreButton.isDisplayed());
    }
    //Validate Method
    public void validateMoreButtonIsDisplayed(){
        String actualResult=pharmacyText.getText();
        String expectedResult="Pharmacy";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
    // Action Method
    public void setShowMoreButtonIsDisplayed() throws InterruptedException {
        redCardButton.click();
        Thread.sleep(4000);
        showMoreButton.click();
        Thread.sleep(3000);
        System.out.println("Show More Button is Clicked" + showMoreButton.isDisplayed());
    }
    // Validation Method
    public void validateShowMoreButtonIsDisplayed(String expectedResult) {
        String actualResult = getTextByXpath(webExclusiveButtonIsClickable);
        Assert.assertEquals(actualResult, expectedResult);
    }
    // Action Method
    public void setWhichCardIsRightForYouButtonIsDisplayed() throws InterruptedException { // Failed
        redCardButton.click();
        Thread.sleep(3000);
        whichCardIsRightForYouButton.isDisplayed();
        Thread.sleep(3000);
        System.out.println("Which Card Is Right For You Button is Clicked" + whichCardIsRightForYouButton.isDisplayed());
    }
    // Validation Method
    public void validateWhichCardIsRightForYouButtonIsDisplayed(String expectedResult) {
        String actualResult = getTextByXpath(webExclusiveButtonIsClickable);
        Assert.assertEquals(actualResult, expectedResult);
    }
    // Action Method
    public void learnMoreButtonIsDisplayed() throws InterruptedException {
        redCardButton.click();
        Thread.sleep(3000);
        learnMoreButton.click();
        Thread.sleep(3000);
        System.out.println("Learn More Button is Displayed" + learnMoreButton.isDisplayed());
    }
    // Validation Method
    public void validatelearnMoreButtonIsDisplayed(String expectedResult) {
        String actualResult = getTextByXpath(webExclusiveButtonIsClickable);
        Assert.assertEquals(actualResult, expectedResult);
    }
    // Action Method
    public void setNoAnnualFeeButtonIsClickable() throws InterruptedException {
        redCardButton.click();
        Thread.sleep(3000);
        noAnnualFeeButton.click();
        Thread.sleep(3000);
        System.out.println("No Annual Fee Button is Clicked" + noAnnualFeeButton.isDisplayed());
    }
    // Validation Method
    public void validateNoAnnualFeeButtonIsClickable(String expectedResult) {
        String actualResult = getTextByXpath(webElementNoAnnualFeeButtonRatesFeesText);
        Assert.assertEquals(actualResult, expectedResult);
    }

    // Action Method
    public void contactUsButtonIsDisplayed() throws InterruptedException {
        redCardButton.click();
        Thread.sleep(3000);
        contactUsButton.isDisplayed();
        System.out.println("Contact us button is displable" + contactUsButton.isDisplayed());
    }
    // Validation Method
    public void validateContactUsButtonIsDisplayed(String expectedResult) {
        String actualResult = getTextByXpath(webExclusiveButtonIsClickable);
        Assert.assertEquals(actualResult, expectedResult);
    }
    // Action Method
    public void petsButtonIsClickable() throws InterruptedException {
        petsButton.click();
        Thread.sleep(3000);

    }
    // Validation Method
    public void validatePetsButtonIsClickable(String expectedResult){
       String actualResult= getTextByXpath(webElementPetsButtonRegistryText);
       Assert.assertEquals(actualResult,expectedResult);
    }

}




























