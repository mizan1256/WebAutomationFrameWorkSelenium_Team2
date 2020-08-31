package registry;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static registry.RegistryWebElements.*;

public class RegistryHome extends WebAPI {
    @FindBy(how = How.XPATH, using = registryTest)//.20
    public WebElement registry;
    @FindBy(how = How.XPATH, using = createBabyRegistryButton)//.20
    public WebElement registryButton;
    @FindBy(how = How.XPATH, using = expectedCreateBabyRegistryButton)//.20
    public WebElement expectedRegistry;

    public void registryTest() throws InterruptedException {// case # 20
        registry.click();
        Thread.sleep(3000);
        registryButton.click();
        Thread.sleep(3000);

    }

    public void validate_RegistryTest() throws InterruptedException {
        String actualResult = "Baby registry";
        String expectedResult = expectedRegistry.getText();
        Assert.assertEquals(actualResult, expectedResult);
        Thread.sleep(3000);
    }

    /////////// case # 21
//    @FindBy(how = How.XPATH, using = registryTest)//.20
//    public WebElement registry;
    @FindBy(how = How.XPATH, using = createWeddingRegistryButton)//.20
    public WebElement weddingButton;
    @FindBy(how = How.XPATH, using = expectedWRButton)//.20
    public WebElement expectedWedding;

    public void createWeddingRegistryButton() throws InterruptedException {// case # 21
        registry.click();
        Thread.sleep(3000);
        weddingButton.click();
        Thread.sleep(3000);
    }
    public void validate_createWeddingRegistryButton() throws InterruptedException {
        String actualResult = "Wedding registry";
        String expectedResult = expectedWedding.getText();
        Assert.assertEquals(actualResult, expectedResult);
        Thread.sleep(3000);
    }
    ////////////////////// case #22
    @FindBy(how = How.XPATH, using = collegeRegistryButton)//.22
    public WebElement collegeRegiButton;
    @FindBy(how = How.XPATH, using = expectedWRButton)//.22
    public WebElement expectedWR;

    public void collegeRegistryButton() throws InterruptedException {// case # 22
        registry.click();
        Thread.sleep(3000);
        collegeRegiButton.click();
        Thread.sleep(3000);
    }
    public void validate_CollegeRegistryButton() throws InterruptedException {
        String actualResult = "College registry";
        String expectedResult = expectedWR.getText();
        Assert.assertEquals(actualResult, expectedResult);
        Thread.sleep(3000);
    }
    /////////////////// case #23
    @FindBy(how = How.XPATH, using = createCustomRegistryButton)//.23
    public WebElement customRegistryButton;
    @FindBy(how = How.XPATH, using = expectedCRegistryButton)//.23
    public WebElement expectedCRButton;

    public void createCustomRegistryButton() throws InterruptedException {// case # 23
        registry.click();
        Thread.sleep(3000);
        customRegistryButton.click();
        Thread.sleep(3000);
    }
    public void validate_CreateCustomRegistryButton() throws InterruptedException {
        String actualResult = "Custom registry";
        String expectedResult = expectedCRButton.getText();
        Assert.assertEquals(actualResult, expectedResult);
        Thread.sleep(3000);
    }
    /////////////////// case #24
    @FindBy(how = How.XPATH, using = houseWarmingRegistryButton)//.24
    public WebElement houseWarmingButton;
    @FindBy(how = How.XPATH, using = expectedHWRegistryButton)//.24
    public WebElement expectedHWButton;

    public void houseWarmingRegistryButton() throws InterruptedException {// case # 24
        registry.click();
        Thread.sleep(3000);
        customRegistryButton.click();
        Thread.sleep(3000);
    }
    public void validate_HouseWarmingRegistryButton() throws InterruptedException {
        String actualResult = "Custom registry";
        String expectedResult = expectedHWButton.getText();
        Assert.assertEquals(actualResult, expectedResult);
        Thread.sleep(3000);
    }
    /////////////////// case #25
    @FindBy(how = How.XPATH, using = createKidsWishList)//.25
    public WebElement kidsWishListButton;
    @FindBy(how = How.XPATH, using = expecteKidsWLlistButton)//.25
    public WebElement expectedKHLButton;

    public void createKidsWishList() throws InterruptedException {// case # 25
        registry.click();
        Thread.sleep(3000);
        kidsWishListButton.click();
        Thread.sleep(3000);
    }
    public void validate_createKidsWishList() throws InterruptedException {
        String actualResult = "Kids’ Wish List";
        String expectedResult = expectedKHLButton.getText();
        Assert.assertEquals(actualResult, expectedResult);
        Thread.sleep(3000);
    }
    /////////////////// case #26
    @FindBy(how = How.XPATH, using = findClassListButton)//.26
    public WebElement findCLButton;
    @FindBy(how = How.XPATH, using = expectFindClassButton)//.26
    public WebElement expectedFCButton;

    public void findClassListButton() throws InterruptedException {// case # 26
        registry.click();
        Thread.sleep(3000);
        findCLButton.click();
        Thread.sleep(3000);
    }
    public void validate_FindClassListButton() throws InterruptedException {
        String actualResult = "Kids Wish List";
        String expectedResult = expectedFCButton.getText();
        Assert.assertEquals(actualResult, expectedResult);
        Thread.sleep(3000);
    }
    /////////////////// case #27
    @FindBy(how = How.XPATH, using = firstNameBox)//.27
    public WebElement firstName;
    @FindBy(how = How.XPATH, using = lastNameBox)//.27
    public WebElement lastName;
    @FindBy(how = How.XPATH, using = searchButton)//.27
    public WebElement search;
    @FindBy(how = How.XPATH, using = errorMessage)//.27
    public WebElement error;

    public void firstLastNameBox() throws InterruptedException {// case # 24
        registry.click();
        Thread.sleep(3000);
        firstName.clear();
        firstName.click();
        firstName.sendKeys("jony");
        Thread.sleep(3000);
        lastName.clear();
        lastName.click();
        lastName.sendKeys("hossain");
        Thread.sleep(3000);
        search.click();
        Thread.sleep(3000);
    }
    public void validate_FirstLastNameBox() throws InterruptedException {
        String actualResult = "Sorry, we didn’t find anyone by that name.";
        String expectedResult = error.getText();
        Assert.assertEquals(actualResult, expectedResult);
        Thread.sleep(3000);
    }

}
