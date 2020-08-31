package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePagewebElements.*;

public class HomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = webElementSearchBox) public WebElement searchBox;
    @FindBy(how = How.CSS, using = webElementSearchButton) public WebElement searchButton;
    @FindBy(how = How.XPATH, using = webElementSearchText) public WebElement searchText;
    @FindBy(how = How.XPATH, using = webElementTargetLogo) public WebElement targetLogo;
    @FindBy(how = How.XPATH, using = disposableMaskText) public WebElement faceMask;
    @FindBy(how =How.XPATH, using = clothMasks) public WebElement clothMask;
    @FindBy(how = How.XPATH, using = clearanceImg) public WebElement clearance;
    @FindBy(how = How.XPATH, using = webElementFurnitureClerance)public WebElement furnitureClearance;
    @FindBy(how = How.XPATH, using = webElementFilterResultText) public WebElement filterText;
    @FindBy(how = How.XPATH, using = weeklyAdTab) public WebElement weeklyAd;
    @FindBy(how = How.XPATH, using = showTargetLogo) public WebElement showLogo;
    @FindBy(how = How.XPATH, using = landGiftCard) public WebElement giftCard;
    @FindBy(how = How.XPATH, using = giftCatdText) public WebElement cardText;
    @FindBy(how = How.XPATH, using = checkYourBalance) public WebElement checkBalance;
    @FindBy(how = How.XPATH, using = cardBalanceText) public WebElement balanceText;
    @FindBy(how = How.XPATH, using = checkEmailButton) public WebElement checkEmail;
    @FindBy(how = How.XPATH,using = checkMailButton) public WebElement checkMail;

//Action Method with Validation
    public void searchBoxIsDisplayed(){
        searchBox.isDisplayed();
        System.out.println("EASY FOR EVERYONE");
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='search']")).isDisplayed());
    }
//    Action Method
    public void searchBoxCheck(String searchItem){
        searchBox.sendKeys(searchItem);
        searchButton.click();
    }
   // validate Method
    public void validateSearchText() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult=searchText.getText();
        String expectedResult= "Registry";
        System.out.println("EASY FOR EVERYONE");
        Assert.assertEquals(actualResult,expectedResult,"Search Item not match");
    }
    //    Action Methiod
    public void disposableMaskIsDisplayed(String searchItem) {
    searchBox.sendKeys(searchItem);
    searchButton.click();
    clothMask.click();
}
    // Validation
    public void validateFaceMasks() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult=faceMask.getText();
        String expectedResult= "Registry";
        System.out.println("EASY FOR EVERYONE");
        Assert.assertEquals(actualResult,expectedResult,"Search Item not match");
    }
//Action Method with validation
    public void targetLogoIsDisplayed(){
        targetLogo.isDisplayed();
        System.out.println("EASY FOR EVERYONE");
        Assert.assertTrue(driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M12 1c6.07')]")).isDisplayed());
    }
//Action Method
    public void clearanceImage() throws InterruptedException {
        Thread.sleep(3000);
        clearance.click();
        Thread.sleep(3000);
        furnitureClearance.click();
    }
//    Validation
    public void validateClearanceImage(){
        String actualresult = filterText.getText();
        String expectedResult = "Filter results";
        System.out.println("EASY FOR EVERYONE");
        Assert.assertEquals(actualresult,expectedResult,"Not Match");
    }
    //Action Method with Validation
    public void weeklyAdClickable(){
        weeklyAd.click();
        showLogo.isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//img[@class='svg']")).isDisplayed());
        System.out.println("EASY FOR EVERYONE");
    }
//    Action Method
    public void giftCardPageLanded(){
        giftCard.click();
    }
//    Validation
    public void validateGiftCardPageLanded(){
        String actualresult = cardText.getText();
        String expectedResult = "Homepage";
        Assert.assertEquals(actualresult,expectedResult);
        System.out.println("PASSED");
    }
//    Action Method
    public void checkYourBalance() throws InterruptedException {
        giftCard.click();
        Thread.sleep(7000);
        checkBalance.click();
    }
//  Validation
    public void validateCheckYourBalance(){
        String actualResult = balanceText.getText();
        String expectedResult= "Check a gift card balance";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
    //    Action Method
    public void checkEmailButton() throws InterruptedException {
        giftCard.click();
        Thread.sleep(7000);
        checkEmail.click();
    }
    //  Validation
    public void validateCheckEmailButton(){
        String actualResult = cardText.getText();
        String expectedResult= "Gift Cards";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
    //    Action Method
    public void checkMailButton() throws InterruptedException {
        giftCard.click();
        Thread.sleep(7000);
        checkMail.click();
    }
    //  Validation
    public void validateCheckMailButton(){
        String actualResult = cardText.getText();
        String expectedResult= "Gift Cards";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }

}

