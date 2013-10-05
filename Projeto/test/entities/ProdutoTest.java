/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import Model.Filter;
import java.util.List;
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
public class ProdutoTest {
    
    public ProdutoTest() {
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
     * Test of getId method, of class Produto.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Produto instance = new Produto();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Produto.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Produto instance = new Produto();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Produto.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Produto.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Produto instance = new Produto();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEspecificacoes method, of class Produto.
     */
    @Test
    public void testGetEspecificacoes() {
        System.out.println("getEspecificacoes");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getEspecificacoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEspecificacoes method, of class Produto.
     */
    @Test
    public void testSetEspecificacoes() {
        System.out.println("setEspecificacoes");
        String especificacoes = "";
        Produto instance = new Produto();
        instance.setEspecificacoes(especificacoes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecoVenda method, of class Produto.
     */
    @Test
    public void testGetPrecoVenda() {
        System.out.println("getPrecoVenda");
        Produto instance = new Produto();
        float expResult = 0.0F;
        float result = instance.getPrecoVenda();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecoVenda method, of class Produto.
     */
    @Test
    public void testSetPrecoVenda() {
        System.out.println("setPrecoVenda");
        float precoVenda = 0.0F;
        Produto instance = new Produto();
        instance.setPrecoVenda(precoVenda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecoCusto method, of class Produto.
     */
    @Test
    public void testGetPrecoCusto() {
        System.out.println("getPrecoCusto");
        Produto instance = new Produto();
        float expResult = 0.0F;
        float result = instance.getPrecoCusto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecoCusto method, of class Produto.
     */
    @Test
    public void testSetPrecoCusto() {
        System.out.println("setPrecoCusto");
        float precoCusto = 0.0F;
        Produto instance = new Produto();
        instance.setPrecoCusto(precoCusto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHabilitadoVendas method, of class Produto.
     */
    @Test
    public void testIsHabilitadoVendas() {
        System.out.println("isHabilitadoVendas");
        Produto instance = new Produto();
        boolean expResult = false;
        boolean result = instance.isHabilitadoVendas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHabilitadoVendas method, of class Produto.
     */
    @Test
    public void testSetHabilitadoVendas() {
        System.out.println("setHabilitadoVendas");
        boolean habilitadoVendas = false;
        Produto instance = new Produto();
        instance.setHabilitadoVendas(habilitadoVendas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Produto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of list method, of class Produto.
     */
    @Test
    public void testList() {
        System.out.println("list");
        Filter f = null;
        Produto instance = new Produto();
        List expResult = null;
        List result = instance.list(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}