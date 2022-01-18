package cn.atofinon.cloud.designpattern.template;

/**
 * @Author yangjw
 * @Date 1/9/22 7:12 PM
 * @Descrition
 */


public abstract class DayTemplate {

    final void dayCalculate(){
        calculateLegalHoliday();
        calculateWeekend();
        calculateTemplateRule();
        if (hook()){
            System.out.println("执行 hook 规则");
        }
    }


    void calculateLegalHoliday() {
        System.out.println("do calculate Legal Holiday");

    }


      void calculateWeekend(){
        System.out.println("do calculate weekend");
    }

     abstract void calculateTemplateRule();

    boolean hook(){
        System.out.println("do default hook...");
        return true;
    }

    public static void main(String[] args) {
        DateTemplate dayTemplate= new DateTemplate();
        dayTemplate.dayCalculate();


        WeekTemplate weekTemplate=new WeekTemplate();
        weekTemplate.dayCalculate();
    }

}
