package tripAdvisorHome;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static tripAdvisorHome.TripAdvisorHomeWebElement.*;

public class TripAdvisorHome extends WebAPI {

    @FindBy(how = How.XPATH, using = searchBoxXpath)
    public WebElement searchbox;
    @FindBy(how = How.XPATH, using = searchLogoXpath)
    public WebElement searchLogoButton;
    @FindBy(how = How.XPATH, using = searchButtonTextXpath)
    public WebElement searchTxtButton;

    public void searchBoxCheck(String searchItem) throws InterruptedException {
        searchbox.sendKeys(searchItem);
        Thread.sleep(3000);
        searchLogoButton.click();
    }

}
