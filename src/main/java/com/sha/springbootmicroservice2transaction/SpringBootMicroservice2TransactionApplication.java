package com.sha.springbootmicroservice2transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class SpringBootMicroservice2TransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservice2TransactionApplication.class, args);
	}

}
