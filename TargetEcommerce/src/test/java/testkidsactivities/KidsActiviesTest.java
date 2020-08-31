package testkidsactivities;

import common.WebAPI;
import kidsactivates.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KidsActiviesTest extends WebAPI {

    MainPage mainPage;

    @BeforeMethod
    public void getInit(){
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }
    @Test
    public void testAgeActivesButton() throws InterruptedException {
        mainPage.ageActivesButton();
        mainPage.validateAgeActivesButton();
    }
    @Test
    public void testToysButton() throws InterruptedException {
        mainPage.toysButton();
        mainPage.validateToysButton();
    }
    @Test
    public void testGiftCard() throws InterruptedException {
        mainPage.giftCard();
        mainPage.validationGiftCard();
    }
    @Test
    public void testGiftCorner() throws InterruptedException {
        mainPage.giftCorner();
    }
    @Test
    public void testFindStoreTab() throws InterruptedException {
        mainPage.findStoreTab("11239");
    }



}
