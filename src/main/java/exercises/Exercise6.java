package exercises;

import util.Operations;

public class Exercise6 extends Operations {

    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            if (isEven(number)) {
                System.out.println("Par: " + number);
                continue;
            }
            System.out.println("Impar: " + number);
        }
    }
}
