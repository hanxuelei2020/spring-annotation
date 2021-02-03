package com.haust.bean;

import org.springframework.beans.factory.FactoryBean;

public class PeronFactoryBean implements FactoryBean<Person>{

	//获得对象
	@Override
	public Person getObject() throws Exception {
		// TODO Auto-generated method stub
		
		return new Person();
	}

	//返回对象的类型
	@Override
	public Class<Person> getObjectType() {
		// TODO Auto-generated method stub
		return Person.class;
	}

	//是否单利模式
	@Override
	public boolean isSingleton() {
		return true;
	}
}
