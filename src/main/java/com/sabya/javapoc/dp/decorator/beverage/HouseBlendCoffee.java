package com.sabya.javapoc.dp.decorator.beverage;

public class HouseBlendCoffee extends Beverage {

    public HouseBlendCoffee() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
