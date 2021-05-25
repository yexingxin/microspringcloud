package com.yxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApplicationStart8001 {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationStart8001.class, args);
		System.out.println("服务端启动成功，端口号是8001");
	}

}
