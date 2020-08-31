package homefunctiontest;

import common.WebAPI;
import homefunction.HomeFunctionPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeFunctionalTest extends WebAPI {

    HomeFunctionPage homeFunctionPage;

    @BeforeMethod
    public void getInit() {
        homeFunctionPage = PageFactory.initElements(driver, HomeFunctionPage.class);
    }
    @Test
    public void testShoppingCart() throws InterruptedException {
        homeFunctionPage.shoppingCart();
    }
    @Test
    public void testCartSignIn() throws InterruptedException {
        homeFunctionPage.cartSignIn();
    }
    @Test
    public void testCartSignInNegative() throws InterruptedException {
        homeFunctionPage.cartSignInNegative();
    }
    @Test
    public void testShoppingCartNegative() throws InterruptedException {
        homeFunctionPage.shoppingCartNegative();
    }
    @Test
    public void testSignInButton() throws InterruptedException {
        homeFunctionPage.signInButton();
    }
    @Test
    public void testUseLogIn() throws InterruptedException {
        homeFunctionPage.useLogIn();
    }


}
