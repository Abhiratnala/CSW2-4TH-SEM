package com.spring.maven_5;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans_5.xml");
		CSE S_1=(CSE)context.getBean("Student_1");
		S_1.Enroll();
		CSIT S_2=(CSIT)context.getBean("Student_2");
		S_2.Enroll();
	}

}

