package kr.co.acorn.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.acorn.board.dto.BoardDTO;
import kr.co.acorn.board.dto.StartEnd;

public class BoardOracleDao implements Dao {
	//db연겨객체
	private SqlSession ss;
   
	public void setSs(SqlSession ss) {
	   this.ss = ss;
	}

	@Override
	public List<BoardDTO> selectAll(int startNo, int endNo) {
		StartEnd se = new StartEnd(startNo, endNo);
	   //마이바티스의 mapper에있는 이름을 실행하는것 =  return
	   return ss.selectList("kr.co.acorn.board.selectAll",se);
	}

	@Override
	public void insertOne(BoardDTO dto) {
	   ss.insert("kr.co.acorn.board.insertOne", dto);
	}

	@Override
	public int getTotalData() {
		// 총 게시물건수 리턴
		return ss.selectOne("kr.co.acorn.board.count");
	}

	@Override
	public BoardDTO selectOne(int bno) {
		return ss.selectOne("kr.co.acorn.board.selectOne", bno);
	}

	@Override
	public void updateOne(BoardDTO dto) {
		ss.update("kr.co.acorn.board.updateOne", dto);
	}

	@Override
	public void deleteOne(BoardDTO dto) {
		ss.delete("kr.co.acorn.board.deleteOne", dto);
	}

	@Override
	public void raiseHits(int bno) {
		ss.update("kr.co.acorn.board.raiseHits", bno);
	}

}