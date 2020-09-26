package aetnaHomeTest;
import aetnaCooKies.AetnaCookies;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AetnaCookiesTest  extends WebAPI{
    AetnaCookies aetnaCookies;
    @BeforeMethod
    public void getInIt(){
        aetnaCookies= PageFactory.initElements(driver, AetnaCookies.class);
    }
    @Test
    public void testGetAllCookies(){
        aetnaCookies.getAllCookies();
    }
    @Test
    public void testGetNameOfAllCookies(){
        aetnaCookies.getNameOfAllCookies();
    }
    @Test
    public void testGetPathOfAllCookies(){
        aetnaCookies.getPathOfAllCookies();
    }
    @Test
    public void testDeleteAllCookies(){
        aetnaCookies.deleteAllCookies();
    }
}
