package testHome;

import common.WebAPI;
import order.OrderPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrderPageTest extends WebAPI {
 OrderPage orderPage;

    @BeforeMethod
    public void getInit() {
        orderPage = PageFactory.initElements(driver, OrderPage.class);
    }

    @Test
    public void testOrderBox() throws InterruptedException {
        orderPage.searchOrderBUttonClickable();
        orderPage.validateOrderBoxText();
    }
@Test
    public void testEmailBoxDisplay() throws InterruptedException {
        orderPage.searchEmailDisplay();
    }
    @Test
    public void testSignInBoxDisplay() throws InterruptedException {
        orderPage. searchSignInBoxDisplay();
    }
    @Test
    public void testCreatAccountDisplay() throws InterruptedException {
        orderPage. searchCreatAccountButtonDisplay();
    }


    }
