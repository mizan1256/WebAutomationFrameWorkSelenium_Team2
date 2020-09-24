package geicoHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static geicoHome.GeicoWebElements.*;

public class GeicoHome extends WebAPI {

    @FindBy(how = How.XPATH, using = webElementsLogoIsDisplay) public WebElement LogoIsDisplay;

    @FindBy(how = How.XPATH, using = webElementsInsurance) public WebElement Insurance;
    @FindBy(how = How.XPATH, using = webElementsVehicleIns) public WebElement VehicleIns;
    @FindBy(how = How.XPATH, using = webElementsAuto) public WebElement Auto;
    @FindBy(how = How.XPATH, using = webElementsZipCode) public WebElement ZipCode;
    @FindBy(how = How.XPATH, using = webElementsReview) public WebElement Review;
    @FindBy(how = How.XPATH, using = webElementsNextButton) public WebElement NextButton;
    @FindBy(how = How.XPATH, using = webElementsMonth) public WebElement Month;
    @FindBy(how = How.XPATH, using = webElementsDOBDay) public WebElement DOBDay;
    @FindBy(how = How.XPATH, using = webElementsDOBYear) public WebElement DOBYear;
    @FindBy(how = How.XPATH, using = webElementsDOBNextButton) public WebElement DOBNextButton;
    @FindBy(how = How.XPATH, using = webElementsFirstName) public WebElement FirstName;
    @FindBy(how = How.XPATH, using = webElementsLastName) public WebElement LastName;
    @FindBy(how = How.XPATH, using = webElementsNameNextButton) public WebElement NameNextButton;
    @FindBy(how = How.XPATH, using = webElementsAddress) public WebElement Address;
    @FindBy(how = How.XPATH, using = webElementsAddressNextButton) public WebElement AddressNextButton;
    @FindBy(how = How.XPATH, using = webElementsVIN) public WebElement VIN;
    @FindBy(how = How.XPATH, using = webElementsInsuranceValidateText) public WebElement InsuranceValidateText;

    @FindBy(how = How.XPATH, using = webElementsSearch) public WebElement Search;
    @FindBy(how = How.XPATH, using = webElementsSearchBox) public WebElement SearchBox;
    @FindBy(how = How.XPATH, using = webElementsSearchButton) public WebElement SearchButton;
    @FindBy(how = How.XPATH, using = webElementsSearchValidateText) public WebElement SearchValidateText;

    @FindBy(how = How.XPATH, using = webElementsHomeowner) public WebElement Homeowner;
    @FindBy(how = How.XPATH, using = webElementsHomeownerZipCode) public WebElement HomeownerZipCode;
    @FindBy(how = How.XPATH, using = webElementsStartQuote) public WebElement StartQuote;
    @FindBy(how = How.XPATH, using = webElementsHomeownerValidateText) public WebElement HomeownerValidateText;

    @FindBy(how = How.XPATH, using = webElementsBoat) public WebElement Boat;
    @FindBy(how = How.XPATH, using = webElementsBoatZipCode) public WebElement BoatZipCode;
    @FindBy(how = How.XPATH, using = webElementsBoatStartQuote) public WebElement BoatStartQuote;
    @FindBy(how = How.XPATH, using = webElementsBoatEmail) public WebElement BoatEmail;
    @FindBy(how = How.XPATH, using = webElementsBoatLastName) public WebElement BoatLastName;
    @FindBy(how = How.XPATH, using = webElementsBoatMailingZip) public WebElement BoatMailingZip;
    @FindBy(how = How.XPATH, using = webElementsBoatGetQuote) public WebElement BoatGetQuote;
    @FindBy(how = How.XPATH, using = webElementsBoatValidateText) public WebElement BoatValidateText;

