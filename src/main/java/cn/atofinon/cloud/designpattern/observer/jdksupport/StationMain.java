package cn.atofinon.cloud.designpattern.observer.jdksupport;


/**
 * @Author yangjw@tuya.com
 * @Date 2020/5/10 2:29 pm
 * @Descrition
 */


public class StationMain {

    public static void main(String[] args) {
        WeatherData weatherData  = new WeatherData();
//        StatisticsDisplay statisticsDisplay =  new StatisticsDisplay();

        weatherData.setMeasurementChanged(80,65,30.45f);
    }
}
