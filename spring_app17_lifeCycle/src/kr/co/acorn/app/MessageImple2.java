package kr.co.acorn.app;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

public class MessageImple2 implements Message{
	String name;
	
	/*public MessageImple2() {};
	
	public MessageImple2(String name) {
		super();
		this.name = name;
	}*/
	
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void printMsg() {
		System.out.println(name + " 님 안녕하세요.");
	}
	
	public void init() {
		System.out.println("초기화 메서드");
	}
	
	public void destroy() {
		System.out.println("종료 메서드");
	}
}
