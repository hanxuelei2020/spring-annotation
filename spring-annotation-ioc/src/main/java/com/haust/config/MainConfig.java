package com.haust.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.haust.bean.Person;
import com.haust.bean.Student;
import com.haust.conditional.LinuxConditional;
import com.haust.conditional.WindowConditional;
import com.haust.selector.MyImportBeanDefinitionRegistrar;
import com.haust.selector.MyImportSelector;

@Configuration
@ComponentScan(value = "com.haust",includeFilters = {
		@Filter(type = FilterType.ANNOTATION,classes = {
				Controller.class,Service.class
		})
},useDefaultFilters = false)
@Import({Student.class,MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
//导入配置文件
//@PropertySource(value = {
//		可以使用@PropertySource({})或者
	//  @PropertySources指定多个@PropertySource
//})
//@ComponentScan(value = "com.haust")
//value 可以指定要扫描的包
//会扫描该包下的所有类，不仅仅是带注解的，通过Filter来进行筛选。
/**
 * 		去除那些类
 * * 	excludeFilters = {
 * 			type去除那些类型，注解、aspectj、类、自定义、Regex
 * 			classes 那些类型的注解要被去除
 *			@Filter(type = FilterType.ANNOTATION,classes = {
				Controller.class,Service.class
			})
 *		}
 *
 *		只包含哪些类，必须领useDefaultFilters = false
		 @ComponentScan(value = "com.haust",includeFilters = {
				@Filter(type = FilterType.ANNOTATION,classes = {
						Controller.class,Service.class
				})
		},useDefaultFilters = false)
		
		可以添加多个注解扫描
		@ComponentScans(
			value = {
				@ComponentScan ...
			}
		)
		
		
		FilterType.ANNOTATION 注解
		FilterType.ASSIGNABLE_TYPE 包含那个类，包括他本身，他的子类以及实现类
		FilterType.CUSTOM 自定义规则   Filter candidates using a given custom
	 * 		{@link org.springframework.core.type.filter.TypeFilter} implementation.
 */
public class MainConfig {
	
	//方法名就是注入的对象的id名
	//也可以使用Bean的value值来确定对象的id名
	//所有的Bean注解默认都是单利的，无论获取多少次，都是一个。
	@Bean
	@Scope("singleton")
	@Lazy
	/**
	 * @Scope("singleton")	单实例的  ioc容器启动就会调用，创建对象放入容器中，以后直接从容器中拿
	 * @Scope("prototype")  多实例的	通过scope调整作用域
	 * @Lazy 懒加载，在获取对象的时候才开始创建对象。仅在单实例的情况下
	 * @return
	 */
	public Person person() {
		return new Person(null, "lisi",20);
	}
	
	/**
	 * @Conditional()	条件注解，可以根据条件是否注入,放在方法上就是判断这个方法的返回值是否满足条件，放在雷伤就是对整个类进行统一管理
	 * 
	 * @return
	 */
	@Bean("bill")
	@Conditional(WindowConditional.class)
	public Person person1() {
		return new Person();
	}
	
	@Bean("linus")
	@Conditional(LinuxConditional.class)
	public Person person2() {
		return new Person(null, "linus",20);
	}
	
	
	/**
	 * 	@import 快速的导入一个组件
	 * 	@ImportSelector 快速批量的导入组件，返回值就是类的全类名,放入到import注解中
	 * 	ImportBeanDefinitionRegistrar 手动注册
	 */
	
	
}
