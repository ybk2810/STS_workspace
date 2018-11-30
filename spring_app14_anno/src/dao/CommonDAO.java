package dao;

import java.util.ArrayList;

import dto.DeptDTO;

public interface CommonDAO {
	public void connect();
	public void insert(DeptDTO dto);
	public void update(DeptDTO dto);
	public void delete(int no);
	public ArrayList<DeptDTO> selectAll();
	public DeptDTO selectOne(int no);
	public void close();
}
