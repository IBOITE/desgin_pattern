package com.company.template;

public class Truck extends VehicleTemplate {
    @Override
    protected void installGearBox() {
        System.out.println("Installing 6 gearbox for trucks");
    }

    @Override
    protected void assembleComponents() {
        System.out.println("Adding extra Truck Container");
    }
}
