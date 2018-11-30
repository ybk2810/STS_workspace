package kr.co.acorn.board.service;

import java.util.List;

import kr.co.acorn.board.dao.Dao;
import kr.co.acorn.board.dto.BoardDTO;

public class BoardServiceImple implements BoardService {
	Dao dao;
	
	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@Override
	public List<BoardDTO> readAll(int startNo, int endNo) {
		
		return dao.selectAll(startNo,endNo);
	}

	@Override
	public int getTotal() {
		
		return dao.getTotalData();
	}

	@Override
	public void add(BoardDTO dto) {
		dao.insertOne(dto);
	}

	@Override
	public BoardDTO readOne(int bno) {
		dao.raiseHits(bno);
		return dao.selectOne(bno);
	}

	@Override
	public void modify(BoardDTO dto) {
		dao.updateOne(dto);
	}

	@Override
	public void remove(BoardDTO dto) {
		dao.deleteOne(dto);
	}


}
