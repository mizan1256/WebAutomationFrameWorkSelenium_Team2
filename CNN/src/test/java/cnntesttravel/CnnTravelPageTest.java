package cnntesttravel;

import cnnhome.CnnHomePage;
import cnntravel.CnnTravelPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CnnTravelPageTest extends WebAPI {

    CnnTravelPage myTravelPage;

    @BeforeMethod
    public void getInIt(){
        myTravelPage = PageFactory.initElements(driver, CnnTravelPage.class);
    }

    @Test//#57
    public void testing_Validate_TravelDestination() throws InterruptedException {
        myTravelPage.travelDestination();
        myTravelPage.validate_TravelDestination();
    }
    @Test//#58
    public void testing_ValidateFoodDrinkTextXpath() throws InterruptedException {
        myTravelPage.foodDrinkTextXpath();
        myTravelPage.validateFoodDrinkTextXpath();
    }
    @Test//#59
    public void testing_ValidateNewsTextClickable() throws InterruptedException {
        myTravelPage.newsTextClickable();
        myTravelPage.validateNewsTextClickable();
    }
    @Test//#60
    public void testing_ValidateStayTextClickable() throws InterruptedException {
        myTravelPage.stayTextClickable();
        myTravelPage.validateStayTextClickable();
    }

}
