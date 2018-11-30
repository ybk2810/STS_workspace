package kr.co.acorn.app.test2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import kr.co.acorn.app.test.Data;

public class TestMain2 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app2.xml");
		SystemMonitor sm = ac.getBean("sm",SystemMonitor.class);
		
		sm.print();
	}
}
