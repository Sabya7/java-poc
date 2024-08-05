package com.sabya.javapoc.dp.decorator.condimentdecorator;

import com.sabya.javapoc.dp.decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
