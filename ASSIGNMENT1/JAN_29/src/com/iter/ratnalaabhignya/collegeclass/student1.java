package com.iter.ratnalaabhignya.collegeclass;

public class student1 extends college {
	private int studentId;
	private String StudentName;
	public student1(String n, String l, int studentId, String studentName) {
		super(n, l);
		this.studentId = studentId;
		StudentName = studentName;

	}
	public void displayStudentInfo() {
		System.out.println("student name: "+StudentName);
		System.out.println("student id: "+studentId);
		System.out.println("clg name: "+collegeName);
		System.out.println("clg location: "+collegeLoc);
		}
	
	
	

}
