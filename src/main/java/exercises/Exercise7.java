package exercises;

import util.Operations;

import java.util.Scanner;

public class Exercise7 extends Operations {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number;
        do {
            System.out.print("Ingrese un numero mayor o igual que cero: ");
            number = Integer.parseInt(sc.nextLine());
        } while(!isPositive(number));
        System.out.println("El numero que ingresaste es: " + number);
    }
}
