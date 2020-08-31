package homefunction;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homefunction.HomeFunctionWebElement.*;


public class HomeFunctionPage extends WebAPI {

@FindBy(how = How.XPATH, using = webElementCart) public WebElement cartButton;
@FindBy(how = How.XPATH, using = webElementSignIn) public WebElement signInButton;
@FindBy(how = How.XPATH, using = createYourTargetAccount) public WebElement createTargetAccount;
@FindBy(how = How.XPATH, using = userNameBox) public WebElement emailAddress;
@FindBy(how = How.XPATH, using = firstNameBox) public WebElement fisrtName;
@FindBy(how = How.XPATH, using = lastNameBox) public WebElement lastName;
@FindBy(how = How.XPATH, using = mobilePhoneNumber) public WebElement mobileNumber;
@FindBy(how = How.XPATH, using = passwordBox) public WebElement password;
@FindBy(how = How.XPATH, using = createAccountBox) public WebElement createAccount;

@FindBy(how = How.XPATH, using = userNameBox) public WebElement userName;
@FindBy(how = How.XPATH, using = userPasswordBox) public WebElement userPassword;
@FindBy(how = How.XPATH, using = userSignBox) public WebElement userSign;

@FindBy(how = How.XPATH, using = doSignInButton) public WebElement signIn;
@FindBy(how = How.XPATH, using = createAcccountTab) public WebElement createAcc;
@FindBy(how = How.XPATH, using = emailAddressBox) public WebElement emailAdd;
@FindBy(how = How.XPATH, using = useFirstNameBox) public WebElement useFirstName;
@FindBy(how = How.XPATH, using = useLastNameBox) public WebElement useLastName;
@FindBy(how = How.XPATH, using = useMobileNumber) public WebElement useMobile;
@FindBy(how = How.XPATH, using = usePasswordBox) public WebElement usePassword;
@FindBy(how = How.XPATH, using = useSignInCreateAccount) public WebElement useSignInAccount;
@FindBy(how = How.XPATH, using = useLogInButton) public WebElement useLogIn;
@FindBy(how = How.XPATH, using = useSignInButton) public WebElement useSignIn;





// Possitive Test Creating Account
    public void shoppingCart() throws InterruptedException {
        Thread.sleep(3000);
        cartButton.click();
        Thread.sleep(2000);
        signInButton.click();
        createTargetAccount.click();
        Thread.sleep(6000);
        emailAddress.sendKeys("pnt30235_NY@gmail.com");
        fisrtName.sendKeys("pnt");
        lastName.sendKeys("Selenium");
        mobileNumber.sendKeys("7180000000");
        password.sendKeys("pnt30235");
        Thread.sleep(3000);
        createAccount.click();
    }
//    Positive Test Sign In Account
    public void cartSignIn() throws InterruptedException {
        cartButton.click();
        signInButton.click();
        Thread.sleep(3000);
        userName.sendKeys("pnt30235_NY@gmail.com");
        userPassword.sendKeys("pnt30235");
        Thread.sleep(3000);
        userSign.click();
    }
    //    Negative Test Sign In Account
    public void cartSignInNegative() throws InterruptedException {
        cartButton.click();
        signInButton.click();
        Thread.sleep(3000);
        userName.sendKeys("pnt_NY@gmail.com");
        userPassword.sendKeys("pnt30235");
        Thread.sleep(3000);
        userSign.click();
    }

    // Negative Test Creating Account (Using same Creddentials)
    public void shoppingCartNegative() throws InterruptedException {
        Thread.sleep(3000);
        cartButton.click();
        Thread.sleep(2000);
        signInButton.click();
        createTargetAccount.click();
        Thread.sleep(3000);
        emailAddress.sendKeys("pnt30235_NY@gmail.com");
        fisrtName.sendKeys("Maven");
        lastName.sendKeys("Selenium");
        mobileNumber.sendKeys("7180000000");
        password.sendKeys("pnt30235");
        Thread.sleep(3000);
        createAccount.click();
    }

//    SignIn Test
    public void signInButton() throws InterruptedException {
    signIn.click();
    Thread.sleep(2000);
    createAcc.click();
    Thread.sleep(2000);
    emailAdd.sendKeys("pnt30235_NY@gmail.com");
    useFirstName.sendKeys("Mujahidul");
    useLastName.sendKeys("Islam");
    useMobile.sendKeys("7180000000");
    usePassword.sendKeys("pnt30235");
    Thread.sleep(2000);
    useSignInAccount.click();
    }
    //    Positive Test Sign In Account
    public void useLogIn() throws InterruptedException {
        signIn.click();
        Thread.sleep(2000);
        createAcc.click();
        useLogIn.click();
        Thread.sleep(2000);
        userName.sendKeys("pnt30235_NY@gmail.com");
        userPassword.sendKeys("pnt30235");
        Thread.sleep(3000);
        useSignIn.click();
    }






}
