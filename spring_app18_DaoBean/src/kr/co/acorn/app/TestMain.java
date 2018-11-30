package kr.co.acorn.app;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		
		Dao d = ac.getBean("dao", Dao.class);
		
		int result = d.selectCount();
		System.out.println("result: " + result);
		
		ArrayList<DeptDTO> list = d.selectAll();
		
		for(DeptDTO dto : list) {
			System.out.println(dto.getDeptno() + " : " + dto.getDname() + " : " + dto.getLoc());
		}
	}
}
