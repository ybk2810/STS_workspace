package dao;

import java.util.ArrayList;

import dto.DeptDTO;

public class MySqlDAO implements CommonDAO {

	@Override
	public void connect() {
		System.out.println("MySpl DB접속");
	}

	@Override
	public void insert(DeptDTO dto) {
		System.out.println("MySpl 추가");
	}

	@Override
	public void update(DeptDTO dto) {
		System.out.println("MySpl 수정");
	}

	@Override
	public void delete(int no) {
		System.out.println("MySpl 삭제");
	}

	@Override
	public ArrayList<DeptDTO> selectAll() {
		System.out.println("MySpl 전체조회");
		return null;
	}

	@Override
	public DeptDTO selectOne(int no) {
		System.out.println("MySpl 1건조회");
		return null;
	}

	@Override
	public void close() {
		System.out.println("MySpl 닫기");
	}
	
}
