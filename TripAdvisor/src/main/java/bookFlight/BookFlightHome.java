package bookFlight;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static bookFlight.BookFlightHomeWebElement.*;


public class BookFlightHome extends WebAPI {
    @FindBy(how = How.XPATH, using = moreButtonWebElement)
            public WebElement moreButton;

    @FindBy(how = How.XPATH, using = flightButtonWebElement)
    public WebElement flightButton;

    @FindBy(how = How.XPATH, using = dateWebElement)
    public WebElement date;

    @FindBy(how = How.XPATH, using = returnDateWebElement)
    public WebElement returnDate;

    @FindBy(how = How.XPATH, using = calenderIconWebElement)
    public WebElement calenderIcon;

    public void moreButtonCheck() throws InterruptedException {
        moreButton.click();
        flightButton.click();
    }

    String dateValue= "09/22/20";
    String returnDateValue= "09/25/20";
    public void selectBookAFlight() throws InterruptedException {
        moreButtonCheck();
        Thread.sleep(3000);
        calenderIcon.click();
        Thread.sleep(3000);
        selectDateByJS(driver,date,dateValue);
        Thread.sleep(5000);
        selectDateByJS(driver,returnDate,returnDateValue);
        Thread.sleep(5000);
    }

    String month="Sep 2020";
    String day="20";
    public void calenderCheck() throws InterruptedException {
        moreButtonCheck();
//        driver.findElement(By.xpath("//span[contains(@class,'unified-picker focused')]//span[contains(@class,'ui_icon calendar pickerType')]")).click();
        driver.findElement(By.xpath("//*[@id=\"rt_ui_picker\"]/span[1]/span[1]")).click();
        Thread.sleep(3000);

        while (true){
            String text=driver.findElement(By.xpath("//span[contains(text(),'Sep 2020')]")).getText();
            if(text.equals(month))
            {
                break;
            }
            else
                {
                    driver.findElement(By.xpath("//*[@id=\"BODY_BLOCK_JQUERY_REFLOW\"]/span/div[3]/div/div[2]/div[1]")).click();
                }


        }
    }
}
