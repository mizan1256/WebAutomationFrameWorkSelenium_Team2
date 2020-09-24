package unitedAirLinesHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static unitedAirLinesHome.UnitedAirLinesWebElements.*;

public class UnitedAirLinesHome extends WebAPI {

    @FindBy(how = How.XPATH, using = webElementsUnitedLogoIsDisplay) public WebElement UnitedLogoIsDisplay;

    @FindBy(how = How.XPATH, using = webElementsSearch) public WebElement Search;
    @FindBy(how = How.XPATH, using = webElementsSearchBox) public WebElement SearchBox;
    @FindBy(how = How.XPATH, using = webElementsSearchButton) public WebElement SearchButton;
    @FindBy(how = How.XPATH, using = webElementsSearchValidateText) public WebElement SearchValidateText;

    @FindBy(how = How.XPATH, using = webElementsSaveTrips) public WebElement SaveTrips;

    @FindBy(how = How.XPATH, using = webElementsAlerts) public WebElement Alerts;
    @FindBy(how = How.XPATH, using = webElementsChangeOrCancel) public WebElement ChangeOrCancel;
    @FindBy(how = How.XPATH, using = webElementsConformationNum) public WebElement ConformationNum;
    @FindBy(how = How.XPATH, using = webElementsLastName) public WebElement LastName;
    @FindBy(how = How.XPATH, using = webElementsFindTripSearch) public WebElement FindTripSearch;
    @FindBy(how = How.XPATH, using = webElementsAlertValidateText) public WebElement AlertValidateText;

    @FindBy(how = How.XPATH, using = webElementsCustomerSafety) public WebElement CustomerSafety;
    @FindBy(how = How.XPATH, using = webElementsCustomerSafetyValidateText) public WebElement CustomerSafetyValidateText;

    @FindBy(how = How.XPATH, using = webElementsTripsOverview) public WebElement Overview;
    @FindBy(how = How.XPATH, using = webElementsTripsOverviewValidateText) public WebElement TripsOverviewValidateText;

    @FindBy(how = How.XPATH, using = webElementsBookFlightFrom) public WebElement BookFlightFrom;
    @FindBy(how = How.XPATH, using = webElementsBookFlightTo) public WebElement BookFlightTo;
    @FindBy(how = How.XPATH, using = webElementsFindFlight) public WebElement FindFlight;
    @FindBy(how = How.XPATH, using = webElementsBookFlightValidateText) public WebElement BookFlightValidateText;

    @FindBy(how = How.XPATH, using = webElementsHelp) public WebElement Help;
    @FindBy(how = How.XPATH, using = webElementsBaggageInfo) public WebElement BaggageInfo;
    @FindBy(how = How.XPATH, using = webElementsPayOnline) public WebElement PayOnline;
    @FindBy(how = How.XPATH, using = webElementsHelpValidateText) public WebElement HelpValidateText;

    @FindBy(how = How.XPATH, using = webElementsLanguages) public WebElement Languages;
    @FindBy(how = How.XPATH, using = webElementsChange) public WebElement Change;

    @FindBy(how = How.XPATH, using = webElementsSignIn) public WebElement SignIn;
    @FindBy(how = How.XPATH, using = webElementsSignInEmail) public WebElement SignInEmail;
    @FindBy(how = How.XPATH, using = webElementsSignInPassword) public WebElement SignInPassword;
    @FindBy(how = How.XPATH, using = webElementsSignInRememberMe) public WebElement SignInRememberMe;
    @FindBy(how = How.XPATH, using = webElementsSignInButton) public WebElement SignInButton;




    public void UnitedLogo() throws InterruptedException {
        UnitedLogoIsDisplay.isDisplayed();
        Thread.sleep(1000);
    }

    public void UnitedSearchCheck() throws InterruptedException {
        Search.click();
        Thread.sleep(1000);
        SearchBox.sendKeys("carry on");
        Thread.sleep(1000);
        SearchButton.click();
        Thread.sleep(2000);
    }
    public void UnitedValidateSearchText(String expectedResult){
        String actualResult = SearchValidateText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
    }

    public void UnitedSaveTripsCheck() throws InterruptedException {
        SaveTrips.click();
        Thread.sleep(1000);
    }

    public void UnitedAlertsCheck() throws InterruptedException {
        Alerts.click();
        Thread.sleep(1000);
        ChangeOrCancel.click();
        Thread.sleep(1000);
        ConformationNum.sendKeys("231674");
        Thread.sleep(2000);
        LastName.sendKeys("hgajsdf");
        FindTripSearch.click();
        Thread.sleep(3000);

    }
    public void UnitedValidateAlertsText(String expectedResult){
        String actualResult = AlertValidateText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
    }

    public void UnitedCustomerSafetyCheck() throws InterruptedException {
        Alerts.click();
        Thread.sleep(1000);
        CustomerSafety.click();
        Thread.sleep(1000);
    }
    public void UnitedValidateCustomerSafetyText(String expectedResult){
        String actualResult = CustomerSafetyValidateText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
    }

    public void UnitedTripOverviewCheck() throws InterruptedException {
        Alerts.click();
        Thread.sleep(1000);
        Overview.click();
        Thread.sleep(1000);
    }
    public void UnitedValidateTripOverviewText(String expectedResult){
        String actualResult = TripsOverviewValidateText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
    }

    public void UnitedBookFlightCheck() throws InterruptedException {
        BookFlightFrom.sendKeys("New York/Newark EWR");
        Thread.sleep(1000);
        BookFlightTo.sendKeys("Calgary YYC");
        Thread.sleep(1000);
        FindFlight.click();
        Thread.sleep(3000);
    }
    public void UnitedValidateBookFlightText(String expectedResult){
        String actualResult = BookFlightValidateText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
    }

    public void UnitedHelpCheck() throws InterruptedException {
        Help.click();
        Thread.sleep(3000);
        BaggageInfo.click();
        Thread.sleep(1000);
        PayOnline.click();
        Thread.sleep(3000);
    }
    public void UnitedValidateHelpText(String expectedResult){
        String actualResult = HelpValidateText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
    }

    public void UnitedLanguagesCheck() throws InterruptedException {
        Languages.click();
        Thread.sleep(1000);
        Change.click();
        Thread.sleep(3000);
    }

    public void UnitedSignInCheck() throws InterruptedException {
        SignIn.click();
        Thread.sleep(1000);
        SignInEmail.click();
        SignInEmail.sendKeys("Arman.hossain496@gmail.com");
        Thread.sleep(1000);
        SignInPassword.sendKeys("ChillPNT");
        Thread.sleep(1000);
        SignInRememberMe.click();
        Thread.sleep(1000);
        SignInButton.click();
        Thread.sleep(3000);
    }
//    public void UnitedValidateSignInText(String expectedResult){
//        String actualResult = HelpValidateText.getText();
//        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
//    }

}
