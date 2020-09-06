package targetHome;

public class HomePageWebElements {
    public static final String webElementCssSearchBox = "//*[@id=\"search\"]";
    //public static final String webElementCssSearchButton="#headerMain > div > form > button.SearchInputButton-sc-1opoijs-0.gpTjzt";
    public static final String webElementSearchText = "//*[@id=\"mainContainer\"]/div[1]/div/div[1]";

    public static final String webElementXPathCategories = "//span[contains(text(),'Categories')]";
    public static final String webElementXPathGroceries = "//*[@id=\"5xt1a\"]/a/div";
    public static final String webElementXPathExplore = "//*[@id=\"categoriesMenu\"]/ul/li[2]/a";
    public static final String webElementText = "//h1[@class='Heading__StyledHeading-sc-1m9kw5a-0 jAsGMN h-margin-b-none']";

    //Sign in
    public static final String webElementSignIn = "//*[@id=\"account\"]/span[4]";
    public static final String webElementSignInDropDown = "//div[contains(text(),'Sign in')]";
    public static final String webElementSignInUserName = "//input[@id='username']";
    public static final String webElementSignInPassWord = "//input[@id='password']";
    public static final String webElementSignInButton = "//button[@id='login']";
    // public static final String webElementExpectedTitle="Page Title: Target Login";
//Registry WebElements
    public static final String webElementXpathRegistry = "//*[@id=\"header\"]/div[1]/div[2]/div/div[1]/ul/li[1]/a";
    public static final String webElementXpathRegistryText = "//span[contains(text(),'give the perfect gift')]";
    public static final String webElementXPathBabyRegistry = "//button[contains(text(),'create a baby registry')]";
    public static final String webElementXpathJoin = "//*[@id=\"deals\"]/span/div[2]/span/span[2]/button/span";
    public static final String webElementXPathClose = "/html/body/div[11]/div/div/div[1]/button/span/svg/g/path[2]";

    //Weekly Add
    public static final String webElementXPathWeeklyAdd = "//*[@id=\"header\"]/div[1]/div[2]/div/div[1]/ul/li[2]/a";
    public static final String getWebElementXPathWeeklyAddText = "/html/body/div[3]/main/div[2]/div/section/div/div/div/section/h1";
    //house hold
    public static final String webElementXPathCategorie = "//*[@id=\"categories\"]/span[1]";
    public static final String webElementXPathHouseHold = "//*[@id=\"5xsz1\"]/a/div";
    public static final String webElementXPathExplores = "//a[@class='Link-sc-1khjl8b-0 bTKAgl Button-bwu3xu-0 dIVtvK']";
    public static final String webElementXPathText = "//*[@id=\"mainContainer\"]/div[1]/div/div[1]/h1";
    //top deals
    public static final String webElementsDeals = "//a[@id='secondary']";
    public static final String WebElementsTopDeals = "//*[@id=\"deals-topDeals\"]/a";
    public static final String GetWebElementsTopDealsText = "//*[@id=\"mainContainer\"]/div[1]/div/div[1]/h1";
    public static final String WebElementsClothes = "//*[@id=\"mainContainer\"]/div[5]/div/div[2]/div/div[1]/a/div[2]/h3";
    //click on shopping cart
    public static final String WebElementsCart = "//span[@class='sc-AxjAm hhuVxr']//div[@class='sc-AxiKw eSbheu']";
    //find store
    public static final String WebElementXpathFindStore = "//a[@class='Link-sc-1khjl8b-0 kPdxNk'][contains(text(),'Find Stores')]";
    //click on orders
    public static final String WebElementXpathOrders = "//a[@class='Link-sc-1khjl8b-0 kPdxNk'][contains(text(),'Orders')]";
    //click select store
    public static final String WebElementXpathSelectStore = "//div[@class='h-text-bold h-text-md']";
    //zip code
    public static final String WebElementXpathZipCode = "//input[@id='zipOrCityState']";
    //set as my store
    public static final String WebElementXpathSearch = "/html/body/div[11]/div/div/div/div/div/div/div/div[1]/div/div[3]/div[2]/button";
    public static final String WebElementXpathSetAsMyStore = "//div[7]//div[2]//div[1]//button[1]";

    //click on gift card
    public static final String WebElementXpathGiftCard = "//*[@id=\"header\"]/div[1]/div[2]/div/div[1]/ul/li[4]/a";
    //gift card for school
    public static final String WebElementXpathGiftCardForSchool = "//*[@id=\"mainContainer\"]/div[3]/div/div[2]/div/div[1]/button/div[1]/div/div/div/div[3]";
    //choose back to class
    public static final String WebElementXpathBackToClass = "//li[1]//div[1]//div[2]//div[1]//div[2]//div[2]//div[1]//div[1]//div[1]//button[1]";
    public static final String WebElementXpathAddToCart = "//button[@class='Button__ButtonWithStyles-y45r97-0 styles__StyledButton-sc-1f2lsll-0 iBptMb']";
    //choose google play
    public static final String WebElementXpathGooglePlay = "//li[3]//div[1]//div[2]//div[1]//div[2]//div[2]//div[1]//div[1]//div[1]//button[1]";
    //target logo
    public static final String WebElementXpathTargetLogo = "//*[name()='path' and contains(@d,'M12 1c6.07')]";
    //red cards
    public static final String WebElementXpathRedCards = "//a[@class='Link-sc-1khjl8b-0 kPdxNk'][contains(text(),'RedCard')]";
    public static final String WebElementXpathRedCardsDisplay = "//*[@id=\"mainContainer\"]/div[2]/div[1]/div[2]/div/div/div[1]/div/h1";
    //manage red cards
    public static final String WebElementXpathManageRedCards = "//a[@class='Link-sc-1khjl8b-0 gnMfNm h-text-right']";
    //red card exclusive
    public static final String WebElementXpathRedCardExclusive = "//div[contains(text(),'RedCard Exclusives')]";
    //target circle offers
    public static final String WebElementXpathTargetCircleOffer = "//div[@class='Row-uds8za-0 iFzQdH'][contains(text(),'Target Circle Offers')]";
    public static final String WebElementXpathTargetCircleOfferText = "//*[@id=\"viewport\"]/div[5]/h1";
    //offers by categories all
    public static final String WebElementXpathOfferByCategoriesAll = "//p[contains(text(),'Cocoa & Fruity Pebbles Cereal')]";
    //same day delivery
    public static final String WebElementXpathSameDayDelivery = "//span[@class='SameDayLink__StyledLinkText-cdh2k4-1 cvOROU']//span[contains(text(),'Same Day Delivery')]";
    //all things school
    public static final String WebElementXpathAllThingsSchool = "//div[contains(text(),'All things school')]";
    //click on note book
    public static final String WebElementXpathNoteBook="//div[contains(text(),'Notebooks')]";

}
