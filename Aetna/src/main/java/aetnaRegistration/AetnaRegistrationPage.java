package aetnaRegistration;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import static aetnaRegistration.AetnaRegWebElement.*;

public class AetnaRegistrationPage extends WebAPI {
    @FindBy(how =How.XPATH, using = homePageLogInButtonWebElement)
    public WebElement homePageLogInButton;

    @FindBy(how =How.XPATH, using = registrationButtonWebElement)
    public WebElement registrationButton;

    @FindBy(how =How.CSS, using = memberIdFieldWebElement)
    public WebElement memberIdField;

    @FindBy(how =How.XPATH, using = firstNameFieldWebElement)
    public WebElement firstNameField;

    @FindBy(how =How.XPATH, using = lastNameFieldWebElement)
    public WebElement lastNameField;

    @FindBy(how =How.XPATH, using = monthFieldWebElement)
    public WebElement monthField;

    @FindBy(how =How.XPATH, using = dayFieldWebElement)
    public WebElement dayField;

    @FindBy(how =How.XPATH, using = yearFieldWebElement)
    public WebElement yearField;

    @FindBy(how =How.XPATH, using = zipCodeFieldWebElement)
    public WebElement zipCodeField;

    @FindBy(how =How.XPATH, using = continueButtonWebElement)
    public WebElement continueButton;

    //Functional test of Create an Aetna account
    public void homePageLogInButtonCheck() throws InterruptedException {
        homePageLogInButton.click();
        Thread.sleep(3000);
        registrationButton.click();
        Thread.sleep(3000);
        memberIdField.sendKeys("N0123 456789");
        firstNameField.sendKeys("Mohammad");
        lastNameField.sendKeys("Islam");
        monthField.click();
        Select select=new Select(monthField);
        select.selectByVisibleText("March");
        dayField.click();
        Select daySelect= new Select(dayField);
        daySelect.selectByVisibleText("05");
        yearField.click();
        Select yearSelect=new Select(yearField);
        yearSelect.selectByVisibleText("1970");
        zipCodeField.sendKeys("11432");
       // continueButton.click();
    }

}
