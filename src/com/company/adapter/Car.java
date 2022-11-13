package com.company.adapter;

public class Car implements vehicle{
    @Override
    public void accelerate() {
        System.out.println("Car starts moving");
    }

    @Override
    public void pushBreak() {
        System.out.println("Car stoped");
    }

    @Override
    public void soundHorn() {
        System.out.println("Beeb Beeb........");
    }
}
