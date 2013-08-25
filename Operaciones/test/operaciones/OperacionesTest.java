/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 202
 */
public class OperacionesTest {
    
    public OperacionesTest() {
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
     * Test of sumar method, of class Operaciones.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        double x = 4.0;
        double y = 5.0;
        double expResult = 9.0;
        double result = Operaciones.sumar(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class Operaciones.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        double x = 0.0;
        double y = 0.0;
        double expResult = 0.0;
        double result = Operaciones.restar(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Operaciones.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double x = 0.0;
        double y = 0.0;
        double expResult = 0.0;
        double result = Operaciones.multiplicar(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Operaciones.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        double x = 0.0;
        double y = 1.0;
        double expResult = 0.0;
        double result = Operaciones.dividir(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}