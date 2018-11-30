package kr.co.acorn.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.acorn.dao.Dao;
import kr.co.acorn.dto.MemberDTO;

@Controller
public class LoginController {
	Dao dao;

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String login() {
		return "loginForm";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public ModelAndView loginOk(@RequestParam("id")String id,@RequestParam("pw")String pw) {
		MemberDTO dto = dao.selectOne(id, pw);
		
		ModelAndView mav = new ModelAndView("loginOk","dto",dto);
		return mav;
	}
}
