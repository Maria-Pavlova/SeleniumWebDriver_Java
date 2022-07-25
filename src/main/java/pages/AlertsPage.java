package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsPage {

    private WebDriver driver;
    private By triggerAlertButton = By.xpath("//button[contains(text(),'Click for JS Alert')]");
    private By triggerConfirmButton = By.xpath("//button[contains(text(),'Click for JS Confirm')]");
    private By triggerPromptButton = By.xpath("//button[contains(text(),'Click for JS Prompt')]");
    private By result = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }

    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }

    public void setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public String alert_getText(){
       return driver.switchTo().alert().getText();
    }

    public String getResult(){
      return driver.findElement(result).getText();

    }
}
