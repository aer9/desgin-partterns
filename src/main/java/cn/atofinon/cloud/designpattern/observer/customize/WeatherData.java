package cn.atofinon.cloud.designpattern.observer.customize;

import cn.atofinon.cloud.designpattern.observer.Observer;
import cn.atofinon.cloud.designpattern.observer.Subject;

import java.util.ArrayList;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/5/2 4:14 pm
 * @Descrition
 */


public class WeatherData implements Subject {

    private ArrayList observerList;

    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observerList= new ArrayList();
    }

    public WeatherData(ArrayList observerList) {
        this.observerList = observerList;
    }


    /**
     * 注册 观察者
     *
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 删除观察者
     *
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObserver() {
        observerList.stream().forEach(obs -> {
            Observer observer = (Observer) obs;
            observer.update(temp, humidity, pressure);
        });
    }

    public void measurementChanged() {
        notifyObserver();
    }

    public void setMeasurementChanged(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
