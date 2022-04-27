package exercises;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise13 {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
