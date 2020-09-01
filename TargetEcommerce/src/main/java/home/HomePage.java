package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageWebElement.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH,using = webElementTergetLogo) public WebElement tergetLogo;
    @FindBy(how = How.XPATH,using = webElementRegistryButton) public WebElement registryButton;
    @FindBy(how = How.XPATH,using = webElementHalloweenButton) public WebElement halloweenButton;
    @FindBy(how = How.XPATH,using = webElementMoreButton) public WebElement moreButton;
    @FindBy(how = How.XPATH, using = webElementSameDayDeliveryButton) public WebElement sameDayDeliveryButton;
    @FindBy(how = How.XPATH, using = webElementImage) public WebElement homepageImage;
    @FindBy(how = How.XPATH, using = webElementBabyButton) public WebElement babyButton;
    @FindBy(how = How.XPATH, using = webElementClearanceButton) public WebElement clearanceButton;


//    Action Method
    public void tergetLogoIsDisplayed(){
        tergetLogo.isDisplayed();
    }
//    Action Method
    public void registryLandedPage(){
        registryButton.click();
    }
//    Action Method
    public void actionHalloweenButton(){
        halloweenButton.click();
    }
//    Action Method
    public void ActionMoreButton(){
        moreButton.click();
    }
//    Action Method
    public void actionSameDayDeliveryButton() throws InterruptedException {
        sameDayDeliveryButton.isDisplayed();
        Thread.sleep(3000);
        sameDayDeliveryButton.click();
        Thread.sleep(2000);
    }
//    Action Method
    public void actionHomePageImage(){
        homepageImage.isDisplayed();
    }
//    Action Method
    public void actionBabyButton() throws InterruptedException {
        babyButton.click();
        Thread.sleep(4000);
    }
//    Validation
    public void validationHomePageImage(){
      String actualResult=babyButton.getText();
      String expectedResult="Baby";
      Assert.assertEquals(actualResult,expectedResult,"Do not match");
    }
//    Action Method
    public void actionClearanceButton() throws InterruptedException {
        clearanceButton.click();
        Thread.sleep(4000);
    }
//    Validation
    public void validationClearanceButton(){
        String actualResult= clearanceButton.getText();
        String expectedResult="Home Clearance";
        Assert.assertEquals(actualResult,expectedResult,"Do not match");
    }

}
