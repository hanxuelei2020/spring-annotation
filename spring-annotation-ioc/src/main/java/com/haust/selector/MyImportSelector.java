package com.haust.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector{

	/**
	 * AnnotationMetadata 注解标注的类的上面的全部的注解信息
	 * 返回的String数组就可以将所有要加入到IOC容器的类统一加入其中
	 */
	
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// TODO Auto-generated method stub
		//不能返回一个null
		return new String[]{};
	}

}
