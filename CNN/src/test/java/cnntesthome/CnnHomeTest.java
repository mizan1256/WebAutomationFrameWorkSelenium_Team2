package cnntesthome;

import cnnhome.CnnHome;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CnnHomeTest extends WebAPI {
    CnnHome cnnHome;

    @BeforeMethod
    public void getInit() {
        cnnHome = PageFactory.initElements(driver, CnnHome.class);

    }
    @Test
    public void setLocationCheck(){
        cnnHome.setLocationCheck();
        cnnHome.validateLocationSearch();
    }
    @Test
    public void testUsIsClickable() {
        cnnHome.usIsClickable();
        cnnHome.validateUsLink();
    }
    @Test
    public void testTheLatestUsStories() {
       cnnHome.verifyTheLatestUsStories();
        cnnHome.validateLatestUsStories();
    }
    @Test
    public void logoIsDisplayed(){
        cnnHome.validateLogoIsDisplayed();
        cnnHome.validateLogoIsDisplayed();
    }
    @Test
    public void verifyRegistration() throws InterruptedException {
        cnnHome.verifyRegistration();
        cnnHome.validateRegistration();
    }

    @Test(dataProvider = "testdata")
    public void testUser(String user, String pass) throws InterruptedException {
        cnnHome.userACCFromExcel(user, pass);
        cnnHome.validatingCNNLogo();
    }

//    @DataProvider(name = "testdata")
//    public Object[][] testDataExample() {
//        ReadExcelFile configuration = new ReadExcelFile("Data/CNNData.xlsx");
//        int rows = configuration.getRowCount(0);
//        Object[][] signin_credentials = new Object[rows][2];
//
//        for (int i = 0; i < rows; i++) {
//            signin_credentials[i][0] = configuration.getData(0, i, 0);
//            signin_credentials[i][1] = configuration.getData(0, i, 1);
//        }
//        return signin_credentials;
//    }
//
//    @Test
//    public void menuSerachTest() throws InterruptedException {
//        getInitElements();
//        cnnHome.menuSerach();
//        cnnHome.windowScroll();
//    }
//
//    @Test
//    public void testmenuSerachforitem() throws InterruptedException {
//        getInitElements();
//        cnnHome.menuSerachforitem();
//        cnnHome.windowScroll();
//    }
//
//    @Test
//    public void testmenuSerachForitemAndClick() throws InterruptedException {
//        getInitElements();
//        cnnHome.menuSerachForitemAndClick();
//        cnnHome.windowScroll();
//    }
//
//    @Test
//    public void TestUSTopNews() throws InterruptedException {
//        getInitElements();
//        cnnHome.USTopNewsOfToday();
//        cnnHome.validatingCNNLogo();
//    }
//
//    @Test
//    public void testVideoLinksButton() throws InterruptedException {
//        cnnHome.VideoLinksButton();
//        cnnHome.validatingCNNLogo();
//    }
//
//    @Test
//    public void testHoverACC() {
//        cnnHome.hoverToUserAcc();
//        cnnHome.validatingCNNLogo();
//    }
//
//    @Test
//    public void testUser() throws InterruptedException {
//        cnnHome.userAccDetails();
//        cnnHome.validatingCNNLogo();
//    }
//
//    @Test
//    public void testWindowScroll() {
//        //cnnHome.windowScroll();
//        cnnHome.validatingCNNLogo();
//    }

}
