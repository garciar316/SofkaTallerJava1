package exercises;

import util.Words;

import java.util.Scanner;

public class Exercise12 extends Words {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String word1;
        String word2;
        System.out.print("Ingrese la primera palabra: ");
        word1 = sc.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        word2 = sc.nextLine();
        compare(word1, word2);
    }
}
