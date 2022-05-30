package com.nology.cloudproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude ={DataSourceAutoConfiguration.class})
public class CloudProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudProjectApplication.class, args);
	}

}
