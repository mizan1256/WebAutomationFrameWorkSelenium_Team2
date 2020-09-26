package testCnnHomePage;
import common.WebAPI;
import livetv.LiveTvHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class LiveTvHomeTest extends WebAPI{
    LiveTvHome liveTvHome;

    @BeforeMethod
    public void getInIt(){
        liveTvHome = PageFactory.initElements(driver,LiveTvHome.class);
    }
    @Test
    public void testLiveTvButtonCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        liveTvHome.liveTvButtonCheck();
        liveTvHome.validateLiveTvButtoncheck("Covid-19 latest");
    }
    @Test (enabled = true)
    public void testTvChannelButton() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        liveTvHome.tvChannelButton();
        liveTvHome.validateTvChannelButton("Login");
    }
    @Test (enabled = true)
    public void testChannelCloseOption() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        liveTvHome.channelCloseOption();
        liveTvHome.validateChannelCloseOption("News Shows");
    }
    @Test(enabled = true)
    public void testLindaVoiceVideoCheck() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        liveTvHome.lindaVoiceVideoCheck();
        liveTvHome.validatelindaVoiceVideoCheck("US");
    }
    @Test(enabled = true)
    public void testLiveTvPlayButton() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        liveTvHome.liveTvPlayButton();
//        liveTvHome.validatelindaVoiceVideoCheck("US");
    }
    @Test(enabled = true)
    public void testSetLocation() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        liveTvHome.setLocation();
        liveTvHome.validateSetLocation("Register");
    }
    @Test(enabled = true)
    public void testSetLocationSignUp() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        liveTvHome.setLocationSignUp();
        liveTvHome.validateSetLocationSignUp("This account already exists. Please log in.");
    }

}
