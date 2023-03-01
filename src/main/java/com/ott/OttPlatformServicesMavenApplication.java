package com.ott;

import com.ott.entity.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SpringBootApplication
public class OttPlatformServicesMavenApplication {

	public static void main(String[] args) {

		// using application context xml
		/**
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		Employee employee = (Employee) factory.getBean("employee");
		System.out.println(employee.toString()+" "+employee.hashCode());
		Employee employee1 = (Employee) factory.getBean("employee");
		System.out.println(employee1.toString()+" "+employee1.hashCode());
		 */

		// initialize spring boot container
		SpringApplication.run(OttPlatformServicesMavenApplication.class, args);
	}

}
