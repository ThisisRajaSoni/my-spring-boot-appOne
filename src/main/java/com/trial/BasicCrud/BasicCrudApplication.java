package com.trial.BasicCrud;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BasicCrudApplication {

	public static void main(String[] args) {
		System.out.println("*********Raja Spring Starts*************");
		
		SpringApplication.run(BasicCrudApplication.class, args);
		
//		ConfigurableApplicationContext run = SpringApplication.run(BasicCrudApplication.class, args);
//		
//		String[] beanDefinitionNames = run.getBeanDefinitionNames();
//		
//		Arrays.sort(beanDefinitionNames);
//		for(String bean : beanDefinitionNames) {
//			System.out.println("Bean - "+ bean);
//		}
		
	}

}
