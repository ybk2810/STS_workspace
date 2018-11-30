package spring_app2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(name="mc")
	public Beverage MachineCoffee() {
		MachineCoffee mc = new MachineCoffee();
		mc.setSnack("머신커피에 맞는 과자");
		return mc;
	}
	
	@Bean(name="hc")
	public Beverage HandDripCoffee() {
		return new HandDripCoffee();
	}
	
}
