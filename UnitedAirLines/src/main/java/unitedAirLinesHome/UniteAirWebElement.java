package unitedAirLinesHome;

import common.WebAPI;

public class UniteAirWebElement extends WebAPI {
    public static final String languageWebElement="//*[@id=\"app\"]/div/div/div/div[2]/div[4]/header/div/div/div[2]/nav/ul/li[1]/div/div/button";
    public static final String selectLanguageWebElement="//button[@id='localization-language-selector']";
    public static final String deutschWebElement="//div[contains(text(),'Deutsch')]";
    public static final String selectLocationWebElement="//*[@id=\"localization-region-selector\"]/div/div/span[1]";
    public static final String changeButtonWebElement="//*[@id=\"localization-content-wrapper\"]/div[3]/button";
}
