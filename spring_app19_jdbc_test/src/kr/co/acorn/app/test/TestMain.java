package kr.co.acorn.app.test;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.acorn.app.dao.Dao;
import kr.co.acorn.app.dto.DeptDTO;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		
		Dao d = ac.getBean("dao", Dao.class);
		
		/*int result = d.selectCount();
		System.out.println("result: " + result);*/
		
		/*ArrayList<DeptDTO> list = d.selectAll();
		for(DeptDTO dto : list) {
			System.out.println(dto.getDeptno() + " : " + dto.getDname() + " : " + dto.getLoc());
		}*/
		
		/*DeptDTO dto = d.selectOne(20);
		System.out.println(dto.getDeptno() + " : " + dto.getDname() + " : " + dto.getLoc());*/
		
		DeptDTO dto2 = new DeptDTO();
		dto2.setDname("박지현");
		dto2.setLoc("인성쓰ㄺ");
		d.insertOne(dto2);
		
		/*dto2.setDeptno(192);
		dto2.setDname("김영복sla");
		dto2.setLoc("rasdfo잘생김");
		d.updateOne(dto2);*/
		
		d.deleteOne(801);
		ArrayList<DeptDTO> list2 = d.selectAll();
		for(DeptDTO dto : list2) {
			System.out.println(dto.getDeptno() + " : " + dto.getDname() + " : " + dto.getLoc());
		}
		
		
	}
}
