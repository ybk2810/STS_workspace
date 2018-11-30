package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import dao.CommonDAO;
import dto.DeptDTO;

public class DeptService implements DBService{
	@Autowired
	@Qualifier("odao")
	CommonDAO dao;

	public void setDao(CommonDAO dao) {
		this.dao = dao;
	}

	@Override
	public void readAll() {
		dao.selectAll();
	}

	@Override
	public void readOne(int no) {
		dao.selectOne(no);
	}

	@Override
	public void write(DeptDTO dto) {
		dao.insert(dto);
	}

	@Override
	public void modif(DeptDTO dto) {
		dao.update(dto);
	}

	@Override
	public void drop(int no) {
		dao.delete(no);
	}
}
