package com.xworkz.configure;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
@Configuration
public class DBConfiguration {
	//this class to support JPA entity  manager factory object creation 
	//replacement of persistence.xml
	
	public DBConfiguration() {
		
		System.out.println(" -----DB configuration created------");
		// TODO Auto-generated constructor stub
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean factoryBean(DataSource dataSource) {
		
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		
		bean.setPackagesToScan("com.xworkz");
		bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		bean.setDataSource(dataSource);
		
		Map<String, Object> jpaProperties = new HashMap<String, Object>();
		jpaProperties.put("Hibernate.show_sql", true);
		jpaProperties.put("Hibernate.format_sql", true);
		jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		jpaProperties.put("hibernate.hbm2ddl.auto", "update");
	
		bean.setJpaPropertyMap(jpaProperties);	
		return bean ;
	}
	

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource  driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/onlinebank");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("Xworkzodc@123");
		
		//learn what is connection pool;
		
		return driverManagerDataSource;
	}
}
