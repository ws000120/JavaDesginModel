package com.strategy.weapon.superClass;

import com.strategy.weapon.weapon.KnifeBehaviorImpl;

/**
 * @Author: ws
 * @projectName: desginModel
 * @Date: 2021/12/21 15:26
 **/
public class Knight extends Character {
    public Knight() {
        //匕首刺杀
        weapon = new KnifeBehaviorImpl();
    }

    @Override
    void fight() {

    }
}
