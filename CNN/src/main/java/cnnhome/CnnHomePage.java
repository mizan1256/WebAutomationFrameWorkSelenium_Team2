package cnnhome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static cnnhome.CnnHomePageWebElement.UsText;
import static cnnhome.CnnHomePageWebElement.expectedUsText;


public class CnnHomePage extends WebAPI {


    @FindBy(how = How.XPATH, using = UsText)//33
    public WebElement us;

    @FindBy(how = How.XPATH, using = expectedUsText)//33
    public WebElement expectedUs;


    public void us() throws InterruptedException {// case # 33
        Thread.sleep(3000);
        us.click();

    }

    public void validate_Us() {
        String actualTopDeal = "US";
        Assert.assertEquals(actualTopDeal, expectedUs.getText());
    }
////////////////////////////////////////////////

}
