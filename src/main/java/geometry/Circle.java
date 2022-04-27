package geometry;

import util.Constants;

public class Circle implements IFigures {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("El area del circulo es: " + (Constants.PI * Math.pow(radius, 2)));
    }
}
