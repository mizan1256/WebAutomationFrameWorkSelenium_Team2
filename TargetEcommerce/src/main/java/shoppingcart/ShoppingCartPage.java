package shoppingcart;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static shoppingcart.ShoppingCartWebElement.*;


public class ShoppingCartPage extends WebAPI {
    @FindBy(how = How.XPATH, using = shoppingCartLogo)
    public WebElement shoppInCartLogo;
    @FindBy(how = How.XPATH, using = shoppingCartLogoText)
    public WebElement shoppingCartText;
    @FindBy(how = How.XPATH, using = signInEmailIdBox)
    public WebElement signInEmailId;
    @FindBy(how = How.XPATH, using = signInPasswordBox)
    public WebElement signInPassword;
    @FindBy(how = How.XPATH, using = shoppingCartSignInButton)
    public WebElement shoppingCartSignIn;
    @FindBy(how = How.XPATH, using = finalSignInbutton)
    public WebElement finalSignIn;

    public void shoppingCartLogoIsDisplay() {
        shoppInCartLogo.isDisplayed();
        System.out.println("Shoping cart logo is displayed :" + shoppInCartLogo.isDisplayed());
    }

    public void shoppingCartLogoIsClickable() {
        shoppInCartLogo.click();
    }

    public void validateShoppingCartLogoIsClickable() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult = shoppingCartText.getText();
        System.out.println(shoppingCartText.getText());
        Thread.sleep(3000);
        String expectedresult = "Your cart is empty";
        Assert.assertEquals(actualResult, expectedresult, "Test case not match");
    }

    /**
     * Shopping Cart Fanctional test
     */
    public void shoppingInCartLogIn() throws InterruptedException {
        shoppingCartLogoIsClickable();
        shoppingCartSignIn.click();
        signInEmailId.sendKeys("mizan_1256@yahoo.com");
        signInPassword.sendKeys("Tasmi1256");
        finalSignIn.click();
        Thread.sleep(3000);
    }

    public void validateShoppInCartLogIn() {
        Assert.assertEquals("Target : Expect More. Pay Less.", driver.getTitle());
    }
}
