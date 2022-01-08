package javadoop.create;

/**
 * @Author yangjw@tuya.com
 * @Date 2021/2/19 17:21
 * @Descrition
 */


public class ChineseFoodFactory implements FoodFactory{

    /**
     * do something
     *
     * @param name
     * @return Food
     */
    @Override
    public Food makeFood(String name) {

        if (name.equals("A")) {
            return  new Food();
        }

        return null;
    }
}
