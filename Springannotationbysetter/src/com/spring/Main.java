package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args)
	{
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Employeeconfig.class);
		Employee employee=applicationContext.getBean(Employee.class);
		employee.setName("Shashi");
		System.out.println(employee.getName());
	}
}
