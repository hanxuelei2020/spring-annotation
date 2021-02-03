package com.haust.conditional;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowConditional implements Condition{

	/**
	 * ConditionContext 获得条件上下文
	 * AnnotatedTypeMetadata 获得注解类型的信息
	 */
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// TODO Auto-generated method stub
		// 获取bean创建工厂
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		
		//类加载器
		ClassLoader classLoader = context.getClassLoader();
		
		//环境变量
		Environment environment = context.getEnvironment();
		
		//获取注册表
		BeanDefinitionRegistry registry = context.getRegistry();
		
		//获取路径加载器
		ResourceLoader resourceLoader = context.getResourceLoader();
		
		String property = environment.getProperty("os.name");
		if (property.contains("Window")) {
			return true;
		}
		return false;
	}

}
