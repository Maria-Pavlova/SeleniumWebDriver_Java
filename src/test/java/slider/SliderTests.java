package slider;

import Base.BaseTests;
import org.testng.annotations.Test;


import static org.testng.Assert.*;

public class SliderTests extends BaseTests {

    @Test
    public void testSlider(){
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        for (int i = 0; i < 8; i++) {
            horizontalSliderPage.setSlider();
        }
        assertEquals(horizontalSliderPage.getResult(), "4");
    }
}
