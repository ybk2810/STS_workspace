package kr.co.acorn.board.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// hello.do ==> hello.jsp
// msg ==> 안녕
@Controller
public class HelloController {
	@RequestMapping("/hello.do")
	public ModelAndView hello() {
		return new ModelAndView("hello","msg","안뇽");
		
	}
}
