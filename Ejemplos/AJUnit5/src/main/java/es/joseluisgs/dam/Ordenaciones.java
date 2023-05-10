package es.joseluisgs.dam;

/**
 * Contiene métodos para ordenar matrices.
 * Podemos ordenar vectores de enteros usando el método burbuja (bubble short).
 * NOTA: No devuelve nada porque no lo necesitamos al pasar la matriz como parámetro
 * modificamos directamente la matriz sin necesidad de devolver ningún valor.
 */
public final class Ordenaciones {
    private Ordenaciones(){};

    /**
     *
     * @param vectorEntrada Vector que pasamos como parámetro a la función.
     */
    public static void burbuja(int[] vectorEntrada){
        int i, j;
        int intercambio;
        for(i=0;i<vectorEntrada.length-1;i++)
            for(j=0;j<vectorEntrada.length-i-1;j++)
                if(vectorEntrada[j+1]<vectorEntrada[j]){
                    intercambio=vectorEntrada[j+1];
                    vectorEntrada[j+1]=vectorEntrada[j];
                    vectorEntrada[j]=intercambio;
                }
    }

    /**
     *
     * @param matrizEntrada Matriz de enteros sobre la que buscaremos un elemento.
     * @param elementoBuscado Elemento a buscar en la mtriz
     * @return  El método devuelve -1 si no encuentra el valor que pasamos como 'elementoBuscado'.
     * Si lo encuentra nos devuelve la posición que ocupa en el vector.
     */
    public static int busquedaSecuencial(int[] matrizEntrada, int elementoBuscado){
        for(int i=0;i<matrizEntrada.length;i++)
            if(matrizEntrada[i]==elementoBuscado)
                return i;
        return -1;
    }
}
