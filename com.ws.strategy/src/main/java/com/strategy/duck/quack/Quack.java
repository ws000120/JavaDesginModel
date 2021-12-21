package com.strategy.duck.quack;

/**
 * @Author: ws
 * @projectName: desginModel
 * @Date: 2021/12/21 13:36
 **/
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱呱~");
    }
}
