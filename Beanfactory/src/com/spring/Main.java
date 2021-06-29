package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	
	
	public static void main(String ar[]) {
		
		Resource  resource = new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Student  student =(Student)beanFactory.getBean("studentbean");
		student.StudentInfo();
		Addressclass add =(Addressclass)beanFactory.getBean("addressbean");
		add.AddressInfo();
		
	}

}
