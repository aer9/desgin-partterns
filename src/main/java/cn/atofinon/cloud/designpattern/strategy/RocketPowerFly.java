package cn.atofinon.cloud.designpattern.strategy;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/1/4 2:54 PM
 * @Descrition
 */


public class RocketPowerFly implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("rocket power fly");
    }
}
