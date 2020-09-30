package registry;


import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homefunctiontest.HomePagewebElements.*;

public class RegistryHomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = webElementTargetLogo)public WebElement checkLogo;

    @FindBy(how = How.XPATH, using = webElementSearchText) public WebElement searchText;

    @FindBy(xpath ="//a[@class='Link-sc-1khjl8b-0 kPdxNk'][contains(text(),'Registry')]") public WebElement registryButton;
    @FindBy(xpath = "//h1[@class='h-padding-b-jumbo h-display-inline-block Heading__StyledHeading-sc-6yiixr-0 chGBOr']//span[contains(text(),'Registry')]") public WebElement registryText;

    @FindBy (xpath = "//img[@class='h-display-inline-block styles__RegistryLogo-sc-1v5fzne-1 Afvth']") public WebElement boxLogo;
    @FindBy(xpath = "//span[contains(text(),'find a registry')]") public WebElement valedateText;

    @FindBy(xpath = "//button[contains(text(),'create a baby registry')]") public WebElement createBabyField;
    @FindBy(xpath = "//img[@class='styles__RegistryLogo-sc-13385cm-1 hfuzYL']") public WebElement shoppingCar;

    @FindBy(xpath = "//div[@class='styles__ContentWrapper-vnn8rt-1 iacQrW']//div[2]//a[1]//img[1]") public WebElement appStoreLogo;
    @FindBy(xpath = "//span[contains(text(),'easy for everyone')]") public WebElement easyText;

    // Action Method
    public void logoIsDisplayed(){
        checkLogo.isDisplayed();
    }
    //Action Method
    public void registryButtonIsClickable() throws InterruptedException {
        registryButton.click();
    }
    //Validation
    public void validateRegistryButton() {
        String actualResult= registryText.getText();
        String expectedRuslt="Registry";
        System.out.println("EASY FOR EVERYONE");
        Assert.assertEquals(actualResult,expectedRuslt,"Message");
    }
    //    Action Method
    public void boxLogo(){
        registryButton.click();
        boxLogo.click();
    }
    //    Validate
    public void validateBoxLogo(){
        String actualResult = valedateText.getText();
        String expectedResult = "find a registry";
        System.out.println("EASY FOR EVERYONE");
        Assert.assertEquals(actualResult,expectedResult,"Not Match");
    }
    //    Action Method
    public void creatBabyRegistry() throws InterruptedException {
        registryButton.click();
        Thread.sleep(3000);
        createBabyField.click();
        Thread.sleep(3000);
    }
    //    Validation
    public void validateShoppingCar(){
        System.out.println("EASY FOR EVERYONE");
        Assert.assertTrue(driver.findElement(By.xpath("//img[@class='styles__RegistryLogo-sc-13385cm-1 hfuzYL']")).isDisplayed());
    }
    //    Action Method
    public void appsStroeLogo() throws InterruptedException {
        registryButton.click();
        Thread.sleep(3000);
        createBabyField.click();
        Thread.sleep(3000);
        appStoreLogo.isDisplayed();
    }
    //    Validation
    public void validateAppsStroeLogo(){
        String actualResult = easyText.getText();
        String expectedResult= "EASY FOR EVERYONE";
        System.out.println("EASY FOR EVERYONE");
        Assert.assertEquals(actualResult,expectedResult,"Not Match");
    }
}
