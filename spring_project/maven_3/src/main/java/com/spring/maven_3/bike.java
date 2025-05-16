package com.spring.maven_3;

public class bike implements vehical{
	String name;
	int id;
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("bike with name "+name+" and id "+id+" started");
		
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("bike with name "+name+" and id "+id+" stopped");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
