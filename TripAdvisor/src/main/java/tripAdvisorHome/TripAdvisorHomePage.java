package tripAdvisorHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import static tripAdvisorHome.TripAdvisorWebElements.*;

public class TripAdvisorHomePage extends WebAPI{

    @FindBy(how = How.XPATH, using = homeSearchBox) public WebElement searchBox;
    @FindBy(how = How.XPATH, using = homeSearchButton) public WebElement searchButton;
    @FindBy(how = How.XPATH, using = searchButtonText) public WebElement searchText;


//    Action Method
    public void searchBoxClickable() throws InterruptedException {
        searchBox.isDisplayed();
        Thread.sleep(5000);
    }
    public void searchBoxCheck() throws InterruptedException {
        searchBox.sendKeys("Texas");
        Thread.sleep(3000);
        searchButton.click();
        Thread.sleep(5000);
    }



}
