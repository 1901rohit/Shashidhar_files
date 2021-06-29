package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


public class Appcontextmain {
	public static void main(String [] args)
	{
		ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext.xml");
		Studentclass s=(Studentclass)a.getBean("student",Studentclass.class);
		s.display();
	}

}
