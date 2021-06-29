package com.spring.starter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.TextEditorConfig;
import com.spring.TextEditorConstructorBasedDI;
import com.spring.TextEditorSetterBasedDI;

public class App {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = 
		new AnnotationConfigApplicationContext(TextEditorConfig.class);

		TextEditorSetterBasedDI tesb = context.getBean(TextEditorSetterBasedDI.class);
		
		TextEditorConstructorBasedDI tecb = context.getBean(TextEditorConstructorBasedDI.class);
		
		tesb.spellCheck();
		
		tecb.spellCheck();
		
		context.close();
		
	}

}
