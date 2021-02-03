package com.haust.config;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class MyTypeFilter implements TypeFilter {

	/**
	 * 	MetadataReader 读取当前类的所有信息
	 * 	MetadataReaderFactory 读取所有的类的信息
	 */
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		// TODO Auto-generated method stub
		//获取当前类的注解
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		//获取当前类的类信息
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		//获取当前类的路径
		Resource resource = metadataReader.getResource();
		
		//获得类名
		String className = classMetadata.getClassName();
		System.out.println(className);
		return false;
	}

}
