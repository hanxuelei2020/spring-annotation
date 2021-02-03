package com.haust.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.lang.Nullable;

import com.haust.config.MainConfig;

/**
 * 使用@Value赋值；
 * 1 基本数值
 * 2 可是写SpEL； #{}
 * 3 可以写${};  取出配置文件中的值
 * 
 * 除了可以使用@value之外还可以使用
 * 		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		//获取环境变量的值
		Environment environment = applicationContext.getEnvironment();
		String property = environment.getProperty("xxx");
 * @author PC
 *
 */
public class Person {
	private Integer id;
	@Value("张三")
	private String nameString;
	@Value("#{20-2}")
	private Integer age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(@Nullable Integer id, String nameString, Integer age) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", nameString=" + nameString + ", age=" + age + "]";
	}
	
	
	
}
