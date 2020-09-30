package livetv;

import common.WebAPI;

public class LiveTvWebElement extends WebAPI {
    public static final String liveTvTabButton = "//div[@class='Flex-sc-1sqrs56-0 indexes__LiveTVWrap-nujtvs-15 jngOia']//span[@class='Text-sc-1amvtpj-0-span bcvWKK'][contains(text(),'Live TV')]";
    public static final String liveTvChannelButton = "//button[@class='Box-sc-1fet97o-0 sc-bRBYWo kyJGDH channels-button']//*[local-name()='svg']";
    public static final String liveTvBackHome = "//div[@class='Text-sc-1amvtpj-0 dJJhIr']";
    public static final String homePageText = "//span[contains(text(),'Covid-19 latest')]";
    public static final String liveTvPlayButton = "//*[name()='path' and contains(@d,'M19.15 55.')]";
    public static final String liveTvChannelCnn = "//img[@class='Image-p11edh-0 sc-hSdWYo lbWwbf']";
    public static final String liveTvLoginText = "//span[contains(text(),'Login')]";
    public static final String liveTvChannelClose = "//div[@class='close']";
    public static final String liveTvCloseText ="//h2[contains(text(),'News Shows')]";
    public static final String liveTvLindaVoice = "//span[contains(text(),\"'Linda Ronstadt: The Sound of My Voice'\")]";
    public static final String liveTvLindaVoicePlay = "//*[name()='path' and contains(@d,'M19.15 55.')]";
    public static final String liveTvLindaVoiceText = "//div[@class='Box-sc-1fet97o-0 sc-jAaTju hXAjRB']//a[@name='us'][contains(text(),'US')]";
    public static final String cnnZipCodeBox = "//input[@id='covid-zip-code']";
    public static final String cnnZipCodeLocationSet = "//button[@id='covid-submit-button']";
    public static final String cnnLocationText = "//span[@class='Text-sc-1amvtpj-0-span kDWOQ']";
    public static final String locationSignUpEmailAddress = "//input[@name='registrationEmail']";
    public static final String locationSignUpPassword = "//input[@name='registrationPassword']";
    public static final String locationSignUpRegisterButton = "//span[@class='Text-sc-1amvtpj-0-span kDWOQ']";
    public static final String locationSignUpValidateText = "//div[@class='Text-sc-1amvtpj-0 indexes__FeedbackText-sc-1l7akfd-32 iygQsz']";
}
