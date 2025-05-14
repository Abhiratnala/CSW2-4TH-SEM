package com.spring.maven123;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans12.xml");
		student s1=(student)context.getBean("s1");
		s1.display();
		

	}

}
