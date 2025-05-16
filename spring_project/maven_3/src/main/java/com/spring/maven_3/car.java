package com.spring.maven_3;

public class car implements vehical{
	String name;int id;


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


	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("car with name "+name+" and id "+id+" started");
		
	}


	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("car with name "+name+" and id "+id+" stopped");
		
	}
	

}
