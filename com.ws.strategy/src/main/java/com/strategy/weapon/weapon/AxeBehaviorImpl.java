package com.strategy.weapon.weapon;

/**
 * @Author: ws
 * @projectName: desginModel
 * @Date: 2021/12/21 15:21
 **/
public class AxeBehaviorImpl implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("使用斧子砍劈！");
    }
}
