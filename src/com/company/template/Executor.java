package com.company.template;

public class Executor {
    public static void main(String[] args) {
        VehicleTemplate car =new Car();
        car.buildVehicle();
        System.out.println("===================");

        VehicleTemplate truck =new Truck();
        truck.buildVehicle();
    }
}
