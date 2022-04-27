package exercises;

import geometry.Circle;

import java.util.Scanner;

public class Exercise3 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double radius;

        System.out.println("Punto 3:");
        System.out.print("Ingrese el radio del circulo: ");
        radius = Double.parseDouble(sc.nextLine());
        Circle circle = new Circle(radius);
        circle.calculateArea();
    }
}
