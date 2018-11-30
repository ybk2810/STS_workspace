package kr.co.acorn.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OracleDAO implements Dao{
	Connection conn;
	StringBuffer sb = new StringBuffer();
	PreparedStatement pstmt;
	ResultSet rs;
	
	// 초기화 시켜주는 메서드
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
		
	}
	

	
	
	
	@Override
	public int selectCount() {
		sb.setLength(0);
		sb.append("SELECT COUNT(*) cnt FROM dept");
		
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			rs.next();
			result = rs.getInt("cnt");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ArrayList<DeptDTO> selectAll() {
		ArrayList<DeptDTO> list = new ArrayList<DeptDTO>();
		sb.setLength(0);
		sb.append("SELECT * FROM dept");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");

				DeptDTO dto = new DeptDTO();
				dto.setDeptno(deptno);
				dto.setDname(dname);
				dto.setLoc(loc);

				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		return list;
	}

	@Override
	public DeptDTO selectOne(int no) {
		sb.setLength(0); // 문장 길이를 0으로

		sb.append("SELECT * FROM DEPT ");
		sb.append("WHERE deptno = ?");

		System.out.println("SQL문 출력: " + sb.toString());

		DeptDTO dto = new DeptDTO();
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, no);

			rs = pstmt.executeQuery();

			rs.next();
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			dto.setDeptno(deptno);
			dto.setDname(dname);
			dto.setLoc(loc);

		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return dto;
	}
	
	public void close() {
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
