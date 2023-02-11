package com.ott;

public class Environment implements EnvironmentI {
	
	public void init() {
		System.out.println("Environment init");
	}

	@Override
	public String toString() {
		return "Environment "+ this.hashCode();
	}
	
	public void destroy() {
		System.out.println("Envionment destroy");
	}
}
