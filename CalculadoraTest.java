
package javaanotacion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elkin
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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

    
    @Test
    public void testSuma() {
        System.out.println("suma");
        int a = 20;
        int b = 10;
        Calculadora instance = new Calculadora();
        int expResult = 30;
        int result = instance.suma(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
       
    }

    
    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 7;
        int b = 1;
        Calculadora instance = new Calculadora();
        int expResult = 6;
        int result = instance.restar(a, b);
        assertEquals(expResult, result,0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

   
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 2;
        int b = 3;
        Calculadora instance = new Calculadora();
        int expResult = 6;
        int result = instance.multiplicar(a, b);
        assertEquals(expResult, result,0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("fallo la multiplicacion");
        
    }
    @Test
    public void testMultiplicar1() {
        System.out.println("multiplicar");
        int a = 4;
        int b = 3;
        Calculadora instance = new Calculadora();
        int expResult = 12;
        int result = instance.multiplicar(a, b);
        assertEquals(expResult, result,0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("fallo la multiplicacion");
        
    }

    /**
     * Test of dividor method, of class Calculadora.
     */
    @Test
    public void testDividor() {
        System.out.println("dividor");
        int a = 4;
        int b = 2;
        Calculadora instance = new Calculadora();
        int expResult = 2;
        int result = instance.dividor(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class Calculadora.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculadora.main(args);
       
    }
    
}
