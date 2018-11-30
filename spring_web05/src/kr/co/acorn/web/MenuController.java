package kr.co.acorn.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MenuController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		String[] menuList = request.getParameterValues("ck");
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", menuList);
		mav.setViewName("menu");
		return mav;
	}

}
