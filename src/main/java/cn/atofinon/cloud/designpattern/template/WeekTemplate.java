package cn.atofinon.cloud.designpattern.template;

/**
 * @Author yangjw
 * @Date 1/9/22 7:16 PM
 * @Descrition
 */


public class WeekTemplate extends DayTemplate {


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
        System.out.println("do calculate WeekTemplate");
    }

    @Override
    boolean hook() {
        System.out.println("week template false");
        return false;
    }
}
