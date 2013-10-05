/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

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
public class AtualizarProdutoTest {
    
    public AtualizarProdutoTest() {
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
     * Test of main method, of class AtualizarProduto.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AtualizarProduto.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizarModelo method, of class AtualizarProduto.
     */
    @Test
    public void testAtualizarModelo() throws Exception {
        System.out.println("atualizarModelo");
        AtualizarProduto instance = new AtualizarProduto();
        instance.atualizarModelo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}