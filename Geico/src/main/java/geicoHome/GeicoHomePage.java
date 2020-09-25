package geicoHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static geicoHome.GeicoHomePageWebElements.*;

public class GeicoHomePage extends WebAPI {


    //@Find By
    @FindBy(id = accessYourPolicyDropDownBox_Id)
    WebElement accessYourPolicyDropDownBox;

    @FindBy(xpath = newCustomerStartHereBtn_xp)
    WebElement newCustomerStartHereBtn;

    @FindBy(xpath = policyNumberField_xp)
    WebElement policyNumberField;

    @FindBy(xpath = dateOfBirthField_xp)
    WebElement dateOfBirthField;

    @FindBy(xpath = zipCodeField_xp)
    WebElement zipCodeField;

    @FindBy(xpath = continueBtn_xp)
    WebElement continueBtn;

    @FindBy(xpath = policynumberFieldErrorMsg_xp)
    WebElement policynumberFieldErrorMsg;

    @FindBy(xpath = zipCodeFieldErrorMsg_xp)
    WebElement zipCodeFieldErrorMsg;

    @FindBy(xpath = onlineActivationErrorMsg_xp)
    WebElement onlineActivationErrorMsg;

    @FindBy(xpath = searchBtn_xp)
    WebElement searchBtn;

    @FindBy(xpath = searchField_xp)
    WebElement searchField;

    @FindBy(xpath = searchSubmitBtn_xp)
    WebElement searchSubmitBtn;













    //Action and Validate Methods:

    //DropDown Check Using Select Class
    public void checkAccessPolicyDropDownByText(){
        clickOnElement(accessYourPolicyDropDownBox);
        sleepFor(3);
        selectFromDropdownByVisibleText(accessYourPolicyDropDownBox,dropDownText);
        sleepFor(3);
        selectFromDropdownByIndexNo(accessYourPolicyDropDownBox,3);
        sleepFor(3);
    }

    public void checkAccessPolicyDropDownByIndexNo(){
        clickOnElement(accessYourPolicyDropDownBox);
        sleepFor(3);
        selectFromDropdownByIndexNo(accessYourPolicyDropDownBox,3);
        sleepFor(3);
    }


    public void onlineActivationWithPolicyNumberFieldBlank(){
        clickOnElement(newCustomerStartHereBtn);
        sleepFor(2);
        typeOnElement(policyNumberField,"");
        typeOnElement(dateOfBirthField,"11/11/1990");
        sleepFor(3);
        typeOnElement(zipCodeField,"11435");
        clickOnElement(continueBtn);
    }
    public void validateOnlineActivationWithPolicyNumberFieldBlank(){
        String actualText = policynumberFieldErrorMsg.getText();
        String expectedText = "Policy Number is required.";
        Assert.assertEquals(actualText,expectedText,"Text doesn't match");
    }

    public void onlineActivationWithInvalidZipCode(){
        clickOnElement(newCustomerStartHereBtn);
        sleepFor(2);
        typeOnElement(policyNumberField,"1234567891");
        typeOnElement(dateOfBirthField,"11/11/1990");
        sleepFor(3);
        typeOnElement(zipCodeField,"114");
        clickOnElement(continueBtn);
    }
    public void validateOnlineActivationWithInvalidZipCode(){
        String actualText = zipCodeFieldErrorMsg.getText();
        String expectedText = "Please enter a 5-digit zip code.";
        Assert.assertEquals(actualText,expectedText,"Text doesn't match");
    }

    public void onlineActivationWithInvalidCredentials() {
        clickOnElement(newCustomerStartHereBtn);
        sleepFor(2);
        typeOnElement(policyNumberField, "1234567891");
        typeOnElement(dateOfBirthField, "11/11/1990");
        sleepFor(3);
        typeOnElement(zipCodeField, "11435");
        clickOnElement(continueBtn);
    }
    public void validateOnlineActivationWithInvalidCredentials(){
        String actualText = onlineActivationErrorMsg.getText();
        String expectedText = "The information you entered does not match our system. Please try again.";
        Assert.assertEquals(actualText,expectedText,"Text doesn't match");
    }







}
