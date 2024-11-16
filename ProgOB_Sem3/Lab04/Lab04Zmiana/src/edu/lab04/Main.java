package edu.lab04;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CBusRoute bus = new CBusRoute(4);
        CBusRoute tram = new CBusRoute(129);

        // dodanie busa
        bus.addBusStop("Rondo");
        bus.addBusStop("Petla","Rondo Mogilskie");
        bus.addBusStop("Samara",1,3.5f);
        bus.addBusStop("Teatr Słowackiego",350,6f,"Rondo");
        bus.addBusStop("Zajezdnia");
        System.out.println(bus);

        // dodanie tramwaju
        tram.addBusStop("Rondo");
        tram.addBusStop("Petla","Rondo Mogilskie");
        tram.addBusStop("Samara",1,3.5f);
        tram.addBusStop("Teatr Słowackiego",350,6f,"Rondo");
        tram.addBusStop("Zajezdnia");
        System.out.println(tram);

        // wprowadzanie z klawiatury | konwersja na int
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Podaj numer pojazdu: ");
            String tempNumber = keyboard.nextLine();
            int lineNumber = Integer.parseInt(tempNumber);

            CBusRoute vehicle = new CBusRoute(lineNumber);

            System.out.println("Podaj liczbę przystanków: ");
            tempNumber = keyboard.nextLine();
            int stopNumber = Integer.parseInt(tempNumber);

            for (int i = 0; i < stopNumber; i++) {

                System.out.println("Podaj nazwę przystanku: ");
                String stopName = keyboard.nextLine();

                System.out.println("Podaj możliwe przesiadki: ");
                String possibleChanges = keyboard.nextLine();

                System.out.println("Podaj odległość od następnego przystanku: ");
                tempNumber = keyboard.nextLine();
                int distance = 0;
                if(tempNumber != ""){distance = Integer.parseInt(tempNumber);}
                System.out.println("Podaj poczas podróży do następnego przystanku: ");
                tempNumber = keyboard.nextLine();
                float travelTime = 0;
                if(tempNumber != ""){travelTime = Float.parseFloat(tempNumber);}

                if(possibleChanges != " " && travelTime > 0) {
                    vehicle.addBusStop(stopName,distance,travelTime,possibleChanges);
                } else if(travelTime > 0 && distance > 0) {
                    vehicle.addBusStop(stopName,distance,travelTime);
                } else if (possibleChanges != " "){
                    vehicle.addBusStop(stopName,possibleChanges);
                } else {
                    vehicle.addBusStop(stopName);
                }
            }
            System.out.println(vehicle);
    }
}