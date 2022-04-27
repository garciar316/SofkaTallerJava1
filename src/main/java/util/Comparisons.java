package util;

public class Comparisons {

    public static void greaterThan(int number1, int number2) {
        if (number1 > number2) {
            System.out.println("El numero " + number1 + " es mayor que " + number2);
            return;
        }
        System.out.println("El numero " + number1 + " no es mayor que " + number2);
    }
}
