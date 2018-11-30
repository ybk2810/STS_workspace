package kr.co.acorn.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class CheckTime implements MethodInterceptor{
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		StopWatch sw = new StopWatch();
		sw.start();
		Object obj = invocation.proceed(); // 메서드 실행
		sw.stop();
		System.out.println("진행시간: " + sw.getTotalTimeSeconds() + "초");
		
		return obj;
	}
}
