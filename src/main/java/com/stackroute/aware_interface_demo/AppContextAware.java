package com.stackroute.aware_interface_demo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AppContextAware implements ApplicationContextAware{

	private ApplicationContext context;
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context=applicationContext;
		System.out.println("setApplicationContext method called");
	}
	
	public void getDetails() {
		Person per=(Person)context.getBean("person");
		System.out.println("Is it singleton = "+context.isSingleton("person"));
		System.out.println(per);
		
	}
}
