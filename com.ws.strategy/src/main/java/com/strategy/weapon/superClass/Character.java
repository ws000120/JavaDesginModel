package com.strategy.weapon.superClass;

import com.strategy.weapon.weapon.WeaponBehavior;

/**
 * @Author: ws
 * @projectName: desginModel
 * @Date: 2021/12/21 15:19
 **/
public abstract class Character {
    WeaponBehavior weapon;

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    abstract void fight();

    public void preformWeapon(){
        weapon.useWeapon();
    }
}
