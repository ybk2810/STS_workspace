package kr.co.acorn.board.dao;

import java.util.List;

import kr.co.acorn.board.dto.BoardDTO;

public interface Dao {
   public List<BoardDTO> selectAll(int startNo, int endNo);
   public void insertOne(BoardDTO dto);
   public int getTotalData();
   public BoardDTO selectOne(int bno);
   public void updateOne(BoardDTO dto);
   public void deleteOne(BoardDTO dto);
   public void raiseHits(int bno);

}