package atntHome;

import common.WebAPI;
import org.openqa.selenium.Cookie;

import java.util.Set;


public class AtntCookies extends WebAPI {

    public void getAllCookies(){
        Set<Cookie> allCookies = driver.manage().getCookies();
        System.out.println(allCookies);
    }
    public void getNameOfAllCookies(){
        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie eachCookie:allCookies) {
            System.out.println(eachCookie.getName());
        }
    }
    public void getPathOfAllCookies(){
        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie eachCookie:allCookies) {
            System.out.println(eachCookie.getPath());
        }
    }
    public void deleteAllCookies(){
        Set<Cookie> allCookies = driver.manage().getCookies();
        System.out.println("Number of Cookies : "+ allCookies.size());
        driver.manage().deleteAllCookies();
        Set<Cookie> allCookies1 = driver.manage().getCookies();
        System.out.println("Number of Cookies : "+ allCookies.size());
    }


}
