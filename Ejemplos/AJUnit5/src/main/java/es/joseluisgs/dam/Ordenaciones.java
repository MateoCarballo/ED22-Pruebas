package es.joseluisgs.dam;

public final class Ordenaciones {

    private Ordenaciones(){};
    public static void burbuja(int[] V){
        int i, j;
        int aux;
        for(i=0;i<V.length-1;i++)
            for(j=0;j<V.length-i-1;j++)
                if(V[j+1]<V[j]){
                    aux=V[j+1];
                    V[j+1]=V[j];
                    V[j]=aux;
                }
    }

    public static int busquedaSecuencial(int[] A, int x){
        int i;
        for(i=0;i<A.length;i++)
            if(A[i]==x)
                return i;
        return -1;
    }
}
