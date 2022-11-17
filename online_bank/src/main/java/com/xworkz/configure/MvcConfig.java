package com.xworkz.configure;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan("com.xworkz")
public class MvcConfig {
	
	
	public MvcConfig() {
		System.out.println("-------MVC configure----");
		// TODO Auto-generated constructor stub
	}
	@Bean
	public ViewResolver setupViewResolver() {
		System.out.println("---------setupViewResolver-----------");
		return new InternalResourceViewResolver("/", ".jsp");
	}	
	

}
