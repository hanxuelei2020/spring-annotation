package com.haust.selector;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import com.haust.bean.Cat;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar{

	/**
	 * AnnotationMetadata 当前类的注解信息
	 * BeanDefinitionRegistry bean定义注册器
	 */
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		// TODO Auto-generated method stub
//		registry.containsBeanDefinition("") 判断是否注册了bean
		
		boolean definition = registry.containsBeanDefinition("person");
		if (definition) {
			registry.registerBeanDefinition("cat", new RootBeanDefinition(Cat.class));
		}
	}
}
