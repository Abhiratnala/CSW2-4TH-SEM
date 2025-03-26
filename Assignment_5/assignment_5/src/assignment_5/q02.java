package assignment_5;
import java.util.*;
public class q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter");
		int i=in.nextInt();
		StringBuffer s=new StringBuffer("fgdhr");
		switch(i)
		{
		case 1:
			System.out.println("enter");
		    String s1=in.nextLine();
			System.out.println(	s.append(s1));
		break;
		case 2:
			System.out.println("enter");
		    String s2=in.next();
		    int n=in.nextInt();
			System.out.println(s.insert(n, s2));
			break;
		case 3:
			System.out.println("enter");
		    String s3=in.next();
		    int m=in.nextInt();
		    int e=in.nextInt();
		    System.out.println(s.replace(m, e, s3));
		    break;
		case 4:
			System.out.println("enter");
		    int x=in.nextInt();
		    int z=in.nextInt();
		System.out.println(s.delete(x, z));
		break;
		case 5:
		System.out.println(s.reverse());
		break;
		case 6:
			System.out.println("enter");
		    int y=in.nextInt();
		System.out.println(s.substring(y));
		default:
			System.out.println("invalid ip");
		}
	}

}
