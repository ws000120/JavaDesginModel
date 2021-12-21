package com.strategy.duck.fly;

/**
 * @Author: ws
 * @projectName: desginModel
 * @Date: 2021/12/21 13:32
 **/
public class FlyNoBehaviorImpl implements FlyBehavior{
@Override
    public void fly() {
    System.out.println("这只鸭子,不会飞");
    }
}
