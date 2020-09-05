package targetHome;

import common.WebAPI;
import datadriven.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;



import java.util.List;

import static targetHome.HomePageWebElement.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = searchBoxByXpath)//...1
    public WebElement searchBox;

    @FindBy(how = How.XPATH, using = searchLogoButtonByXpath)
    public WebElement searchLogoButton;

    @FindBy(how = How.ID, using = searchForProductById)
    public WebElement searchProduct;

    @FindBy(how = How.XPATH, using = searchForProductByXpath_Actual)
    public WebElement actualText;

    @FindBy(how = How.XPATH, using = sameDayDeliveryTargetByXpath)//5
    public WebElement sameDayDelivery;

    @FindBy(how = How.XPATH, using = heartLogoByXpath)//6
    public WebElement heartLogo;

    @FindBy(how = How.XPATH, using = cartLogoByXpath)//7
    public WebElement cartLogo;

    @FindBy(how = How.XPATH, using = expected_helpByXpath)//7
    public WebElement expected;



    ////////////////////////////////////////////
    public void cartLogo_method() {//7 - click on- cart logo- land on the cart page.
        cartLogo.click();
    }

    public void validate_cartLogo_method() throws InterruptedException {
        String actualCartLogo = driver.getTitle();
        Assert.assertEquals(actualCartLogo, driver.getTitle());
        Thread.sleep(2000);
    }

    //////////////////////////////////////////////
    public void heartLogoFavorite_Method() throws InterruptedException {//6 - click on- heart logo- land on the favorite page.
        heartLogo.click();
    }

    public void validate_heartLogoFavorite_Method() throws InterruptedException {
        String actualHeartLogo = driver.getTitle();
        Assert.assertEquals("Your Favorites : Target", driver.getTitle());
        Thread.sleep(2000);
    }
/////////////////////////////////////////

    public void sameDayDeliveryTarget_Method() {//5- click on same day delivery and land on the delivery page.
        sameDayDelivery.click();
    }

    public void validate_sameDayDeliveryTarget_Method() throws InterruptedException {
        String actualSameDayDelivery = driver.getTitle();
        Assert.assertEquals("Same Day Delivery : Target", driver.getTitle());
        Thread.sleep(2000);
    }
//////////////////////////////////////////////////4
    @FindBy(how = How.XPATH, using = dealsTargetHomePageByXpath)//4
    public WebElement deals;

    @FindBy(how = How.XPATH, using = dealsTarget_TopDealsByXpath)//4
    public WebElement topDeals;

    @FindBy(how = How.XPATH, using = expected_topDealText)//7
    public WebElement expected_topDeal;


    public void dealsTarget() throws InterruptedException {// case # 4
        deals.click();
        Thread.sleep(5000);
        topDeals.click();
        Thread.sleep(5000);
    }

    public void validate_DealsTarget() {
        String actualTopDeal = "Top Deals";
        Assert.assertEquals(actualTopDeal, expected_topDeal.getText());
    }
////////////////////////////////////////////////

    public void searchBoxIsDisplayed() throws InterruptedException {// case# 1
        searchBox.isDisplayed();
    }

    public void validating_SearchBoxIsDisplayed() throws InterruptedException {
        Assert.assertEquals("Target : Expect More. Pay Less.", driver.getTitle());
        Thread.sleep(2000);
    }
/////////////////////////////////

    public void searchBoxIsClickable(String searchItem) throws InterruptedException {// case # 2
        Thread.sleep(2000);
        searchBox.sendKeys("candle");
        Thread.sleep(2000);
        searchLogoButton.click();
    }

    public void validating_SearchBoxIsClickable() throws InterruptedException {
        Assert.assertEquals("Target : Expect More. Pay Less.", driver.getTitle());
        Thread.sleep(2000);
    }
//////////////////////////////////////

    public void searchingForProduct_Method(String searchItem) throws InterruptedException { // case # 3
        //searchBoxIsDisplayed();
        searchBox.sendKeys(searchItem);
        searchLogoButton.click();
        Thread.sleep(2000);
    }

    public void validating_SearchingForProduct_Method() throws InterruptedException {
        Thread.sleep(2000);
        String actualResult = actualText.getText();
        Thread.sleep(2000);
        String expectedResult = "“headphones”";
        Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
    }
