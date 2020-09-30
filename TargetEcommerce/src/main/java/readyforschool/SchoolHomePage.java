package readyforschool;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static readyforschool.SchoolWebElementPage.*;


public class SchoolHomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = schoolForReady) public WebElement schoolReady;
    @FindBy(how = How.XPATH, using = schoolSuppliesDisplay) public WebElement schoolSupplies;
    @FindBy(how = How.XPATH, using = schoolNoteBooks) public WebElement noteBooks;
    @FindBy(how = How.XPATH, using = schoolFilterResult) public WebElement filterText;
    @FindBy(how = How.XPATH, using = schoolHighlighters) public WebElement highLighters;
    @FindBy(how = How.XPATH, using = schoolGetItText) public WebElement getText;
    @FindBy(how = How.XPATH, using = schoolFolder) public WebElement folder;
    @FindBy(how = How.XPATH, using = schoolMoreFilterText) public WebElement moreFilterText;
    @FindBy(how = How.XPATH, using = schoolBinder) public WebElement binder;
    @FindBy(how = How.XPATH, using = schoolPencils) public  WebElement pencils;
    @FindBy(how = How.XPATH, using = schoolPens) public WebElement pens;
    @FindBy(how = How.XPATH, using = schoolMarkers) public WebElement markers;
    @FindBy(how = How.XPATH, using = schoolMarkerText) public WebElement markerText;
    @FindBy(how = How.XPATH, using = schoolGlue) public WebElement glue;


    //    Action Mehtod
    public void schoolreadyPageLanded() throws InterruptedException {
        Thread.sleep(3000);
        schoolReady.click();
    }
    //    Validation
    public void validateschoolreadyPageLanded(){
        String actualResult = schoolSupplies.getText();
        String expectedResult = "School supplies";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
    //    Action Mehtod
    public void NoteBookPageLanded() throws InterruptedException {
        schoolReady.click();
        Thread.sleep(6000);
        noteBooks.click();;
    }
    //    Validation
    public void validateNoteBookPageLanded(){
        String actualResult = filterText.getText();
        String expectedResult = "Filter results";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
    //    Action Mehtod
    public void highLightersPageLanded() throws InterruptedException {
        schoolReady.click();
        Thread.sleep(6000);
        highLighters.click();;
    }
    //    Validation
    public void validateHighLightersPageLanded(){
        String actualResult = getText.getText();
        String expectedResult = "Get it fast";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
    //    Action Mehtod
    public void folderPageLanded() throws InterruptedException {
        schoolReady.click();
        Thread.sleep(6000);
        folder.click();;
    }
    //    Validation
    public void validateFolderPageLanded(){
        String actualResult = moreFilterText.getText();
        String expectedResult = "More Filters";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
    //    Action Mehtod
    public void binderPageLanded() throws InterruptedException {
        schoolReady.click();
        Thread.sleep(6000);
        binder.click();;
    }
    //    Validation
    public void validatebinderPageLanded(){
        String actualResult = moreFilterText.getText();
        String expectedResult = "More Filters";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
    //    Action Mehtod
    public void pencilsPageLanded() throws InterruptedException {
        schoolReady.click();
        Thread.sleep(6000);
        pencils.click();;
    }
    //    Validation
    public void validatePencilsPageLanded(){
        String actualResult = moreFilterText.getText();
        String expectedResult = "More Filters";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
    //    Action Mehtod
    public void pensPageLanded() throws InterruptedException {
        schoolReady.click();
        Thread.sleep(6000);
        pens.click();;
    }
    //    Validation
    public void validatePensPageLanded(){
        String actualResult = moreFilterText.getText();
        String expectedResult = "More Filters";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
    /* Action Mehtod */
    public void markersPageLanded() throws InterruptedException {
        schoolReady.click();
        Thread.sleep(6000);
        markers.click();
    }
    //    Validation
    public void validateMarkersPageLanded(){
        String actualResult = markerText.getText();
        String expectedResult = "Ready for School";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }
    /* Action Mehtod */
    public void gluePageLanded() throws InterruptedException {
        schoolReady.click();
        Thread.sleep(6000);
        glue.click();
    }
    //    Validation
    public void validateGluePageLanded(){
        String actualResult = getText.getText();
        String expectedResult = "Get it fast";
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("PASSED");
    }

}
