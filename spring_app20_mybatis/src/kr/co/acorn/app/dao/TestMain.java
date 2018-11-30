package kr.co.acorn.app.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.acorn.app.dto.DeptDTO;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		
		Dao d= ac.getBean("dao", Dao.class);
		
		/*List<DeptDTO> list = d.selectAll();
		for(DeptDTO dto : list) {
			System.out.println(dto.getDeptno()+" : "+dto.getDname()+" : "+dto.getLoc());
		}*/
		
		
		/*DeptDTO dto1= d.selectOne(10);
		System.out.println(dto1.getDeptno()+" : "+dto1.getDname()+" : "+dto1.getLoc());*/
		
		
		for(int i=1; i<500; i++) {
			DeptDTO dto2 = new DeptDTO();
			dto2.setDname("익룡목소리"+i);
			dto2.setLoc("혜애옠예엨"+i);
			d.insertOne(dto2);
		}
		/*
		List<DeptDTO> list = d.selectAll();
		for(DeptDTO dto : list) {
			System.out.println(dto.getDeptno()+" : "+dto.getDname()+" : "+dto.getLoc());
		}*/
		
		
		/*d.deleteOne(778);
		List<DeptDTO> list = d.selectAll();
		for(DeptDTO dto : list) {
			System.out.println(dto.getDeptno()+" : "+dto.getDname()+" : "+dto.getLoc());
		}*/
		
		DeptDTO dto2 = new DeptDTO();
		dto2.setDeptno(10);
		dto2.setDname("김영복사마");
		dto2.setLoc("씹잘생김");
		d.updateOne(dto2);
		List<DeptDTO> list = d.selectAll();
		for(DeptDTO dto : list) {
			System.out.println(dto.getDeptno()+" : "+dto.getDname()+" : "+dto.getLoc());
		}
	}
}