//////////////////////////////////////
//// case-9--create target acount-sign in/e-mail/pass/click create button//......9
    @FindBy(how = How.XPATH, using = signInTarget)
    public WebElement signIn;
    @FindBy(how = How.XPATH, using = signInTextFromList)
    public WebElement signInText;
    @FindBy(how = How.XPATH,using = emailBox)
    public WebElement email;
    @FindBy(how = How.XPATH,using = passwordBox)
    public WebElement password;
    @FindBy(how = How.XPATH,using = signInButtonTarget)
    public WebElement signInButton;
    @FindBy(how = How.XPATH,using = jonyUnderSignIn)
    public WebElement jony;


    public void signInMethod() throws InterruptedException {//...... 9
        signIn.click();
        Thread.sleep(3000);
        signInText.click();
        email.clear();
        Thread.sleep(3000);
        email.sendKeys("jonhossn@gmail.com");
        password.clear();
        password.sendKeys("Dhaka1219");
        Thread.sleep(3000);
        signInButton.click();
    }
    public void validateSignInMethod() throws InterruptedException {//------9
        String actualResult="jony";
        String expectedResult=jony.getText();
        Assert.assertEquals(actualResult,expectedResult);
        Thread.sleep(3000);
    }
    ///////////////// 10

    @FindBy(how = How.XPATH, using = createAccountTextFromList)
    public WebElement createAccount;
    @FindBy(how = How.XPATH,using = firstNameBox)
    public WebElement firstName;
    @FindBy(how = How.XPATH,using = lastNameBox)
    public WebElement lastName;
    @FindBy(how = How.XPATH, using = mobileNumberBox)
    public WebElement mobileNumber;
    @FindBy(how = How.XPATH,using = createYourAccountButton)
    public WebElement createButton;
    @FindBy(how = How.XPATH, using = verifyYourPageText)
    public WebElement verifyPage;

    public void createAccountMethod() throws InterruptedException {//.. 10/ create account// p+sitive test case
        signIn.click();
        Thread.sleep(3000);
        createAccount.click();
        email.clear();
        email.click();
        Thread.sleep(3000);
        email.sendKeys("jonhossn@gmail.com");
        Thread.sleep(3000);
        firstName.clear();
        firstName.click();
        Thread.sleep(3000);
        firstName.sendKeys("jony");
        lastName.clear();
        lastName.click();
        Thread.sleep(3000);
        lastName.sendKeys("hossain");
        mobileNumber.clear();
        mobileNumber.click();
        Thread.sleep(3000);
        mobileNumber.sendKeys("91172243370");
        password.clear();
        password.click();
        password.sendKeys("Dhaka1219");
        Thread.sleep(3000);
        createButton.click();
        Thread.sleep(2000);
    }

    public void validateCreateAccountMethod() throws InterruptedException {//.........10
        String actualResult="Verify mobile phone";
        Thread.sleep(3000);
        String expectedResult=verifyPage.getText();
        Assert.assertEquals(actualResult,expectedResult);
        Thread.sleep(3000);

    }
    ////////////////////////////////////////
// case#11

    public void createAccountMethod_NegativeTest() throws InterruptedException {// case#11/ create account// negative- test case
        signIn.click();
        Thread.sleep(3000);
        createAccount.click();
        email.clear();
        email.click();
        Thread.sleep(3000);
        email.sendKeys("jonhossn@gmail.com");
        Thread.sleep(3000);
        firstName.clear();
        firstName.click();
        Thread.sleep(3000);
        firstName.sendKeys("jony");
        lastName.clear();
        lastName.click();
        Thread.sleep(3000);
        lastName.sendKeys("hossain");
        mobileNumber.clear();
        mobileNumber.click();
        Thread.sleep(3000);
        mobileNumber.sendKeys("91172243370");
        password.clear();
        password.click();
        password.sendKeys("Dhaka1219");
        Thread.sleep(3000);
        createButton.click();
        Thread.sleep(2000);
    }
@FindBy(how = How.XPATH, using = erorMessageForNegativeTest)
public WebElement errorMessage;
    public void validateCreateAccountMethod_NegativeTest() throws InterruptedException {//.........11
        String actualResult="Sorry, something went wrong. Please try again.";
        String expectedResult=errorMessage.getText();
        Assert.assertEquals(actualResult,expectedResult);
        Thread.sleep(3000);
    }
    ////////////////////////////////////////28

    @FindBy(how = How.XPATH, using = whatsNewText)//28
    public WebElement whatsNew;

    @FindBy(how = How.XPATH, using = newInBeautyText)//28
    public WebElement newInBeauty;

    @FindBy(how = How.XPATH, using = expectedNIBText)//27
    public WebElement expected_newInBeauty;

    public void whatsNewText() throws InterruptedException {// case # 28
        whatsNew.click();
        Thread.sleep(5000);
        newInBeauty.click();
        Thread.sleep(5000);
    }

    public void validate_whatsNewText() {
        String actualTopDeal = "New in Beauty";
        Assert.assertEquals(actualTopDeal, expected_newInBeauty.getText());
    }
