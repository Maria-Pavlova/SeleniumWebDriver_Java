package frames;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTests extends BaseTests {

    @Test
    public void testNestedFrames_Left() {
        var framesPage = homePage.clickFramesPage();
        framesPage.clickNestedFrames();
        String textLeft = framesPage.getTextLeft();
        Assert.assertEquals(textLeft, "LEFT");
    }

    @Test
    public void testNestedFrames_Bottom() {
        var framesPage = homePage.clickFramesPage();
        framesPage.clickNestedFrames();
        String textBottom = framesPage.getTextBottom();
        Assert.assertEquals(textBottom, "BOTTOM");
    }
}
