package com.iter.ratnalaabhignya.rectangleclass;
/*Design a Java class called Rectangle with private attributes length and width. Include
a constructor to initialize these attributes, as well as setter and getter methods for each
attribute. Additionally, implement methods to calculate the area and perimeter of the
rectangle. Write a main method to create an object of the Rectangle class, set values
for its attributes, and display the area and perimeter.*/
public class Rectangle {
	private int length, width;
	public Rectangle(int l,int w) {
		length=l;
		width=w;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int area() {
		return length*width;
	}
	public int perimeter() {
		return (2*(length+width));
	}
	public static void main(String [] args) {
		Rectangle ob=new Rectangle(20,10);
		System.out.println("area: "+ob.area());
		System.out.println("perimeter:"+ob.perimeter());
	    ob.setLength(22);
		ob.getLength();
		ob.setWidth(10);
		ob.getWidth();
		System.out.println("area: "+ob.area());
		System.out.println("perimeter:"+ob.perimeter());
		
	}

}
