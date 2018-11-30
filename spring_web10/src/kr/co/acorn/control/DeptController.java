package kr.co.acorn.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.acorn.dao.Dao;

@Controller
public class DeptController {
	@Autowired
	Dao dao;

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/deptList")
	public ModelAndView list() {
		return new ModelAndView(
				"list", "list", dao.selectAll());
	}
}
