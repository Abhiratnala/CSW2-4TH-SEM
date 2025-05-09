package q03;

public class q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lambda for run
		Runnable add=()->System.out.println(2+5);
		System.out.println(add);
		Runnable sub=()->System.out.println(2-5);
		System.out.println(sub);
		Runnable mul=()->System.out.println(2*5);
		System.out.println(mul);
		Runnable div=()->System.out.println(2/5);
		System.out.println(div);
		//reference is only printing 
		

	}

}
