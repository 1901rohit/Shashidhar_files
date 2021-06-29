package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("beans..xml");
		TextEdit t=(TextEdit)a.getBean("textbean");
		t.SpellCheck();
	}

}
