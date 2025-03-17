package assignment_3;
import java.util.*;

/*You are given a string containing alphanumeric characters, and your task is to design a 
Java program that extracts and displays the numeric characters from the given string. If 
no numeric characters are present, the program should display an appropriate message 
indicating their absence. Additionally, if the input string is null or empty, the program 
must throw a NullPointerException with a meaningful error message.*/
public class q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter ");
		String s=in.next();;
		String s2=null;
		int c1=0;
		 for (int i=0;i<s.length();i++) {
			 char c=s.charAt(i);
	            if (Character.isDigit(c)) {
	            	c1++;
	                break;
	            } 
			
		}
		 if(c1!=0) {
			 System.out.println("number found");
		 }
		 else
			 System.out.println("not found");
		try {
			if(s2==null) {
				throw new NullPointerException("string is null");
			}
		}
		catch(NullPointerException e) {
			System.out.println("error handled");
		}

	}

}
