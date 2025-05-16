package com.spring.maven_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("bean_3.xml");
		vehical v1=(vehical)context.getBean("c1");
		v1.start();
        v1.stop();
        System.out.println();//no 2 beans required
        vehical v2=(vehical)context.getBean("b1");
		v2.start();
        v2.stop();
        

	}

}
