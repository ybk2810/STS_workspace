package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import dao.CommonDAO;
import dao.OracleDAO;
import service.DBService;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		
		DBService ds = ac.getBean("service", DBService.class);
		ds.readAll();
		ds.readOne(10);
		
	}
	
	
}
