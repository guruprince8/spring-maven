package com.ott;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

	@Bean(name = {"appEnvironment"},initMethod = "init",destroyMethod = "destroy")
	public Environment getEnvironmentObject() {
		return new Environment();
	}
}
