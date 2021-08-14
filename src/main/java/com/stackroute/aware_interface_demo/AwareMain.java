package com.stackroute.aware_interface_demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class AwareMain {
	public static void main(String[] args) {
		/*ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		AppContextAware awr=(AppContextAware)ctx.getBean("applicationAware");
		awr.getDetails();*/
		
		BeanFactory fac=new XmlBeanFactory(new ClassPathResource("beans.xml"));
		BeanFctryAware beanAware= (BeanFctryAware) fac.getBean("beanFact");
		beanAware.getDetails();
	}
}
