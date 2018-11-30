package kr.co.acorn.app;

import java.util.ArrayList;

public interface Dao {
	public int selectCount();
	public ArrayList<DeptDTO> selectAll();
	public DeptDTO selectOne(int no);
}
