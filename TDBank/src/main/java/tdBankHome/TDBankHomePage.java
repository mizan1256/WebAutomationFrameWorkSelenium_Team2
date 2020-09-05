package tdBankHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static tdBankHome.TDBankWebElements.*;

public class TDBankHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = homePageTDBankLogo)
    public WebElement tdBankLogo;

    //    Action Method
    public void tdBankLogoIsDisplayed() {
        tdBankLogo.isDisplayed();
    }

    //    Action Method
    public void tdBankSmallBusinessTab() throws InterruptedException {
        clickOnElement(homePageSmallBusinessTab);
        Thread.sleep(3000);
    }

    //  Validate Method
    public void validateTDBankSmallBusinessTab(String expectedResult) {
        String actualResult = getTextByXpath(homePageSmallBusinessHeadlinesText);
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println("PASSED");
    }

    //    Action Method
    public void tdBankCommercialTab() throws InterruptedException {
        clickOnElement(homePageCommercialTab);
        clickOnElement(homePageCommTabLearnButton);
        Thread.sleep(2000);
    }

    //  Validate Method
    public void validateTDBankCommercialTab(String expectedResult) {
        String actualResult = getTextByXpath(homePageCommTabCheckText);
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println("PASSED");
    }

    //  Action Method
    public void tdBankCommercialLearnBox() throws InterruptedException {
        tdBankCommercialTab();
        clickOnElement(homePageCommTabLearnBox);
    //  clickOnElement(homePageCommTabLearnButton);
        Thread.sleep(2000);
    }

    //  Validate Method
    public void validateTDBankCommercialLearnBox(String expectedResult) {
        String actualResult = getTextByXpath(homePageCommTabLearnBoxCheckText);
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println("PASSED");
    }

    // Action Method
    public void investingAndWealthTab(String expectedResult) {
        clickOnElement(homePageInvestingWealthTab);
        clickOnElement(investingWealthIndividualFamily);
    //  validate
        String actualResult = getTextByXpath(investingWealthCheckText);
        Assert.assertEquals(actualResult, expectedResult);
    }


}