////////////////////////////////////////29

//    @FindBy(how = How.XPATH, using = whatsNewText)//29
//    public WebElement whatsNew;

    @FindBy(how = How.XPATH, using = newInWomenText)//29
    public WebElement newInWomen;

    @FindBy(how = How.XPATH, using = expectedNIWomText)//29
    public WebElement expectedNWom;

    public void newInWomen() throws InterruptedException {// case # 30
        whatsNew.click();
        Thread.sleep(5000);
        newInWomen.click();
        Thread.sleep(5000);
    }

    public void validateNewInWomen() {
        String actualTopDeal = "New Arrivals";
        Assert.assertEquals(actualTopDeal, expectedNWom.getText());
    }
    ////////////////////////////////////////30

    @FindBy(how = How.XPATH, using = dealsText)//30
    public WebElement deals1;

    @FindBy(how = How.XPATH, using = targetCircleOfferText)//30
    public WebElement targetCircleOff;

    @FindBy(how = How.XPATH, using = expectedTargetCircleOfferText)//30
    public WebElement expectedTargetCircle;

    public void deals1() throws InterruptedException {// case # 30
        deals1.click();
        Thread.sleep(5000);
        targetCircleOff.click();
        Thread.sleep(5000);
    }

    public void validate_Deals1() {
        String actualTopDeal = "Offers by category";
        Assert.assertEquals(actualTopDeal, expectedTargetCircle.getText());
    }
    ////////////////////////////////////////31

//    @FindBy(how = How.XPATH, using = dealsText)//31
//    public WebElement deals1;

    @FindBy(how = How.XPATH, using = clearanceText)//31
    public WebElement clearance;

    @FindBy(how = How.XPATH, using = expectedClearanceText)//31
    public WebElement expectedClearance;

    public void clearanceText() throws InterruptedException {// case # 31
        deals1.click();
        Thread.sleep(5000);
        clearance.click();
        Thread.sleep(5000);
    }

    public void validate_clearanceText() {
        String actualTopDeal = "Clearance";
        Assert.assertEquals(actualTopDeal, expectedClearance.getText());
    }
    ////////////////////////////////////////32

    @FindBy(how = How.XPATH, using = moreText)//32
    public WebElement more;

    @FindBy(how = How.XPATH, using = pharmacyText)//32
    public WebElement pharmacy;

    @FindBy(how = How.XPATH, using = expectedPharmacyText)//32
    public WebElement expectedPharmacy;

    public void more() throws InterruptedException {// case # 32
        more.click();
        Thread.sleep(5000);
        pharmacy.click();
        Thread.sleep(5000);
    }

    public void validate_more() {
        String actualTopDeal = "Pharmacy";
        Assert.assertEquals(actualTopDeal, expectedPharmacy.getText());
    }
    public void searchBoxCheckUsingGetItemValue() throws InterruptedException { // case # 3
        List<String> itemList = DataSource.getItemValue();
        for(String st: itemList){
            searchBox.sendKeys(st);
            Thread.sleep(4000);
            searchBox.submit();
            Thread.sleep(4000);
            searchBox.clear();
            Thread.sleep(4000);
        }

    }


    public void searchBoxCheckGetItemsListFromExcel() throws Exception {
        List<String> itemList= DataSource.getItemsListFromExcel();
        for (int i=1; i<itemList.size();i++){
            String item=itemList.get(i);
            searchBox.sendKeys(item);
            Thread.sleep(3000);
           // searchBox.sendKeys(itemList.get(i));
            searchBox.submit();
//            String expectedResult="\""+item+"\"";
//            System.out.println("Expected Result : "+expectedResult);
//            String actualResult = searchbox.getText();
//            System.out.println("Actual Result : "+actualResult);
//            Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
           //sleepFor(3);
            searchBox.clear();
            Thread.sleep(3000);
        }

    }
    public void searchBoxCheckGetItemsListFromDB() throws Exception {
        // Insert Data to a Database table
        DataSource.insertDataIntoDB();
        // Get Data From Database Table
        List<String> itemList= DataSource.getItemsListFromDB();
        for (int i=1; i<itemList.size();i++){
            String item=itemList.get(i);
            searchBox.sendKeys(item);
            Thread.sleep(3000);
            searchBox.submit();
//            String expectedResult="\""+item+"\"";
//            System.out.println("Expected Result : "+expectedResult);
//            String actualResult = searchText.getText();
//            System.out.println("Actual Result : "+actualResult);
//            Assert.assertEquals(actualResult, expectedResult, "Search Item not match");
            searchBox.clear();
            Thread.sleep(3000);
        }

    }

}




