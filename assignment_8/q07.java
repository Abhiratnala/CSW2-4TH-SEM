package assignment8_datetimeApi;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime d=LocalDateTime.now();
		System.out.println("curr date nd time "+d);
		LocalDate d1=LocalDate.now();
		DateTimeFormatter Formatter=DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String s1=d1.format(Formatter);
		System.out.println(s1);
		System.out.println();
		

	}

}
