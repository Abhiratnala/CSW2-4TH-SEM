package assignment_3;

/*Write a Java program to find the square root of an integer number. Demonstrate the use 
of a try-catch block to handle ArithmeticException. */
public class q04 {
	public static double sqrt(int n) throws ArithmeticException {
		if(n<0) {
			throw new ArithmeticException("enter +ve number");
		}
		else
			return Math.sqrt(n);
		
	}
public static void main(String[] args) {
 try{
	 System.out.println( sqrt(0));
 
	sqrt(-8);
 }
 catch(ArithmeticException e) {
	 System.out.println(e.getMessage());
 }
	
		
		// TODO Auto-generated method stub

	}

}
