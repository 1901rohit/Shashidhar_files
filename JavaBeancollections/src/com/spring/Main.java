package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String ar[]) {

		      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		      Collection a=(Collection)context.getBean("Collection");

		      a.getAddressList();
		      a.getAddressSet();
		      a.getAddressMap();
		      a.getAddressProp();

	}

}
