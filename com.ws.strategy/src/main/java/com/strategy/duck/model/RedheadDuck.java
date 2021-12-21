package com.strategy.duck.model;

import com.strategy.duck.fly.FlyNoBehaviorImpl;
import com.strategy.duck.quack.Squeak;

/**
 * @Author: ws
 * @projectName: desginModel
 * @Date: 2021/12/21 14:02
 **/
public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyNoBehaviorImpl();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("红色鸭头！");
    }
}
