package cn.atofinon.cloud.designpattern.responsibility;

/**
 * @Author yangjw
 * @Date 1/8/22 5:14 PM
 * @Descrition
 */


public class VipFreeProvider implements AssetProvider {

    /**
     * 执行节点
     */
    @Override
    public boolean process(Integer type) {
        System.out.println("vip free");
        return type == 1 ? true : false;
    }


    /**
     * 顺序
     *
     * @return
     */
    @Override
    public int getPriority() {
        return 1;
    }
}
