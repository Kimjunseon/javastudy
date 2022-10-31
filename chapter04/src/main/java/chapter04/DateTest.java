package chapter04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		printDate01(now);
		printDate02(now);

	}
	
	private static void printDate01(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String date = sdf.format(d);
		System.out.println(date);
	}
	
	private static void printDate02(Date d) {
		//년도
		int year = d.getYear(); // +1900 뒤에 2자리만 나옴
		int month = d.getMonth();
		int date = d.getDate();
		int hours = d.getHours();
		int minutes = d.getMinutes();
		int seconds =d.getSeconds();
		System.out.println(year + 1900 + "년" + month + "월" + date + "일" + hours + "시"
						   + minutes + "분" + seconds + "초");
	}
}
