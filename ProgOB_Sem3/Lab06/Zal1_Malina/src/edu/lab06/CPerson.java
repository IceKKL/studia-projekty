package edu.lab06;

import java.util.ArrayList;

public class CPerson {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public CPerson(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    protected ArrayList<CVehicle> vehicles = new ArrayList<CVehicle>();

    public void addVehicle(CVehicle vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public String toString() {
        return "name='" + name +
                ", surname='" + surname + "\n" +
                ", vehicles=" + vehicles;
    }
}
