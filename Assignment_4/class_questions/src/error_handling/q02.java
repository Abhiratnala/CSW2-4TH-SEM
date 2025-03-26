package error_handling;
import java.util.*;
public class q02 {
	static double checkNum(int n) {
		if(n<1)
			throw new ArithmeticException(" number is negetive");
		else
			return n*n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=-3;try {

	System.out.println(checkNum(x));
}
catch(ArithmeticException e) {
	System.out.println("handled");
}

	System.out.println("rest of the code");

	}

}
  