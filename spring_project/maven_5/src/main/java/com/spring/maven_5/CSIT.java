package com.spring.maven_5;

public class CSIT implements Branch{
	public CSIT(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	String name;
	int roll;

	@Override
	public void Enroll() {
		// TODO Auto-generated method stub
		System.out.println("Student is enrolled in CSIT");
		
	}

}
