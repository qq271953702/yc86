package com.yc.C89S3sqeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class C89S3SqEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(C89S3SqEurekaApplication.class, args);
	}

}
