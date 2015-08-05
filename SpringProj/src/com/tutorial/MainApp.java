package com.tutorial;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
					new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld helloworld = (HelloWorld) context.getBean("helloWorld");
		helloworld.getMessage();
		context.registerShutdownHook();
	}

}
