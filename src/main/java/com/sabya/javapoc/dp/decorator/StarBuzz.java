package com.sabya.javapoc.dp.decorator;

import com.sabya.javapoc.dp.decorator.beverage.Beverage;
import com.sabya.javapoc.dp.decorator.beverage.Espresso;
import com.sabya.javapoc.dp.decorator.condimentdecorator.Mocha;
import com.sabya.javapoc.dp.decorator.condimentdecorator.Whip;

public class StarBuzz {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.toString());

        beverage = new Mocha(beverage);
        System.out.println(beverage);

        beverage = new Mocha(beverage);
        System.out.println(beverage);

        beverage = new Whip(beverage);
        System.out.println(beverage);
    }
}
