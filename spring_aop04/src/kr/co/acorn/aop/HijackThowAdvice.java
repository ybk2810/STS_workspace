package kr.co.acorn.aop;

import org.springframework.aop.ThrowsAdvice;

public class HijackThowAdvice implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) {
		System.out.println("hijack Throw Exception");
	}
}
