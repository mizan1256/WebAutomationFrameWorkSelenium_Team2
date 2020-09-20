package testHome;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    HomePage homePage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void TestNavigateToWeeklyAd() {//works
        homePage.navigateToWeeklyAd();
        homePage.validateNavigateToWeeklyAd();
    }

    @Test
    public void TestSearchBox() {//works
    homePage.SearchElement();
    homePage.validateSearchElement();
    }

    @Test
    public void TestNavigate() {//works
        homePage.navigate();
        homePage.validateNaviagte();
    }


    @Test
    public void TestCart() {//works
        homePage.cart();
        homePage.validateCart();
    }
    @Test
    public void TestWishList() {//works
        homePage.wishList();
        homePage.validateWishList();
    }
    @Test
    public void TestMore() {//works
        homePage.moretargetApp();
        homePage.validateMoreTargetApp();
    }
    @Test
    public void TestMorePharmacy() {//works
        homePage.morePharmacy();
        homePage.validateMorePharmacy();

    }
    @Test
    public void TestMorePharmacyToolsForCareGiver() {//works
        homePage.morePharmacyToolsForCareGiver();
        homePage.validateMorePharmacyToolsForCareGiver();

    }
    @Test
    public void TestMoreWhatsNew() {//works
       homePage.moreWhatsNew();
       homePage.validateMoreWhatsNew();

    }
    @Test
    public void TestMoreWhatsNewTrends() {//works
        homePage.MoreWhatsNewTrends();
        homePage.validateMoreWhatsNewTrends();

    }
    @Test
    public void TestMoreWhatsNewSpotLight() {//works
        homePage.MoreWhatsNewSpotLight();
        homePage.validateMoreWhatsNewSpotLight();

    }

    @Test
    public void TestSelectAStore() {//works
        homePage.selectAStore();
        homePage.validateSelectAStore();

    }
    @Test
    public void TestAllTheThingsSchool() throws InterruptedException {//works
        homePage.allTheThingsSchool();
        homePage.validateAllTheThingsSchool();

    }

    @Test
    public void TestSchool1() throws InterruptedException {//works: takes few try
        homePage.school1();
        homePage.validateSchool();
    }

    @Test
    public void TestItemsAddToCart() throws InterruptedException {//works
        homePage.ItemsAddToCart();
        homePage.validateAddToCart();
    }


     @Test
     public void TestKidsHeadPhone() throws InterruptedException {//works
     homePage.kidsHeadPhone();
     homePage.validateKidsHeadPhone();

     }
    @Test
    public void TestReadyForSchool() {//works
        homePage.readyForSchool();
        homePage.validateReadyForSchool();

    }

    @Test
    public void TestPostIt() {//works
        homePage.postIt();
        homePage.validatePostIt();

    }








}
