package kr.co.acorn.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//Action
//Controller 인터페이스 구현

public class WelcomeController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg1", "msg1: 곤니찌와");
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일 hh시 mm분 ss초");
		String str = sdf.format(d);
		
		mav.addObject("time", "time: " + str);
		mav.setViewName("welcome");
		
		return mav;
	}
	
}
