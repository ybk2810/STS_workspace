package kr.co.acorn.app.test3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain3 {
	public static void main(String[] args) {
		// ApplicationContext
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("app3.xml");
		
		Printer p = ac.getBean("printer", Printer.class);
		
		p.print();
	}
}
