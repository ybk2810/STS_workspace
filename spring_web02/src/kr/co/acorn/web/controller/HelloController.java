package kr.co.acorn.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller
{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/*ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "안녕");
		mav.setViewName("hello");*/
		
		ModelAndView mav = new ModelAndView("hello", "msg", "해봐");
		
		return mav;
	}

}
