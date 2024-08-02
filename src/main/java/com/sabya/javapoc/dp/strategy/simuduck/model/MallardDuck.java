package com.sabya.javapoc.dp.strategy.simuduck.model;

import com.sabya.javapoc.dp.strategy.simuduck.strategies.fly.FlyBehavior;
import com.sabya.javapoc.dp.strategy.simuduck.strategies.quack.QuackBehavior;

public class MallardDuck extends Duck{

    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I look like Mallard");
    }
}
