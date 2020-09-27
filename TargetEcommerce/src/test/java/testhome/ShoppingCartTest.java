package testhome;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import shoppingcart.ShoppingCartPage;

public class ShoppingCartTest extends WebAPI {
    ShoppingCartPage shoppingCart;
    @BeforeMethod
    public void getInIt() {
        shoppingCart = PageFactory.initElements(driver, ShoppingCartPage.class);
    }
    @Test
    public void testShoppingCartLogoIsDisplay(){
        shoppingCart.shoppingCartLogoIsDisplay();
    }
    @Test
    public void testShoppingCartLogoIsClickable() throws InterruptedException {
        shoppingCart.shoppingCartLogoIsClickable();
        shoppingCart.validateShoppingCartLogoIsClickable();
    }
    @Test
    public void testShoppingCartLogIn() throws InterruptedException {
        shoppingCart.shoppingInCartLogIn();
        shoppingCart.validateShoppingCartLogIn();
    }
}
