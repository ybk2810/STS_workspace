package kr.co.acorn.aop;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class FireLog {
	public void doAspect(JoinPoint jp) throws IOException {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일 hh시 mm분 ss초");
		String str = sdf.format(d);
		
		String filePath = "c:/log/time"+str+".log";
		
		FileWriter fw = new FileWriter(filePath);
		fw.write(str+"n");
		fw.flush();
		fw.close();
		
	}
}
