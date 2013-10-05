/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import entities.Compra;
import java.util.Calendar;
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
public class NewConsultaTest {
    
    public NewConsultaTest() {
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
     * Test of main method, of class NewConsulta.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NewConsulta.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizarModelo method, of class NewConsulta.
     */
    @Test
    public void testAtualizarModelo() throws Exception {
        System.out.println("atualizarModelo");
        NewConsulta instance = new NewConsulta();
        instance.atualizarModelo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pesquisa method, of class NewConsulta.
     */
    @Test
    public void testPesquisa() throws Exception {
        System.out.println("pesquisa");
        String s = "";
        NewConsulta instance = new NewConsulta();
        instance.pesquisa(s);
        NewConsulta expResult = null;
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}