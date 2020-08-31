package geicohomepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static geicohomepage.GeicoHomeWebElement.*;

public class GeicoHomePage extends WebAPI {

    @FindBy(how = How.XPATH,using = webElementGeicoLogo_Cls) public WebElement logo;

    @FindBy(how = How.XPATH, using = webElementCovidTab) public WebElement covid;

    @FindBy(how = How.XPATH, using = autoBox) public WebElement auto;

//    Action Method
    public void logoIsDisplayed() throws InterruptedException {
        logo.click();
        Thread.sleep(5000);
    }

    public void covidTab(){
        covid.click();
    }
    public void autoTab() throws InterruptedException {
        Thread.sleep(5000);
        auto.click();
    }


}
