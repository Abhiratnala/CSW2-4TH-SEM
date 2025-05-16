package com.spring.Maven1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mobileApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
sim sim=(sim)context.getBean("air");
sim.call();
sim.data();
sim sim2=(sim)context.getBean("voda");
sim2.call();
sim2.data();
	}

}
  