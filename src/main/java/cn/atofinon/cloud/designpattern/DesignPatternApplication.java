package cn.atofinon.cloud.designpattern;

import cn.atofinon.cloud.designpattern.strategy.RedHeadDuck;
import cn.atofinon.cloud.designpattern.strategy.RocketPowerFly;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {
//		SpringApplication.run(DesignPatternApplication.class, args);

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
		redHeadDuck.performQuack();

		redHeadDuck.performFly();
        redHeadDuck.setFlyBehavior(new RocketPowerFly());
        redHeadDuck.performFly();
    }

}
