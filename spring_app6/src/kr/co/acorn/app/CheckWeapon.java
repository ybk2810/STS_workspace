package kr.co.acorn.app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CheckWeapon {
	public void check() {
//		Calendar c = Calendar.getInstance();
//		int year = c.get(Calendar.YEAR);
//		int month = c.get(Calendar.MONTH)+1;
//		int day = c.get(Calendar.DAY_OF_MONTH);
//		int hour = c.get(Calendar.HOUR_OF_DAY);
//		int minute = c.get(Calendar.MINUTE);
//		int second = c.get(Calendar.SECOND);
//		String Date;
//		if(month<10) {
//			Date = year+"."+"0"+month+"."+day+" "+hour+"시:"+minute+"분:"+second+"초";
//		}else {
//			Date = year+"."+month+"."+day+" "+hour+"시:"+minute+"분:"+second+"초";
//		}
//		System.out.println(Date);
//		return Date;
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
		String date = sdf.format(d);
		String FilePath = "c:\\log\\"+"time"+date+".log";
		File f = new File(FilePath);
		FileWriter fw = null; 
		try {
			fw = new FileWriter(f);
			fw.write("무기사용함    "+date);
			fw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(fw!=null)fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	

}
