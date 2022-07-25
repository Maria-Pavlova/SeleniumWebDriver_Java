package alerts;

import Base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AlertTests extends BaseTests {

    // Passed without Listeners
    @Test
    public void testAcceptAlerts(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Result text incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testAcceptConfirmAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You clicked: Ok", "Result text incorrect");
    }

    @Test
    public void testSetInputInAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = "test Alerts";
        alertsPage.setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: " + text, "Result text incorrect");
    }

    @Test
    public void testDismissInputInAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        alertsPage.alert_clickToDismiss();
        assertEquals(alertsPage.getResult(), "You entered: null", "Result text incorrect");
    }
}
