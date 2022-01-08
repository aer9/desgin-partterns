package cn.atofinon.cloud.designpattern.responsibility;

/**
 * @Author yangjw
 * @Date 1/8/22 5:16 PM
 * @Descrition
 */


public class ZeroProvider implements AssetProvider {


    /**
     * 执行节点
     *
     * @param type 类型
     * @return
     */
    @Override
    public boolean process(Integer type) {
        System.out.println("Zero ");
        return type == 2 ? true : false;
    }


    /**
     * 顺序
     *
     * @return
     */
    @Override
    public int getPriority() {
        return 2;
    }
}
