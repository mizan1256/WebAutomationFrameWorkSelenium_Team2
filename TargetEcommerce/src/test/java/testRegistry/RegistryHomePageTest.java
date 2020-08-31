package testRegistry;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import registry.RegistryHome;

public class RegistryHomePageTest extends WebAPI {

    RegistryHome myRegistry;

    @BeforeMethod
    public void getInIt(){
        myRegistry= PageFactory.initElements(driver, RegistryHome.class);
    }


    @Test//20
    public void testing_validate_ExclusiveText() throws InterruptedException {
        myRegistry.registryTest();
        myRegistry.validate_RegistryTest();
    }
    @Test//21
    public void testing_Validate_createWeddingRegistryButton() throws InterruptedException {
        myRegistry.createWeddingRegistryButton();
        myRegistry.validate_createWeddingRegistryButton();
    }
    @Test//22
    public void testing_Validate_CollegeRegistryButton() throws InterruptedException {
        myRegistry.collegeRegistryButton();
        myRegistry.validate_CollegeRegistryButton();
    }
    @Test//23
    public void testing_Validate_CreateCustomRegistryButton() throws InterruptedException {
        myRegistry.createCustomRegistryButton();
        myRegistry.validate_CreateCustomRegistryButton();
    }
    @Test//24
    public void testing_Validate_houseWarmingRegistryButton() throws InterruptedException {
        myRegistry.houseWarmingRegistryButton();
        myRegistry.validate_HouseWarmingRegistryButton();
    }
    @Test//25
    public void testing_Validate_createKidsWishList() throws InterruptedException {
        myRegistry.createKidsWishList();
        myRegistry.validate_createKidsWishList();
    }
    @Test//26
    public void testing_Validate_FindClassListButton() throws InterruptedException {
        myRegistry.findClassListButton();
        myRegistry.validate_FindClassListButton();
    }
    @Test//27
    public void testing_Validate_FirstLastNameBox() throws InterruptedException {
        myRegistry.firstLastNameBox();
        myRegistry.validate_FirstLastNameBox();
    }
}
