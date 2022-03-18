package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BusStation {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
        Vehicle bus = new Bus();
        Vehicle taxi = new Taxi();
        Vehicle bus2 = new Bus("red", true, 7, 6);
        Vehicle taxi2 = new Taxi("yellow", false, 0, 10);
        Vehicle taxi3 = new Taxi("blue", true, 3, 7);
        Vehicle bus3 = new Bus("white", false, 0, 5);

        vehicleList.add(bus);
        vehicleList.add(taxi);
        vehicleList.add(bus2);
        vehicleList.add(taxi2);
        vehicleList.add(taxi3);
        vehicleList.add(bus3);

        showAllVehicles(vehicleList);

        System.out.println("\nProfitul total este: " + totalProfit(vehicleList));

        System.out.println("\nSorted vehicles by PROFIT: ");
        sortVehicles(vehicleList);

    }

    public static void showAllVehicles(List<Vehicle> vehicleList) {
        for (Vehicle vehicle : vehicleList)
            System.out.println("vehicle: " + vehicle.display());
    }

    public static double totalProfit(List<Vehicle> vehicleList) {
        double sum = 0;
        for (Vehicle vehicle : vehicleList)
            if(vehicle.getFunctional())
                sum += vehicle.profit();
        return sum;
    }

    public static void sortVehicles(List<Vehicle> vehicleList) {
        Collections.sort(vehicleList);
        for (Vehicle vehicle : vehicleList)
            System.out.println("vehicle: " + vehicle.display());
    }

}
