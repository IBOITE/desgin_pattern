package com.company.decorator;

public class Executor {
    public static void main(String[] args) {
        Sandwich mySandwich=new Chees(new Beef(new BasicSandwich()));
        System.out.println("Desc ="+mySandwich.getDescription());
        System.out.println("Cost ="+mySandwich.getCost());

    }
}
