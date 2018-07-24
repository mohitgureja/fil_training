package com.fil.dcrust;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.fil.dcrust.LibraryLogAspect;
import com.fil.dcrust.MyLibService;
import com.fil.dcrust.MyLibServiceImpl;

@Configuration
@EnableAspectJAutoProxy
public class BeansConfiguration 
{
	@Bean
	LibraryLogAspect libraryLogAspect()
	{
		return new LibraryLogAspect();
	}
	
	@Bean
	public MyLibService myAOPService()
	{
		return new MyLibServiceImpl();
	}
}
