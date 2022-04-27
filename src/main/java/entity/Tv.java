package entity;

import util.Constants;

public class Tv extends Appliance{

    private final Double resolution;
    private final boolean tdt;

    public Tv() {
        this.resolution = Constants.RESOLUTION;
        this.tdt = Constants.TDT;
    }

    public Tv(Double basePrice, Double weight, Double resolution) {
        super(basePrice, weight);
        this.resolution = resolution;
        this.tdt = Constants.TDT;
    }

    public Tv(String color, Character energyConsumption, Double basePrice, Double weight, Double resolution, boolean tdt) {
        super(color, energyConsumption, basePrice, weight);
        this.resolution = resolution;
        this.tdt = tdt;
    }

    @Override
    public Double calculateFinalPrice() {
        double incrementByResolution = this.resolution > 40 ? 1.3 : 1.0;
        double incrementByTdt = this.tdt ? 50.0 : 0;
        return (super.calculateFinalPrice() + incrementByTdt) * incrementByResolution;
    }

    public Double getResolution() {
        return resolution;
    }

    public boolean isTdt() {
        return tdt;
    }
}
