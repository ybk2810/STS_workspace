package kr.co.acorn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import kr.co.acorn.dto.MemberDTO;

public class MemberDAO implements Dao {
	private Connection conn;
	private StringBuffer sb = new StringBuffer();
	private PreparedStatement pstmt;
	private ResultSet rs;
	private DataSource ds;

	public MemberDAO() {
	}

	public MemberDAO(DataSource ds) {
		// datasource 에 디비연결 소스가 있어?
		super();
		this.ds = ds;
	}

	@Override
	public List<MemberDTO> selectAll() {
		List<MemberDTO> list = new ArrayList<MemberDTO>();

		try {
			conn = ds.getConnection();
			sb.setLength(0);
			sb.append("SELECT * FROM member ");

			pstmt = conn.prepareStatement(sb.toString());

			rs = pstmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String repw = rs.getString("repw");
				String email = rs.getString("email");
				String addrs = rs.getString("addrs");

				MemberDTO dto = new MemberDTO();
				dto.setAddrs(addrs);
				dto.setEmail(email);
				dto.setId(id);
				dto.setPw(pw);
				dto.setRepw(repw);

				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public MemberDTO selectOne(String id, String pw) {
		MemberDTO dto = new MemberDTO();

		try {
			conn = ds.getConnection();
			sb.setLength(0);
			sb.append("SELECT id FROM member ");
			sb.append("WHERE id=? and pw=? ");

			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			pstmt.setString(2, pw);

			rs = pstmt.executeQuery();
			boolean isOk = rs.next();
			if (isOk) {
				dto.setId(id);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dto;
	}

	@Override
	public void updateOne(MemberDTO dto) {
		try {
			conn = ds.getConnection();
			sb.setLength(0);
			sb.append("UPDATE member ");
			sb.append("SET pw = ?, repw = ?, email = ?, addrs = ? ");
			sb.append("WHERE id = ? ");

			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, dto.getPw());
			pstmt.setString(2, dto.getRepw());
			pstmt.setString(3, dto.getEmail());
			pstmt.setString(4, dto.getAddrs());
			pstmt.setString(5, dto.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertOne(MemberDTO dto) {
		try {
			conn = ds.getConnection();
			sb.setLength(0);
			sb.append("INSERT INTO member ");
			sb.append("VALUES ( ?, ?, ?, ? ) ");

			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getRepw());
			pstmt.setString(4, dto.getEmail());
			pstmt.setString(5, dto.getAddrs());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteOne(String id) {
		try {
			conn = ds.getConnection();
			sb.setLength(0);
			sb.append("DELETE member ");
			sb.append("WHERE id = ? ");
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
