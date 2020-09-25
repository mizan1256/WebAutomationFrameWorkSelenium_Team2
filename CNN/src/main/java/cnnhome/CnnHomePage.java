package cnnhome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static cnnhome.CnnHomePageWebElements.*;

public class CnnHomePage  extends WebAPI {

    //@FindBy

//    @FindBy(xpath = "//div[@class='Flex-sc-1sqrs56-0 indexes__HideOnMobile-nujtvs-13 fSxGEU']//div[@id='account-icon-button']//*[local-name()='svg']")
//    WebElement userAccountBtn;

    @FindBy(xpath = userAccountBtn_Xp)
    WebElement userAccountBtn;

    @FindBy(xpath = signUpBtn_Xp)
    WebElement signUpBtn;

    @FindBy(xpath = emailAddressField_Xp)
    WebElement emailAddressField;

    @FindBy(xpath = passwordField_Xp)
    WebElement passwordField;

    @FindBy(xpath = zipCodeField_xp)
    WebElement zipCodeField;

    @FindBy(xpath = registerBtn_xp)
    WebElement registerBtn;

    @FindBy(xpath = invalidEmailText_xp)
    WebElement invalidEmailText;

    @FindBy(xpath = invalidPasswordText_xp)
    WebElement invalidPasswordText;

    @FindBy(xpath =invalidZipcodeText_xp)
    WebElement invalidZipcodeText;

    @FindBy(xpath =accountExistText_xp)
    WebElement accountExistText;

    @FindBy(xpath =loginEmailField_xp)
    WebElement loginEmailField;

    @FindBy(xpath =loginPasswordField_xp)
    WebElement loginPasswordField;

    @FindBy(xpath =loginBtn_xp)
    WebElement loginBtn;

    @FindBy(xpath =invalidUserNameAndPasswordText_xp)
    WebElement invalidUserNameAndPasswordText;

    @FindBy(xpath = editionBtn_xp)
    WebElement editionBtn;

    @FindBy(xpath = international_xp)
    WebElement international;

    @FindBy(xpath = arabic_xp)
    WebElement arabic;

    @FindBy(xpath = espanol_xp)
    WebElement espanol;

    @FindBy(xpath = searchBtn_xp)
    WebElement searchBtn;

    @FindBy(xpath = searchBox_xp)
    WebElement searchBox;











    //Action  & Validate Method

    public void signUpWithInvalidEmail(){
        clickOnElement(userAccountBtn);
        sleepFor(4);
        clickOnElement(signUpBtn);
        sleepFor(2);
        typeOnElement(emailAddressField,"asdf");
        typeOnElement(passwordField,"Test1234@");
        typeOnElement(zipCodeField,"11435");
        sleepFor(2);
        clickOnElement(registerBtn);
    }
    public void validateSignUpWithInvalidEmail(){
        String actualText = invalidEmailText.getText();
        String expectedText = "Please enter a valid email address";
        Assert.assertEquals(actualText,expectedText,"Text doesn't match");
    }


    public void signUpWithInvalidPassword(){
        clickOnElement(userAccountBtn);
        sleepFor(4);
        clickOnElement(signUpBtn);
        sleepFor(2);
        typeOnElement(emailAddressField,"test@gmail.com");
        typeOnElement(passwordField,"1122334655");
        typeOnElement(zipCodeField,"11435");
        sleepFor(2);
        clickOnElement(registerBtn);
    }
    public void validateSignUpWithInvalidPassword(){
        String actualText = invalidPasswordText.getText();
        String expectedText = "Please enter a valid password";
        Assert.assertEquals(actualText,expectedText,"Text doesn't match");
    }


    public void signUpWithInvalidZipCode(){
        clickOnElement(userAccountBtn);
        sleepFor(4);
        clickOnElement(signUpBtn);
        sleepFor(2);
        typeOnElement(emailAddressField,"test@gmail.com");
        typeOnElement(passwordField,"Test1234@");
        typeOnElement(zipCodeField,"asdfg");
        sleepFor(2);
        clickOnElement(registerBtn);
    }
    public void validateSignUpWithInvalidZipCode(){
        String actualText = invalidZipcodeText.getText();
        String expectedText = "Must only contain numbers";
        Assert.assertEquals(actualText,expectedText,"Text doesn't match");
    }


    public void signUpWithAllValidCredentials(){
        clickOnElement(userAccountBtn);
        sleepFor(4);
        clickOnElement(signUpBtn);
        sleepFor(2);
        typeOnElement(emailAddressField,"pntp.2020@gmail.com");
        typeOnElement(passwordField,"Test2020@");
        typeOnElement(zipCodeField,"11435");
        sleepFor(2);
        clickOnElement(registerBtn);
    }
    public void validateSignUpWithAllValidCredentials(){
        String actualText = accountExistText.getText();
        String expectedText = "This account already exists. Please log in.";
        Assert.assertEquals(actualText,expectedText,"Text doesn't match");
    }

    public void loginWithInvalidCredentials(){
        clickOnElement(userAccountBtn);
        sleepFor(3);
        typeOnElement(loginEmailField,"test@gmail.com");
        typeOnElement(loginPasswordField,"123456");
        clickOnElement(loginBtn);
    }

    public void validateLoginWithInValidCredentials(){
        String actualText = invalidUserNameAndPasswordText.getText();
        String expectedText = "You have entered an invalid username or password.";
        Assert.assertEquals(actualText,expectedText,"Text doesn't match");
    }

    public void loginWithAllValidCredentials(){
        clickOnElement(userAccountBtn);
        sleepFor(3);
        typeOnElement(loginEmailField,"pntp.2020@gmail.com");
        typeOnElement(loginPasswordField,"Test2020@");
        clickOnElement(loginBtn);
        sleepFor(2);
    }

    public void validateLoginWithAllValidCredentials(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "CNN - Breaking News, Latest News and Videos";
        Assert.assertEquals(actualTitle,expectedTitle,"Title doesn't match");
    }

    public void changeEditionFromUsToInternational(){
        clickOnElement(editionBtn);
        sleepFor(3);
        clickOnElement(international);
        sleepFor(2);
    }
    public void validateChangeEditionFromUsToInternational(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "CNN International - Breaking News, US News, World News and Video";
        Assert.assertEquals(actualTitle,expectedTitle,"Title doesn't match");
    }

    public void changeEditionFromUsToArabic(){
        clickOnElement(editionBtn);
        sleepFor(3);
        clickOnElement(arabic);
        sleepFor(2);
    }

    public void validateChangeEditionFromUsToArabic(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "CNN Arabic";
        Assert.assertEquals(actualTitle,expectedTitle,"Title doesn't match");
    }

    public void changeEditionFromUsToEspanol(){
        clickOnElement(editionBtn);
        sleepFor(3);
        clickOnElement(espanol);
        sleepFor(2);
    }
    public void validateChangeEditionFromUsToEspanol(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "CNN en Español | Últimas noticias en español de Latinoamérica, Estados Unidos y el mundo";
        Assert.assertEquals(actualTitle,expectedTitle,"Title doesn't match");
    }

    public void checkSearchBox(){
        clickOnElement(searchBtn);
        sleepFor(2);
        typeOnElementAndEnter(searchBox,"Donald Trump");
        sleepFor(2);
        System.out.println(driver.getCurrentUrl());
    }
    public void validateCheckSearchBox(){
       String expectedUrl ="https://us.cnn.com/search?q=Donald+Trump";
       String actualUrl = driver.getCurrentUrl();
       Assert.assertEquals(expectedUrl,actualUrl,"Url doesn't match");
        System.out.println("piash");


    }

















}
