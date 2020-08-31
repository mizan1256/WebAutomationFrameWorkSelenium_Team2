package testRedCard;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import redCard.RedCardPage;

public class RedCardTest extends WebAPI {

    RedCardPage myRedCard;

    @BeforeMethod
    public void getInIt(){
        myRedCard= PageFactory.initElements(driver, RedCardPage.class);
    }

    @Test//16
    public void testing_RedCardText() throws InterruptedException {
        myRedCard.redCardText();
        myRedCard.validate_RedCardText();
    }
    @Test//17
    public void testing_validate_ExclusiveText() throws InterruptedException {
        myRedCard.exclusiveText();
        myRedCard.validate_ExclusiveText();
    }
    @Test//18
    public void testing_validate_benefitText() throws InterruptedException {
        myRedCard.benefitText();
        myRedCard.validate_benefitText();
    }
    @Test//19
    public void testing_validate_programRuleText() throws InterruptedException {
        myRedCard.programRuleText();
        myRedCard.validate_programRuleText();
    }
}
