package service;

import dto.DeptDTO;

public interface DBService {
	public void readAll();
	public void readOne(int no);
	public void write(DeptDTO dto);
	public void modif(DeptDTO dto);
	public void drop(int no);
}
