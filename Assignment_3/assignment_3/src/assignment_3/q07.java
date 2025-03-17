package assignment_3;
//Design a Java program to perform matrix operations such as addition, multiplication, 
//and transpose. Introduce scenarios where accessing elements beyond the matrix bounds 
//results in an ArrayIndexOutOfBoundsException. Handle these exceptionseffectively and provide meaningful error messages that clearly indicate the nature of 
//the exception.
import java.util.*;
public class q07  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int r=2;
		int c=2;
		int [][] m=new int [r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.println("emyter");
				m[i][j]=in.nextInt();
				
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
		System.out.print(m[i][j]);
			}
			System.out.println();
		}
		try {
			System.out.println("enter index to be accessed");
			int x=in.nextInt();
			int y=in.nextInt();
			if(x>=r || y>=c) {
				throw new ArrayIndexOutOfBoundsException("enter valid index");
			}
			else
				System.out.println(m[x][y]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

}
