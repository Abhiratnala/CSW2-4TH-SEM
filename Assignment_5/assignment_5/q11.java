package assignment_5;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

public class q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner in=new Scanner(System.in);
			File a=new File("E:\\ratnala abhignya_2341001003\\CSW2\\CHAP12\\Class_WorkSpace\\assignment_5\\src\\q09\\diary.txt");
			if(!a.exists()) {
				System.out.println("file doesnt exist so create a file ");
				
			}
			try (BufferedWriter writer =new BufferedWriter(new FileWriter(a,true))) {
				System.out.println("enter");
				String entry=in.nextLine();
				String date=LocalDateTime.now().toString();
				writer.write("date= "+date+" entry := "+entry);
				System.out.println("new entry updates successfully");
				
			
	}
		catch(Exception e) {
			System.out.println(e.getMessage());

}
	}
}
