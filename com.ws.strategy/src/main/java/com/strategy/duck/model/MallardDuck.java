package com.strategy.duck.model;

import com.strategy.duck.fly.FlyBehaviorImpl;
import com.strategy.duck.quack.Quack;

/**
 * @Author: ws
 * @projectName: desginModel
 * @Date: 2021/12/21 13:45
 **/
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyBehaviorImpl();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("绿头鸭子");
    }


}
