package registry;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static registry.registryHomePageElements.*;

public class RegistryHomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = webElementsRegistry)
    public WebElement registryButton;
    @FindBy(how = How.XPATH, using = webElementsRegistryText)
    public WebElement registryText;
    @FindBy(how = How.XPATH, using = webElementHouseWarmingRegistry)
    public WebElement houseWarmingRegistry;
    @FindBy(how = How.XPATH, using = webElementHouseWarmingRegistryDisplay)
    public WebElement houseWarmingRegistryDisplay;
    @FindBy(how = How.XPATH, using = webElementHouseWarmingRegistryDisplayBrands)
    public WebElement houseWarmingRegistryBrands;
    @FindBy(how = How.XPATH, using = webElementCreateRegistry)
    public WebElement createRegistry;
    @FindBy(how = How.XPATH, using = webElementsRegistrySignInButton)
    public WebElement registrySignButton;
    @FindBy(how = How.XPATH, using = webElementsRegistrySignInPage)
    public WebElement signInPage;
    @FindBy(how = How.XPATH, using = webElementsFindList)
    public WebElement findList;
    @FindBy(how = How.XPATH, using = webElementsReadyForSchool)
    public WebElement readyForSchool;
    @FindBy(how = How.XPATH, using = webElementsReadyForSchoolText)
    public WebElement readyForSchoolText;

    //Test-11
    //Action Method
    public void checkRegistry() {
        registryButton.click();
    }

    //Validate method
    public void validateCheckRegistry() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'celebrate any milestone')]")).isDisplayed());
    }

    //Test-12
    //Action Method
    public void checkHouseWarmingRegistry() throws InterruptedException {
        registryButton.click();
        Thread.sleep(5000);
        houseWarmingRegistry.click();
        Thread.sleep(4000);
    }

    //Validate method
    public void validateCheckHouseWarmingRegistry() throws InterruptedException {
        String actualResult = "KITCHEN SOLUTIONS";
        Thread.sleep(4000);
        String expectedResult = houseWarmingRegistryDisplay.getText();
        Assert.assertEquals(actualResult, expectedResult, "Not Exist");

    }

    //Test-13
    //Action Method
    public void checkHouseWarmingBrands() throws InterruptedException {
        registryButton.click();
        Thread.sleep(5000);
        houseWarmingRegistry.click();
        Thread.sleep(4000);
    }

    //Validate method
    public void validateCheckHouseWarmingBrands() throws InterruptedException {
        String actualResult = "Housewarming registry";
        Thread.sleep(4000);
        String expectedResult = houseWarmingRegistryBrands.getText();
        Assert.assertEquals(actualResult, expectedResult, "Not Exist");

    }

    //Test-14
    //Action Method
    public void checkCreateRegistry() throws InterruptedException {
        registryButton.click();
        Thread.sleep(3000);
        houseWarmingRegistry.click();
        Thread.sleep(3000);
        createRegistry.click();
        Thread.sleep(2000);
    }

    //Validate method
    public void validateCreateRegistry() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Do you already have a Target.com account?')]")).isDisplayed());
    }

    //Test-15
    //Action Method
    public void checkRegistrySignINButton() throws InterruptedException {
        registryButton.click();
        Thread.sleep(3000);
        houseWarmingRegistry.click();
        Thread.sleep(3000);
        registrySignButton.click();
        Thread.sleep(2000);
    }

    //Validate method
    public void validateCheckRegistrySignINButton() throws InterruptedException {
        String actualResult = "Sign into your Target account";
        Thread.sleep(4000);
        String expectedResult = signInPage.getText();
        Assert.assertEquals(actualResult, expectedResult, "Not Exist");

    }

    //Action Method
    public void checkFindList() throws InterruptedException {
        registryButton.click();
        Thread.sleep(3000);
        findList.click();
        Thread.sleep(3000);
    }

    //Validate Method
    public void validateCheckFindList() throws InterruptedException {
        String actualResult = "School List Assist : Target";
        Thread.sleep(3000);
        String expectedResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Text don't match");
    }

    //Action Method
    public void checkReadyForSchool() throws InterruptedException {
        registryButton.click();
        Thread.sleep(3000);
        findList.click();
        Thread.sleep(3000);
        readyForSchool.click();
        Thread.sleep(3000);
    }
    //Validate method
    public void validateCheckReadyForSchool() throws InterruptedException {
        String actualResult = "Ready for School";
        Thread.sleep(4000);
        String expectedResult = readyForSchoolText.getText();
        Assert.assertEquals(actualResult, expectedResult, "Not Exist");

    }
}
