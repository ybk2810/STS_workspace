package kr.co.acorn.aop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;

public class LoggingAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		/*Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println("현재시간출력: " + hour + ":" + minute + ":" + second);*/
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("hh시 mm분 ss초");
		System.out.println("현재시각 : " + sdf.format(d));
		String time = sdf.format(d);
		String path = "c:/log/"+time+".log";
		File f = new File(path);
		FileWriter fw = new FileWriter(f);
		fw.write(time+"이체함");
		fw.flush();
		fw.close();
	}

}
