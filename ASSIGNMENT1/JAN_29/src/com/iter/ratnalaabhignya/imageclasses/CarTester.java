package com.iter.ratnalaabhignya.imageclasses;
//Write a Java program with a Car class having private fields (make, model), a
//parameterized constructor, getter, and setter methods. In the CarTester class,
//instantiate myCar1 with values and myCar2 with null. Print their initial details,
//update myCar2 using setters, and print the updated details.

public class CarTester {

	public static void main(String[] args) {
		car myCar1=new car("123","222");
		car myCar2=new car(null,null);
		myCar2.getter();
		myCar2.setter("1222", "2627");
		myCar1.getter();
		myCar2.getter();
		
		
		
		// TODO Auto-generated method stub

	}

}
