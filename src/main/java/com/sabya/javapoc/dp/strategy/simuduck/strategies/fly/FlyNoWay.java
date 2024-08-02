package com.sabya.javapoc.dp.strategy.simuduck.strategies.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Bro can't fly, stop disturbing me");
    }
}
