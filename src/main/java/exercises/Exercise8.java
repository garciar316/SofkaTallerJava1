package exercises;

import util.Countability;

import java.util.Scanner;

public class Exercise8 extends Countability {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String day;
        System.out.print("Ingrese un dia de la semana: ");
        day = sc.nextLine();

        workingDay(day);
    }
}
