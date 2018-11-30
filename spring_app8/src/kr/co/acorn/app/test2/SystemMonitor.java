package kr.co.acorn.app.test2;

public class SystemMonitor {
	Sender sender;
	
	public SystemMonitor() {}
	public SystemMonitor(Sender sender) {
		super();
		this.sender = sender;
	}

	public void print() {
		System.out.println("SystemMonitor 클래스의 print()");
		sender.show();
	}


	/*public void setSender(Sender sender) {
		this.sender = sender;
	}*/

	
	
	
}
