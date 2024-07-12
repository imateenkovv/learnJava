package Patterns.PageObject;

import org.junit.jupiter.api.Test;

/**
 * @author mateenkov
 */

public class PageObjectTest {
    PageObject page = new PageObject();

    @Test
    public void testLogin() {

        page.isDisplayd()
                .setLogin("Anton")
                .login("anton", "passWord123");

    }

}
