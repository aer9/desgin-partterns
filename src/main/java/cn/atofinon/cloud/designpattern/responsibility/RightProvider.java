package cn.atofinon.cloud.designpattern.responsibility;

/**
 * @Author yangjw
 * @Date 1/8/22 5:17 PM
 * @Descrition
 */


public class RightProvider implements AssetProvider {


    /**
     * 顺序
     *
     * @return
     */
    @Override
    public int getPriority() {
        return 3;
    }

    /**
     * 执行节点
     *
     * @param type 类型
     * @return
     */
    @Override
    public boolean process(Integer type) {
        System.out.println("right");
        return type == 3 ? true : false;
    }


}
