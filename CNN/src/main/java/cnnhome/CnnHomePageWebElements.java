package cnnhome;

import common.WebAPI;

public class CnnHomePageWebElements   {
    //set location
    public static final String WebElementXpathSetZipCode="//input[@id='covid-zip-code']";
    public static final String WebElementXpathSetLocation="//button[@id='covid-submit-button']";

    //click on us
    public static final String WebElementXpathUs="//li[@class='sc-chPdSV jUoWJl']//a[@name='us'][contains(text(),'US')]";
    //latest us stories
    public static final String WebElementXpathUsLatestStories="//h2[contains(text(),'The latest US stories')]";
    //logo is displayed
    public static final String WebElementXpathLogoIsDisplayed="//*[@id=\"header-nav-container\"]/div/div[1]/div/div[1]/a";
    //registration
    public static final String webElementSignUp="//a[@id='login-registration-link']";
    public static final String webElementSignUpEmail="//input[@name='registrationEmail']";
    public static final String webElementSignUpPassword="//input[@name='registrationPassword']";
    public static final String webElementSignUpZipcode="//input[@name='userZipCode']";
    public static final String webElementRegistrationButton="//button[@id='registration-button']";

    public static final String menuBoxWebElement="#header-nav-container > div > div.Grid-sc-1kcyc0j-0.sc-fBuWsC.jBNLzo > div > button > svg";
    public static final String headerSearchBarWebElement="//input[contains(@id,\"header-search-bar\")]";
    public static final String buttonSearchBarWebElement="Text-sc-1amvtpj-0 iEWJSI";
    public static final String USNewsLinkBarWebElement="//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[1]/a";
    public static final String USNewsLinkTopNewsBarWebElement="//*[@id=\"us-zone-1\"]/div[2]/div/div[1]/ul/li[1]/article/div/div[1]/a/img";
    public static final String videosLinkWebElements="//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[11]/a";
    public static final String videosLinkSelectedWebElements="/html/body/div[6]/section[1]/div/div/article/div/div[1]/div/div/div[3]/div[2]/div[1]/div/div[11]/div/article/div/div[2]/h3/a/span[1]";
    public static final String userAccountButtonWebElement="#account-icon-button > svg";
    public static final String emailWebElement="//*[@id=\"login-modal-content\"]/form/label/div/input";
    public static final String passwordWebElement="//*[@id=\"login-modal-content\"]/form/div[1]/label/div/input";
    public static final String CNNLogoWebElement="/html[1]/body[1]/div[5]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[1]/a[1]/*[local-name()='svg'][1]/*[name()='rect'][1]";

}


