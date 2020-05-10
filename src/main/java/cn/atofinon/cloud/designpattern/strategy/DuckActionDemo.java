package cn.atofinon.cloud.designpattern.strategy;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/4/13 10:33 PM
 * @Descrition
 */


public class DuckActionDemo {

    public static void main(String[] args) {
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performQuack();

        redHeadDuck.performFly();
        redHeadDuck.setFlyBehavior(new RocketPowerFly());
        redHeadDuck.performFly();
    }
}
