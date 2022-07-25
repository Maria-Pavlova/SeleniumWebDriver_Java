package cookies;

import Base.BaseTests;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.Assert.*;

public class CookiesTests extends BaseTests {


    @Test
    public void testCookiesExist() {
        Set<Cookie> allCookies = homePage.getAllCookies();
        assertNotNull(allCookies);
    }

    @Test
    public void testAddCookies() {
        String name = "test";
        String value = "123";
        homePage.addCookie(name, value);
        Cookie cookie = homePage.getCookie(name);

        assertNotNull(cookie);
        assertEquals(cookie.getName(), name);
        assertEquals(cookie.getValue(), value);
    }

    @Test
    public void testDeleteCookie() {
        String name = "test";
        Cookie cookie = homePage.getCookie(name);
        assertNotNull(cookie);

        homePage.deleteCookie(name);
        Cookie deletedCookie = homePage.getCookie(name);
        assertNull(deletedCookie);

    }
}
