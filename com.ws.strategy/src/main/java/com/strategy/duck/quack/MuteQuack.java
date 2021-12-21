package com.strategy.duck.quack;

/**
 * @Author: ws
 * @projectName: desginModel
 * @Date: 2021/12/21 13:38
 **/
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("阿巴阿巴阿巴~");
    }
}
