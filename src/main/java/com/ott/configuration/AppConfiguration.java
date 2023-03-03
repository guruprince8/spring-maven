package com.ott.configuration;

import com.ott.dto.EmployeeResponse;
import com.ott.environment.Environment;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@SuppressWarnings("unused")
public class AppConfiguration {

	@Bean(name = {"appEnvironment"},initMethod = "init",destroyMethod = "destroy")
	public Environment getEnvironmentObject() {
		return new Environment();
	}

	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public EmployeeResponse getEmployeeResponse(){
		return new EmployeeResponse();
	}
}
