package testDeals;

import common.WebAPI;
import deals.Deals;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DealsPageTest extends WebAPI {
    Deals deals;

    @BeforeMethod
    public void getInit() {
        deals = PageFactory.initElements(driver, Deals.class);
    }



    @Test
    public void TestDeals() {//passed
        deals.deals();
        deals.validateDeals();

    }
    @Test
    public void testGoTopDeals() {//works
        deals.GoTopDeals();
        deals.validateGoTopDeals();

    }
    @Test
    public void testRedCardDeals() {//works
        deals.redCardDeals();
        deals.validateRedCardDeals();

    }
    @Test
    public void testRedCardDeals2() {//works
        deals.redCardDeals2();
        deals.validateRedCardDeals2();

    }

    @Test
    public void testNavigateToTargetCircle() {//works
        deals.navigateToTargetCircle();
        deals.validateNavigateToTargetCircle();
    }
    @Test
    public void testNavigateToForYouTargetCircle(){//works
        deals.navigateToForYouTargetCircle();
        deals.validateNavigateToForYouTargetCircle();
    }


    @Test
    public void testNavigateToAdultBeveragesTargetCircle(){//works
        deals.navigateToAdultBeveragesTargetCircle();
        deals.validateNavigateToAdultBeveragesTargetCircle();

    }

    @Test
    public void testNavigateToApparelTargetCircle() {//works
        deals.navigateToApparelTargetCircle();
        deals.validateNavigateToApparelTargetCircle();
    }


    @Test
    public void testNavigateToBabyTargetCircle() {//works
        deals.navigateToBabyTargetCircle();
        deals.validateNavigateToBabyTargetCircle();

    }
    @Test
    public void testNavigateToBeautyTargetCircle() {//works
        deals.navigateToBeautyTargetCircle();
        deals.validateNavigateToBeautyTargetCircle();
    }
    @Test
    public void testNavigateToFoodTargetCircle() {//works

        deals.navigateToFoodTargetCircle();
        deals.validateNavigateToFoodTargetCircle();
    }

    @Test
    public void testNavigateToHealthTargetCircle() {//works
        deals.navigateToHealthTargetCircle();
        deals.validateNavigateToHealthTargetCircle();
    }


    @Test
    public void testNavigateToHomeTargetCircle() {//works
        deals.navigateToHomeTargetCircle();
        deals.validateNavigateToHomeTargetCircle();
    }
}
