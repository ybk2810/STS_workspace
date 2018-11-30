package kr.co.acorn.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	// <bean id= "h" class="kr.co.acorn.app.HelloImple"><bean/>
	
	@Bean(name="h")
	public Hello helloworld() {
		return new HelloImple();
	}
}
