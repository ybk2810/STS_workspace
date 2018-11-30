package kr.co.acorn.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac  = new ClassPathXmlApplicationContext("app.xml");
		CustomerService cs = ac.getBean("cs",CustomerService.class);
		cs.printEmail();
		cs.printName();
	}
}
