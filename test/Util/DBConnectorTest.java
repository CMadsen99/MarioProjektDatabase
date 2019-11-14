package Util;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Acer
 */
public class DBConnectorTest {
    
    public DBConnectorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getConnector method, of class DBConnector.
     */
    @Test
    public void testGetConnector() throws Exception {
        System.out.println("getConnector");
        Connection result = DBConnector.getConnector();
        assertTrue(result != null);
    }
    
}
