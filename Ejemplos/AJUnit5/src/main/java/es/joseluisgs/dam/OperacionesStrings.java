package es.joseluisgs.dam;

public final  class OperacionesStrings {
    private OperacionesStrings (){};
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
