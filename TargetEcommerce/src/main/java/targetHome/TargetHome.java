package targetHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


import static targetHome.TargetWebElements.*;

public class TargetHome extends WebAPI {

    @FindBy(how= How.XPATH, using = webElementsLogo) public WebElement targetLogo;
    @FindBy (how=How.XPATH, using = webElementsShoppingCard) public WebElement shoppingCard;


    public void targetLogoDisplayCheck(){
        targetLogo.isDisplayed();
    }

    public void targetLogoIsClickable(){
        targetLogo.click();
    }
    public void validateTargetLogoIsClickable(){
        // System.out.println(driver.getTitle());
        Assert.assertEquals("Target : Expect More. Pay Less.",driver.getTitle());
    }

}
