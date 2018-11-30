package kr.co.acorn.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	// 			/views/login/loginForm.jsp
	//webcontents
	@RequestMapping("/login.do")
	public String login() {
		return "login/loginForm";
		// viewName
	}
	
	@RequestMapping("/loginOk.do")
	public String loginOk(@RequestParam(value="id")String id, @RequestParam("pw")String pw, HttpSession session) {
		// id와 pw 파라미터 값을 가져와서 db에 연결해서 해당 id, pw 검사
		//String id = req.getParameter("id");
		//String pw = req.getParameter("pw");
		
		// 존재한다면 session에 id를 담기
		if(id.equals("aaa") && pw.equals("bbb")) {
			session.setAttribute("id",id);
			session.setAttribute("pw",pw);
		}
		
		return "main";
	}
}
