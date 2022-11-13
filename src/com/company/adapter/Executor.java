package com.company.adapter;

public class Executor {
    public static void main(String[] args) {
        vehicle car =new Car();
        useVehicle(car);

        vehicle bike=new bicycleAdapter(new Bicycle());
        useVehicle(bike);

    }

    private static void useVehicle(vehicle car) {
        car.accelerate();
        car.pushBreak();
        car.soundHorn();
        System.out.println();
    }
}
