package cn.atofinon.cloud.designpattern.strategy;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/1/4 2:23 PM
 * @Descrition
 */


public class Duck {

    IFlyBehavior flyBehavior;

    IQuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.Quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }


    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("swim...");
    }

}
