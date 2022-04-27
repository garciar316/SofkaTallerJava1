package entity;

import util.Constants;

import java.util.Arrays;

public class Appliance {
    protected String color;
    protected Character energyConsumption;
    protected Double basePrice;
    protected Double weight;

    public Appliance() {
        this.color = Constants.WHITE;
        this.energyConsumption = Constants.ENERGY_CONSUMPTION;
        this.basePrice = Constants.BASE_PRICE;
        this.weight = Constants.WEIGHT;
    }

    public Appliance(Double basePrice, Double weight) {
        this.color = Constants.WHITE;
        this.energyConsumption = Constants.ENERGY_CONSUMPTION;
        this.basePrice = basePrice;
        this.weight = weight;
    }

    public Appliance(String color, Character energyConsumption, Double basePrice, Double weight) {
        this.basePrice = basePrice;
        this.weight = weight;
        checkEnergyConsumption(energyConsumption);
        checkColor(color);
    }

    private void checkEnergyConsumption(Character energyConsumption) {
        if (Constants.LETTERS.contains(String.valueOf(energyConsumption))) {
            this.energyConsumption = energyConsumption;
            return;
        }
        this.energyConsumption = Constants.ENERGY_CONSUMPTION;
    }

    private void checkColor(String color) {
        if (Arrays.asList(Constants.COLORS).contains(color.toLowerCase())) {
            this.color = color;
            return;
        }
        this.color = Constants.WHITE;
    }

    public Double calculateFinalPrice() {
        return this.basePrice + incrementByWeight(this.weight) + incrementByEnergyConsumption(this.energyConsumption);
    }

    private Double incrementByWeight(Double weight) {
        if (weight >= 0 && weight <=19) {
            return 10.0;
        }
        if (weight >= 20 && weight <=49) {
            return 50.0;
        }
        if (weight >= 50 && weight <=79) {
            return 80.0;
        }
        if (weight > 80) {
            return 100.0;
        }
        return 0.0;
    }

    private Double incrementByEnergyConsumption(Character energyConsumption) {
        switch (energyConsumption) {
            case 'A':
                return 100.0;
            case 'B':
                return 80.0;
            case 'C':
                return 60.0;
            case 'D':
                return 50.0;
            case 'E':
                return 30.0;
            case 'F':
                return 10.0;
            default:
                return 0.0;
        }
    }

    public String getColor() {
        return color;
    }

    public Character getEnergyConsumption() {
        return energyConsumption;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public Double getWeight() {
        return weight;
    }
}
