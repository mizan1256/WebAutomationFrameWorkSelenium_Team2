package livetv;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static livetv.LiveTvWebElement.*;

public class LiveTvHome extends WebAPI{

    @FindBy(how = How.XPATH,using = liveTvTabButton) public WebElement liveTv;
    @FindBy(how = How.XPATH, using = liveTvChannelButton) public WebElement tvChannelButton;
    @FindBy(how = How.XPATH, using = liveTvBackHome) public WebElement backHome;
    @FindBy(how = How.XPATH, using = homePageText) public WebElement homeText;
    @FindBy(how = How.CLASS_NAME, using = liveTvPlayButton) public WebElement tvPlayButton;
    @FindBy(how = How.XPATH, using = liveTvChannelCnn) public WebElement tvChannelCnn;
    @FindBy(how = How.XPATH, using = liveTvLoginText) public WebElement loginText;
    @FindBy(how = How.XPATH, using = liveTvChannelClose) public WebElement channelClose;
    @FindBy(how = How.XPATH, using = liveTvCloseText) public WebElement closeText;
    @FindBy(how = How.XPATH, using = liveTvLindaVoice) public WebElement lindaVoice;
    @FindBy(how = How.XPATH, using = liveTvLindaVoicePlay) public WebElement lindaVoicePlay;
    @FindBy(how = How.XPATH, using = liveTvLindaVoiceText) public WebElement lindaVoiceText;
    @FindBy(how = How.XPATH, using = cnnZipCodeBox) public WebElement zipCode;
    @FindBy(how = How.XPATH, using = cnnZipCodeLocationSet) public WebElement locationSet;
    @FindBy(how = How.XPATH, using = cnnLocationText) public WebElement locationText;
    @FindBy(how = How.XPATH, using = locationSignUpEmailAddress) public WebElement emailAddress;
    @FindBy(how = How.XPATH, using = locationSignUpPassword) public WebElement password;
    @FindBy(how = How.XPATH, using = locationSignUpRegisterButton) public WebElement registerButton;
    @FindBy(how = How.XPATH, using = locationSignUpValidateText) public WebElement validateText;


    public void liveTvPlayButton() throws InterruptedException {
        liveTv.click();
        Thread.sleep(5000);
        tvPlayButton.submit();
        Thread.sleep(5000);
    }
//    Action Method
    public void liveTvButtonCheck() throws InterruptedException {
        liveTv.click();
        Thread.sleep(2000);
//        tvPlayButton.submit();
        backHome.click();
    }
    // Validate Method
    public void validateLiveTvButtoncheck(String expectedResult) throws InterruptedException {
        Thread.sleep(3000);
        String actualResult=homeText.getText();
        Assert.assertEquals(actualResult,expectedResult,"Search Item not match");
        System.out.println("PASSED");
    }
//    Action Method
    public void tvChannelButton() throws InterruptedException {
        liveTv.click();
        Thread.sleep(3000);
        tvChannelButton.click();
        Thread.sleep(3000);
        tvChannelCnn.click();
        Thread.sleep(3000);
    }
    // Validate Method
    public void validateTvChannelButton(String expectedResult) throws InterruptedException {
        Thread.sleep(3000);
        String actualResult=loginText.getText();
        Assert.assertEquals(actualResult,expectedResult,"Search Item not match");
        System.out.println("PASSED");
    }
//    Action Method
    public void channelCloseOption() throws InterruptedException {
        tvChannelButton();
        channelClose.click();
        Thread.sleep(5000);
    }
    // Validate Method
    public void validateChannelCloseOption(String expectedResult) throws InterruptedException {
        Thread.sleep(3000);
        String actualResult=closeText.getText();
        Assert.assertEquals(actualResult,expectedResult,"Search Item not match");
        System.out.println("PASSED");
    }
// Action Method
    public void lindaVoiceVideoCheck() throws InterruptedException {
        channelCloseOption();
        Thread.sleep(3000);
        lindaVoice.click();
        Thread.sleep(3000);
        lindaVoicePlay.click();
        Thread.sleep(7000);
    }
    // Validate Method
    public void validatelindaVoiceVideoCheck(String expectedResult) throws InterruptedException {
        Thread.sleep(3000);
        String actualResult=lindaVoiceText.getText();
        Assert.assertEquals(actualResult,expectedResult,"Search Item not match");
        System.out.println("PASSED");
    }
//    Action Method
    public void setLocation() throws InterruptedException {
        zipCode.sendKeys("11416");
        locationSet.click();
        Thread.sleep(3000);
    }
    // Validate Method
    public void validateSetLocation(String expectedResult) throws InterruptedException {
        Thread.sleep(3000);
        String actualResult=locationText.getText();
        Assert.assertEquals(actualResult,expectedResult,"Search Item not match");
        System.out.println("PASSED");
    }
    //    Action Method Negative Test (Use same credential)
    public void setLocationSignUp() throws InterruptedException {
        setLocation();
        emailAddress.sendKeys("pnt30235_NY@gmail.com");
        password.sendKeys("Pnt@30235");
        registerButton.click();
        Thread.sleep(4000);
    }
    // Validate Method
    public void validateSetLocationSignUp(String expectedResult) throws InterruptedException {
        Thread.sleep(3000);
        String actualResult=validateText.getText();
        Assert.assertEquals(actualResult,expectedResult,"Search Item not match");
        System.out.println("PASSED");
    }

}
