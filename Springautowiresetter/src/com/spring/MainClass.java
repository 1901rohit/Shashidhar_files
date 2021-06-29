package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String ar[]) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		TextEditor textEditor = (TextEditor)applicationContext.getBean("texteditor");
		textEditor.spellCheck();
		
	}

}
