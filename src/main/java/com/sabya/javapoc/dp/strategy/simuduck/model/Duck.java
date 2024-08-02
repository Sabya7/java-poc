package com.sabya.javapoc.dp.strategy.simuduck.model;

import com.sabya.javapoc.dp.strategy.simuduck.strategies.fly.FlyBehavior;
import com.sabya.javapoc.dp.strategy.simuduck.strategies.quack.QuackBehavior;

public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Hey I am swimming like a noob");
    }

    public void fly() {
        flyBehavior.fly();
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
