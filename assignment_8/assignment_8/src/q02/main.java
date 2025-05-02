package q02;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator ref1=(a,b)->a+b;
		System.out.println(ref1.add(5, 2));
		calculator ref2=(a,b)->a-b;
		System.out.println(ref2.add(5, 2));
		calculator ref3=(a,b)->a*b;
		System.out.println(ref3.add(5, 2));
		calculator ref4=(a,b)->a/b;
		System.out.println(ref4.add(5, 2));
		

	}

}
