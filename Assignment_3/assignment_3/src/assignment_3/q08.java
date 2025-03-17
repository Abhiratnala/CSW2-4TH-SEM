package assignment_3;
import java.util.*;
/*Create a custom-checked exception class named CustomCheckedException. Use this 
exception in your program to handle a specific error condition and demonstrate its 
usage with a try-catch block*/
class CustomCheckedException extends Exception{
	CustomCheckedException(String m){
		super(m);
	}
}
public class q08 {

	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("enter your fname ");
		String f=in.nextLine();
		try {
			
		
		for(int i=0;i<f.length();i++) {
			if(f.charAt(i)==' ') {
				throw new CustomCheckedException("enter first name only");
			}
				
				
			}
		}
		catch(CustomCheckedException e) {
			System.out.println(e.getMessage());
		}
		
		
		// TODO Auto-generated method stub

	}

}
