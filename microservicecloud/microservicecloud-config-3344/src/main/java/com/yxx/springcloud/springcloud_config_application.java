package com.yxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class springcloud_config_application {

	public static void main(String[] args) {
		SpringApplication.run(springcloud_config_application.class, args);
		System.out.println("3344启动成功");

	}

}
