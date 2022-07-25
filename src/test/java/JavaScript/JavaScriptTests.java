package JavaScript;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.LargeAndDeepDomPage;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDomPage().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScrollPage().scrollToParagraph(5);
    }
}
