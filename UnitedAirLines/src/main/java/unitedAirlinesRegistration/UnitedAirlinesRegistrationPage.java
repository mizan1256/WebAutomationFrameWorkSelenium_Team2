package unitedAirlinesRegistration;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static unitedAirlinesRegistration.UnitedAirlinesRegistrationWebElements.*;

public class UnitedAirlinesRegistrationPage extends WebAPI {

    @FindBy(how = How.XPATH, using = signInButton)
    public WebElement signIn;
    @FindBy(how = How.XPATH, using = signMileagePlusNumber)
    public WebElement mileageNumber;
    @FindBy(how = How.XPATH, using = signInPassword)
    public WebElement password;
    @FindBy(how = How.XPATH, using = signInCreateButton)
    public WebElement signInCreate;

    @FindBy(how = How.XPATH, using = travelStartFromBox)
    public WebElement startFrom;
    @FindBy(how = How.XPATH, using = travelWhereToBox)
    public WebElement whereToBox;
    @FindBy(how = How.XPATH, using = travelDateBox)
    public WebElement dateBox;
    @FindBy(how = How.XPATH, using = travelDateBoxClear)
    public WebElement dateBoxClear;
    @FindBy(how = How.XPATH, using = travelDepartureDate)
    public WebElement departureDate;
    @FindBy(how = How.XPATH, using = travelStartDate)
    public WebElement startDate;
    @FindBy(how = How.XPATH, using = travelArrivalDate)
    public WebElement arrivalDate;
    @FindBy(how = How.XPATH, using = travelEndDate)
    public WebElement endDate;
    @FindBy(how = How.XPATH, using = travellerNumberBox)
    public WebElement passengerBox;
    @FindBy(how = How.XPATH, using = travellerNumberAgeCheck)
    public WebElement ageCheck;
    @FindBy(how = How.XPATH, using = travellerNumberDecreaseButton)
    public WebElement numberDecreaseButton;
    @FindBy(how = How.XPATH, using = travellerNumberOfPassengerBox)
    public WebElement numberOfPassengerBox;
    @FindBy(how = How.XPATH, using = travellerNumberOfPassengerIncrease)
    public WebElement numberIncreaseButton;
    @FindBy(how = How.XPATH, using = travellerNumberButtonClose)
    public WebElement numberCloseButton;
    @FindBy(how = How.XPATH, using = travellerCheckText)
    public WebElement checkText;
    @FindBy(how = How.XPATH, using = travellerClassCheck)
    public WebElement classCheck;


//    Action Method
    public void createSignInAccount() {
        signIn.click();
//        mileageNumber.sendKeys("pnt3023_NY");
//        password.sendKeys("Pnt@30235");
//        signInCreate.click();
    }

//  Action Method
    public void findFlightDestination() throws InterruptedException {
        startFrom.clear();
        Thread.sleep(2000);
        startFrom.sendKeys("New York");
        Thread.sleep(2000);
        whereToBox.sendKeys("Dhaka");
        Thread.sleep(2000);
    }

//  Validate Method
    public void validateFindFlightDestination(String expectedResult) {
        String actualResult = checkText.getText();
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println("PASSED");
    }
//  Action Method
    public void findFlightDateCheck() throws InterruptedException {
        dateBox.click();
        Thread.sleep(2000);
        dateBoxClear.click();
        Thread.sleep(2000);
        arrivalDate.click();
        Thread.sleep(2000);
        startDate.click();
        Thread.sleep(2000);
        departureDate.click();
        Thread.sleep(2000);
        endDate.click();
        Thread.sleep(2000);
    }

//  Validate Method
    public void validatefindFlightDateCheck(String expectedResult) {
        String actualResult = checkText.getText();
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println("PASSED");
    }
//  Action Method
    public void numberOfPassengerCheck() throws InterruptedException {
        passengerBox.click();
        Thread.sleep(2000);
        numberOfPassengerBox.click();
        Thread.sleep(2000);
        numberIncreaseButton.click();
        Thread.sleep(2000);
        numberIncreaseButton.click();
        Thread.sleep(2000);
        numberDecreaseButton.click();
        Thread.sleep(2000);
        numberCloseButton.click();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[@id='cabinType']")).click();
//        Actions action = new Actions(driver);
//        Actions hover = action.moveToElement(driver.findElement(By.xpath("//button[@id='cabinType']")));
//        action.build().perform();
    }

//  Validate Method
    public void validateNumberOfPassengerCheck(String expectedResult) {
        String actualResult = checkText.getText();
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println("PASSED");
    }

//  Action Method
    public void passengerClassCheck() throws InterruptedException {
        mouseHoverByXpath("//button[@id='cabinType']");
        Thread.sleep(3000);
    }

}