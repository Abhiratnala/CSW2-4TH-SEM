package assignment_5;
import java.util.*;
public class q07 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a=in.nextLine();
		String w1=in.next();
		String w2=in.next();
		System.out.println("old line "+a);
		String words[]=a.split(" ");
		String p1="",p2="";
		for(String i:words) {
			if(i.equals(w1)) {
				 p1=a.substring(0,a.indexOf(i));
				p2=a.substring(a.indexOf(i)+i.length(), a.length());
				p1+=w2+p2;
			
				
			}
		}
		System.out.println(p1);
		// TODO Auto-generated method stub
		

	}

}
