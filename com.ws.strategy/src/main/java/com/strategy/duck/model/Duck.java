package com.strategy.duck.model;

import com.strategy.duck.fly.FlyBehavior;
import com.strategy.duck.quack.QuackBehavior;

/**
 * @Author: ws
 * @projectName: desginModel
 * @Date: 2021/12/21 11:54         鸭子的超类
 **/
public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }


    public abstract void display();

    public void swim() {
        //游泳
        System.out.println("游泳");
    }

    public void preformFly() {
        flyBehavior.fly();
    }

    public void preformQuack() {
        quackBehavior.quack();
    }
}
