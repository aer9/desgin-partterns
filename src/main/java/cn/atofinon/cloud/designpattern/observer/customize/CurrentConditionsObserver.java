package cn.atofinon.cloud.designpattern.observer.customize;

import cn.atofinon.cloud.designpattern.observer.DisplayElement;
import cn.atofinon.cloud.designpattern.observer.Observer;
import cn.atofinon.cloud.designpattern.observer.Subject;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/5/2 4:50 pm
 * @Descrition
 */


public class CurrentConditionsObserver implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;
    private Subject subject;


    public CurrentConditionsObserver(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public CurrentConditionsObserver() {
    }

    /**
     * 收到主题的通知后 更新操作
     *
     * @param temp
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }


    /**
     * 显示动作
     */
    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "CurrentConditionsObserver{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", subject=" + subject +
                '}';
    }
}
