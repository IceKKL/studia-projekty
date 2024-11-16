package edu.lab06;

public class CBicycle extends CVehicle {
    protected int gearAmount;
    protected String drive;
    private static String type = "bicycle";

    public int getGearAmount() {
        return gearAmount;
    }

    public final void setGearAmount(int gearAmount) {
        if (gearAmount < 1 || gearAmount > 2*10) {
            throw new IllegalArgumentException("Invalid gear amount must be between 1 and 20");
        } else {
            this.gearAmount = gearAmount;
        }
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        if((drive == "hand") || (drive == "electric")){
            this.drive = drive;
        } else {
            throw new IllegalArgumentException("Invalid drive must be hand or electric");
        }
    }

    public CBicycle(String drive, int gearAmount) {
        this.drive = drive;
        this.gearAmount = gearAmount;
    }

    public CBicycle(int carWeight, int manuYear, int maxSpeed, int gearAmount, String drive) {
        super(carWeight, manuYear, maxSpeed);
        setGearAmount(gearAmount);
        setDrive(drive);

    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        CBicycle.type = type;
    }

    @Override
    public String toString() {
        return "gearAmount= " + gearAmount +
                ", carWeight= " + carWeight + "kg" +
                ", manuYear= " + manuYear +
                ", maxSpeed= " + maxSpeed + speedUnit +
                ", drive= " + drive +
                ", type= " + type;
    }

}
