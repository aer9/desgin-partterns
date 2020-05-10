package cn.atofinon.cloud.designpattern.observer;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/5/2 4:10 pm
 * @Descrition
 */


public interface Subject {

    /**
     * 注册 观察者
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 删除观察者
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver();
}
