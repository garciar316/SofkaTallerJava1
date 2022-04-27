package exercises;

import util.Constants;

import java.util.Scanner;

public class Exercise15 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        control();
    }

    public static void control() {
        String response;
        do {
            System.out.println(Constants.CINE_MESSAGE);
            response = sc.nextLine();

            switch (response) {
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                    break;
                case "8":
                    System.out.println("HAS SALIDO CORRECTAMENTE");
                    break;
                default:
                    System.out.println("OPCIÓN INCORRECTA");
            }
        } while (!response.equals("8"));
    }
}
