package com.haust.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxConditional implements Condition{

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// TODO Auto-generated method stub
		
		//环境变量
		Environment environment = context.getEnvironment();
		String property = environment.getProperty("os.name");
		if (property.contains("linux")) {
			return true;
		}
		return false;
	}

}
