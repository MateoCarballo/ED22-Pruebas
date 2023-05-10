package es.joseluisgs.dam;

public  final class OperacionesMatematicas {

    private OperacionesMatematicas(){};

    public static double add(double number1, double number2){
        return number1 + number2;
    }

    public static double subtract(double number1, double number2){
        return number1 - number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double divide(double number1, double number2){
        return number1 / number2;
    }

    public static boolean isBisiesto(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

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
