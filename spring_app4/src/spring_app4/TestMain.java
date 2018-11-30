package spring_app4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/dao.xml"));
		CommonDAO cd = factory.getBean("dao",CommonDAO.class);
		
		cd.connect();
		cd.selectAll();
		
	}
}
