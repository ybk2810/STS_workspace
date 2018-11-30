package kr.co.acorn.control;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.multipart.MultipartFile;

public class FileValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		// 검사 대상 : target
		// 이때 발생하는 에러 : errors
		
		UploadFile file = (UploadFile)target;
		MultipartFile mf = file.getFile();
		
		if(mf.getSize() == 0) {
			errors.rejectValue("file", null, "파일을 선택해 주세요.");
		}else if(mf.getSize()>104857600) {
			errors.rejectValue("file", null, "100MB이하의 파일만 전송가능합니다.");
		}
	}

}
