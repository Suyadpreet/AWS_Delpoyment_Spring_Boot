package com.suyad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsDeploymentSpringBootApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(AwsDeploymentSpringBootApplication.class, args);
		System.out.println("Application has been Started Successfully.............");
	}

}
