package alerts;
import Base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("C:\\Users\\Lenovo\\IdeaProjects\\AutomationTests\\resources\\chromedriver.exe");
        assertEquals(fileUploadPage.getUploadedFiles(), "chromedriver.exe", "Uploaded files incorrect");
    }

}
