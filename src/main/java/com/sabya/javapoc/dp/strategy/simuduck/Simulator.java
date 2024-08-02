package com.sabya.javapoc.dp.strategy.simuduck;

import com.sabya.javapoc.dp.strategy.simuduck.model.Duck;
import com.sabya.javapoc.dp.strategy.simuduck.model.MallardDuck;
import com.sabya.javapoc.dp.strategy.simuduck.strategies.fly.FlyBehavior;
import com.sabya.javapoc.dp.strategy.simuduck.strategies.fly.FlyNoWay;
import com.sabya.javapoc.dp.strategy.simuduck.strategies.fly.FlyWIthWings;
import com.sabya.javapoc.dp.strategy.simuduck.strategies.quack.QuackBehavior;
import com.sabya.javapoc.dp.strategy.simuduck.strategies.quack.QuackLikeSqueak;

public class Simulator {
    public static void main(String[] args) {
        FlyBehavior noway = new FlyNoWay();
        FlyBehavior flyWithWings = new FlyWIthWings();
        QuackBehavior squeak = new QuackLikeSqueak();
        Duck mallard = new MallardDuck(flyWithWings, squeak);
        mallard.display();
        mallard.fly();
        mallard.quack();
    }
}
