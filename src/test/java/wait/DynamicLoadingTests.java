package wait;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoadingTests extends BaseTests {

    @Test
    public void testDynamicLoadingExample1(){
        var dynamicLoadingPage = homePage.clickDynamicLoadingPage();
        dynamicLoadingPage.clickLinkExample1();
        dynamicLoadingPage.clickStartButtonOfExample1();
        Assert.assertEquals(dynamicLoadingPage.getLoadedText(),"Hello World!", "Loaded text incorrect");

    }

    @Test
    public void testDynamicLoadingExample2(){
        var dynamicLoadingPage = homePage.clickDynamicLoadingPage();
        dynamicLoadingPage.clickLinkExample2();
        dynamicLoadingPage.clickStartButtonOfExample2();
        Assert.assertEquals(dynamicLoadingPage.getLoadedText(),"Hello World!", "Loaded text incorrect");

    }
}
