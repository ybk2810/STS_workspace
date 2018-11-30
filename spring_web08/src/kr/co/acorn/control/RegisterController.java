package kr.co.acorn.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.acorn.dao.Dao;
import kr.co.acorn.dto.MemberDTO;

@Controller
public class RegisterController {
	Dao dao;

	// setter
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/register/step1.do")
	public String register() {
		return "registerForm";
 	}
	
	@RequestMapping("/register/step2.do")
	public String registerOk(@ModelAttribute("dto")MemberDTO dto) {
		
		dao.insertOne(dto);
		return "redirect:/login.do";
 	}
	
}
