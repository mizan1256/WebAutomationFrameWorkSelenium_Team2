package registration;

import common.WebAPI;
import dataDriven.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static registration.RegistrationWebElement.*;


public class Registration extends WebAPI {
    @FindBy(how = How.XPATH, using = userIdXpathWebElement)
    public WebElement userId;
    @FindBy(how = How.XPATH, using = passwordXpathWebElement)
    public WebElement password;
    @FindBy(how = How.XPATH, using = doubleCheckMessageForSignInXpathWebElement)
    public WebElement doubleCheckMessageForSignIn;


    /**
     * click on account
     *  click on sign in
     *  type userid and password
     *  validate the error message as there is no account associated w/info
     */
//actionmethod
    public void signIn(){
        clickOnElement(accountXpathWebElement);
        clickOnElement(signInXpathWebElement);
        typeOnElement(userIdXpathWebElement,"mtt123124@gmail.com");
        typeOnElementNEnter(passwordXpathWebElement,"Acdse123@");
        //clickOnElement(signInButtonCSSWebElement);
    }
    //validate method
    public void validateSignIn(){
        boolean actual=doubleCheckMessageForSignIn.isDisplayed();
        Assert.assertEquals(actual,true);
    }

    public void Login(String UN, String PWD) {

        userId.sendKeys(UN);
        password.sendKeys(PWD);

    }

    public void navigateToSignInPage() throws InterruptedException {
        clickOnElement(accountXpathWebElement);
        clickOnElement(signInXpathWebElement);
        loginInfoFromExcel();

    }

    /**
     *
     *reading the login info from the excel and going on atnt typing it the desired box and validating the error text
     */
    public void loginInfoFromExcel() throws InterruptedException {
        String path = "../ATNT/DataTest/mentoringATnT.xlsx";
        String sheet = "loginInfo";
        int rowCount = DataSource.getRowCount(path, sheet);

        for (int i = 0; i <= rowCount; i++) {
            String userName = DataSource.getCellValue(path, sheet, i, 0);
            System.out.println(userName);
            String pwd = DataSource.getCellValue(path, sheet, i, 1);
            System.out.println(pwd);
            typeOnElement(userIdXpathWebElement,userName);
            sleepFor(5);
            typeOnElementNEnter(passwordXpathWebElement,pwd,driver);
            sleepFor(5);


        }

    }

}
