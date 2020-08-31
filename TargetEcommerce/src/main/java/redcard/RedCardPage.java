package redcard;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static redcard.RedCardWebElement.*;

public class RedCardPage extends WebAPI {

    @FindBy(how = How.XPATH, using = redCardTab) public WebElement redcard;
    @FindBy(how = How.XPATH, using = redBenifitText) public WebElement benifitText;

    @FindBy(how = How.XPATH, using = redExclusives) public WebElement exclusives;
    @FindBy(how = How.XPATH, using = moveToDoor) public WebElement moveText;

    @FindBy(how = How.XPATH, using = showMoreButton) public WebElement showButton;
    @FindBy(how = How.XPATH, using = driveUpText) public WebElement driveText;

    @FindBy(how = How.XPATH, using = moreDetailsClass) public WebElement moreDetails;
    @FindBy(how = How.XPATH, using = aboutThisItemText) public WebElement itemText;
    @FindBy(how = How.XPATH, using = aboutItemText) public WebElement aboutText;

    @FindBy(how = How.XPATH, using = atHomeLearning) public WebElement atHome;
    @FindBy(how = How.XPATH, using = colorPencilsButton) public WebElement colorPencil;
    @FindBy(how = How.XPATH, using = crayolaPencilBoxImage) public WebElement crayolaImg;
    @FindBy(how = How.XPATH, using = coloredPencilsText) public WebElement pencilsText;


//    Action Method
    public void redCardLandedPage(){
        redcard.click();
    }
//    Validation
    public void validateRedCardLandedPage(){
        String actualResult = benifitText.getText();
        String expectedResult= "Benefits";
        Assert.assertEquals(actualResult,expectedResult,"Not Match");
        System.out.println("PASSED");
    }
//  Action Method
    public void redCardExclusivePage() throws InterruptedException {
        redcard.click();
        Thread.sleep(3000);
        exclusives.click();
    }
//    Validation
    public void validateRedCardExclusivePage(){
        String actualResult = moveText.getText();
        String expectedResult = "More to your door";
        Assert.assertEquals(actualResult,expectedResult,"Not Match");
        System.out.println("PASSED");
    }
//  Action Method
    public void showMoreButton(){
        redcard.click();
        showButton.click();
    }
//    Validation
    public void validateShowMoreButton(){
        String actualResult = driveText.getText();
        String expectedResult = "Drive Up";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
//Action Method
public void moreDetailsbutton() throws InterruptedException {
        redcard.click();
        exclusives.click();
        Thread.sleep(2000);
        moreDetails.click();
        Thread.sleep(4000);
//        itemText.isDisplayed();
}
// Validation
    public void validatemoreDetailsbutton(){
        String actualResult = aboutText.getText();
        String expectedResult = "About this item";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
//    Action Method
    public void atHomeLearning() throws InterruptedException {
        atHome.click();
        Thread.sleep(6000);
        colorPencil.click();
        Thread.sleep(2000);
        crayolaImg.isDisplayed();
    }
//    Validation
    public void testAtHomeLearning() throws InterruptedException {
        String actualResult=pencilsText.getText();
        Thread.sleep(3000);
        String expectedResult="Colored Pencils";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }










}
