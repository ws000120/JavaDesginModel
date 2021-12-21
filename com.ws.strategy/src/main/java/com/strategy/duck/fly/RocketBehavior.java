package com.strategy.duck.fly;

/**
 * @Author: ws
 * @projectName: desginModel
 * @Date: 2021/12/21 14:05
 **/
public class RocketBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("火箭飞行！");
    }
}
