package com.elesho.spring.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("classpath:application-${spring.profiles.active.default}.properties")
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class AwsHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsHerokuApplication.class, args);
	}

}
