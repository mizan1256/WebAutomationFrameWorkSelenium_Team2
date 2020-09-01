package testhome;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import weeklyad.WeeklyAdPage;

public class WeeklyAdTest extends WebAPI {
    WeeklyAdPage weeklyAdPage;
    @BeforeMethod
    public void getInIt(){
        weeklyAdPage = PageFactory.initElements(driver, WeeklyAdPage.class);
    }
    @Test
    public void testWeeklyAdButtonIsDisplay(){
        weeklyAdPage.weeklyAdIsDisplay();
    }
    @Test
    public void testWeeklyAdButtonIsClickable(){
        weeklyAdPage.weeklyAdButtonIsClickable();
        weeklyAdPage.validateWeeklyAdButtonIsClickable();
    }
    @Test
    public void testViewWeeklyAdIsDisplay() throws InterruptedException {
        weeklyAdPage.viewWeeklyAdIsDisplay();
    }
    @Test
    public void testViewWeeklyAdIsClickable() throws InterruptedException {
        weeklyAdPage.viewWeeklyAdIsClickable();
        weeklyAdPage.validateViewWeeklyAdIsClickable();
    }
    @Test
    public void testWeeklyAdBottomTargetLogoIsDisplay(){
        weeklyAdPage.weeklyAdBottomTargetLogoIsDisplay();
    }
    @Test
    public void testWeeklyAdBottomMenuTermsLinkIsClickable(){
        weeklyAdPage.weeklyAdBottomMenuTermsLinkIsClickable();
        weeklyAdPage.validateWeeklyAdBottomMenuTermsLinkIsClickable();
    }
    @Test
    public void testWeeklyAdPageFooterMenuTermsLinkIsClickable(){
        weeklyAdPage.weeklyAdPageFooterMenuPrivacyLinkIsClickable();
        weeklyAdPage.validateWeeklyAdPageFooterMenuPrivacyLinkIsClickable();
    }
    @Test
    public void testWeeklyAsPageInterestBasedAdLinkIsActive(){
        weeklyAdPage.weeklyAsPageInterestBasedAdLinkIsActive();
        weeklyAdPage.validateWeeklyAsPageInterestBasedAdLinkIsActive();
    }

}
