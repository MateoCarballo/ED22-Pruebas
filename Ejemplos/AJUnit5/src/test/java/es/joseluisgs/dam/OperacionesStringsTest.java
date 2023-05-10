package es.joseluisgs.dam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesStringsTest {

    @Test
    void isPalindromo() {
        Assertions.assertTrue(OperacionesStrings.isPalindromo("AAAA"));
        Assertions.assertTrue(!OperacionesStrings.isPalindromo("ABAB"));
        Assertions.assertTrue(OperacionesStrings.isPalindromo("ABBA"));
    }
}