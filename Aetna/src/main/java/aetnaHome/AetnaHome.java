package aetnaHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import reporting.TestLogger;

import static aetnaHome.AetnaHomeWebElements.*;

public class AetnaHome extends WebAPI {
    @FindBy(how = How.XPATH,using = webElementsContactUsButton) public WebElement contactUsButton;
    @FindBy(how = How.XPATH,using = webElementsContactUsButtonText) public WebElement contactUsButtonText;

    @FindBy(how = How.XPATH,using = webElementsEspanolButton) public WebElement espanolButton;
    @FindBy(how = How.XPATH,using = webElementsEspanolButtonText) public WebElement espanolButtonText;


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
        String actualResult = "Planes de seguro de salud | Aetna";
        Thread.sleep(3000);
        Assert.assertEquals(actualResult,expectedResult, "Text don't match");
    }



}
