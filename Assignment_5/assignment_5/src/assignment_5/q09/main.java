package q09;

import java.util.*;
import java.io.*;
import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner in=new Scanner(System.in);
		File a=new File("E:\\ratnala abhignya_2341001003\\CSW2\\CHAP12\\Class_WorkSpace\\assignment_5\\src\\q09\\diary.txt");
		if(a.exists()) {
			FileWriter ob=new FileWriter("E:\\ratnala abhignya_2341001003\\CSW2\\CHAP12\\Class_WorkSpace\\assignment_5\\src\\q09\\diary.txt");
			LocalDate d=LocalDate.now();
			String date=d.toString();
			for(int i=0;i<date.length();i++) {
				ob.write(date.charAt(i));
			}
			System.out.println("how was ur day");
			String s=in.nextLine();
			for(int i=0;i<s.length();i++) {
				ob.write(s.charAt(i));
			}
			ob.close();
	}
		else {
			System.out.println("doesnt exist so creating new file ");
			File ob=new File("E:\\ratnala abhignya_2341001003\\CSW2\\CHAP12\\Class_WorkSpace\\assignment_5\\src\\q09\\diary.txt");
			if(ob.createNewFile())
				System.out.println("file created"+ob.getName());
			FileWriter ob2=new FileWriter("E:\\ratnala abhignya_2341001003\\CSW2\\CHAP12\\Class_WorkSpace\\assignment_5\\src\\q09\\diary.txt");
			LocalDate d=LocalDate.now();
			String date=d.toString();
			for(int i=0;i<date.length();i++) {
				ob2.write(date.charAt(i));
			}
			System.out.println("how was ur day");
			String s=in.nextLine();
			for(int i=0;i<s.length();i++) {
				ob2.write(s.charAt(i));
			}
			ob2.close();
			
			
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
