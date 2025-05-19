package com.spring.mavenDependency;

public class student {
	private int rollno;
	private String name;
	private address add;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public address getAdd() {
		return add;
	}
	public void setAdd(address add) {
		this.add = add;
	}
	public void display() {
		System.out.println(this.getName()+" "+this.getRollno()+" "+add.toString());
	}
	

}
