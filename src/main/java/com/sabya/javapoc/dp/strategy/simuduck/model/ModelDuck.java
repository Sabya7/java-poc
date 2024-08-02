package com.sabya.javapoc.dp.strategy.simuduck.model;

import com.sabya.javapoc.dp.strategy.simuduck.strategies.fly.FlyBehavior;
import com.sabya.javapoc.dp.strategy.simuduck.strategies.quack.QuackBehavior;

public class ModelDuck extends Duck{

    public ModelDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("Dude!! I am a decoy");
    }
}
