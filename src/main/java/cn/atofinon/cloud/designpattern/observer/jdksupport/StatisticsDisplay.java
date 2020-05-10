package cn.atofinon.cloud.designpattern.observer.jdksupport;

import cn.atofinon.cloud.designpattern.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/5/2 5:39 pm
 * @Descrition
 */


public class StatisticsDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;

    /**
     * 显示动作
     */
    @Override
    public void display() {

    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {

    }
}
