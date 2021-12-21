package com.strategy.weapon.weapon;

/**
 * @Author: ws
 * @projectName: desginModel
 * @Date: 2021/12/21 15:25
 **/
public class KnifeBehaviorImpl implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("使用匕首刺杀！");
    }
}
