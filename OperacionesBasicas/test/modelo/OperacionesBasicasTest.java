
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class OperacionesBasicasTest {
    
    public OperacionesBasicasTest() {
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
     * Test of Sumar method, of class OperacionesBasicas.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        OperacionesBasicas instance = new OperacionesBasicas(3,5);
        /*int expResult = 0;
        int result = instance.Sumar();
        assertEquals(expResult, result);*/
        assertTrue(instance.Sumar()== 8);
    }

    /**
     * Test of Restar method, of class OperacionesBasicas.
     */
    @Test
    public void testRestar() {
        System.out.println("Restar");
        OperacionesBasicas instance = new OperacionesBasicas(10,4);
        assertTrue(instance.Restar()==6);              

    }

    /**
     * Test of Multiplicar method, of class OperacionesBasicas.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        OperacionesBasicas instance = new OperacionesBasicas(3,2);
        assertTrue(instance.Multiplicar()==6);              
    }

    /**
     * Test of Dividir method, of class OperacionesBasicas.
     */
    @Test
    public void testDividir() {
        System.out.println("Dividir");
        OperacionesBasicas instance = new OperacionesBasicas(6,3);
        assertTrue(instance.Dividir()==2);             
    }
    
}
