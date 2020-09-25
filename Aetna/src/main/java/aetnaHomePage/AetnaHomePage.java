package aetnaHomePage;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static aetnaHomePage.AetnaHomePageWebElements.*;

public class AetnaHomePage extends WebAPI {

    //@FindBy Annotations:
    @FindBy(xpath = loginBtn_Xp)
    WebElement loginBtn;

    @FindBy(xpath = memberLoginBtn_Xp)
    WebElement memberLoginBtn;

    @FindBy(xpath = userNameField_Xp)
    WebElement userNameField;

    @FindBy(xpath = passwordField_Xp)
    WebElement passwordField;

    @FindBy(id = secureLoginBtn_Id)
    WebElement secureLoginBtn;

    @FindBy(id = userNameError_Id)
    WebElement userNameErrorMsg;

    @FindBy(id = passwordError_Id)
    WebElement passwordErrorMsg;

    @FindBy(linkText = invalidUserNameAnsPass_LT)
    WebElement invalidUseNameAndPasswordMsg;

    @FindBy(xpath = contactUsBtn_Xp)
    WebElement contactUsBtn;

    @FindBy(xpath = contactAetnaText_Xp)
    WebElement contactAetnaText;

    @FindBy(xpath = generalInquiriesBtn_Xp)
    WebElement generalInquiries;

    @FindBy(xpath = memberServiceBtn_Xp)
    WebElement memberServiceBtn;

    @FindBy(xpath = memberServicePageText_Xp)
    WebElement memberServicePageText;


    @FindBy(xpath = "//ul[@class='megamenu__primary meganav__primary--left']//button[text()='Shop for a plan'][position()=1]")
    WebElement shopForAPlan;

    ////ul[@class='megamenu__primary meganav__primary--left']//button[text()='Shop for a plan'][position()=1]

    @FindBy(xpath = "//ul[@class='megamenu__block--main megamenu__secondarylink--hover']//button[contains(text(),'Health coverage')]")
    WebElement healthCoverageBtn;
    //ul[@class='megamenu__block--main megamenu__secondarylink--hover']//button[contains(text(),'Medicare')]
    //ul[@class='megamenu__block--main megamenu__secondarylink--hover']//child::button[text()='Medicare']
    //div[@class='megamenu__secondary--link megamenu__secondary--inactive secondary__link--selected']//button[contains(text(),'Health coverage')]

    @FindBy(xpath = "//ul[@class='megamenu__tertiary--main']//a[@class='megamenu__tertiary--link link__text--inline--tertiary'][contains(text(),'Find a doctor')]")
    WebElement findADoctor;

    @FindBy(linkText = "Find Aetna Medicare Health Care Professionals")
    WebElement findADoctorPageText;


    //

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
    public WebElement shopForaPlan;

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
    public WebElement findaDoctor;

    @FindBy(how =How.XPATH, using = findADoctorLogoWebElement)
    public WebElement findADoctorLogo;

    @FindBy(how = How.XPATH, using =  secureMemberLogInTextWebElement)
    public WebElement secureMemberLogInText;



    //Action and validate
    public void findADoctor() {
        sleepFor(3);
        clickOnElement(shopForaPlan);
        sleepFor(2);
        clickOnElement(healthCoverageBtn);
        sleepFor(2);
        clickOnElement(findaDoctor);
        sleepFor(3);
    }

    public void validateFindADoctor() {
        String actualText = findADoctorPageText.getText();
        String expectedText = "Find Aetna Medicare Health Care Professionals";
        Assert.assertEquals(actualText, expectedText, "Text doesn't match");
    }


    //Action Method
    public void loginWithUserNameFieldBlank() {
        clickOnElement(loginBtn);
        clickOnElement(memberLoginBtn);
        sleepFor(3);
        typeOnElement(userNameField, "");
        typeOnElement(passwordField, "123456");
        sleepFor(5);
        clickOnElement(secureLoginBtn);
    }

    public void loginWithPasswordFieldBlank() {
        clickOnElement(loginBtn);
        clickOnElement(memberLoginBtn);
        sleepFor(3);
        typeOnElement(userNameField, "pntp.2020");
        typeOnElement(passwordField, "");
        sleepFor(5);
        clickOnElement(secureLoginBtn);
    }

    public void loginWithInvalidUserNameAndPassword() {
        clickOnElement(loginBtn);
        clickOnElement(memberLoginBtn);
        sleepFor(3);
        typeOnElement(userNameField, "asdfgh");
        typeOnElement(passwordField, "12345678");
        sleepFor(5);
        clickOnElement(secureLoginBtn);
    }

    public void checkContactUsBtn() {
        clickOnElement(contactUsBtn);
        sleepFor(2);
    }

    public void checkContactUsMemberService() {
        clickOnElement(contactUsBtn);
        sleepFor(2);
        clickOnElement(generalInquiries);
        clickOnElement(memberServiceBtn);

    }


    //Validate Method
    public void validateLoginWithUserNameFieldBlank() {
        String actualText = userNameErrorMsg.getText();
        String expectedText = "User name is needed to continue";
        Assert.assertEquals(actualText, expectedText, "Text doesn't match");
    }

    public void validateLoginWithPasswordFieldBlank() {
        String actualText = passwordErrorMsg.getText();
        String expectedText = "Password is needed to continue";
        Assert.assertEquals(actualText, expectedText, "Text doesn't match");
    }

    public void validateLoginWithInvalidUserNameAndPassword() {
        String actualText = invalidUseNameAndPasswordMsg.getText();
        String expectedText = "Invalid username or password. Please try again.";
        Assert.assertEquals(actualText, expectedText, "Text doesn't match");
    }

    public void validateContactUsBtn() {
        String actualText = contactAetnaText.getText();
        String expectedText = "Contact Aetna";
        Assert.assertEquals(actualText, expectedText, "Text doesn't match");
    }

    public void validateContactUsMemberService() {
        String actualText = memberServicePageText.getText();
        String expectedText = "Already a member? Email, call or chat with us.";
        Assert.assertEquals(actualText, expectedText, "Text doesn't match");
    }


    //action
    public void shopForAPlanButton() throws InterruptedException {
        shopForaPlan.click();
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
        findaDoctor.click();
        Thread.sleep(3000);
        findADoctorLogo.click();
    }
    public void validateFindADoctorButtonCheck(String expectedResult){
        String actualResult=secureMemberLogInText.getText();
        Assert.assertEquals(actualResult,expectedResult,"Text do not match.");
    }


}
