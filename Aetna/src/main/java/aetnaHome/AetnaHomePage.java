package aetnaHome;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static aetnaHome.AetnaHomePageWebElement.*;

public class AetnaHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = webElementAetnaLogo)
    public WebElement aetnaLogo;
    @FindBy(how = How.XPATH,using = webElementsContactUsButton) public WebElement contactUsButton;
    @FindBy(how = How.XPATH,using = webElementsContactUsButtonText) public WebElement contactUsButtonText;

    @FindBy(how = How.XPATH,using = webElementsEspanolButton) public WebElement espanolButton;
    @FindBy(how = How.XPATH,using = webElementsEspanolButtonText) public WebElement espanolButtonText;

    @FindBy(how = How.XPATH,using = webElementsAetnaSearchBox) public WebElement aethnaSearchBox;
    @FindBy(how = How.XPATH,using = webElementsAetnaSearchBoxText) public WebElement aethnaSearchBoxText;

    @FindBy(how = How.XPATH,using = webElementsAetnaShopForAPlanButton) public WebElement shopForAPlanButton;
    @FindBy(how = How.XPATH,using = webElementAetnaHealthCoverageButton) public WebElement healthCoverageButton;
    @FindBy(how = How.XPATH,using = webElementAetnaStudentsPlanButton) public WebElement studentPlanButton;
    @FindBy(how = How.XPATH,using = webElementAetnaStudentsPlanButtonText) public WebElement studentPlanButtonText;

    @FindBy(how = How.XPATH,using = webElementAetnaFindADoctorHospitalOrPharmacyMenu) public WebElement findADoctorHospitalOrPharmacy;




    //    Action Method
    public void aetnaLogoIsDisplayed(){
        aetnaLogo.isDisplayed();
        System.out.println("Aetna Logo is Displayed " + aetnaLogo.isDisplayed());
    }

    //Action Method
    public void checkContactUsButton(){
        contactUsButton.click();
    }
    //Validate Method
    public void validateCheckContactUsButton(String expectedResult) throws InterruptedException {
        String actualResult=contactUsButtonText.getText();
        Thread.sleep(3000);
        Assert.assertEquals(actualResult,expectedResult,"Text don't Exist");
    }
    //Action Method
    public void checkEspanolButton(){

        espanolButton.click();
    }
    //Validate Method
    public void validateCheckEspanolButton(String expectedResult) throws InterruptedException {
        String actualResult = "";
        Thread.sleep(3000);
        Assert.assertEquals(actualResult,expectedResult, "Text don't match");
    }
    //Action Method
    public void checkAethnaSearchBox() throws InterruptedException {
        aethnaSearchBox.sendKeys("Health Insurance plans");
        Thread.sleep(3000);
        aethnaSearchBox.submit();
    }
    //Validate Method
    public void validateCheckAethnaSearchBox(String expectedResult) throws InterruptedException {
        String actualResult = aethnaSearchBoxText.getText();
        Thread.sleep(3000);
        Assert.assertEquals(actualResult,expectedResult, "Text don't match");
    }
    //Action Method
    public void checkAethnaShopForAPlanButton() throws InterruptedException {
        Thread.sleep(3000);
        shopForAPlanButton.click();
        healthCoverageButton.click();
        Thread.sleep(3000);
        studentPlanButton.click();
    }
    //Validate Method
    public void validateCheckAethnaShopForAPlanButton(String expectedResult) throws InterruptedException {
        String actualResult = "Home | Aetna Student Health";
        Thread.sleep(3000);
        Assert.assertEquals(actualResult,expectedResult, "Text don't match");
    }
    //Action Method
    public void checkFindADoctorHospitalOrPharmacyMenu() throws InterruptedException {
        shopForAPlanButton.click();
        sleepFor(5);
        healthCoverageButton.click();
        Thread.sleep(3000);
        studentPlanButton.click();
        Thread.sleep(3000);
        findADoctorHospitalOrPharmacy.click();
    }
    //Validate Method
    public void validateCheckFindADoctorHospitalOrPharmacyMenu(String expectedResult) throws InterruptedException {
        String actualResult = "Find a Doctor, Hospital or Pharmacy | Aetna Student Health";
        Thread.sleep(3000);
        Assert.assertEquals(actualResult,expectedResult, "Text don't match");
    }





}
