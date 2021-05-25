package com.yxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Zuul_9001_application {

	public static void main(String[] args) {
		SpringApplication.run(Zuul_9001_application.class, args);
		System.out.println("Zuul_9001_application成功启动");
	}

}
