package cn.atofinon.cloud.designpattern.strategy;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/1/4 2:43 PM
 * @Descrition
 */


public class CanFly implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("can fly");
    }

}
