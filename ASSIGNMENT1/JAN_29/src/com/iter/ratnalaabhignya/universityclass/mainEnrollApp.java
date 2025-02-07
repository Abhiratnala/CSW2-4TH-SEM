package com.iter.ratnalaabhignya.universityclass;
import java.util.*;

public class mainEnrollApp {

	public static void main(String[] args) {
		Enrollment e=new Enrollment(10);
		Scanner in=new Scanner(System.in);
		System.out.println("enter name regn no, branch");
		String n=in.next();
		int r=in.nextInt();
		String b=in.next();
		course c1=new course(n,r,b);
		System.out.println("enter name regn no, branch");
		n=in.next();
		r=in.nextInt();
		b=in.next();
		course c2=new course(n,r,b);
		e.enroll(c1);
		e.enroll(c2);
		e.display();
		e.drop(c1);
		e.display();
	
		
		// TODO Auto-generated method stub

	}

}
