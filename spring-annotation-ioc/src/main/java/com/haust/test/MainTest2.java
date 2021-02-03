package com.haust.test;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.haust.config.MainConfig2;

public class MainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}

	private static void test1() {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
//		String[] definitionNames = applicationContext.getBeanDefinitionNames();
//		for (String string : definitionNames) {
//			System.out.println(string);
//		}
//		Person bean = applicationContext.getBean("getPeronFactoryBean",Person.class);
		Object bean = applicationContext.getBean("getPeronFactoryBean");
		System.err.println(bean);
	}

}
