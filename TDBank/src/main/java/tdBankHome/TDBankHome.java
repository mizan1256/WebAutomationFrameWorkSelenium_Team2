package tdBankHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static tdBankHome.TDBankWebElements.*;

public class TDBankHome extends WebAPI {


    @FindBy(how = How.XPATH, using = webElementsLogoIsDisplay) public WebElement LogoIsDisplay;






    public void geicoSearchCheck() throws InterruptedException {

        Thread.sleep(1000);

    }
    public void validateSearchText(String expectedResult){

    }


}
