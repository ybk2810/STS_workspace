package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import dao.CommonDAO;
import dao.OracleDAO;
import service.DBService;

public class TestMain {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/application.xml"));
		
		CommonDAO dao = factory.getBean("dao", CommonDAO.class);
		DBService ds = factory.getBean("service", DBService.class);
		ds.readAll();
		ds.readOne(10);
		
	}
	
	
}
