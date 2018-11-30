package kr.co.acorn.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {
	@RequestMapping("goHome.do")
	public ModelAndView aaa() {
		return new ModelAndView("goHome","msg","피자를 달라..");
	}
	@RequestMapping("lunch.do")
	public ModelAndView bbb() {
		return new ModelAndView("lunch","msl","밥이 보약이야");
	}
	@RequestMapping("home.do")
	public String home(HttpServletRequest req, HttpSession session) {
		// method 명도 자유롭게 쓸 수 있고
		// 매개변수도 필요하면 사용할 수 있고, 없어도 상관 없다.
		// 리턴타입에는 ModelAndView, String 등 여러가지 가능하다.
		
		return "home";
	}
	
}
