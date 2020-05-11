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

    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurementChanged(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
