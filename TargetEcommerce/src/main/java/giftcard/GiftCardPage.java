package giftcard;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static giftcard.GiftCardWebElements.*;

public class GiftCardPage extends WebAPI {
    @FindBy(xpath = "//a[@class='Link-sc-1khjl8b-0 kPdxNk'][contains(text(),'Gift Cards')]")
    WebElement giftCardButton;

    @FindBy(xpath = "//h1[@class='Heading__StyledHeading-sc-1m9kw5a-0 jAsGMN h-margin-b-none']")
    WebElement headerGiftCardPage;

    @FindBy(xpath = "//div[@class='StorycardContainer-lejxwe-0 dvzoVo storycard']//img")
    WebElement gcpShiptImage;

    @FindBy(xpath = "//span[contains(text(),'Shipt Membership Giftcard (Email Delivery)')]")
    WebElement gcpHeaderShiptImageDisplay;

    @FindBy(how = How.XPATH, using =webElementShiptButton)
    public WebElement gcpShiptButton;
    @FindBy(how = How.XPATH, using =webElementShiptButtonClickable)
    public WebElement gcpShiptButtonClickable;
    @FindBy(how = How.XPATH, using = webElementgcpGiftCardForSchoolShoppingBagLogo)
    public WebElement gcpGiftForScLogo;
    @FindBy(how = How.XPATH, using = giftForSchoolChooseOptionButton)
    public WebElement gcpChooseOption;
    @FindBy(how =How.XPATH, using = backToClassGiftCard)
    public WebElement gcpBackToClass;


    public void giftCardButtonCheck(){

        giftCardButton.click();
    }

    public void validateGiftCardButtonCheck() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult=headerGiftCardPage.getText();
        Thread.sleep(3000);
        String expectedResult="Gift Cards";
        Assert.assertEquals(actualResult,expectedResult,"Text do not match");
    }
    public void shiptImageDisplay(){
        giftCardButtonCheck();
        System.out.println("Test case's Image displayed: "+gcpShiptImage.isDisplayed());
    }

    public void gcpShiptImageIsClickAble(){
        giftCardButton.click();
        gcpShiptImage.click();
    }
    public  void validateGcpShiptImageIsClickAble() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals("Shipt Membership Giftcard (Email Delivery) : Target",driver.getTitle());
    }

    public void gcpShiptButtonIsDisplay() throws InterruptedException {
        giftCardButtonCheck();
        Thread.sleep(3000);
        System.out.println("Shipt Button displayed: "+gcpShiptButton.isDisplayed());
    }

    public void gcpShiptButtonIsClickable() throws InterruptedException {
        giftCardButtonCheck();
        Thread.sleep(3000);
        gcpShiptButton.click();
    }
    public void validateGcpShiptButtonIsClickable() throws InterruptedException {
        String actualResult=gcpShiptButtonClickable.getText();
        Thread.sleep(3000);
        String expectedResult="Shipt Membership Giftcard (Email Delivery)";
        System.out.println(actualResult);
        Assert.assertEquals(actualResult,expectedResult,"Text do not match");
    }

    public void gcpGiftCardForSchShoBagLogoIsDisplay(){
        giftCardButtonCheck();
        gcpGiftForScLogo.isDisplayed();
        System.out.println("Gift card for school logo is displayed : "+gcpGiftForScLogo.isDisplayed());
    }

    public void gcpGiftCardForSchoolShoppingBagLogo() throws InterruptedException {
        giftCardButtonCheck();
        Thread.sleep(5000);
        gcpGiftForScLogo.getLocation();
        Thread.sleep(5000);
        gcpGiftForScLogo.click();
    }
    public void validateGcpGiftCardForSchoolShoppingBagLogo() throws InterruptedException {
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        Assert.assertEquals("Gift Cards : Target",driver.getTitle());
    }

    public void gcpGiftForSchoolChooseOption() throws InterruptedException {
        giftCardButtonCheck();
        gcpGiftCardForSchoolShoppingBagLogo();
        Thread.sleep(3000);
        gcpChooseOption.click();
    }
    public void validateGcpGiftForSchoolChooseOption() throws InterruptedException {
        Thread.sleep(5000);
        String actualResult = gcpBackToClass.getText();
        System.out.println(actualResult);
        Assert.assertEquals("Back to Class GiftCard",gcpBackToClass.getText());
    }
}
