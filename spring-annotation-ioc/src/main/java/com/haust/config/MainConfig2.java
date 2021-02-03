package com.haust.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.haust.bean.PeronFactoryBean;

@Configuration
@ComponentScans({
	@ComponentScan(value = {"com.haust"},includeFilters = {
			@Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {
					MainConfig2.class,
			})
	},useDefaultFilters = false)
})
public class MainConfig2 {

	/**
	 * 第四种方式注入bean对象，实现spring提供的FactoryBean接口
	 * 
	 * 只有在Bean是单利模式才会有spring完全管理
	 * 1 Bean的生命周期，容器创建的时候初始化bean，并创建bean。在容器关闭的时候销毁bean
	 * 2 通过让Bean实现 DisposableBean InitializingBean接口来完成初始化和销毁方法
	 * 3 为方法添加@PostConstruct注解来完成初始化方法@PreDestroy注解来完成销毁方法
	 * 4 BeanPostProcessor 在bean初始化前后进行后置通知。
	 * 			postProcessBeforeInitialization 在一切初始化之前
	 * 			postProcessAfterInitialization 在一切销毁之后
	 * @return
	 */
	@Bean
	public PeronFactoryBean getPeronFactoryBean() {
		return new PeronFactoryBean();
	}
}
