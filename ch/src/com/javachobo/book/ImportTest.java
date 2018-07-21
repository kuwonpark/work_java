package com.javachobo.book;
import java.text.SimpleDateFormat;
import java.util.Date;


 class ImportTest {
	 public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyy/MM/DD");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("오늘 날짜는 "+date.format(today));
		System.out.println("오늘 시간는 "+time.format(today));
		
		
	}

}
