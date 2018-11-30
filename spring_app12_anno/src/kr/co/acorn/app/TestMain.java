package kr.co.acorn.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
		
		Character ch = ac.getBean("ch", Character.class);
		ch.eat("도너츠");
		ch.attack("리리&지현");
		ch.get("동전");
	}
}
