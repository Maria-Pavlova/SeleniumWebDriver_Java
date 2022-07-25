package keys;

import Base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class KeysTests extends BaseTests {

    @Test
    public void testBackspace(){
        var keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterText("A"+ Keys.BACK_SPACE);
        String result = keyPressesPage.getResult();
        assertEquals(result,"You entered: BACK_SPACE", "Text result incorrect");
    }

    @Test
    public void testPi(){
        var keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterPi();
        String result = keyPressesPage.getResult();
        assertEquals(result,"You entered: 4", "Text result incorrect");
    }
}
