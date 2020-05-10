package cn.atofinon.cloud.designpattern.observer;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/5/2 4:10 pm
 * @Descrition
 */


public interface Observer {

    /**
     * 收到主题的通知后 更新操作
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp,float humidity,float pressure);

}
