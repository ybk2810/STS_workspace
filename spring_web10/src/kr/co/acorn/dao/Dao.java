package kr.co.acorn.dao;

import java.util.List;

import kr.co.acorn.dto.DeptDTO;

public interface Dao {
	public List<DeptDTO> selectAll();
	public void add(DeptDTO dto);
}
