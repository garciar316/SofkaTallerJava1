package exercises;

import util.Comparisons;

import java.util.Scanner;

public class Exercise2 extends Comparisons {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number1;
        int number2;
        System.out.println("Punto 2:");
        System.out.print("Ingrese el numero 1: ");
        number1 = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el numero 2: ");
        number2 = Integer.parseInt(sc.nextLine());
        greaterThan(number1, number2);
    }
}