    @FindBy(how = How.XPATH, using = webElementsCondo) public WebElement Condo;
    @FindBy(how = How.XPATH, using = webElementsCondoZipCode) public WebElement CondoZipCode;
    @FindBy(how = How.XPATH, using = webElementsCondoStartQuot) public WebElement CondoStartQuot;
    @FindBy(how = How.XPATH, using = webElementsCondoFirstName) public WebElement CondoFirstNam;
    @FindBy(how = How.XPATH, using = webElementsCondoLastName) public WebElement CondoLastName;
    @FindBy(how = How.XPATH, using = webElementsCondoBOB) public WebElement CondoBOB;
    @FindBy(how = How.XPATH, using = webElementsCondoAddress) public WebElement CondoAddress;
    @FindBy(how = How.XPATH, using = webElementsCondoUnitNum) public WebElement CondoUnitNum;
    @FindBy(how = How.XPATH, using = webElementsCondoAmount) public WebElement CondoAmount;
    @FindBy(how = How.XPATH, using = webElementsCondoContinue) public WebElement CondoContinue;
    @FindBy(how = How.XPATH, using = webElementsCondoValidateText) public WebElement CondoValidateText;




    public void geicoLogoIsDisplay() throws InterruptedException {
        LogoIsDisplay.isDisplayed();
    }

    public void geicoInsurance() throws InterruptedException {
        Insurance.click();
        VehicleIns.click();
        Auto.click();
        Thread.sleep(1000);
        ZipCode.sendKeys("11208");
        Review.click();
        Thread.sleep(1000);
        NextButton.click();
        Thread.sleep(1000);
        Month.sendKeys("04");
        DOBDay.sendKeys("24");
        DOBYear.sendKeys("1950");
        Thread.sleep(1000);
        DOBNextButton.click();
        Thread.sleep(1000);
        FirstName.sendKeys("hshasd");
        LastName.sendKeys("hdfahsfh");
        NameNextButton.click();
        Thread.sleep(1000);
        Address.sendKeys("776 HEMLOCK ST");
        AddressNextButton.click();
        Thread.sleep(1000);
    }
    public void validateInsuranceText(String expectedResult){
        String actualResult = InsuranceValidateText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
    }

    public void geicoSearchCheck() throws InterruptedException {
        Search.click();
        Thread.sleep(1000);
        SearchBox.sendKeys("Car Insurance");
        Thread.sleep(1000);
        SearchButton.click();
        Thread.sleep(1000);

    }
    public void validateSearchText(String expectedResult){
        String actualResult = SearchValidateText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
    }

    public void geicoHomeownerCheck() throws InterruptedException {
        Homeowner.click();
        Thread.sleep(1000);
        HomeownerZipCode.sendKeys("11208");
        Thread.sleep(1000);
        StartQuote.click();
        Thread.sleep(1000);

    }
    public void validateHomeownerText(String expectedResult){
        String actualResult = HomeownerValidateText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
    }

    public void geicoBoatCheck() throws InterruptedException {
        Boat.click();
        Thread.sleep(1000);
        CondoZipCode.sendKeys("11208");
        CondoStartQuot.click();
        Thread.sleep(1000);
        BoatEmail.sendKeys("Arman.hossain@gmail.com");
        BoatLastName.sendKeys("hossain");
        BoatMailingZip.sendKeys("11208");
        Thread.sleep(1000);
        BoatGetQuote.click();
        Thread.sleep(3000);

    }
    public void validateBoatText(String expectedResult){
        String actualResult = BoatValidateText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
    }

    public void geicoCondoCheck() throws InterruptedException {
        Condo.click();
        Thread.sleep(1000);
        BoatZipCode.sendKeys("11208");
        BoatStartQuote.click();
        Thread.sleep(3000);
        CondoFirstNam.sendKeys("Arman");
        CondoLastName.sendKeys("hossain");
        CondoBOB.sendKeys("11231997");
        Thread.sleep(1000);
        CondoAddress.sendKeys("766 Hemlock Street");
        Thread.sleep(1000);
        CondoUnitNum.sendKeys("7");
        CondoAmount.click();
        Thread.sleep(1000);
        CondoContinue.click();
        Thread.sleep(3000);


    }
    public void validateCondoText(String expectedResult){
        String actualResult = CondoValidateText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
    }



}
