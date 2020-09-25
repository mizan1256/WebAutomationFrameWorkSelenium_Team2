package tdBankHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TDBankHomePage extends WebAPI {

    //@Find By Annotations with Locators
    @FindBy(xpath = "//a[@id='td-desktop-nav-dropdown-link-0']")
    WebElement countrySelectBtn;

    @FindBy(xpath = "//ul[@class='td-dropdown-content']//a[contains(text(),'Canada')]")
    WebElement selectCanada;

    @FindBy(xpath = "//a[@id='td-desktop-nav-dropdown-link-2']//span[@class='td-icon expand']")
    WebElement productsDropdownBtn;

    @FindBy(xpath = "//ul[@class='td-dropdown-content']//a[contains(text(),'Credit Cards')]")
    WebElement creditCards;

    @FindBy(xpath = "//ul[@class='td-dropdown-content']//a[contains(text(),'Savings')]")
    WebElement savings;

    @FindBy(xpath = "//select[@id='state']")
    WebElement selectState;

    @FindBy(xpath = "//select[@id='city']")
    WebElement selectCity;

    @FindBy(xpath = "//button[@class='td-button td-button-block td-button-secondary' and @type='button']")
    WebElement setMyLocation;

    @FindBy(xpath = "//div[@class='td-col td-col-xs-12 td-col-sm-10 td-col-sm-offset-1']")
    WebElement savingsPageText;

    @FindBy(xpath = "//a[@id='td-desktop-nav-dropdown-link-4']//span[@class='td-icon expand']")
    WebElement loginDropdownBtn;

    @FindBy(xpath = "//div[@class='td-col']//a[contains(text(),'Online Banking')]")
    WebElement onlineBanking;

    @FindBy(xpath = "//input[@id='formElement_0']")
    WebElement usernameField;

    @FindBy(xpath = "//input[@id='formElement_1']")
    WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit' and text()='Log in']")
    WebElement loginBtn;

    @FindBy(xpath = "//span[@class='error-message ng-binding' and contains(text(),\"Something doesn't\")]")
    WebElement errorLoginMsg;












    //Action and Validate Methods:
    public void changeCountry(){
        clickOnElement(countrySelectBtn);
        clickOnElement(selectCanada);
    }
    public void validateCountryChanged(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "TD Canada Trust - Personal, Small Business Banking & Investing";
        Assert.assertEquals(actualTitle,expectedTitle,"Title doesn't match");
    }

    //MouseHoverOver
    public void selectCreditCardFromList(){
        Actions actions = new Actions(driver);
        actions.moveToElement(productsDropdownBtn).perform();
        sleepFor(3);
        clickOnElement(creditCards);

    }
    public void validateCreditCardPage(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "Apply for a Credit Card Online | TD Bank Rewards Credit Cards";
        Assert.assertEquals(actualTitle,expectedTitle,"Title doesn't match");

    }

    //Select from Dropdown
    public void savingsAccountDropdown(){
        mouseHover(productsDropdownBtn);
        sleepFor(3);
        clickOnElement(savings);
        selectFromDropdownByVisibleText(selectState,"New York");
        sleepFor(3);
        selectFromDropdownByVisibleText(selectCity,"Astoria");
        sleepFor(2);
        clickOnElement(setMyLocation);
    }
    public void validateSavingsAccount(){
        String actualText = savingsPageText.getText();
        String expectedText = "TD Bank Savings & Money Market Accounts";
        Assert.assertEquals(actualText,expectedText,"Text doesn't match");

    }

    //Login with invalid credentials with navigating to another page
    public void loginWithInvalidCredentials(){
        mouseHover(loginDropdownBtn);
        clickOnElement(onlineBanking);
        sleepFor(3);
        driver.navigate().to("https://onlinebanking.tdbank.com/#/authentication/login");
        sleepFor(2);
        typeOnElement(usernameField,"test123");
        typeOnElement(passwordField,"12345678");
        sleepFor(2);
        clickOnElement(loginBtn);
        sleepFor(4);

    }
    public void validateLoginWithInvalidCredentials(){
        String actualText = errorLoginMsg.getText();
        String expectedText = "Something doesn't match. Please try again. You can also retrieve your user name or reset your password via the \"Forgot user name and/or password?\" link.";
        Assert.assertEquals(actualText,expectedText,"Text doesn't match");
    }

















}
