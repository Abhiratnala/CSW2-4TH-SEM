package error_handling;

public class q03 {
	static double checkNum(int n) {
		if(n<1)
			throw new ArithmeticException(" number is negetive");
		else
			return n*n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
