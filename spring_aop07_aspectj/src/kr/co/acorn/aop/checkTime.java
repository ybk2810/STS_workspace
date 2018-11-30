package kr.co.acorn.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class checkTime{
	
	//app.xml에서 around의 method와 동일하게 : logAround를
	public Object logAround(ProceedingJoinPoint pjp) throws Throwable {
		//실행중인 메서드의 이름을 얻어오기
		String methodName = pjp.getSignature().getName();
		//현재 메서드명 출력
		System.out.println("현재실행중인메서드:"+methodName);
		
		StopWatch sw = new StopWatch();
		sw.start();
		Object obj = pjp.proceed();
		sw.stop();
		System.out.println("처리시간 : "+sw.getTotalTimeSeconds());
		return obj;
	}


}
