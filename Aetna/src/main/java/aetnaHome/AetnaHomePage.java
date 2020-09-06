package aetnaHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static aetnaHome.AetnaHomePageWebElement.*;

public class AetnaHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = webElementAetnaLogo)
    public WebElement aetnaLogo;


//    Action Method
    public void aetnaLogoIsDisplayed(){
        aetnaLogo.isDisplayed();
        System.out.println("Aetna Logo is Displayed " + aetnaLogo.isDisplayed());
    }
}
