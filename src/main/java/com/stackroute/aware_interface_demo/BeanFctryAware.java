package com.stackroute.aware_interface_demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class BeanFctryAware implements BeanFactoryAware{

	private BeanFactory beanFactory;
	
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory=beanFactory;
	}
	
	public void getDetails() {
		Person per=(Person)beanFactory.getBean("person");
		System.out.println(per);
		System.out.println("Is The Person Bean Singleton = "+beanFactory.isSingleton("person"));
	}

}
