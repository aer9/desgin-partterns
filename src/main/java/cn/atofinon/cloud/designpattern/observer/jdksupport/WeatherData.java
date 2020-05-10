package cn.atofinon.cloud.designpattern.observer.jdksupport;

import java.util.Observable;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/5/2 5:32 pm
 * @Descrition
 */


public class WeatherData extends Observable {

    private float temp;
    private float humidity;
    private float pressure;

}
