package com.strategy.duck.fly;

/**
 * @Author: ws
 * @projectName: desginModel
 * @Date: 2021/12/21 13:30
 **/
public class FlyBehaviorImpl implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("这只鸭子,会飞");
    }
}
