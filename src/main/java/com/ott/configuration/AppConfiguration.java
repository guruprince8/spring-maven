package com.ott.configuration;

import com.ott.dto.EmployeeResponse;
import com.ott.environment.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

	@Bean(name = {"appEnvironment"},initMethod = "init",destroyMethod = "destroy")
	public Environment getEnvironmentObject() {
		return new Environment();
	}

	@Bean
	public EmployeeResponse getEmployeeResponse(){
		return new EmployeeResponse();
	}
}
