package cn.atofinon.cloud.designpattern.template;

/**
 * @Author yangjw
 * @Date 1/9/22 7:18 PM
 * @Descrition
 */


public class DateTemplate extends DayTemplate {

    @Override
    void calculateLegalHoliday() {
        super.calculateLegalHoliday();
    }

    @Override
    void calculateWeekend() {
        super.calculateWeekend();
    }

    @Override
    void calculateTemplateRule() {
        System.out.println("do calculate DateTemplate");
    }

    @Override
    boolean hook() {
        System.out.println("day template false");
        return true;
    }
}
