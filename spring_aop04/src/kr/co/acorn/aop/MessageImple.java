package kr.co.acorn.aop;

public class MessageImple implements Message {
	String msg;
	
	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public void printMsg() {
		System.out.println("출력 메세지" + msg);
	}

	@Override
	public void printThrowsException() {
		// 예외가 발생
		throw new IllegalArgumentException();
	}

}
