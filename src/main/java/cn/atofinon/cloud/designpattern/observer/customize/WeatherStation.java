package cn.atofinon.cloud.designpattern.observer.customize;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/5/2 4:56 pm
 * @Descrition
 */


public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData  = new WeatherData();
        CurrentConditionsObserver currentConditionsObserver = new CurrentConditionsObserver(weatherData);

        currentConditionsObserver.update(100,5,55.45f);
        weatherData.setMeasurementChanged(80,65,30.45f);
    }
}
