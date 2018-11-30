package kr.co.acorn.dao;

import java.util.List;

import kr.co.acorn.dto.MemberDTO;

public interface Dao {
	public List<MemberDTO> selectAll();
	public MemberDTO selectOne(String id, String pw);
	public void insertOne(MemberDTO dto);
	public void updateOne(MemberDTO dto);
	public void deleteOne(String id);
}
