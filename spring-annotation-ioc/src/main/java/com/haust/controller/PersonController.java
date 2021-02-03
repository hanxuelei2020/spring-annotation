package com.haust.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.haust.service.PersonService;

@Controller
public class PersonController {
	/**
	 * 	@Autowired
	 * 	@Resource
	 * 	@Inject
		@Qualifier(value = "")
		都是装配,@Autowired是默认按照类型去找，如果一个类型的存在多个对象，就按名称去找，名称为
		自己定义的变量名称。@Autowired+@Qualifier(value = "")可以按照名称去找。@Resource和@Autowired
		一样
		默认必须装配，否则报错,应该这样
		@Autowired(required = false)
		
		在组件--Bean上面加@Primary,将组件变为首选项。
		此时使用@Qualifier(value = "")可以进行更改
		
		@Inject装配导入依赖
		
		@Autowired可以装配构造器，方法，属性，参数
		注：如果一个组件的构造器只有一个有参构造器，那么这个构造器中的对象，将会被自动注入。无需使用@Autowired
		@Bean+参数中注入的对象，也会自动从容器中拿
		
		自定义组件如果实现了XXXAwire，在创建对象的时候会自动的装配进去
	 */
	@Autowired
	private PersonService personServiceImpl;
}
