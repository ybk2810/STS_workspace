package spring_app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		
		Object obj1 = factory.getBean("lp");		
		Printer p1 = (Printer)obj1;
		p1.printing("s");

		Object obj2 = factory.getBean("dp");		
		Printer p2 = (Printer)obj2;
		p2.printing("s");
	}
}
