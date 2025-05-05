package assignment8_datetimeApi;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate startDate=LocalDate.of(2024, 05, 05);
		LocalDate currDate=LocalDate.now();
		//to find no of days between start date nd current date 
		long daysBetween=ChronoUnit.DAYS.between(startDate,currDate);
		System.out.println(daysBetween);

	}

}
