package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageWebElement.*;

public class HomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = opinionButton) public WebElement opinion;
    @FindBy(how = How.XPATH, using = opinionWordText) public WebElement opinionText;

    @FindBy(how = How.XPATH, using = usButton) public WebElement us;
    @FindBy(how = How.XPATH, using = usWordText) public WebElement usText;

    @FindBy(how = How.XPATH, using = dropDownEdition) public WebElement edition;
    @FindBy(how = How.XPATH, using = dropDownInternational) public WebElement international;
    @FindBy(how = How.XPATH, using = validateCovid19Text) public WebElement covid19Text;

    @FindBy(how = How.XPATH, using = dropDownArabic) public WebElement arabic;
    @FindBy(how = How.XPATH, using = validateArabicText) public WebElement arabicText;

    @FindBy(how = How.XPATH, using = cnnLogo) public WebElement logo;

    @FindBy(how = How.XPATH, using = openMenuTab) public WebElement openMenu;
    @FindBy(how = How.XPATH, using = searchBox) public WebElement search;
    @FindBy(how = How.XPATH, using = searchButton) public WebElement searchButt;



//    Action Method
    public void opinionButton(){
        opinion.click();
    }
//    Validation
    public void validateOpinionButton(){
        String actualResult=opinionText.getText();
        String expectedResult="Opinion";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
//    Action Method
    public void usButton(){
        us.click();
    }
//    Validation
    public void validateUsButton(){
        String expectedResult=usText.getText();
        String actualResult = "US";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
//    Action Method
    public void dropDownEditionButton(){
        edition.click();
        international.click();
    }
//    Validation
    public void validateDropDownEditionButton(){
        String actualResult = "COVID-19:";
        String expectedResult = covid19Text.getText();
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
//    Action Method
    public void dropDownArabic(){
        edition.click();
        arabic.click();
    }
//    Validation
    public void validateDropDownArabic(){
        String actualResult = "صفحات خاصة";
        String expectedResult = arabicText.getText();
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
//  Action Method
    public void cnnLogoIsDisplayed(){
        logo.isDisplayed();
    }

//    Action Method
    public void burgerButtonCheck(){
        openMenu.click();
        search.sendKeys("News");
        searchButt.click();
    }

}
