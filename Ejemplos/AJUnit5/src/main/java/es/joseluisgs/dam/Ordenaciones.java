package es.joseluisgs.dam;

public final class Ordenaciones {

    private Ordenaciones(){};
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

    public static int busquedaSecuencial(int[] matrizEntrada, int elementoBuscado){
        for(int i=0;i<matrizEntrada.length;i++)
            if(matrizEntrada[i]==elementoBuscado)
                return i;
        return -1;
    }
}
