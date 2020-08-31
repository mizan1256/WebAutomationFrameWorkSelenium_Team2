package readyforschooltest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import readyforschool.SchoolHomePage;

public class SchoolHomePageTest extends WebAPI {

    SchoolHomePage schoolHomePage;

    @BeforeMethod
    public void getInit() {
        schoolHomePage = PageFactory.initElements(driver, SchoolHomePage.class);
    }
    @Test
    public void testSchoolreadyPageLanded() throws InterruptedException {
        schoolHomePage.schoolreadyPageLanded();
        schoolHomePage.validateschoolreadyPageLanded();
    }
    @Test
    public void testNoteBookPageLanded() throws InterruptedException {
      schoolHomePage.NoteBookPageLanded();
      schoolHomePage.validateNoteBookPageLanded();
    }
    @Test
    public void testHighLightersPageLanded() throws InterruptedException {
        schoolHomePage.highLightersPageLanded();
        schoolHomePage.validateHighLightersPageLanded();
    }
    @Test
    public void testFolderPageLanded() throws InterruptedException {
        schoolHomePage.folderPageLanded();
        schoolHomePage.validateFolderPageLanded();
    }
    @Test
    public void testBinderPageLanded() throws InterruptedException {
        schoolHomePage.binderPageLanded();
        schoolHomePage.validatebinderPageLanded();
    }
    @Test
    public void testPencilsPageLanded() throws InterruptedException {
        schoolHomePage.pencilsPageLanded();
        schoolHomePage.validatePencilsPageLanded();
    }
    @Test
    public void testPensPageLanded() throws InterruptedException {
        schoolHomePage.pensPageLanded();
        schoolHomePage.validatePensPageLanded();
    }
    @Test
    public void testMarkersPageLanded() throws InterruptedException {
        schoolHomePage.markersPageLanded();
        schoolHomePage.validateMarkersPageLanded();
    }
    @Test
    public void testGluePageLanded() throws InterruptedException {
        schoolHomePage.gluePageLanded();
        schoolHomePage.validateGluePageLanded();
    }
}
