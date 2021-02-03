package com.haust.test;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.haust.bean.Person;
import com.haust.config.MainConfig;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test1();
	}

	private static void testImp() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
	}

	private static void test3() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		//获取环境变量的值
		Environment environment = applicationContext.getEnvironment();
		String property = environment.getProperty("os.name");
		System.out.println(property);
		String[] strings = applicationContext.getBeanNamesForType(Person.class);
		for (String string : strings) {
			System.out.println(string);
		}
		Map<String, Person> personMap = applicationContext.getBeansOfType(Person.class);
		for (String keyString : personMap.keySet()) {
			System.out.println(keyString + ":" + personMap.get(keyString));
		}
	}

	private static void test2() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		String[] strings = applicationContext.getBeanDefinitionNames();
		for (String string : strings) {
			System.out.println(string);
		}
	}

	private static void test1() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		Person person = applicationContext.getBean("bill",Person.class);
		System.out.println(person);
		
		String[] strings = applicationContext.getBeanDefinitionNames();
		for (String string : strings) {
			System.out.println(string);
		}
	}

	
}
