package assignment_3;
import java.util.*;

/*Create a method that accepts a string input and converts it into an integer. Use a try
catch block to handle NumberFormatException, and if an exception occurs, prompt 
the user to enter a valid numeric value.*/
public class q03 {
public static void check(String name) {
	int x=0;
	try {
		 x=Integer.parseInt(name);
		 System.out.println(x);
	}
	catch(NumberFormatException e) {
		System.out.println("enter valid numeric val");
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check("10er");
		

	}

}
