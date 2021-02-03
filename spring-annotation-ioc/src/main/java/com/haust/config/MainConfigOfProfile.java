package com.haust.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 *  @profile
 *  	spring为我们提供的可以根据当前环境，动态激活和切换一系列组件的功能
 *  	指定组件在哪一种环境下会被注册到容器中，不指定的情况下任何环境都能注册这个组件
 *  	默认default所有的组件加入。
 *  
 *  动态激活 
 *  	1. -DSpring.profiles.active="XXX"
 *  	2. 
 *  		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
			applicationContext.getEnvironment().setActiveProfiles("");
			applicationContext.register(MainConfigOfProfile.class);
			applicationContext.refresh();
		写在类配置上，只有在指定的环境上，整个配置里面都会被加载
		没有配置的可以在任何环境中加载。
 * @author PC
 *
 */
@Configuration
public class MainConfigOfProfile {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.getEnvironment().setActiveProfiles("");
		applicationContext.register(MainConfigOfProfile.class);
		applicationContext.refresh();
	}
}
