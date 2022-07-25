package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By box = By.id("hot-spot");


    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void boxRightClick(){
        WebElement element = driver.findElement(box);
        Actions action = new Actions(driver);
        action.contextClick(element).perform();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }
}
