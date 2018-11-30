package kr.co.acorn.app;

import org.springframework.beans.factory.annotation.Autowired;

public class GreetingImple implements Greeting{
	@Autowired
	NowTime nt;
	String msg;
	
	
	public void setNt(NowTime nt) {
		this.nt = nt;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	@Override
	public void printMSG() {
			System.out.println("지금 시간은"+ nt.getTime() +"입니다.");
			System.out.println("메세지:"+msg);
	}
}
