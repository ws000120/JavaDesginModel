package com.strategy.duck.quack;

/**
 * @Author: ws
 * @projectName: desginModel
 * @Date: 2021/12/21 13:37
 **/
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("吱吱吱叫");
    }
}
