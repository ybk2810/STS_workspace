package kr.co.acorn.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.co.acorn.app.dto.DeptDTO;

public class DeptDAO implements Dao {
	ConnectionManager cm;
	
	public DeptDAO(ConnectionManager cm) {
		super();
		this.cm = cm;
	}

/*	// 초기화 시켜주는 메서드
	public void init() {
		// 변수
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.206:1521:orcl";
		String user = "scott";
		String password = "tiger";
		
		// 드라이버 로딩
		// connection 객체를 생성
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	
	@Override
	public List<DeptDTO> selectAll() {
		SqlSessionFactory factory = cm.getFactory();
		SqlSession ss = factory.openSession(true);
		System.out.println("ss: " + ss);
		List<DeptDTO> list = ss.selectList("kr.co.test.selectAll");
		ss.close();
		return list;
	}

	@Override
	public DeptDTO selectOne(int no) {
		SqlSessionFactory factory = cm.getFactory();
		SqlSession ss = factory.openSession(true);
		
		DeptDTO dto = ss.selectOne("kr.co.test.selectOne", no);
		ss.close();
		return dto;
	}
	
	@Override
	public void insertOne(DeptDTO dto) {
		SqlSessionFactory factory = cm.getFactory();
		SqlSession ss = factory.openSession(true);
		
		ss.insert("kr.co.test.insertOne", dto);
		ss.close();
	}
	
	@Override
	public void updateOne(DeptDTO dto) {
		SqlSessionFactory factory = cm.getFactory();
		SqlSession ss = factory.openSession(true);
		
		ss.update("kr.co.test.updateOne", dto);
		ss.close();
	}
	
	@Override
	public void deleteOne(int no) {
		SqlSessionFactory factory = cm.getFactory();
		SqlSession ss = factory.openSession(true);
		
		ss.delete("kr.co.test.deleteOne", no);
		ss.close();
	}

}
