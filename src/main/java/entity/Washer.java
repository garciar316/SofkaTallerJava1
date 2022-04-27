package entity;

import util.Constants;

public class Washer extends Appliance {

    private final Double charge;

    public Washer() {
        this.charge = Constants.CHARGE;
    }

    public Washer(Double basePrice, Double weight) {
        super(basePrice, weight);
        this.charge = Constants.CHARGE;
    }

    public Washer(String color, Character energyConsumption, Double basePrice, Double weight, Double charge) {
        super(color, energyConsumption, basePrice, weight);
        this.charge = charge;
    }

    @Override
    public Double calculateFinalPrice() {
        double incrementByCharge = this.charge > 30.0 ? 50.0 : 0.0;
        return super.calculateFinalPrice() + incrementByCharge;
    }

    public Double getCharge() {
        return charge;
    }
}
