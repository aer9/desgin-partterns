package cn.atofinon.cloud.designpattern.strategy;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/1/4 2:30 PM
 * @Descrition
 */


public class QuackBehavior implements IQuackBehavior {

    @Override
    public void Quack() {
        System.out.println("quack.... ");
    }

}
