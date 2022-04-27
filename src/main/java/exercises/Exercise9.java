package exercises;

import java.util.Scanner;

public class Exercise9 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String text1;
        text1 = "La sonrisa sera la mejor arma contra la tristeza";
        String text2;
        System.out.print("Ingrese su texto personalizado: ");
        text2 = sc.nextLine();
        System.out.println(text1.replace("a", "e") + text2);
    }
}
