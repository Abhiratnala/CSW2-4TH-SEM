package assignment8_datetimeApi;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime d=LocalDateTime.now();
		DateTimeFormatter Formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String s1=d.format(Formatter);
		System.out.println(s1);

	}

}
