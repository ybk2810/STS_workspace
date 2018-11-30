package kr.co.acorn.app.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		// app1.xml Data bean 추가
		
		// 설정 읽기
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/app1.xml"));
		// Data Bean 꺼내서
		Data d = factory.getBean("data", Data.class);
		System.out.println("출력값: " + d.getNumber());
		// 출력값 : 50
	}
}
