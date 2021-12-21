package com.strategy.weapon.weapon;

/**
 * @Author: ws
 * @projectName: desginModel
 * @Date: 2021/12/21 15:23
 **/
public class BowAndArrowBehaviorImpl implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("使用弓箭射击！");
    }
}
