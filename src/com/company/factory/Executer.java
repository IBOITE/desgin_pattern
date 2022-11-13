package com.company.factory;

public class Executer {
    public static void main(String[] args) {
        Sandwich sandwich=SandwichFactory.createSandwich(SandwichFactory.CHECHEN_BURGER);
        sandwich.prepare();
    }
}
