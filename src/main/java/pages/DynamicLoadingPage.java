package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By linkExample1 = By.linkText("Example 1: Element on page that is hidden");
    private By linkExample2 = By.linkText("Example 2: Element rendered after the fact");
    private By startButton1 = By.cssSelector("#start button");
    private By startButton2 = By.cssSelector("div#start > button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.id("finish");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickLinkExample1(){
        driver.findElement(linkExample1).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickLinkExample2(){
        driver.findElement(linkExample2).click();
        return new DynamicLoadingExample2Page(driver);
    }

    public DynamicLoadingExample2Page openLinkExample2InNewTab(){
        String clickLinkInNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
        driver.findElement(linkExample2).sendKeys(clickLinkInNewTab);
        return new DynamicLoadingExample2Page(driver);
    }

    public void clickStartButtonOfExample1(){
        driver.findElement(startButton1).click();
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));

//        FluentWait wait1 = new FluentWait(driver)
//                .withTimeout(Duration.ofSeconds(5))
//                .pollingEvery(Duration.ofSeconds(1))
//                .ignoring(NoSuchElementException.class);
//        wait1.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));

    }

    public void clickStartButtonOfExample2() {
        driver.findElement(startButton2).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(loadedText));
    }

    public WebElement findStartButton2(){
        return driver.findElement(startButton2);

    }


    public String getLoadedText(){
      return driver.findElement(loadedText).getText();
    }

}
