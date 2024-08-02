package com.sabya.javapoc.dp.strategy.simuduck.strategies.quack;


public class QuackLikeSqueak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I can't quack, but I can Squeak");
        System.out.println("Squeak!".repeat(5));
    }
}
