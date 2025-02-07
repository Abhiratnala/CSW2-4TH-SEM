package com.iter.ratnalaabhignya.collegeclass;

public class school {
	private int studentId;
	private String StudentName;
	college c1;
	public school(int studentId, String studentName, college c1) {
		this.studentId = studentId;
		StudentName = studentName;
		this.c1 = c1;
	}
	public void displayStudentInfo() {
		System.out.println("student name: "+StudentName);
		System.out.println("student id: "+studentId);
		System.out.println("clg name: "+c1.collegeName);
		System.out.println("clg location: "+c1.collegeLoc);
		
		
		
	}
	

}
