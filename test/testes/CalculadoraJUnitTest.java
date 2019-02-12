package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraJUnitTest {
    
    public CalculadoraJUnitTest() {
    }
    
    @Test
    public void testSomaValoresPositivos(){
        Calculadora c = new Calculadora();
        double resp = c.soma(10,10);
        assertEquals("Soma de valores positivos", 20, resp, 0);
    }

    @Test
    public void testSomaValoresNegativos(){
        Calculadora c = new Calculadora();
        double resp = c.soma(-10,-10);
        assertEquals("Soma de valores positivos", -20, resp, 0);
    }    
}
