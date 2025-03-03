package q1;
import java.util.*;

import assignment2_2.car;
public class q06 {
	String name, color,type;
	public q06(String name, String color, String type) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
	}

	Scanner in=new Scanner(System.in);
	@Override
	public int hashCode() {
		System.out.println("enter code");
		int i=in.nextInt();
		int x=i*21;
		return x;
	}
	@Override
	public String toString() {
		return (this.name+"  "+this.color+"  "+this.type);
	}
	

	public static void main(String[] args) {
		q06 animals[]=new q06[3];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<animals.length;i++) {
			System.out.println("enter");
			String n=in.next();
			String c=in.next();
			String t=in.next();
	       animals[i]=new q06(n,c,t);
	      System.out.println("unique code:"+ animals[i].hashCode());
	      animals[i].toString();
		}
		
		// TODO Auto-generated method stub

	}


	
}
