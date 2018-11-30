package kr.co.acorn.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import kr.co.acorn.dto.DeptDTO;

@Repository
public class DeptOracleDAO implements Dao {
	@Autowired
	@Qualifier("sqlSessionTemplate")
	SqlSession ss;
	
	// setter
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}

	@Override
	public List<DeptDTO> selectAll() {
		return ss.selectList("kr.co.acorn.dept.selectAll");
	}

	@Override
	public void add(DeptDTO dto) {
		
	}
}
