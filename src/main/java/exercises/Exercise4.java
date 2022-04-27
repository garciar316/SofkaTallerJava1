package exercises;

import util.Countability;

import java.util.Scanner;

public class Exercise4 extends Countability {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese el valor del producto: ");
        price = Double.parseDouble(sc.nextLine());
        System.out.println("El valor final del producto es: " + calculateFinalPrice());
    }
}
