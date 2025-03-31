package assignment_5;
import java.util.*;
public class q06 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a=in.next();
	char c[]=a.toCharArray();
	char ch=in.next().charAt(0);
	for(int i=0;i<c.length;i++)
		 {
		if(c[i]==ch) {
			System.out.println("element present at "+i);
			break;
		}
		
	}
	for(int i=c.length-1;i>=0;i--)
	 {
	if(c[i]==ch) {
		System.out.println("element present at "+i);
		break;
	}
	
}

		// TODO Auto-generated method stub
		

	}

}
