package com.hcl.axis.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AxisAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AxisAccountApplication.class, args);
		System.out.println("Axis Account Service");
		
	}

	

	

}
