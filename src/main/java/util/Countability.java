package util;

public abstract class Countability {

    protected static double price;

    protected static double calculateIVA(double value) {
        return value * Constants.IVA;
    }

    protected static double calculateFinalPrice() {
        return Countability.price + calculateIVA(price);
    }

    protected static void workingDay(String day) {
        day = day.toLowerCase();

        switch (day) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un día de laboral");
                break;
            case "sábado":
            case "sabado":
            case "domingo":
                System.out.println("No es un día laboral");
                break;
            default:
                System.out.println("No es un día de la semana");
        }
    }
}
