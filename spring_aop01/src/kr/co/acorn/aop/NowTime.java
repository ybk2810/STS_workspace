package kr.co.acorn.aop;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class NowTime implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		Date d = new Date();
		System.out.println(d);
	}


	
	

}
