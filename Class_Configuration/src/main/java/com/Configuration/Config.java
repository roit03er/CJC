package com.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
		
	
	@Bean
	public Employee emp1() {
		return new Employee();
	}
}
