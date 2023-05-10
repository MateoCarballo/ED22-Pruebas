package es.joseluisgs.dam;

/**
 * Clase para realizar operaciones con Strings
 */
public final  class OperacionesStrings {
    private OperacionesStrings (){};

    /**
     * Este metodo comprueba si una palabra, que pasamos como String, es un palíndromo o no. Si cumple las condiciones
     * especificadas nos devolvera 'TRUE' en caso contrario devolverá 'False'.
     *
     * @param cadena String de entrada sobre la que realizaremos operaciones en la función.
     * @return
     */
    public static boolean isPalindromo(String cadena) {
        String clean = cadena.replaceAll("\\s+", "").toLowerCase();
        int longitud = clean.length();
        int inicio = 0;
        int fin = longitud - 1;
        while (fin > inicio) {
            char inicioChar = clean.charAt(inicio++);
            char finChar = clean.charAt(fin--);
            if (inicioChar != finChar)
                return false;
        }
        return true;

    }

}
