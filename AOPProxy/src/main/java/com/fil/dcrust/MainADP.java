package com.fil.dcrust;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan (basePackages= {"com.fil.dcrust"})
public class MainADP {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(BeansConfiguration.class);
		context.refresh();
		
		String[] beans= context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beans));
		
		MyLibService libService = (MyLibService)context.getBean(MyLibService.class);
		LibraryLogAspect objAspect = context.getBean(LibraryLogAspect.class);
		System.out.println(libService);
		System.out.println(objAspect);
		
		libService.getBook();
		libService.getStudent();
		libService.issue("Java", "Mohit");

	}

}
