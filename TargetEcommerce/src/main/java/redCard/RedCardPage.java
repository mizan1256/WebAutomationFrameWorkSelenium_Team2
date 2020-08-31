package redCard;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static redCard.RedPageWebElement.*;

public class RedCardPage extends WebAPI {

    @FindBy(how = How.XPATH, using= redCardText)//.16
    public WebElement redCard;
//    @FindBy(how = How.XPATH, using= expectedRedCardText)//.16
//    public WebElement expectedRCard;

    public void redCardText() throws InterruptedException {// case # 16
        Thread.sleep(3000);
        redCard.click();
    }
    public void validate_RedCardText() throws InterruptedException {
        String actualResult="RedCard : Save 5% at Target";
        String expectedResult= driver.getTitle();
        Assert.assertEquals(actualResult,expectedResult);
        Thread.sleep(3000);
    }
    //////////////// case # 17

    @FindBy(how = How.XPATH, using= exclusiveText)//.17
    public WebElement exclusive;
    @FindBy(how = How.XPATH, using= expectedExclusiveText)//.17
    public WebElement expectedExclusive;

    public void exclusiveText() throws InterruptedException {// case # 17
        redCardText();
        Thread.sleep(3000);
        exclusive.click();
    }
    public void validate_ExclusiveText() throws InterruptedException {
        String actualResult="RedCard Exclusives";
        String expectedResult= expectedExclusive.getText();
        Assert.assertEquals(actualResult,expectedResult);
        Thread.sleep(3000);
    }
    /////////////////// case #18
    @FindBy(how = How.XPATH, using= benefitText)//.18
    public WebElement benefit;
    @FindBy(how = How.XPATH, using= showMoreButton)//.18
    public WebElement showMore;
    @FindBy(how = How.XPATH, using= expectedSMButton)//.18
    public WebElement expectedSM;

    public void benefitText() throws InterruptedException {// case # 18
        redCardText();
        Thread.sleep(3000);
        benefit.click();
        Thread.sleep(3000);
        showMore.click();
    }
    public void validate_benefitText() throws InterruptedException {
        String actualResult="Drive Up";
        String expectedResult= expectedSM.getText();
        Assert.assertEquals(actualResult,expectedResult);
        Thread.sleep(3000);
    }
    /////////////////////// case #19
    @FindBy(how = How.XPATH, using= programRuleText)//.19
    public WebElement programRule;
    @FindBy(how = How.XPATH, using= targetLogoFooter)//.19
    public WebElement targetLogo;

    public void programRuleText() throws InterruptedException {// case # 19
        redCardText();
        Thread.sleep(3000);
        programRule.click();
        Thread.sleep(3000);
        targetLogo.click();
    }
    public void validate_programRuleText() throws InterruptedException {
        String actualResult="RedCard : Save 5% at Target";
        String expectedResult= driver.getTitle();
        Assert.assertEquals(actualResult,expectedResult);
        Thread.sleep(3000);
    }

}
