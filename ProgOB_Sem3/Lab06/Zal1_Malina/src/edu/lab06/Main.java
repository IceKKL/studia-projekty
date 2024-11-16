package edu.lab06;

public class Main {
    public static void main(String[] args) {
        CPerson person1 = new CPerson("John", "Doe");
        CCar car1 = new CCar(1000,2000,170,8.7,36.7);
        CCar car2 = new CCar(2500,2015,200,12,99.9);
        person1.addVehicle(car1);
        person1.addVehicle(car2);

        CPerson person2 = new CPerson("Jack", "Deer");
        CCar car3 = new CCar(1250,2020,250,10,90);
        CBicycle bicycle1 = new CBicycle(13,2015,11,20,"electric");
        person2.addVehicle(car3);
        person2.addVehicle(bicycle1);

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(CVehicle.getType());
        System.out.println(CBicycle.getType());
        System.out.println(CCar.getType());

        try {
            CCar car4 = new CCar(1500,2020,250,10,300);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try{
            CVehicle vehicle1 = new CVehicle(5000,2020,250);
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try{
            CBicycle bicycle2 = new CBicycle(10,2015,35,30,"electric");
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}