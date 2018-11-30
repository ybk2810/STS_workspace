package kr.co.acorn.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Hello h = ac.getBean("h",Hello.class);
		
		h.sayHello("핑크퐁");
	}
}
