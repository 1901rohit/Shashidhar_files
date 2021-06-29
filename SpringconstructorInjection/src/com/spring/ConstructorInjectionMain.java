package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ConstructorInjectionMain {
	
	public static void main(String [] args)
	{
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory= new XmlBeanFactory(resource);
		Employee employee=(Employee)beanFactory.getBean("employeebean");
		employee.show();
	}
	

}
