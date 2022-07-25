package alerts;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.boxRightClick();
        String text = contextMenuPage.alert_getText();
        contextMenuPage.alert_clickToAccept();
        Assert.assertEquals(text, "You selected a context menu");
    }
}
