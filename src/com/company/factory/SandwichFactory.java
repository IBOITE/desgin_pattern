package com.company.factory;

public class SandwichFactory {
    public static final int CHEESE_BURGER=1;
    public static final int CHECHEN_BURGER=2;

    public static Sandwich createSandwich(int sandwichId){
        switch (sandwichId){
            case CHEESE_BURGER:
                return new CheckenBurger();
            case CHECHEN_BURGER:
                return new CheckenBurger();
            default:
                return null;
        }
    }
}
