package assignment_5;
import java.util.*;
public class q05 {
	public static void main(String args[] ) {
		Scanner in=new Scanner(System.in);
		String a=in.next();
		String b=in.next();
		String l1=a.toLowerCase();
		String l2=b.toLowerCase();
		String u1=a.toUpperCase();
		String u2=b.toUpperCase();
		System.out.println(l1+" "+l2+" "+u1+" "+u2);
		if(l1.equals(l2) || u1.equals(u2)) {
			System.out.println("true");
		}
		else
			System.out.println("false");
	}

}
