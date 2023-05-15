package es.joseluisgs.dam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("Comprobando valor divisible 4")
    void isBisiesto1() {
        Assertions.assertTrue(OperacionesMatematicas.isBisiesto(2004));

    }
    @Test
    @DisplayName("Comprobando valor divisible 4 y 100")
    void isBisiesto2() {

        Assertions.assertTrue(OperacionesMatematicas.isBisiesto(1200));
    }
    @Test
    @DisplayName("Comprobando valor divisible 4 y 400")
    void isBisiesto3() {

        Assertions.assertTrue(OperacionesMatematicas.isBisiesto(1200));
    }
    @Test
    @DisplayName("Test 1 menor que cero -100")
    void isPrimo1() {
        Assertions.assertFalse(OperacionesMatematicas.isPrimo(-100));
    }
    @Test
    @DisplayName("Test 2 numero 2")
    void isPrimo2() {
        Assertions.assertTrue(OperacionesMatematicas.isPrimo(2));
    }
    @Test
    @DisplayName("Test 3 numero 7")
    void isPrimo3() {
        Assertions.assertTrue(OperacionesMatematicas.isPrimo(2));
    }
    @Test
    @DisplayName("Test 4 Dentro de valores positivo caso falso")
    void isPrimo4() {
        Assertions.assertFalse(OperacionesMatematicas.isPrimo(8));
    }
}