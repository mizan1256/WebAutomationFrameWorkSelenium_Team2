package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static home.HomePageWebElements.webElementUsButton;
import static home.HomePageWebElements.webElementUsButtonText;

public class HomePage extends WebAPI {

    @FindBy(how = How.XPATH, using =  webElementUsButton)
    public WebElement searchWebElementUsButton;

    @FindBy(how = How.XPATH, using =  webElementUsButtonText)
    public WebElement searchWebElementUsButtonText;
//Active Method
    public void UsButton() {
        searchWebElementUsButton.click();
    }

//Velidation

    public void validateUsButtonTex() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actualResult = searchWebElementUsButtonText.getText();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String expectedResult = "US";
        Assert.assertEquals(actualResult, expectedResult, "test fail");


    }



    }
