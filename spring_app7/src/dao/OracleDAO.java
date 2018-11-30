package dao;

import java.util.ArrayList;

import dto.DeptDTO;

public class OracleDAO implements CommonDAO {

	@Override
	public void connect() {
		System.out.println("oracle DB접속");
	}

	@Override
	public void insert(DeptDTO dto) {
		System.out.println("oracle 추가");
	}

	@Override
	public void update(DeptDTO dto) {
		System.out.println("oracle 수정");
	}

	@Override
	public void delete(int no) {
		System.out.println("oracle 삭제");
	}

	@Override
	public ArrayList<DeptDTO> selectAll() {
		System.out.println("oracle 전체조회");
		return null;
	}

	@Override
	public DeptDTO selectOne(int no) {
		System.out.println("oracle 1건 조회");
		return null;
	}

	@Override
	public void close() {
		System.out.println("oracle 종료");
	}

}
