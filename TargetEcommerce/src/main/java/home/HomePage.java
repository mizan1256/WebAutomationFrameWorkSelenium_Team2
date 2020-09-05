package home;

import common.WebAPI;
import datadriven.DataSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;

import static home.HomePageWebElements.*;

public class HomePage extends WebAPI {

    @FindBy(how = How.ID, using = webElementSearchBox)
    public WebElement searchBox;

    @FindBy(how = How.XPATH, using = webElementSearchButton)
    public WebElement searchButton;

    @FindBy(how = How.XPATH, using = webElementSearchBox)
    public WebElement searchText;
    @FindBy(how = How.XPATH, using = signInTarget)
    public WebElement signInButton;
    @FindBy(how = How.XPATH, using = createAccountDropDown)
    public WebElement createAccountDropDownLink;
    @FindBy(how = How.XPATH, using = emailIdForTarget)
    public WebElement emailId;
    @FindBy(how = How.XPATH, using = firstNameForTarget)
    public WebElement firstName;
    @FindBy(how = How.XPATH, using = lastNameForTarget)
    public WebElement lastName;
    @FindBy(how = How.XPATH, using = mobileNumberForTarget)
    public WebElement mobileNumber;
    @FindBy(how = How.XPATH, using = passwordForTarget)
    public WebElement password;
    @FindBy(how = How.XPATH, using = createAccountButton)
    public WebElement createTargetAccount;
    @FindBy(how = How.XPATH, using = errorMessageCreateAccount)
    public WebElement errorMessage;
    @FindBy(how = How.XPATH, using = signInDropDownMenu)
    public WebElement signInDropDownButton;
    @FindBy(how = How.XPATH, using = signInEmailIdBox)
    public WebElement signInEmailId;
    @FindBy(how = How.XPATH, using = signInPasswordBox)
    public WebElement signInPassword;
    @FindBy(how = How.XPATH, using = finalSignInbutton)
    public WebElement finalSignIn;
    @FindBy(how = How.XPATH, using = passwordErrorMessage)
    public WebElement invalidPasswordErrorMessage;

    @FindBy(xpath = "//input[@id='search']")
    WebElement searchField;
    @FindBy(xpath = "//button[@class='SearchInputButton-sc-1opoijs-0 gpTjzt']")
    WebElement searchFieldButton;
    @FindBy(xpath = "//h1[@class='Heading__StyledHeading-sc-1m9kw5a-0 jAsGMN h-margin-b-none']")
    WebElement headerIPhone;

    public void searchBoxIsDisplayed() {
        searchField.isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='search']")).isDisplayed());
    }

    //Action Method
    public void searchBoxCheck(String searchItem) {
        searchField.clear();
        searchField.sendKeys(searchItem);
        searchFieldButton.click();
    }

    //Validation Method
    public void validateSearchText() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult = headerIPhone.getText();
        Thread.sleep(3000);
        String expectedResult = "iPhone";
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, expectedResult, "Text do not match");
    }

    //Positive test Creating account
    public void createTargetAccount() {
        signInButton.click();
        createAccountDropDownLink.click();
        emailId.sendKeys("pnt30242@gmail.com");
        firstName.sendKeys("Mohammd");
        lastName.sendKeys("Islam");
        mobileNumber.sendKeys("7186901256");
        password.sendKeys("Pnt@30242");
        createTargetAccount.click();

    }//Negative test Creating account(using same credentials)

    public void createTargetAccountForNegativeTest() throws InterruptedException {
        signInButton.click();
        Thread.sleep(3000);
        createAccountDropDownLink.click();
        emailId.sendKeys("pnt30242@gmail.com");
        firstName.sendKeys("Mohammd");
        lastName.sendKeys("Islam");
        mobileNumber.sendKeys("7186901256");
        password.sendKeys("Pnt@30242");
        createTargetAccount.click();
    }

    public void validateCreateTargetAccountForNegativeTest() {
        Assert.assertEquals("Sorry, something went wrong. Please try again.", errorMessage.getText());
    }

    public void signInTargetUserAccount() {
        signInButton.click();
        signInDropDownButton.click();
        signInEmailId.sendKeys("mizan_1256@yahoo.com");
        signInPassword.sendKeys("Tasmi1256");
        finalSignIn.click();
    }

    public void validateSignInTargetUserAccount() {
        Assert.assertEquals("Target Login", driver.getTitle());
    }


    public void signInTargetUserAccountUsingInvalidCredentials() throws InterruptedException {
        signInButton.click();
        Thread.sleep(3000);
        signInDropDownButton.click();
        signInEmailId.sendKeys("mizan_1256@yahoo.com");
        signInPassword.sendKeys("Tasmi1255");
        finalSignIn.click();
        Thread.sleep(5000);
    }

    public void validateSignInTargetUserAccountUsingInvalidCredentials() {
        Assert.assertEquals("Sorry, something went wrong. Please try again.", invalidPasswordErrorMessage.getText());
    }

    /**
     * Search Item Using getaItemValue method
     * @throws InterruptedException
     */
    //Action Method
    public void searchBoxCheckUsingGetItemValue() throws InterruptedException {
        List<String> itemList = DataSource.getItemValue();
        for (String st : itemList) {
            searchField.sendKeys(st);
            searchField.submit();
            searchField.clear();
            Thread.sleep(3000);
        }
    }

    //Action Method
    public void searchBoxCheckUsingGetItemsListFromExcel() throws Exception {
            List<String> itemList= DataSource.getItemsListFromExcel();
            for (int i=1; i<itemList.size();i++){
                String item=itemList.get(i);
                searchField.sendKeys(item);
                searchField.submit();
                String expectedResult="\""+item+"\"";
                System.out.println("Expected Result : "+expectedResult);
                String actualResult = searchText.getText();
                System.out.println("Actual Result : "+actualResult);
               Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
                 sleepFor(3);
                searchField.clear();
                Thread.sleep(3000);
            }
    }
    public void searchBoxCheckGetItemsListFromDB() throws Exception {
        // Insert Data to a Database table
        DataSource.insertDataIntoDB();
        // Get Data From Database Table
        List<String> itemList= DataSource.getItemsListFromDB();
        for (int i=1; i<itemList.size();i++){
            String item=itemList.get(i);
            searchField.sendKeys(item);
            searchField.submit();
            String expectedResult="\""+item+"\"";
            System.out.println("Expected Result : "+expectedResult);
            String actualResult = searchText.getText();
            System.out.println("Actual Result : "+actualResult);
        //    Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
            sleepFor(3);
            searchField.clear();
            Thread.sleep(3000);
        }

    }

}