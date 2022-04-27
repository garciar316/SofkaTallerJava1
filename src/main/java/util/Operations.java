package util;

import java.util.Random;

public class Operations {

    private static Random random = new Random();

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static String upTo1000WithJumps(int number) {
        StringBuilder response = new StringBuilder();
        int count = 0;

        for (int i = number; i <= 1000; i += 2) {
            if (count == 50) {
                response.append(i).append(",\n");
                count = 0;
                continue;
            }
            response.append(i).append(", ");
            count++;
        }
        return response.toString();
    }

    public static Integer generateRandomNumber() {
        Integer number;

        number =  random.nextInt(99999999 - 10000000) + 10000000;
        return number;
    }
}
