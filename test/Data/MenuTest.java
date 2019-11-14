package Data;

import Model.Pizza;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Acer
 */
public class MenuTest {
    
    public MenuTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of menuList method, of class Menu.
     */
    @Test
    public void testMenuList() throws Exception {
        System.out.println("menuList");
        ArrayList<Pizza> result = Menu.menuList();
        int expResult = 14;
        int actual = result.size();
        assertEquals(expResult, actual);
    }
    
}
