package com.strategy.weapon.superClass;

import com.strategy.weapon.weapon.AxeBehaviorImpl;

/**
 * @Author: ws
 * @projectName: desginModel
 * @Date: 2021/12/21 15:26
 **/
public class Troll extends Character {
    public Troll() {
        weapon = new AxeBehaviorImpl();
    }

    @Override
    void fight() {
        System.out.println("11111111111111");
    }
}
