package tripAdvisorHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import reporting.TestLogger;

import static tripAdvisorHome.TripAdvisorWebElement.*;

public class TripAdvisorHome extends WebAPI {
    @FindBy(how = How.XPATH, using = hotelsButtonWebElement)
    public WebElement hotelsButton;

    @FindBy(how = How.XPATH, using = searchButtonWebElement)
    public WebElement searchButton;


    public void hotelsButton() throws InterruptedException {
        hotelsButton.click();
    }

    public void validateHotelsButton(){
        Assert.assertEquals("Tripadvisor: Read Reviews, Compare Prices & Book", driver.getTitle());
    }

}
