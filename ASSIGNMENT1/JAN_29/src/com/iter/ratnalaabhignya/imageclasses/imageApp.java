package com.iter.ratnalaabhignya.imageclasses;

import java.util.Scanner;

public class imageApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageLibrary ob=new ImageLibrary(10);
		Scanner in=new Scanner(System.in);
		System.out.println("enter image width color");
		int x=in.nextInt();
		int y=in.nextInt();
		int z=in.nextInt();
		image imgobj1=new image(x,y,z);
		ob.AddImage(imgobj1);
		System.out.println("enter image width color");
		 x=in.nextInt();
		 y=in.nextInt();
		z=in.nextInt();
		image imgobj2=new image(x,y,z);
		ob.AddImage(imgobj2);
		System.out.println(ob.getImage(0));
		System.out.println(ob.getImage(1));
		ob.display();
        System.out.println(ob.searchImage(imgobj2));
		
		
		

	}

}
