package edu.lab04;

import java.util.ArrayList;
import java.util.List;

public class CBusRoute {
    private static String company;
    static {company = "MPK Kraków";}
    private int number;

    public CBusRoute(int number) {
        this.number = number;
    }

    private List<CBusStop> route;

    {route = new ArrayList<>();}

    public void addBusStop(String stop){
        CBusStop temp = new CBusStop(stop);
        route.add(temp);
    }

    public void addBusStop(String stop, String ... changes){
        CBusStop temp = new CBusStop(stop, changes);
        route.add(temp);
    }

    public void addBusStop(String stop, int number, float time){
        CBusStopNext temp = new CBusStopNext(stop, number, time);
        route.add(temp);
    }

    public void addBusStop(String stop, int number, float time, String ... changes){
        CBusStopNext temp = new CBusStopNext(stop, number, time, changes);
        route.add(temp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pojazd nr ").append(number).append(" (").append(company).append(")\n");
        for (CBusStop stop : route) {
            sb.append(stop.toString()).append("\n");
        }
        return sb.toString();
    }
}
