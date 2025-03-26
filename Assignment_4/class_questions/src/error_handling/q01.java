package error_handling;
import java.util.*;
public class q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter");
		int x=in.nextInt();
		int y=in.nextInt();
		try{
			int div=x/y;
			System.out.println(div);
			}
		catch(Exception e) {
			System.out.println("arithematic error");
		}
		}

}
