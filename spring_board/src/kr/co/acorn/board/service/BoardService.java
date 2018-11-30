package kr.co.acorn.board.service;

import java.util.List;

import kr.co.acorn.board.dto.BoardDTO;

public interface BoardService {
	public List<BoardDTO> readAll(int startNo, int endNo);
	public int getTotal();
	public void add(BoardDTO dto);
	public BoardDTO readOne(int bno);
	public void modify(BoardDTO dto);
	public void remove(BoardDTO dto);
}
