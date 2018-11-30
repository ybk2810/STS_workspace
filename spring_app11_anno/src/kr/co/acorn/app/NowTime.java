package kr.co.acorn.app;

import java.text.SimpleDateFormat;
import java.util.Date;

import oracle.sql.DATE;

public class NowTime {

	public String getTime() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("hh시mm분ss초");
		String time = sdf.format(d);
		return time;
	}
	
	
}
