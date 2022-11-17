package com.xworkz.configure;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//@Configuration


public class SpringDispatcherInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
implements WebMvcConfigurer   {
	
		
	public SpringDispatcherInitializer() {
		System.out.println("------------Dispatcher----------------");;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("------get root configure class----");
		// TODO Auto-generated method stub
		return new Class[]{MvcConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("------get servlet configure class----");

		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("------get servlet mapping  class----");

		// TODO Auto-generated method stub
		return new String[] {"/"};  // indicates any url pattern
	}
	

}
