package aetnaHome;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static aetnaHome.AetnaHomeWebElement.*;

public class AetnaHome extends WebAPI{
    @FindBy(how = How.XPATH, using = aetnaLogoWebElement)
    public WebElement aetnaLogo;

    @FindBy(how = How.XPATH, using = keepUpWithYourCareWebElement)
    public WebElement keepUpWithYourCare;

    @FindBy(how = How.XPATH, using = keepUpWithYourCareTextWebElement)
    public WebElement keepUpWithYourCareText;

    @FindBy(how = How.XPATH, using = aetnaMedicareWebElement)
    public WebElement aetnaMedicare;

    @FindBy(how = How.XPATH, using = viewPlansWebElement)
    public WebElement viewPlans;

    @FindBy(how = How.XPATH, using = shopForAPlanWeBElement)
    public WebElement shopForAPlan;

    @FindBy(how = How.XPATH, using = medicareButtonAWebElement)
    public WebElement medicareButton;

    @FindBy(how = How.XPATH, using = browsAetnaMedicarePlanWebElement)
    public  WebElement browsAetnaMedicarePlan;

    @FindBy(how = How.XPATH, using = memberSupportWebElement)
    public WebElement memberSupport;

    @FindBy(how = How.XPATH, using = yourMemberWebsiteWebElement)
    public WebElement yourMemberWebsite;

    @FindBy(how = How.XPATH, using = logIntoYourMemberWebsiteWebElement)
    public WebElement logIntoYourMemberWebste;

    @FindBy(how =How.XPATH, using = findADoctorWebElement)
    public WebElement findADoctor;

    @FindBy(how =How.XPATH, using = findADoctorLogoWebElement)
    public WebElement findADoctorLogo;

    @FindBy(how = How.XPATH, using =  secureMemberLogInTextWebElement)
    public WebElement secureMemberLogInText;



    //action
    public void aetnaLogoIsDisplay(){
        aetnaLogo.isDisplayed();
        System.out.println("Aetna Logo is displayed : "+ aetnaLogo.isDisplayed());
    }

    //action
    public void keepUpWithYourCareButtonCheck(){
        keepUpWithYourCare.click();
    }
    //validate
    public void validateKeepUpWithYourCareButtonCheck(String expectedResult){
        String actualResult= keepUpWithYourCareText.getText();
        Assert.assertEquals(actualResult,expectedResult,"Text do not match");
    }


    //action
    public void aetnaMedicareButtonCheck(){
        aetnaMedicare.click();
        viewPlans.click();
    }
    //validate
    public void validateAetnaMedicareButtonCheck(){
        Assert.assertEquals("Aetna Medicare | Medicare Advantage, Part D & Supplement Plans", driver.getTitle());
    }

    //action
    public void shopForAPlanButton() throws InterruptedException {
        shopForAPlan.click();
        Thread.sleep(5000);
        aetnaMedicare.click();
    }
    //validate
    public void validateShopForAPlan(){

        Assert.assertEquals( "Aetna Medicare | Medicare Advantage, Part D & Supplement Plans",driver.getTitle());
    }

    public void memberSupportButtonCheck() throws InterruptedException {
        memberSupport.sendKeys(Keys.RETURN);
//        mouseHoverByXpath(yourMemberWebsiteWebElement);
//        logIntoYourMemberWebste.click();
    }
    public void validateMemberSupportButtonCheck(){
        Assert.assertEquals("Individual & Family Health Insurance Plans | Aetna",driver.getTitle());
    }
    public void findADoctorButtonCheck() throws InterruptedException {
        findADoctor.click();
        Thread.sleep(3000);
        findADoctorLogo.click();
    }
    public void validateFindADoctorButtonCheck(String expectedResult){
        String actualResult=secureMemberLogInText.getText();
        Assert.assertEquals(actualResult,expectedResult,"Text do not match.");
    }
}
