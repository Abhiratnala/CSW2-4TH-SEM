package assignment8_datetimeApi;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate startDate=LocalDate.of(2024, 05, 05);
		LocalDate currDate=LocalDate.now();
		//to find no of days between start date nd current date 
		long daysBetween=ChronoUnit.DAYS.between(startDate,currDate);
		System.out.println(daysBetween);
		long time=daysBetween/365;
		System.out.println("interest= "+(5000*8*time)/100);
		
		
		

	}

}
