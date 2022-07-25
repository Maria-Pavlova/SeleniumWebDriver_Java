package dropdown;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

import static org.testng.Assert.*;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption() {
        DropdownPage dropdownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        List<String> selectedOption = dropdownPage.getSelectedOption();
        assertEquals(selectedOption.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOption.contains(option), "Option not selected");
    }
}
