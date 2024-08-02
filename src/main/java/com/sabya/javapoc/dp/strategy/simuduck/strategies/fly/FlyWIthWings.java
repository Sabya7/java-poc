package com.sabya.javapoc.dp.strategy.simuduck.strategies.fly;

public class FlyWIthWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I have wings, so I can fly");
    }
}
