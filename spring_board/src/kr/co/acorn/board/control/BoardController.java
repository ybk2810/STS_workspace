package kr.co.acorn.board.control;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.acorn.board.dto.BoardDTO;
import kr.co.acorn.board.service.BoardService;

@Controller
public class BoardController {
	BoardService bs;
	
	public void setBs(BoardService bs) {
		this.bs = bs;
	}

	// 전체 목록 조회
	@RequestMapping("/boardList")
	public ModelAndView list(@RequestParam(name="currentPage", defaultValue="1")int currentPage, 
			@RequestParam(name="countPerPage", defaultValue="50")int countPerPage) {
		ModelAndView mav = new ModelAndView();
		// 시작 번호
		int startNo = (currentPage-1)*countPerPage+1;
		// 끝 번호
		int endNo = currentPage*countPerPage;
		
		List<BoardDTO> list = bs.readAll(startNo,endNo);
		int total = bs.getTotal();
		
		int totalPage = (total*countPerPage==0)?total/countPerPage:(total/countPerPage)+1;
		// 페이지 시작번호
		int startPage = currentPage-5<=0?1:currentPage-5;
		// 페이지 끝번호
		int endPage = startPage+10>=totalPage?totalPage:startPage+10;

		// 이전
		boolean prev = currentPage> 5? true:false;
		// 다음
		boolean next = currentPage+5>= totalPage? false:true;
		
		
		mav.addObject("total", total);
		mav.addObject("currentPage", currentPage);
		mav.addObject("countPerPage", countPerPage);
		mav.addObject("totalPage", totalPage);
		mav.addObject("startPage", startPage);
		mav.addObject("endPage", endPage);
		mav.addObject("startNo", startNo);
		mav.addObject("endNo", endNo);
		mav.addObject("prev", prev);
		mav.addObject("endNo", endNo);
		mav.addObject("next", next);
		mav.addObject("list", list);
		mav.setViewName("list");
		return mav;
	}
	
	// 추가
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String form() {
		return "writeForm";
		
	}
	
	// writeForm으로 이동
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String writeOk(@ModelAttribute("dto")BoardDTO dto
			/*@RequestParam("bno")int bno, 
			@RequestParam("title")String title, @RequestParam("contents")String contents*/
			) {
		// 파라미터값 가져오기

		// db연결해서 db에 데이터 추가
		bs.add(dto);
				
		// 목록으로 이동
		return "redirect:/boardList";
	}
	
	// 1건 조회
	@RequestMapping("/detail")
	public ModelAndView detail(@RequestParam("bno")int bno) {
		BoardDTO dto = bs.readOne(bno);
		return new ModelAndView("detail", "dto", dto);
	}
	
	// 변경
	@RequestMapping("/modify")
	public ModelAndView modify(@RequestParam("bno")int bno) {
		BoardDTO dto = bs.readOne(bno);
		return new ModelAndView("modifyForm", "dto", dto);
	}
	
	@RequestMapping(value = "/modifyOk", method = RequestMethod.POST)
	public String modifyOk(@ModelAttribute("dto")BoardDTO dto) {
		bs.modify(dto);
		return "redirect:/boardList";
	}
	
	// 삭제
	@RequestMapping("/delete")
	public String delete(@ModelAttribute("dto")BoardDTO dto) {
		bs.remove(dto);
		return "redirect:/boardList";
	}
	
	
}
