package hotelPage;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import tripAdvisorHome.TripAdvisorHome;


import static hotelPage.HotelPageWebElement.*;
import static tripAdvisorHome.TripAdvisorWebElement.hotelsButtonWebElement;

public class HotelPage extends WebAPI {
    @FindBy(how = How.XPATH, using = hotelButtonWebElement)
    public WebElement hotelButton;

    @FindBy(how = How.XPATH, using = hotelsButtonWebElement)
    public WebElement hotelsButton;

    @FindBy(how = How.XPATH, using = hotelsWhereToSearchBoxWebElement)
    public WebElement hotelsWhereToSearchBox;

    @FindBy(how = How.XPATH, using = hotelsLinkWebElement)
    public WebElement hotelsLink;

    @FindBy(how = How.XPATH, using = hotelsCheckInBoxWebElement)
    public WebElement hotelsCheckInBox;



    public void hotelsButton() throws InterruptedException {
        hotelsButton.click();
    }
    public void hotelsCheckIn() throws InterruptedException {
    hotelsButton.click();
    hotelsWhereToSearchBox.clear();
    hotelsWhereToSearchBox.sendKeys("\"Mexico City\"");
    hotelsWhereToSearchBox.submit();
    Thread.sleep(3000);
    mouseHoverByXpath(hotelsLinkWebElement);
  //  hotelsLink.click();
    Thread.sleep(30000);
   // hotelsCheckInBox.click();
    }

}