 package kr.co.acorn.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		
		Hello h= ac.getBean("h", HelloImple.class);
		h.Hello();
		
	}
}
