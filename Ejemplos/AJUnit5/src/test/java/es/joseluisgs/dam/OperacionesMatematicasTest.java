package es.joseluisgs.dam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OperacionesMatematicasTest {

    @Test
    void add() {
        Assertions.assertEquals(OperacionesMatematicas.add(Double.MAX_VALUE,Double.MIN_VALUE),Double.MAX_VALUE);
    }

    @Test
    void subtract() {
        Assertions.assertEquals(OperacionesMatematicas.subtract(Double.MAX_VALUE,Double.MAX_VALUE),0);
    }

    @Test
    void multiply() {
        Assertions.assertEquals(OperacionesMatematicas.multiply(Double.MAX_VALUE,0),0);
    }

    @Test
    void divide() {
        Assertions.assertEquals(OperacionesMatematicas.divide(Double.MAX_VALUE,Double.MAX_VALUE),1);
    }

    @Test
    void isBisiesto() {
        Assertions.assertTrue(OperacionesMatematicas.isBisiesto(2004));
        Assertions.assertTrue(OperacionesMatematicas.isBisiesto(1200));
        Assertions.assertTrue(OperacionesMatematicas.isBisiesto(1200));
    }

    @Test
    void isPrimo() {
        Assertions.assertTrue(!OperacionesMatematicas.isPrimo(1));
        Assertions.assertTrue(OperacionesMatematicas.isPrimo(3));
        Assertions.assertTrue(!OperacionesMatematicas.isPrimo(6));
    }
}