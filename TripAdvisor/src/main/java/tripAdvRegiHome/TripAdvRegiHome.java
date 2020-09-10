package tripAdvRegiHome;

import common.WebAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static tripAdvRegiHome.TripAvdRegiWebElement.*;
import static tripAdvisorHome.TripAdvisorWebElement.webElementHotelsButton;

public class TripAdvRegiHome extends WebAPI {
    @FindBy(how = How.XPATH, using = webElementSignInButton) public WebElement signInButton;
    @FindBy(how = How.XPATH, using = webElementIMNotRobot) public WebElement iMNotRobotCheck;
    @FindBy(how = How.XPATH, using = webElementContinueWithEmailButton) public WebElement continueWithEmailButton;
    @FindBy(how = How.XPATH, using = webElementSignUpButton) public WebElement signUpButton;
    @FindBy(how = How.XPATH,using = webElementEmailBox) public WebElement emailBox;
    @FindBy(how = How.XPATH, using = webElementPasswordBox) public WebElement passwordBox;
    @FindBy(how = How.XPATH, using = webElementJoinButton) public WebElement joinButton;
    @FindBy(how = How.XPATH, using = webElementRegIFrame) public WebElement tripAdvRegIFrame;

    // Action Method
    public void signUpTripAdvisor() throws InterruptedException {
        signInButton.click();
        Thread.sleep(3000);
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='_30pzQStV']"))); // This line or, line 27.
        driver.switchTo().frame(tripAdvRegIFrame);

//        String newWindow = driver.getWindowHandle(); // PopUp new window we use this line
//        driver.switchTo().window(newWindow);

//        iMNotRobotCheck.click();
//        Thread.sleep(3000);
        continueWithEmailButton.click();
        Thread.sleep(3000);
        signUpButton.click();
        Thread.sleep(3000);
        emailBox.clear();
        emailBox.sendKeys("zakerin.nyc@gmail.com");
        Thread.sleep(3000);
        passwordBox.clear();
        passwordBox.sendKeys("#%honeyTA999");
        Thread.sleep(3000);
//        joinButton.click();
//        Thread.sleep(3000);
    }
//    public void hotelButtonIsClickable(){
//        hotelButton.click();
}
