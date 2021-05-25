package com.yxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages={"com.yxx.springcloud"})
@ComponentScan("com.yxx.springcloud")
public class ApplicationStartApp {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationStartApp.class, args);
		System.out.println("消费者启动成功，端口号是9527");

	}

}
