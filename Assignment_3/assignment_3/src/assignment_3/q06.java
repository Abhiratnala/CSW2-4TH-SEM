package assignment_3;

/*Implement a Java program that performs complex manipulations on an array of 
integers, including operations such as sorting, searching, and accessing elements at 
various indices. Introduce scenarios where accessing elements beyond the array bounds 
leads to an ArrayIndexOutOfBoundsException. Handle these exceptions gracefully 
to ensure the program continues execution without crashing*/
public class q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {1,2,3,4,5,6};
		try {
		for(int i=0;i<=x.length;i++) {
			System.out.print(x[i]+"  ");
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("error"+e);
		}
		
		
		

	}

}
