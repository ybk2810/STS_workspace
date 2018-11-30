package spring_app2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		// spring configuration file 읽기
		
		// 콩공장
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		
		Object obj1 = factory.getBean("cf");
		Object obj2 = factory.getBean("hdc");
		
		Beverage b1 = (Beverage)obj1;
		Beverage b2 = (Beverage)obj2;
		
		b1.drink("망고쥬스");
		b2.drink("골드피크");
	}
}
