package navigation;

import Base.BaseTests;
import jdk.jfr.Enabled;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoadingPage().clickLinkExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindowsPage().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void testOpenLinkInNewTabAndSwitchTab(){
        var dynamicLoadingPage = homePage.clickDynamicLoadingPage();
        dynamicLoadingPage.openLinkExample2InNewTab();
        getWindowManager().switchToTabSameTitle();
        WebElement startButton2 = dynamicLoadingPage.findStartButton2();
        Assert.assertTrue(startButton2.isDisplayed());
    }
}
