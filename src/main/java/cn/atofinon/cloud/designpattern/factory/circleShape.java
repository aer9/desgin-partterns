package cn.atofinon.cloud.designpattern.factory;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/4/30 4:43 pm
 * @Descrition
 */


public class circleShape implements Shape {

    @Override
    public void draw() {
        System.out.println("circleShape.draw()..");
    }

}
