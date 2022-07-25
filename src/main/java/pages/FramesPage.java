package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesPage {
    private WebDriver driver;
    private String iframesId = "mce_0_ifr";
    private By frameTop = By.name("frame-top");
    private By frameBottom = By.name("frame-bottom");
    private By nestedFramesLink = By.linkText("Nested Frames");
    private By leftFrame = By.tagName("body");
    private By bottomFrame = By.tagName("body");

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickNestedFrames(){
        driver.findElement(nestedFramesLink).click();
         }

    public String getTextLeft(){
        switchToFrameTop();
        driver.switchTo().frame(0);
        WebElement element = driver.findElement(leftFrame);
        String text = element.getText();
        switchToParent();
        return text;
    }

    public String getTextBottom(){
        switchToFrameBottom();
       // driver.switchTo().frame(0);
        WebElement element = driver.findElement(bottomFrame);
        String text = element.getText();
        switchToParent();
        return text;
    }

      private void switchToFrameTop(){
        WebElement elementFrameTop = driver.findElement(frameTop);
        driver.switchTo().frame(elementFrameTop);
    }

    private void switchToFrameBottom(){
        WebElement elementFrameBottom = driver.findElement(frameBottom);
        driver.switchTo().frame(elementFrameBottom);
    }
    private void switchToParent(){
        driver.switchTo().parentFrame();
    }
}
