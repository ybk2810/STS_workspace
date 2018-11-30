package kr.co.acorn.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		BeanFactory bf;
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		
		Message m = ac.getBean("m", Message.class);
		
		m.printMsg();
		
		// bean 스프링 컨테이너에서 제거될 때 
		// 3단계
		
		AbstractApplicationContext c = (AbstractApplicationContext)ac;
		
		c.close();
	}
}
