package kr.co.acorn.app;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloImple implements Hello{
	//지금시간
//	String name;
	@Autowired
	NowTime nt;

//	public HelloImple() {
//		
//	}
//	public HelloImple(NowTime nt) {
//		super();
//		this.nt = nt;
//	}

	public void setNt(NowTime nt) {
		this.nt = nt;
	}

	@Override
	public void Hello() {
		int hour = nt.getHours();
		if(hour<11) {
			System.out.println("오하요");
			
		}else if(hour<18) {
			System.out.println("곤니찌와");
			
		}else {
			System.out.println("곰방와");
		}

	}
	

}
