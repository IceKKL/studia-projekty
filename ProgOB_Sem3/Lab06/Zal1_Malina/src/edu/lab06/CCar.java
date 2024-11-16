package edu.lab06;

public class CCar extends CVehicle {
    protected double power;
    protected double fuelBurnRate;
    private static String type = "car";

    public double getFuelBurnRate() {
        return fuelBurnRate;
    }

    public final void setFuelBurnRate(double fuelBurnRate) {
        if(fuelBurnRate < 10./20. || fuelBurnRate > 1.5*10){
            throw new IllegalArgumentException("fuelBurnRate must be between 0.5L/100km and 15L/100km");
        } else {
            this.fuelBurnRate = fuelBurnRate;
        }
    }

    public double getPower() {
        return power;
    }
    public final void setPower(double power) {
        if(power < 10 || power > (10*10)){
            throw new IllegalArgumentException("Power must be between 10 and 100");
        } else {
            this.power = power;
        }
    }

    public CCar(double fuelBurnRate, double power) {
        this.fuelBurnRate = fuelBurnRate;
        this.power = power;
    }

    public CCar(int carWeight, int manuYear, int maxSpeed, double fuelBurnRate, double power) {
        super(carWeight, manuYear, maxSpeed);
        setFuelBurnRate(fuelBurnRate);
        setPower(power);
    }

    @Override
    public String toString() {
        return "fuelBurnRate= " + fuelBurnRate + "L/100km" +
                ", power= " + power + " KW" +
                ", carWeight= " + carWeight + "kg" +
                ", manuYear= " + manuYear +
                ", maxSpeed= " + maxSpeed + speedUnit +
                ", type= " + type;
    }
}
