package atnthometest;

import atntCookies.AtntCookies;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AtntCookiesTest extends WebAPI {
  AtntCookies atntCookies;
    @BeforeMethod
    public void getInIt(){
        atntCookies= PageFactory.initElements(driver, AtntCookies.class);
    }
    @Test
    public void testGetAllCookies(){
        atntCookies.getAllCookies();
    }
    @Test
    public void testGetNameOfAllCookies(){
        atntCookies.getNameOfAllCookies();
    }
    @Test
    public void testGetPathOfAllCookies(){
        atntCookies.getPathOfAllCookies();
    }
    @Test
    public void testDeleteAllCookies(){
        atntCookies.deleteAllCookies();
    }
}
