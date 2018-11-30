package kr.co.acorn.app;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

public class MessageImple implements Message, InitializingBean, DisposableBean{
	//@Value("홍길동")
	String name;
	
	public MessageImple() {};
	
	public MessageImple(String name) {
		super();
		this.name = name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void printMsg() {
		System.out.println(name + " 님 안녕하세요.");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean 구현메서드 : 종료");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean 구현메서드 : 초기화 메서드");
	}
}
