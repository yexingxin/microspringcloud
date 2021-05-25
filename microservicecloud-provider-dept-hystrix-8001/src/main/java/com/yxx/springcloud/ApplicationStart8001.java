package com.yxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class ApplicationStart8001 {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationStart8001.class, args);
		System.out.println("熔断服务端启动成功，端口号是8001");
	}

}
