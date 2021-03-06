package com.yxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationEureka7002 {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationEureka7002.class, args);
		System.out.println("Application_7002启动成功");

	}

}
