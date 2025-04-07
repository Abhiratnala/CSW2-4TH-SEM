package assignment_5;
import java.util.*;
public class q08 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		System.out.println("enter 1 for case conversion 2 for search 3 for concat e");
		int z=in.nextInt();
		switch(z) {
		case 1:
			System.out.println(s.toLowerCase());
			System.out.println(s.toUpperCase());
			break;
		case 2:
			System.out.println("enter char to search");
			char ch=in.next().charAt(0);
			int c=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					c++;
					System.out.println("found at pos "+i);
				}
			}
			if(c==0)
				System.out.println("not found");
			break;
		case 3:
			System.out.println("enter string to concatinate");
			String s1=in.next();
			s+=s1;
			System.out.println(s);
	       break;
	       default:
	    	   System.out.println("invalid in");
		// TODO Auto-generated method stub

	}

}
}
