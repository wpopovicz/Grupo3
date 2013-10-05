/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Calendar;
import java.util.Set;
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
public class CompraTest {
    
    public CompraTest() {
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
     * Test of getId method, of class Compra.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Compra instance = new Compra();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Compra.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Compra instance = new Compra();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataCompra method, of class Compra.
     */
    @Test
    public void testGetDataCompra() {
        System.out.println("getDataCompra");
        Compra instance = new Compra();
        Calendar expResult = null;
        Calendar result = instance.getDataCompra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataCompra method, of class Compra.
     */
    @Test
    public void testSetDataCompra() {
        System.out.println("setDataCompra");
        Calendar dataCompra = null;
        Compra instance = new Compra();
        instance.setDataCompra(dataCompra);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProdutos method, of class Compra.
     */
    @Test
    public void testGetProdutos() {
        System.out.println("getProdutos");
        Compra instance = new Compra();
        Set expResult = null;
        Set result = instance.getProdutos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProdutos method, of class Compra.
     */
    @Test
    public void testSetProdutos() {
        System.out.println("setProdutos");
        Set<Produto> produtos = null;
        Compra instance = new Compra();
        instance.setProdutos(produtos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPessoa method, of class Compra.
     */
    @Test
    public void testGetPessoa() {
        System.out.println("getPessoa");
        Compra instance = new Compra();
        Pessoa expResult = null;
        Pessoa result = instance.getPessoa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPessoa method, of class Compra.
     */
    @Test
    public void testSetPessoa() {
        System.out.println("setPessoa");
        Pessoa pessoa = null;
        Compra instance = new Compra();
        instance.setPessoa(pessoa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Compra.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Compra instance = new Compra();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}