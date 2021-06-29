package com.spring;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass{
	
	public static void main(String ar[]) {
		AbstractApplicationContext  applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Controller a =(Controller)applicationContext.getBean("bean");
		a.getMessage();
		applicationContext.registerShutdownHook();
		
		
	}

}
