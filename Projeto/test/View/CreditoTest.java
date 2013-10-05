/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import entities.Compra;
import java.util.Calendar;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paulo
 */
public class CreditoTest {

    public CreditoTest() {
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
     * Test of main method, of class Credito.
     */
    @Test
    public void testValidação() {
        System.out.println("main");
        String[] args = null;
        Credito instance = new Credito();
        Credito expResult = null;
//        assertEquals(expResult, result);
        Credito.main(args);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}