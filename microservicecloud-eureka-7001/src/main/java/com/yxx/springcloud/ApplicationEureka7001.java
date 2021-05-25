package com.yxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationEureka7001 {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationEureka7001.class, args);
		System.out.println("ApplicationEureka启动成功");

	}

}
