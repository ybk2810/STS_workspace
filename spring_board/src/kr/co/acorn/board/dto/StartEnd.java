package kr.co.acorn.board.dto;

public class StartEnd {
	int startNo;
	int endNo;
	
	public StartEnd() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StartEnd(int startNo, int endNo) {
		super();
		this.startNo = startNo;
		this.endNo = endNo;
	}
	
	public int getStartNo() {
		return startNo;
	}
	public void setStartNo(int startNo) {
		this.startNo = startNo;
	}
	public int getEndNo() {
		return endNo;
	}
	public void setEndNo(int endNo) {
		this.endNo = endNo;
	}
	
	
}
