package kr.co.acorn.control;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

@Controller
public class FileUploadController {
	FileValidator fileValidator;
	
	
	public void setFileValidator(FileValidator fileValidator) {
		this.fileValidator = fileValidator;
	}

	@RequestMapping(value="/upload/upload.do", method=RequestMethod.GET)
	public String register() {
		return "upload/form";
 	}
	
	@RequestMapping(value="/upload/upload.do", method=RequestMethod.POST)
	public ModelAndView upload(@ModelAttribute("uploadFile")UploadFile file, HttpServletRequest req, BindingResult result) {
		// 업로드한 파일 객체 가져오기
		// 내부적으로 임의의 경로에 파일 보관한다.
		MultipartFile mfile = file.getFile();
		System.out.println("file: " + file);
		
		// 파일 유효성 검사후 성공하면 작업을 계속, 실해하면 중단
		fileValidator.validate(file, result);
		if(result.hasErrors()) {
			// 다시 돌아가
			return new ModelAndView("upload/form");
		}
		
		// 파일은 어디에 저장?
		HttpSession hs = req.getSession();
		
		ServletContext application = hs.getServletContext();
		
		String filePath = application.getRealPath("/data");
		
		System.out.println("filePath: " + filePath);
		
		String fileName = mfile.getOriginalFilename();
		
		// 파일 객체
		File f = new File(filePath + "/" + fileName);
		
		try {
			// 임시 경로에 보관중인 파일을 저장
			mfile.transferTo(f);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("fileName", f.getName());
		mav.setViewName("upload/uploadFile");
		mav.addObject("filePath", "../data/" + f.getName());
		
		return mav;
 	}
	
	// @ResponseBody
	// 웹애플리케이션의 모델층에서 리턴한 결과
	// 보통 뷰(JSP)로 포워딩하여 출력
	// 이때 뷰페이지를 통하지 않고 바로 출력스트림으로 보내는 것
	// 파일 다운로드, Ajax
	@RequestMapping("/upload/download.do")
	@ResponseBody
	public byte[] download(HttpServletRequest req, @RequestParam("fileName")String fileName, HttpServletResponse resp) throws IOException {
		// download.do?filename=${filename}
		// 파일의 절대 경로
		String filePath = req.getSession().getServletContext().getRealPath("/data");
		
		System.out.println("/data 디렉토리 절대경로: " + filePath);
		
		//파일의 절대 경로
		String absFilePath = filePath + "/" + fileName;
		
		System.out.println("파일의 절대경로: " + absFilePath);
		
		// 파일 객체 생성
		File f = new File(absFilePath);
		
		// 전송할 파일을 byte[]로 형변환 시켜주자.
		byte[] b = FileCopyUtils.copyToByteArray(f);
		
		// 브라우저가 지금 보내는 내용을 이해할 수 있도록 헤더를 추가
		String fn = new String(f.getName().getBytes(), "iso_8859_1");
		
		// 파일의 이름
		resp.setHeader("Content-Disposition", "attachment;filename=\""+fn+"\"");
		
		// 파일의 종류
		resp.setContentType("image/jpeg");
		
		return b;
	}
}
