package aetnaHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static aetnaHome.AetnaWebElements.*;


public class AetnaHome extends WebAPI {


    @FindBy(how = How.XPATH, using = webElementsLogoIsDisplay) public WebElement LogoIsDisplay;

    @FindBy(how = How.XPATH, using = webElementsContactUs) public WebElement ContactUs;
    @FindBy(how = How.XPATH, using = webElementsGeneralInquiries) public WebElement GeneralInquiries;
    @FindBy(how = How.XPATH, using = webElementsInvestor) public WebElement Investor;
    @FindBy(how = How.XPATH, using = webElementsContactUsValidateText) public WebElement ContactUsValidateText;
    @FindBy(how = How.XPATH, using = webElementsReadMore) public WebElement ReadMore;

    @FindBy(how = How.XPATH, using = webElementsMemberSupport) public WebElement MemberSupport;
    @FindBy(how = How.XPATH, using = webElementsAccountManage) public WebElement AccountManage;
    @FindBy(how = How.XPATH, using = webElementsFindDoctor) public WebElement FindDoctor;
    @FindBy(how = How.XPATH, using = webElementsPlanForEmployer) public WebElement PlanForEmployer;
    @FindBy(how = How.XPATH, using = webElementsZipCode) public WebElement ZipCode;
    @FindBy(how = How.XPATH, using = webElementsClickZipCode) public WebElement ClickZipCode;
    @FindBy(how = How.XPATH, using = webElementsSearch) public WebElement Search;
    @FindBy(how = How.XPATH, using = webElementsMetroNY) public WebElement MetroNY;
    @FindBy(how = How.XPATH, using = webElementsContinue) public WebElement Continue;
    @FindBy(how = How.XPATH, using = webElementsMemberSupportValidateText) public WebElement MemberSupportValidateText;

    @FindBy(how = How.XPATH, using = webElementsExplore) public WebElement Explore;
    @FindBy(how = How.XPATH, using = webElementsCareers) public WebElement Careers;
    @FindBy(how = How.XPATH, using = webElementsExploreZipCode) public WebElement ExploreZipCode;
    @FindBy(how = How.XPATH, using = webElementsExploreSearch) public WebElement ExploreSearch;
    @FindBy(how = How.XPATH, using = webElementsExploreStore) public WebElement ExploreStore;
    @FindBy(how = How.XPATH, using = webElementsExploreValidateText) public WebElement ExploreValidateText;

    @FindBy(how = How.XPATH, using = webElementsLogIn) public WebElement LogIn;
    @FindBy(how = How.XPATH, using = webElementsEmployer) public WebElement Employer;
    @FindBy(how = How.XPATH, using = webElementsUserName) public WebElement UserName;
    @FindBy(how = How.XPATH, using = webElementsPassword) public WebElement Password;
    @FindBy(how = How.XPATH, using = webElementsSignIn) public WebElement SignIn;
    @FindBy(how = How.XPATH, using = webElementsLogInValidateText) public WebElement LogInValidateTex;




    public void aetnaLogoIsDisplay(){
        LogoIsDisplay.isDisplayed();
    }

    public void aetnaContactUs() throws InterruptedException {
        ContactUs.click();
        Thread.sleep(1000);
        GeneralInquiries.click();
        Thread.sleep(1000);
        Investor.click();
        Thread.sleep(1000);
        ReadMore.click();
        Thread.sleep(1000);
    }
    public void aetnaContactUsValidateText (String expectedResult){
        String actualResult = ContactUsValidateText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
    }

    public void aetnaMemberSupport() throws InterruptedException {
        MemberSupport.click();
        Thread.sleep(1000);
        MemberSupport.click();
        AccountManage.click();
        //AccountManage.click();
        Thread.sleep(1000);
        FindDoctor.click();
        Thread.sleep(1000);
        PlanForEmployer.click();
        Thread.sleep(1000);
        ZipCode.sendKeys("11208");
        Thread.sleep(1000);
        ClickZipCode.click();
        Thread.sleep(1000);
        Search.click();
        Thread.sleep(1000);
        MetroNY.click();
        Thread.sleep(1000);
        Continue.click();
        Thread.sleep(1000);
    }
    public void aetnaMemberSupportValidateText (String expectedResult){
        String actualResult = MemberSupportValidateText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
    }

    public void aetnaExplore() throws InterruptedException {
        Explore.click();
        Thread.sleep(2000);
        Explore.click();
        Thread.sleep(2000);
        Careers.click();
        Thread.sleep(3000);
        ExploreZipCode.sendKeys("11208");
        Thread.sleep(2000);
        ExploreSearch.click();
        Thread.sleep(2000);
        ExploreStore.click();
        Thread.sleep(2000);
    }
    public void aetnaExploreValidateText (String expectedResult){
        String actualResult = ExploreValidateText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
    }

    public void aetnaLogInCheck() throws InterruptedException {
        LogIn.click();
        Thread.sleep(1000);
        Employer.click();
        Thread.sleep(1000);
        UserName.sendKeys("JustChill");
        Password.sendKeys("JustChill");
        Thread.sleep(1000);
        SignIn.click();
        Thread.sleep(2000);
    }
    public void aetnaLogInCheckValidateText (String expectedResult){
        String actualResult = LogInValidateTex.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test didn't pass");
    }



}
