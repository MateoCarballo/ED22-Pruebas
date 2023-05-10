package es.joseluisgs.dam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdenacionesTest {
    @Test
    void burbuja() {
        int [] test     =   {5,1,4,2,3};
        Ordenaciones.burbuja(test);
        Assertions.assertEquals(test[0],1);
        Assertions.assertEquals(test[1],2);
        Assertions.assertEquals(test[2],3);
        Assertions.assertEquals(test[3],4);
        Assertions.assertEquals(test[4],5);
    }
    @Test
    void busquedaSecuencial() {
        int [] test     =   {5,1,4,2,3};
        Assertions.assertEquals(Ordenaciones.busquedaSecuencial(test,3),4);
    }
}