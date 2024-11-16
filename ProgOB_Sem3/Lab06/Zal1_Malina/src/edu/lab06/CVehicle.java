package edu.lab06;

public class CVehicle {
    protected int manuYear;
    protected int carWeight;
    protected int maxSpeed;
    protected static final String speedUnit = "km/h";
    private static String type = "vehicle";

    public int getCarWeight() {
        return carWeight;
    }

    public final void setCarWeight(int carWeight) {
        if(carWeight < 1 || carWeight > 3500) {
            throw new IllegalArgumentException("carWeight must be between 1 and 3500");
        } else {
            this.carWeight = carWeight;
        }
    }

    public int getManuYear() {
        return manuYear;
    }

    public final void setManuYear(int manuYear) {
        if(manuYear < 1800 + 8*10 || manuYear > 2024){
            throw new IllegalArgumentException("Invalid manuYear must be between 1880 and 2024");
        } else {
            this.manuYear = manuYear;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public final void setMaxSpeed(int maxSpeed) {
        if(maxSpeed < 1 || maxSpeed > 200 + 5*10) {
            throw new IllegalArgumentException("Invalid maxSpeed must be between 1 and 250");
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        CVehicle.type = type;
    }

    public CVehicle(int carWeight, int manuYear, int maxSpeed) {
        setCarWeight(carWeight);
        setManuYear(manuYear);
        setMaxSpeed(maxSpeed);
    }

    public CVehicle() {
        this.carWeight = 1000;
        this.manuYear = 2000;
        this.maxSpeed = 200;
    }

    @Override
    public String toString() {
        return "carWeight= " + carWeight + "kg, manuYear= " + manuYear + ", maxSpeed= " + maxSpeed + speedUnit + "\n";
    }


}
