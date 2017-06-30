package com.apurv.codashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.apurv.codashboard.controller"})
public class CodashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodashboardApplication.class, args);
	}
}
