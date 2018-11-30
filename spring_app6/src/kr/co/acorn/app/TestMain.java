package kr.co.acorn.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	
	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("src/app.xml")); 
		Weapon w= bf.getBean("w",Weapon.class);
		CheckWeapon check = bf.getBean("cw",CheckWeapon.class);
		w.fire();
		w.reload();
		check.check();
	}
}
