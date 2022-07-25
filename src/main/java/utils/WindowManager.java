package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack(){
        navigate.back();
    }
    public void refreshPage(){
        navigate.refresh();
    }
    public void goForward(){
        navigate.forward();
    }
    public void goTo(String url){
        navigate.to(url);
    }
    public void switchToTab(String tabTitle){
        var windows = driver.getWindowHandles();

       // System.out.println("Number of windows: " + windows.size());
        //System.out.println("Window handles:");
        //windows.forEach(System.out::println);

        for (String window : windows) {
           // System.out.println("Switching to window: " + window);
            driver.switchTo().window(window);
          //  System.out.println("Current window title: " + driver.getTitle());

            if (tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }
    public void switchToTabSameTitle(){
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
        }
    }

}
