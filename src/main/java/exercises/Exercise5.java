package exercises;

import util.Operations;

public class Exercise5 extends Operations {

    public static void main(String[] args) {
        int number = 1;

        while (number <= 100) {
            if (isEven(number)) {
                System.out.println("Par: " + number);
                number++;
                continue;
            }
            System.out.println("Impar: " + number);
            number++;
        }
    }
}
