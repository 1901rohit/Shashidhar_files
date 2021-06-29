package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
		public static void main(String [] args) { 
		ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car=applicationcontext.getBean("a",Car.class);
		car.display();
				
		}

}
