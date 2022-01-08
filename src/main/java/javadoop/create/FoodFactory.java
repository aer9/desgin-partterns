package javadoop.create;

/**
 * @Author yangjw@tuya.com
 * @Date 2021/2/19 17:21
 * @Descrition
 */


public interface FoodFactory {

    /**
     * do something
     *
     * @param name
     * @return Food
     */
    Food makeFood(String name);

}
