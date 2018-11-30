package kr.co.acorn.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		
		Message m = ac.getBean("proxy", Message.class);
		
		m.printMsg();
		try {
			m.printThrowsException();
		}catch(Exception e) {
			
		}
	}
}
