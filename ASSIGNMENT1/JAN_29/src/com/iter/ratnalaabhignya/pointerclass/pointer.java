package com.iter.ratnalaabhignya.pointerclass;
/*Write a Java program that defines a Point class with attributes X and Y, and includes a
parameterized constructor to initialize these attributes. Implement a copy
constructor to create a new point object with the same attribute values. Ensure that
modifications made to one object do not affect the other. Utilize getter and setter
methods to retrieve and update the attribute values*/
public class pointer {
	private int x,y;
	public pointer(int x,int y){
		this.x=x;
		this.y=y;
	}
 public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
pointer(pointer p){//copy constructor
	 x=p.x;
	 y=p.y;
 }
public static void main(String [] args) {
	pointer p1=new pointer(5,6);
	System.out.println("x: "+p1.x +"  "+"y: "+p1.y);
	p1.setX(2);
	p1.setY(10);
	System.out.println("x: "+p1.getX() +"  "+"y: "+p1.getY());
	pointer p2=new pointer(p1);
	System.out.println("x: "+p1.x +"  "+"y: "+p1.y);
	p1.setX(2);
	p1.setY(10);
	System.out.println("x: "+p1.getX() +"  "+"y: "+p1.getY());
	
	
}
 
}
