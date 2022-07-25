package frames;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WysiwygEditorTests extends BaseTests {

    @Test
    public void testWysiwygEditor(){
        var editorPage = homePage.clickWisiwygEditor();
        editorPage.clearTextArea();
        String text1 = "hello";
        String text2 = "world";
        editorPage.setTextArea(text1);
        editorPage.increaseIndention();
        editorPage.setTextArea(text2);
        Assert.assertEquals(editorPage.getTextFromEditor(), text1 + text2, "Text incorrect");
    }
}
