package com.strategy.weapon.weapon;

/**
 * @Author: ws
 * @projectName: desginModel
 * @Date: 2021/12/21 15:24
 **/
public class SwordBehaviorImpl implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("使用大宝剑挥舞！");
    }
}
