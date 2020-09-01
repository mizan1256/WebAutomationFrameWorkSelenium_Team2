package order;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static order.OrderPageWebElement.*;

public class OrderPage extends WebAPI {
    @FindBy(how = How.XPATH, using = orderButtonClick)
    public static WebElement searchorderButton;

    @FindBy(how = How.XPATH, using = orderButtonClickText)
    public static WebElement checkorderButtonClickText;


    @FindBy(how = How.CSS, using = emailBoxDisplay)
    public static WebElement checkEmailBox;


    @FindBy(how = How.CSS, using = signinButtonDisplay)
    public static WebElement checksigninButtonDisplay;

    @FindBy(how = How.CSS, using = creatAccountButtonDisplay)
    public static WebElement checkCreatAccountButtonDisplay;

    public static void searchOrderBUttonClickable() {
        searchorderButton.click();
    }
    public static void validateOrderBoxText() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actualResult=checkorderButtonClickText.getText();
        String expectedResult="Sign into your Target account";
        Assert.assertEquals(actualResult,expectedResult,"test fail");
    }
    public static void searchEmailDisplay() {
        checkEmailBox.isDisplayed();
    }
    public static void searchSignInBoxDisplay() {
        checksigninButtonDisplay.isDisplayed();
    }
    public static void searchCreatAccountButtonDisplay() {
        checkCreatAccountButtonDisplay.isDisplayed();
    }
}