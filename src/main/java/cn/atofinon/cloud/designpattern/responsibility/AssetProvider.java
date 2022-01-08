package cn.atofinon.cloud.designpattern.responsibility;

/**
 * @Author yangjw
 * @Date 1/8/22 4:44 PM
 * @Descrition
 */


public interface AssetProvider {

    /**
     * 顺序
     * @return
     */
    int getPriority();

    /**
     * 执行节点
     *
     * @param type 类型
     * @return
     */
    boolean process(Integer type);
}
