package kr.co.acorn.web;

import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일 hh시 mm분 ss초");
		String msg = sdf.format(d);
		
		InetAddress i =InetAddress.getLocalHost();
		String ip = i.getHostAddress();
		
		mav.addObject("msg", "msg: " + msg);
		mav.addObject("ip", "ip: " + ip);
		mav.setViewName("good");
		return mav;
	}

}
