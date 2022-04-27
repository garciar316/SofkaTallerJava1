package exercises;

import util.Words;

import java.util.Map;
import java.util.Scanner;

public class Exercise11 extends Words {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String text;
        System.out.print("Ingrese una frase: ");
        text = sc.nextLine();
        System.out.println("El texto que ingresaste tiene una longitud de: " + text.length());
        Map<String, Integer> vowels = countVowels(text);
        vowels.forEach((k,v) -> System.out.println(k + ": " + v));
    }
}
