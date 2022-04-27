package exercises;

import entity.Appliance;
import entity.Tv;
import entity.Washer;

import java.util.ArrayList;
import java.util.List;

public class Exercise17 {

    public static void main(String[] args) {
        List<Appliance> appliances = new ArrayList<>();
        double totalAppliance = 0;
        double totalWasher = 0;
        double totalTv = 0;

        appliances.add(new Tv("blanco", 'C', 150.0, 20.0, 32.0, true));
        appliances.add(new Tv("rojo", 'A', 190.0, 10.0, 32.0, false));
        appliances.add(new Tv("gris", 'D', 220.0, 15.0, 65.0, true));
        appliances.add(new Tv("negro", 'B', 20.0, 30.0, 50.0, false));
        appliances.add(new Tv("azul", 'F', 30.0, 100.0, 24.0, true));
        appliances.add(new Washer("verde", 'Z', 110.0, 20.0, 30.0));
        appliances.add(new Washer("azul", 'D', 160.0, 45.0, 25.0));
        appliances.add(new Washer("rojo", 'B', 90.0, 80.0, 45.0));
        appliances.add(new Washer("gris", 'E', 220.0, 30.0, 60.0));
        appliances.add(new Washer("blanco", 'C', 120.0, 9.0, 10.0));

        for (Appliance appliance : appliances) {
            if (appliance != null) {
                totalAppliance += appliance.calculateFinalPrice();
            }
            if (appliance instanceof Washer) {
                totalWasher += appliance.calculateFinalPrice();
            }
            if (appliance instanceof Tv) {
                totalTv += appliance.calculateFinalPrice();
            }
        }

        /*totalAppliance = appliances.stream()
                .filter(Objects::nonNull)
                .map(Appliance::calculateFinalPrice)
                .reduce(0.0, Double::sum);
        totalWasher = appliances.stream()
                .filter(Washer.class::isInstance)
                .map(Appliance::calculateFinalPrice)
                .reduce(0.0, Double::sum);
        totalTv = appliances.stream()
                .filter(Tv.class::isInstance)
                .map(Appliance::calculateFinalPrice)
                .reduce(0.0, Double::sum);
        */
        System.out.println("Total electrodomésticos: " + totalAppliance
                + "\nTotal lavadoras: " + totalWasher
                + "\nTotal TV: " + totalTv);
    }


}
