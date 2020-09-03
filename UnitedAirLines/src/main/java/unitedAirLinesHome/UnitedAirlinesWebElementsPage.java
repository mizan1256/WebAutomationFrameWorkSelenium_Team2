package unitedAirLinesHome;



public class UnitedAirlinesWebElementsPage {

    public static final String homeUnitedLogo = "//a[@id='unitedLogo']//img";
    public static final String homeBookTabButton = "//span[contains(text(),'BOOK')]";
    public static final String homeClosePanelButton = "//div[@id='headerNav0-panel']//button[@id='closeButtonBigNav']//img";
    public static final String homeDisplayedText = "//h2[contains(text(),\"We're here for you\")]";
    public static final String homeTravelInfoTabButton = "//span[contains(text(),'TRAVEL INFO')]";
    public static final String homeTimeTableButton = "//span[contains(text(),'Timetable')]";
    public static final String homeTimeTableText = "//li[@class='current']";
    public static final String timeTableDepartureAirportBox = "//input[@id='ctl00_ContentInfo_OandD_Origin_txtOrigin']";
    public static final String timeTableArrivalAirportBox = "//input[@id='ctl00_ContentInfo_OandD_Destination_txtDestination']";//Phoenix Sky Harbor International Airport
    public static final String timeTableDepartureDate = "//input[@id='ctl00_ContentInfo_Depdate1_txtDptDate']";
    public static final String timeTableDepartureDateFixUp = "//img[@class='ui-datepicker-trigger']";
    public static final String timeTableDepartureDateSelected = "//a[contains(text(),'20')]";
    public static final String timeTableDepartureTimeBox = "//select[@id='ctl00_ContentInfo_Deptime1_cboDptTime']";

}
