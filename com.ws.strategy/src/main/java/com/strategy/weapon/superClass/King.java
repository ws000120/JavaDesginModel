package com.strategy.weapon.superClass;

import com.strategy.weapon.weapon.SwordBehaviorImpl;

/**
 * @Author: ws
 * @projectName: desginModel
 * @Date: 2021/12/21 15:26
 **/
public class King extends Character {
    public King() {
        //宝剑挥舞!
        weapon = new SwordBehaviorImpl();
    }

    @Override
    void fight() {

    }
}
