package kr.co.acorn.aop;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
ApplicationContext ac  = new ClassPathXmlApplicationContext("app.xml");
		
		CustomerService cs = ac.getBean("cs",CustomerService.class);
		cs.printEmail();
		cs.printName();
		
//		try {
//			FileWriter fw = new FileWriter("c:/log/aop07_aspect지정.log");
//			String str = "app.xml에서 aop설정했음";
//			fw.write(str);
//			fw.flush();
//			fw.close();
//			
//		} catch (IOException e) {
//			System.out.println("저장안됨");
//		}
	}

}
