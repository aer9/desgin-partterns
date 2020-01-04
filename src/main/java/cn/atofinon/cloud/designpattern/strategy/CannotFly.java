package cn.atofinon.cloud.designpattern.strategy;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/1/4 2:49 PM
 * @Descrition
 */


public class CannotFly implements IFlyBehavior {


    @Override
    public void fly() {
        System.out.println("can not fly");
    }
}
