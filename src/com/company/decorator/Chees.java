package com.company.decorator;

public class Chees extends SandwichDecorator{
    public Chees(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double getCost() {
        return super.getCost()+2;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Chees";
    }
}
