package testhome;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import redCard.RedCardHomePage;

public class RedCardTest extends WebAPI {
    RedCardHomePage redCardHomePage;
    @BeforeMethod
    public void getInit(){
        redCardHomePage= PageFactory.initElements(driver, RedCardHomePage.class);
    }

    @Test
    public void testSetRedCardButtonIsDisplayed() throws InterruptedException {
        redCardHomePage.setRedCardButtonIsDisplayed();
        redCardHomePage.validateRedCardButton("Orders");
    }
    @Test
    public void testSetRedCardButtonIsClicked() throws InterruptedException {
        redCardHomePage.setRedCardButtonIsClicked();
        redCardHomePage.validateRedCardButtonIsClicked();
    }
    @Test
    public void testSetExclusiveButtonIsDisplayed() throws InterruptedException {
        redCardHomePage.setExclusiveButtonIsDisplayed();
        redCardHomePage.validateExclusiveButton("Benefits");
    }
    @Test
    public void testExclusiveButtonIsClickable() throws InterruptedException {
        redCardHomePage.exclusiveButtonIsClickable();
        redCardHomePage.validateExclusiveButtonIsClickable("Apply for Debit");
    }
    @Test
    public void testBenefitButtonIsDisplayed() throws InterruptedException {
        redCardHomePage.setBenefitButtonIsDisplayed();
        redCardHomePage.validateBenefitButtonIsDisplayed("Exclusives");
    }
    @Test
    public void testProgramRulesButtonIsDisplayed() throws InterruptedException {
        redCardHomePage.setProgramRulesButtonIsDisplayed();
        redCardHomePage.validateMethodProgramRulesButtonIsDisplayed("Exclusives");
    }
    @Test
    public void testApplyForCreditCardButtonIsDisplayed() throws InterruptedException {
        redCardHomePage.setApplyForCreditCardButtonIsDisplayed();
        redCardHomePage.validateApplyForCreditCardButtonIsDisplayed("Exclusives");
    }
    @Test
    public void testApplyForDebitButtonIsDisplayed() throws InterruptedException {
        redCardHomePage.setApplyForDebitButtonIsDisplayed();
        redCardHomePage.validateApplyForDebitButtonIsDisplayed("Exclusives");
    }
    @Test
    public void testManageMyRedCardButtonIsDisplayed() throws InterruptedException {
        redCardHomePage.setManageMyRedCardButtonIsDisplayed();
        redCardHomePage.validateManageMyRedCardButtonIsDisplayed("Exclusives");
    }
    @Test
    public void testMoreButtonIsDisplayed() throws InterruptedException {
        redCardHomePage.setMoreButtonIsDisplayed();
        redCardHomePage.validateMoreButtonIsDisplayed();
    }
    @Test
    public void testSetShowMoreButtonIsDisplayed() throws InterruptedException {
        redCardHomePage.setShowMoreButtonIsDisplayed();
        redCardHomePage.validateShowMoreButtonIsDisplayed("Exclusives");
    }
    @Test
    public void setWhichCardIsRightForYouButtonIsDisplayed() throws InterruptedException { // Failed
       redCardHomePage.setWhichCardIsRightForYouButtonIsDisplayed();
       redCardHomePage.validateWhichCardIsRightForYouButtonIsDisplayed("Exclusives");
    }
    @Test void learnMoreButtonIsDisplayed() throws InterruptedException {
        redCardHomePage.learnMoreButtonIsDisplayed();
        redCardHomePage.validatelearnMoreButtonIsDisplayed("Exclusives");
    }
    @Test
    public void setNoAnnualFeeButtonIsClickable() throws InterruptedException {
        redCardHomePage.setNoAnnualFeeButtonIsClickable();
        redCardHomePage.validateNoAnnualFeeButtonIsClickable("rates & fees");
    }
    @Test
    public void setContactUsButtonIsDisplayed() throws InterruptedException {
        redCardHomePage.contactUsButtonIsDisplayed();
        redCardHomePage.validateContactUsButtonIsDisplayed("Exclusives");
    }
    @Test
    public void testPetsButtonIsClickable() throws InterruptedException {
        redCardHomePage.petsButtonIsClickable();
        redCardHomePage.validatePetsButtonIsClickable("Registry");
    }



}






























