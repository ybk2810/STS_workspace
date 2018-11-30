package kr.co.acorn.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloJPController implements Hello, Controller {
	String name;
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("welcomeHome","msg","벤쿄우 간밧데니 시요오");
		mav.addObject("data", sayHello());
		
		return mav;
	}

	@Override
	public String sayHello() {
		return name + "님 환영합니다.";
	}

}
