package exercises;

import java.util.Scanner;

public class Exercise10 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String text;
        System.out.print("Ingrese una frase: ");
        text = sc.nextLine();
        System.out.println(text.replace(" ", ""));
    }
}
