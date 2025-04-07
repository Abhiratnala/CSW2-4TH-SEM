package assignment_5;
/*Write a Java program that illustrates the difference between using string literals and the 
new keyword for creating String objects. Your program should demonstrate the 
memory usage implications and how string comparison behaves differently in each 
case. */
public class q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="hello";
		String a2=new String ("aghhhh");
		if(a==a2)
			System.out.println("true");
		else
			System.out.println("false");

	}

}
