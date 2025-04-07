package assignment_5;
/*Read from a File: Write a Java application that opens the "diary.txt" file created in the 
previous question and displays its content on the console. The program should handle 
cases where the file does not exist by displaying an appropriate error message. */
import java.io.*;
import java.util.*;
public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in=new Scanner(System.in);
			FileInputStream a=new FileInputStream("E:\\ratnala abhignya_2341001003\\CSW2\\CHAP12\\Class_WorkSpace\\assignment_5\\src\\q09\\diary.txt");
			int i;
			while((i=a.read())!=-1) {
				System.out.print((char)i);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
