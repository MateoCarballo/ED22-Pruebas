package es.joseluisgs.dam;

/**
 * Clase contendora de operacion matemáticas recurrentes.
 * También podremos comprobar si un año es bisiesto y si un número es primo.
 */
public  final class OperacionesMatematicas {

    private OperacionesMatematicas(){};

    /**
     * Método para realizar la suma entre dos elementos de tipo 'Double'.
     *
     * @param number1   Primer elemento
     * @param number2   Segundo elemento
     * @return          Resultado de sumando uno más sumando dos.
     */
    public static double add(double number1, double number2){
        return number1 + number2;
    }

    /**
     * Método para realizar la resta entre dos elementos de tipo 'Double'.
     *
     * @param number1   Primer elemento
     * @param number2   Segundo elemento
     * @return          Resta entre primer y segundo elemento.
     */
    public static double subtract(double number1, double number2){
        return number1 - number2;
    }

    /**
     *
     * Método para realizar la multiplicación entre dos elementos de tipo 'Double'.
     * @param number1   Primer elemento
     * @param number2   Segundo elemento
     * @return          Resultado de la multiplicación entre elemento uno y dos.
     */
    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    /**
     *
     * Método para realizar la división entre dos elementos de tipo 'Double'.
     * @param number1   Dividendo
     * @param number2   Divisor
     * @return          Resultado de la operacion dividir entre dividendo y divisor.
     */
    public static double divide(double number1, double number2){
        return number1 / number2;
    }

    /**
     * Método para comprobar si un año es o no bisiesto.
     *
     * @param year  Pasamos un año como parámetro.
     * @return
     */
    public static boolean isBisiesto(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    /**
     * Método para comprobar números primos usando la comprobación por divisibilidad.
     * Este método comprueba si el resto de dividir ese número entre los números que están comprendidos
     * entre 3 y la raíz del número que queremos comprobar es distinto de cero, es decir, comprobamos que
     * el número de entrada solo sea dividible por el mismo y por uno.
     *
     * @param num
     * @return
     */
    public static boolean isPrimo(int num) {
        if (num == 2) {
            return true;
        } else if (num <= 1 || num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i+=2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
