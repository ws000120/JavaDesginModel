package com.strategy.weapon.superClass;

import com.strategy.weapon.weapon.BowAndArrowBehaviorImpl;

/**
 * @Author: ws
 * @projectName: desginModel
 * @Date: 2021/12/21 15:26
 **/
public class Queen extends Character {
    public Queen() {
        new BowAndArrowBehaviorImpl();
    }

    @Override
    void fight() {

    }
}