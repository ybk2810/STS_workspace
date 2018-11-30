package kr.co.acorn.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.acorn.web.dto.MemberDTO;

@Controller
public class RegisterController {
	@RequestMapping("/register/step1.do")
	public String step1() {
		return "step1";
		// viewName
	}
	
	@RequestMapping("/register/step2.do")
	public ModelAndView step2(@ModelAttribute("dto")MemberDTO dto) {	
	/*public ModelAndView step2(@RequestParam(value="id")String id, @RequestParam(value="pw")String pw, 
			@RequestParam(value="repw")String repw, @RequestParam(value="email")String email, 
			@RequestParam(value="addrs")String addrs) {
		
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPw(pw);
		dto.setRepw(repw);
		dto.setEmail(email);
		dto.setAddrs(addrs);*/
		
		// 파라미터 값 가져와서 setter
		
		// dto 객체로 만들기
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("dto", dto);
		mav.setViewName("step2");
		
		//step2.jsp에서 표형태로 출력
		return mav;
	}

}
