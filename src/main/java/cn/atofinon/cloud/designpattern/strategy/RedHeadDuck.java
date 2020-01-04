package cn.atofinon.cloud.designpattern.strategy;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/1/4 2:25 PM
 * @Descrition
 */


public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        quackBehavior = new QuackBehavior();
        flyBehavior = new CannotFly();
    }


    public void display() {

        System.out.println("ReaHeadDuck!");
    }




}
